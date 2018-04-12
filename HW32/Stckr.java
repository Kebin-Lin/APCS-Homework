/*****************************************************
* class Stckr
* driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
*****************************************************/

public class Stckr
{
  public static void main( String[] args )
  {
    Stack cakes = new ALStack<Integer>();
    //Stack cakes = new LLStack();

    cakes.push(1);
    cakes.push(2);
    cakes.push(3);
    cakes.push(4);

    while(!cakes.isEmpty()) System.out.println(cakes.pop());
    System.out.println(cakes.pop());

    cakes.push(2048);
    System.out.println(cakes.peek());

  }

}//end class
