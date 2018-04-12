//Kevin Lin
//APCS2 Pd1
//HW32 -- What a Racket   or: How I Learned to Stop Worrying and Love the Stack
//2018-04-13

/*****************************************************
* class Scheme
* Simulates a rudimentary Scheme interpreter
*
* ALGORITHM for EVALUATING A SCHEME EXPRESSION:
*   1. Steal underpants.
*   2. ...
*   5. Profit!
*
* STACK OF CHOICE: LLStack
* Because: There is no need to create a new underlying array every time expansion is needed
******************************************************/

public class Scheme
{
  /******************************************************
  * precond:  Assumes expr is a valid Scheme (prefix) expression,
  *           with whitespace separating all operators, parens, and
  *           integer operands.
  * postcond: Returns the simplified value of the expression, as a String
  * eg,
  *           evaluate( "( + 4 3 )" ) -> 7
  *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
  ******************************************************/
  public static String evaluate( String expr )
  {
    String[] splitted = expr.split("\\s+");
    Stack<Integer> op = new LLStack<Integer>();
    Stack<String> num = new LLStack<String>();
    for (String i:splitted) {
      //Operators
      if (i.equals("+")) op.push(1);
      else if (i.equals("-")) op.push(2);
      else if (i.equals("*")) op.push(3);
      //Puts the unloaded value back into the stack so it can be used
      else if (i.equals(")")) num.push( unload(op.pop(),num) );
      //Puts numbers and opening parentheses into the stack
      else num.push(i);
    }
    return num.pop();
  }//end evaluate()


  /******************************************************
  * precond:  Assumes top of input stack is a number.
  * postcond: Performs op on nums until closing paren is seen thru peek().
  *           Returns the result of operating on sequence of operands.
  *           Ops: + is 1, - is 2, * is 3
  ******************************************************/
  public static String unload( int op, Stack<String> numbers )
  {
    String current = numbers.pop();
    int output;
    if (op == 1) {
      output = 0;
      while(!current.equals("(")) {//Stops operation once the opening is reached
        output += Integer.parseInt(current);
        current = numbers.pop();
      }
    }
    else if(op == 2) {
      Stack<String> rev = new LLStack<String>();
      while(!current.equals("(")) {
        rev.push(current);
        current = numbers.pop();
      }//Gets a reversed stack so the first number can be subtracted from
      output = Integer.parseInt(rev.pop());
      while(!rev.isEmpty()) {
        output -= Integer.parseInt(rev.pop());
      }
    }
    else {
      output = 1;
      while(!current.equals("(")) {
        output *= Integer.parseInt(current);
        current = numbers.pop();
      }
    }
    return "" + output;
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
}
catch( NumberFormatException e ) {
return false;
}
}
*/


//main method for testing
public static void main( String[] args )
{


  String zoo1 = "( + 4 3 )";
  System.out.println(zoo1);
  System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
  //...7

  String zoo2 = "( + 4 ( * 2 5 ) 3 )";
  System.out.println(zoo2);
  System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
  //...17

  String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
  System.out.println(zoo3);
  System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
  //...29

  String zoo4 = "( - 1 2 3 )";
  System.out.println(zoo4);
  System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
  //...-4
  /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
}//main

}//end class Scheme
