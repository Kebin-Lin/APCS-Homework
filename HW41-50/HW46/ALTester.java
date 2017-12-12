//Kevin Lin
//APCS pd8
//HW46 -- Al<B> Sorted!
//2017-12-05

import java.util.ArrayList;

public class ALTester {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList();
	    for (int i = 0; i < 23; i++) {
	    list.add((int)(Math.random() * 100));
	  }
    System.out.println(list);
	  boolean sorted = true;
    for (int i = 1; i < 23; i++) {
      if (list.get(i) > list.get(i-1)) {
		  sorted = false;
	    break;
	    }
    }
	  String out = sorted ? "" : "not "; //If sorted, out = "", else out = "not "
    System.out.println("The list is " + out + "sorted");
  }
}
