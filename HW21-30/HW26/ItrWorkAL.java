/*****************************************************
* class ItrWork -- skeleton
* Allows for familiarization with iterators
*****************************************************/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWorkAL
{
  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key, List<Integer> L )
  {
    for (Integer i:L) {
      if (key.equals(i)) {return true;}
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key, List<Integer> L )
  {
    Iterator i = L.iterator();
    while (i.hasNext()) {
      if (key.equals(i.next())) {return true;}
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    ArrayList<Integer> out = new ArrayList<Integer>();
    for (Integer i:L) {
      if (i % 2 == 1) {out.add(i);}
    }
    return out;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    ArrayList<Integer> out = new ArrayList<Integer>();
    Iterator i = L.iterator();
    while (i.hasNext()) {
      Integer current = (Integer) i.next();
      if (current % 2 == 1) {out.add(current);}
    }
    return out;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator i = L.iterator();
    int index = 0;
    ArrayList<Integer> toRem = new ArrayList<Integer>();
    while (i.hasNext()) {
      Integer current = (Integer) i.next();
      if (current % 2 == 0) {toRem.add(index);}
      else {index++;}
    }
    for (int i2:toRem) {L.remove(i2);}
  }


  public static void main( String [] args )
  {
    //var type: List   obj type: ArrayList
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
    L.add(i);


    // TASK: write code to print the contents of ArrayList L...

    // a) using a FOREACH loop
    for (Integer i:L) {System.out.print(i + " ");}

    // b) explicitly using an iterator
    Iterator i = L.iterator();
    System.out.println();
    while (i.hasNext()) {System.out.print(i.next() + " ");}

    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);

  }//end main

}//end class ItrWork
