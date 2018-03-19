/*
Kevin Lin
APCS2 Pd1
HW16 -- About Face
2018-03-08
*/

public class Mysterion {

  public static int quickSortHelper(int[] arr, int lower, int higher, int middle) {
    int save = arr[middle];
    swap(arr,middle,higher);
    int ctr = lower;
    for (int i = lower; i < higher; i++) {
      if (arr[i] < save) {
        swap(arr,ctr,i);
        ctr++;
      }
    }
    swap(arr,ctr,higher);
    return ctr;
  }
  //In the indexes between lower and higher, the algorithm places all integers
  //less than the integer at index middle to the left of it, and all integers
  //greater than the integer at index middle to the right of it.

  private static void swap(int[] arr, int a, int b) {
    int save = arr[b];
    arr[b] = arr[a];
    arr[a] = save;
  }

  public static void main(String[] args) {
    int[] arr1 = {2,4,5,1,5,76,12,3};
    int[] arr2 = {3,2,4,5,1,6,8,9};
    int[] arr3 = {9,8,7,6,5,4,3,2,1,0};
    int[][] all = {arr1,arr2,arr3};

    for (int[] i:all) {
      System.out.println("\nArray: ");
      for (int i2 = 0; i2 < i.length; i2++) {
        System.out.print(i[i2] + " ");
      }
      quickSortHelper(i,0,i.length-1,i.length/2);
      System.out.println("\nMiddle: " + (i.length/2));
      System.out.println("After: ");
      for (int i2 = 0; i2 < i.length; i2++) {
        System.out.print(i[i2] + " ");
      }
      System.out.println();
    }

    for (int[] i:all) {
      System.out.println("\nArray: ");
      for (int i2 = 0; i2 < i.length; i2++) {
        System.out.print(i[i2] + " ");
      }
      quickSortHelper(i,0,i.length/2,i.length/4);
      System.out.println("\nHigher: " + i.length/2);
      System.out.println("Middle: " + (i.length/4));
      System.out.println("After: ");
      for (int i2 = 0; i2 < i.length; i2++) {
        System.out.print(i[i2] + " ");
      }
      System.out.println();
    }
  }
}
