import java.util.ArrayList;

public class MySorts {

  public static void insertionSort( ArrayList<Comparable> data )
  {
    int swaps = 0;
    int comparisons = 0;
    for (int pass = 0; pass < data.size()-1; pass++) {
      int currentIndex = pass + 1; //To track the number
      while (currentIndex != 0 && data.get(currentIndex).compareTo(data.get(currentIndex - 1)) < 0) {
        comparisons++;
        data.set(currentIndex,data.set(currentIndex-1, data.get(currentIndex)));
        swaps++;
        currentIndex--;
      }
      comparisons++;
    }
    System.out.println(swaps + " Swaps, " + comparisons + " Comparisons");
  }//end insertionSort

  public static void selectionSort( ArrayList<Comparable> data )
  {
    int swaps = 0;
    int comparisons = 0;
    int mIndex = 0;
    for (int i = 0; i < data.size()-1; i++) {
      mIndex = i;
      for (int i2 = i+1; i2 < data.size(); i2++) {
        //Compares current min to elm at i2, changes mIndex if neccessary
        if (data.get(mIndex).compareTo(data.get(i2)) > 0) {mIndex = i2;}
        comparisons++;
      }
      data.set(i,data.set(mIndex,data.get(i)));
      swaps++;
    }
    System.out.println(swaps + " Swaps, " + comparisons + " Comparisons");
  }//end selectionSort

  public static void bubbleSort( ArrayList<Comparable> data )
  {
    int swaps = 0;
    int comparisons = 0;
    boolean change = true; //If there is no change, then the list is sorted
    while (change) {
      change = false;
      for (int i = data.size()-1; i > 0; i--) {
        if (data.get(i).compareTo(data.get(i-1)) < 0) {
          data.set(i-1,data.set(i,data.get(i-1))); //Swaps values
          change = true;
          swaps++;
        }
        comparisons++;
      }
    }
    System.out.println(swaps + " Swaps, " + comparisons + " Comparisons");
  }//end bubbleSort

  public static void main(String[] args) {}
}
