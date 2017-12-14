import sorts.*;
import java.util.ArrayList;

public class SortTester {

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  public static void main(String[] args) {
    ArrayList<Comparable> bestBubble = new ArrayList<Comparable>();
    ArrayList<Comparable> worstBubble = new ArrayList<Comparable>();
    ArrayList<Comparable> bestSelect = new ArrayList<Comparable>();
    ArrayList<Comparable> worstSelect = new ArrayList<Comparable>();
    ArrayList<Comparable> bestInsert = new ArrayList<Comparable>();
    ArrayList<Comparable> worstInsert = new ArrayList<Comparable>();

    ArrayList[] bestCases = {bestBubble,bestSelect,bestInsert};
    ArrayList[] worstCases = {worstBubble,worstSelect,worstInsert};

    for (ArrayList i : bestCases) { //Populates lists with 0-9 ascending
      for (int i2 = 0; i2 < 10; i2++) {
        i.add(i2);
      }
    }

    for (ArrayList i : worstCases) { //Populates lists with 0-9 descending
      for (int i2 = 9; i2 > -1; i2--) {
        i.add(i2);
      }
    }

    for (ArrayList i : bestCases) {
      System.out.println(i);
    }

    for (ArrayList i : worstCases) {
      System.out.println(i);
    }

    System.out.println("Sorting best cases");
    System.out.println();

/*The best case scenario for bubbleSort is an already sorted list, because
there will be no swaps neccessary, so no swaps will be performed, and the
method will finish in one pass.*/
    System.out.println("Best bubbleSort case:");
    MySorts.bubbleSort(bestBubble);
    System.out.println();


/*There is no best case scenario for selectionSort. Regardless of the state
of the "unsorted" list, the same number of comparisons and swaps will be made,
and swapping an element with itself still counts as a swap.*/
    System.out.println("\"Best\" selectionSort case:");
    MySorts.selectionSort(bestSelect);
    System.out.println();

/*The best case scenario for insertionSort is an already sorted list. Each pass
will choose an index and drag it to its place in the sorted section of the list,
but every element is already in its final resting position, so no swaps will be
made.*/
    System.out.println("Best insertionSort case:");
    MySorts.insertionSort(bestInsert);
    System.out.println();

/*The worst case scenario for bubbleSort is a list sorted in reverse order.
For the list to be sorted, each element will have to be dragged from one end of
the list to the other. This requires a lot of swaps and comparisons.*/
    System.out.println("Sorting worst cases");
    System.out.println("Worst bubbleSort case:");
    MySorts.bubbleSort(worstBubble);
    System.out.println();

/*Should have the same number of swaps and comparisons as the "best" case.*/
    System.out.println("\"Worst\" selectionSort case:");
    MySorts.selectionSort(worstSelect);
    System.out.println();

/*The worst case scenario for insertionSort is a list sorted in reverse order.
For the list to be sorted, each element will have to be dragged from one end of
the list to the other. This requires a lot of swaps and comparisons, but
requires less swaps than bubbleSort because not every element is compared to
another every pass.*/
    System.out.println("Worst insertionSort case:");
    MySorts.insertionSort(worstInsert);
  }
}
