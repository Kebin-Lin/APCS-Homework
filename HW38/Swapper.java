//Kevin Lin
//APCS pd8
//HW38 -- Put It Together
//2017-11-22

/*
Swapper will create a 2D array of unique 3- or 4-character Strings and
display it in the terminal. It will then prompt the user to specify two
locations, swap the items at these locations, and redisplay the array.
*/

import cs1.Keyboard;

public class Swapper {

  public static void display(String[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int i2 = 0; i2 < array[i].length; i2++) {
        System.out.print(array[i][i2] + " ");
      }
      System.out.println();
    }
  }

  public static void swap(String[][] array, int f1, int f2, int s1, int s2) {
    String temp = array[f1][f2];
    array[f1][f2] = array[s1][s2];
    array[s1][s2] = temp;
  }

  public static void main(String[] args) {
    String[][] array = {
      {"Cat","Cow","Dog","Pig"},
      {"Wolf","Lamb","Snek","Frog"},
      {"Mice","Rat","Ram","Bat"}
    };

    display(array);

    System.out.println();
    System.out.println("Choose the two locations of Strings to swap");
    System.out.println("First String");
    System.out.print("Vertical position: ");
    int firstVert = Keyboard.readInt(); //Reads an int input
    System.out.print("Horizontal position: ");
    int firstHoriz = Keyboard.readInt();
    System.out.println();
    System.out.println("Second String");
    System.out.print("Vertical position: ");
    int secVert = Keyboard.readInt();
    System.out.print("Horizontal position: ");
    int secHoriz = Keyboard.readInt();
    System.out.println();
    swap(array,firstVert,firstHoriz,secVert,secHoriz);

    display(array);
  }
}
