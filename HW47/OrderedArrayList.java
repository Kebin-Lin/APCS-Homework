//Kevin Lin
//APCS pd8
//HW47 -- ascending
//2017-12-06

import java.util.ArrayList;

public class OrderedArrayList extends ArrayList<Comparable> {

  public OrderedArrayList() {super();}

  public boolean add(Comparable d) {
    if (size() == 0 || d.compareTo(get(size()-1)) >= 0) {
      super.add(d);
      return true;
    }
    return false;
  }

  public void add(int index, Comparable d) {
    if (index > size() || index < 0) {throw new IndexOutOfBoundsException();}
    boolean before = (index == 0 || d.compareTo(get(index-1)) >= 0); //True if index is 0
    boolean after = (index == size() || d.compareTo(get(index)) <= 0); //True if index is size()
    if (before && after) {
      super.add(index,d);
    }
  }

  public static void main(String[] args) {
    OrderedArrayList array = new OrderedArrayList();
    System.out.println("Printing empty OrderedArrayList: " + array);
    array.add(1);
    array.add(2);
    array.add(5);
    System.out.println("Printing populated OrderedArratList: " + array);
    System.out.println("Attempting to add -1");
    String out = (array.add(-1)) ? "succeeded" : "failed";
    System.out.println("Attempt to add -1 " + out);
    System.out.println(array);
    System.out.println("Attempting to add 4 at index 2");
    array.add(2,4);
    System.out.println("Array after attempt: " + array);
    System.out.println("Atttempting to add 1 at index 2");
    array.add(2,1);
    System.out.println("Array after attempt: " + array);
  }
}
