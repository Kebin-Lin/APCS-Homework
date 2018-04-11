//Kevin Lin
//APCS2 Pd1
//HW31 -- Stack: What Is It Good For?               well, this. 
//2018-04-11

/*****************************************************
* skeleton for class LatKtS
* Driver class for Latkes.
* Uses a stack to reverse a text string, check for sets of matching parens.
*****************************************************/


public class LatKtS
{

  /**********************************************************
  * precondition:  input string has length > 0
  * postcondition: returns reversed string s
  *                flip("desserts") -> "stressed"
  **********************************************************/
  public static String flip( String s )
  {
    Latkes temp = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      temp.push(s.substring(i,i+1));
    }
    String out = "";
    for (int i = 0; i < s.length(); i++) {
      out += temp.pop();
    }
    return out;
  }//end flip()


  /**********************************************************
  * precondition:  s contains only the characters {,},(,),[,]
  * postcondition: allMatched( "({}[()])" )    -> true
  *                allMatched( "([)]" )        -> false
  *                allMatched( "" )            -> true
  **********************************************************/
  public static boolean allMatched( String s )
  {
    Latkes temp = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      String curr = s.substring(i,i+1);
      if (curr.equals("{") ||
          curr.equals("[") ||
          curr.equals("("))
          temp.push(curr);
      else {
        String current = temp.pop();
        if (current == null) {return false;}
        if (curr.equals("}") && !current.equals("{")) {return false;}
        else if (curr.equals(")") && !current.equals("(")) {return false;}
        else if (curr.equals("]") && !current.equals("[")) {return false;}
      }
    }
    return temp.isEmpty();
  }//end allMatched()


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class LatKtS
