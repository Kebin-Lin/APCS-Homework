//Kevin Lin
//APCS2 Pd1
//HW51 -- Heaping Piles of Sordidness
//2018-05-21

public class HeapSort {

  public static void sort(int[] array) {
    //Heapification Stage
    int heaped = 1;
    int currPos;
    while (heaped < array.length) {
      currPos = heaped;
      while (array[currPos] > array[(currPos - 1) / 2]) {
        swap(array,currPos,(currPos - 1) / 2);
        currPos = (currPos - 1) / 2;
      }
      heaped++;
    }
    //"Removal"
    for (int i = array.length-1; i >= 1; i--) {
      swap(array,i,0);
      currPos = 0;
      int maxPos = maxChildPos(array,0,i);
      while (maxPos < i && maxPos != -1) {
        if (array[currPos] < array[maxPos]) swap(array,currPos,maxPos);
        currPos = maxPos;
        maxPos = maxChildPos(array,maxPos,i);
      }
    }
  }

  private static void swap(int[] array, int pos1, int pos2) {
    int temp = array[pos1];
    array[pos1] = array[pos2];
    array[pos2] = temp;
  }

  private static int maxChildPos(int[] array, int pos, int bound) {
    if (pos * 2 + 1 > bound-1) return -1; //No children
    if (pos * 2 + 1 == bound-1) return pos * 2 + 1; //One child
    if (array[pos * 2 + 1] > array[pos * 2 + 2]) return pos * 2 + 1;
    return pos * 2 + 2;
  }

  public static void main(String[] args) {
    int[] array1 = {7,1,4,6,1,8};
    int[] array2 = {9,8,7,6,5,4,3,2,1};
    int[] array3 = {15,40,11,47,93};
    int[][] arrays = {array1,array2,array3};
    for (int[] i : arrays) {
      HeapSort.sort(i);
      System.out.print("Sorted: ");
      for (int i2 : i) {
        System.out.print(i2 + " ");
      }
      System.out.println();
    }

  }
}
