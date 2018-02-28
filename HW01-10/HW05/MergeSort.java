//Kevin Lin
//APCS2 Pd1
//HW05 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2018-02-07

/*======================================
class MergeSort
Implements mergesort on array of ints.

Summary of Algorithm:
The algorithm first checks if the array length is <= 1, which means it's sorted,
and if it is sorted, it returns the array. If the array is not sorted, then it
splits the array in half and calls itself to sort the two smaller arrays. Then
it merges the two sorted arrays that it was given by calling itself, and returns
the merged array.
======================================*/

public class MergeSort
{
  /******************************************************
  * int[] merge(int[],int[])
  * Merges two input arrays
  * Precond:  Input arrays are sorted in ascending order
  * Postcond: Input arrays unchanged, and
  * output array sorted in ascending order.
  ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] output = new int[a.length + b.length];
    int oindex = 0;
    int aindex = 0;
    int bindex = 0;
    while (aindex < a.length && bindex < b.length) {
      if (a[aindex] < b[bindex]) {
        output[oindex] = a[aindex];
        aindex++;
      }
      else {
        output[oindex] = b[bindex];
        bindex++;
      }
      oindex++;
    }
    if (a.length <= aindex) {
      for (int i = bindex; i < b.length; i++) {
        output[oindex] = b[i];
        oindex++;
      }
    }
    else {
      for (int i = aindex; i < a.length; i++) {
        output[oindex] = a[i];
        oindex++;
      }
    }
    return output;
  }//end merge()


  /******************************************************
  * int[] sort(int[])
  * Sorts input array using mergesort algorithm
  * Returns sorted version of input array (ascending)
  ******************************************************/
  public static int[] sort( int[] arr )
  {
    if (arr.length <= 1) {return arr;}
    int[] arr1 = new int[arr.length/2];
    int[] arr2 = new int[arr.length - (arr.length/2)];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr[i];
    }
    //printArray(arr1);
    for (int i = arr1.length; i < arr.length; i++) {
      arr2[i-arr1.length] = arr[i];
    }
    //printArray(arr2);
    return merge(sort(arr1),sort(arr2));
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
    a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
    System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args ) {

    int[] arr0 = {0};
    int[] arr1 = {1};
    int[] arr2 = {1,2};
    int[] arr3 = {3,4};
    int[] arr4 = {1,2,3,4};
    int[] arr5 = {4,3,2,1};
    int[] arr6 = {9,42,17,63,0,512,23};
    int[] arr7 = {9,42,17,63,0,9,512,23,9};

    System.out.println("\nTesting mess-with-array method...");
    printArray( arr3 );
    mess(arr3);
    printArray( arr3 );

    System.out.println("\nMerging arr1 and arr0: ");
    printArray( merge(arr1,arr0) );

    System.out.println("\nMerging arr4 and arr6: ");
    printArray( merge(arr4,arr6) );

    System.out.println("\nSorting arr4-7...");
    printArray( sort( arr4 ) );
    printArray( sort( arr5 ) );
    printArray( sort( arr6 ) );
    printArray( sort( arr7 ) );
        /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
