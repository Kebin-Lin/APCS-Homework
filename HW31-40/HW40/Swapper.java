//Kevin Lin
//APCS pd8
//HW40 -- Make It Better
//2017-11-27

/*
Swapper will create a 2D array of unique 3- or 4-character Strings and
display it in the terminal. It will then prompt the user to specify two
locations, swap the items at these locations, and redisplay the array.

Version 2 Improvements:
- Does not let you specify numbers that are out of index
- Does not let you use non numbers as an input
- Asks until a valid input is given
- Prints the String selected
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
    int firstVert = -1;
    while (!(firstVert <= 2 && firstVert >= 0)) { //Asks until a valid unput is given
	System.out.print("Vertical position: ");
	firstVert = Keyboard.readInt(); //Reads an int input
    }
    int firstHoriz = -1;
    while (!(firstHoriz <= 3 && firstHoriz >= 0)) {
	System.out.print("Horizontal position: ");
	firstHoriz = Keyboard.readInt();
    }
    System.out.println(array[firstVert][firstHoriz] + " selected"); //Prints the selected String
    System.out.println();
    System.out.println("Second String");
    int secVert = -1;
    while (!(secVert <= 2 && secVert >= 0)) {
	System.out.print("Vertical position: ");
	secVert = Keyboard.readInt();
    }
    int secHoriz = -1;
    while (!(secHoriz <= 3 && secHoriz >= 0)) {
	System.out.print("Horizontal position: ");
	secHoriz = Keyboard.readInt();
    }
    System.out.println(array[secVert][secHoriz] + " selected");
    System.out.println();
    swap(array,firstVert,firstHoriz,secVert,secHoriz);

    display(array);
  }
}
