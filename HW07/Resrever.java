//Kevin Lin
//APCS2 Pd1
//HW07 -- A Man, A Plan, A Canal: Panama!
//2018-02-14

public class Resrever {

  public static String reverseLin(String input) {
    String output = "";
    for (int i = input.length(); i > 0; i--) {//Goes through the string backwards
      output += input.substring(i - 1,i);
    }
    return output;
  }

  public static String reverseLog(String input) {
    int len = input.length()/2;
    if (input.length() == 1) { return input; }
    else {return reverseLog(input.substring(len)) +
      reverseLog(input.substring(0,len));}//Reverses order of the two halves
  }

  public static void main(String[] args) {
    System.out.println(reverseLin("Stressed"));
    System.out.println(reverseLog("Stressed"));
  }
}
