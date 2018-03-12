/*
Kevin Lin
APCS2 Pd1
HW17 -- So So Fast
2018-03-12

Algorithm: Partition the array, and then partition the partitions of the array,
until the length of the partition is one or less. Once the array is sorted,
return the value at index y-1.
Worst Case: O(n^2)
Best Case: O(nlogn)
*/

public class FastSelect {

  public static int fastSelect(int[] arr,int y) {
    quickSort(arr);
    return arr[y-1];
  }

  private static void quickSort(int[] arr) {
    quickSortH(arr,0,arr.length-1,(arr.length-1)/2);
  }

  private static void quickSortH(int[] arr, int a, int b, int c) {
    if ((b-a) <= 1) {return;}
    int save = Mysterion.partition(arr,a,b,c);
    quickSortH(arr,a,save,(a + save)/2);
    quickSortH(arr,save,b,(save + b)/2);
  }

  public static void main(String[] args) {
    int[] arr = {7,1,5,12,3};
    for (int i:arr) { System.out.print(i + " "); }
    System.out.println();
    System.out.println("y = 4: " + fastSelect(arr,4));
    for (int i:arr) { System.out.print(i + " "); }
    System.out.println();

    //Best Case: Already sorted list
    int[] best = {1,2,3,4,5,6,7,8,9};
    for (int i:best) { System.out.print(i + " "); }
    System.out.println();
    System.out.println("y = 4: " + fastSelect(best,4));
    for (int i:best) { System.out.print(i + " "); }
    System.out.println();

    //Worst Case: Midpoints of a partition are the min/max of the partition
    int[] worst = {1,4,3,2,9,5,8,7,6};
    for (int i:worst) { System.out.print(i + " "); }
    System.out.println();
    System.out.println("y = 4: " + fastSelect(worst,4));
    for (int i:worst) { System.out.print(i + " "); }
    System.out.println();
  }
}
