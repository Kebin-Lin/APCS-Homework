//Kevin Lin
//ACPS1 pd8
//HW56 -- His Toe Grammar
//2017-12-19

import java.util.ArrayList;

public class StatPrinter {
  ArrayList<Integer> _data;
  ArrayList<Integer> _freq;

  public StatPrinter() {
    _data = new ArrayList<Integer>();
    _freq = new ArrayList<Integer>();
  }

  public StatPrinter(ArrayList<Integer> data) {
    this();

    for (Integer i : data) {
      _data.add(i);
    }

    for (int i = 0; i < max(_data)+1; i++) {
      _freq.add(0);
    }

    for (Integer i : _data) {
      _freq.set(i,_freq.get(i)+1);
    }
  }

  public int max(ArrayList<Integer> a) { //O(n)
    Integer max = a.get(0);
    for (Integer i : a) {
      if (i > max) {max = i;}
    }
    return max;
  }

  public void printHistogram(int max) { //O(n)
    int max2 = max(_freq);
    for (int i = 0; i < _freq.size(); i++) {
      System.out.print(i + " : ");
      int num = (int)((_freq.get(i) / (float)max2) * max);
      for (int i2 = 0; i2 < num; i2++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public boolean isLocalMode(int index) { //O(1)
    if (index == 0 || index == _freq.size()-1) {return false;}
    return (_freq.get(index) > _freq.get(index-1) && _freq.get(index) > _freq.get(index+1));
  }
}
