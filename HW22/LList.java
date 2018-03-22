//Clarence Chen, Kevin Lin
//APCS2 Pd1
//HW22 -- Give and Take
//2018-03-23

/*****************************************************
* class LList
* Implements a linked list of LLNodes, each containing String data
*****************************************************/

public class LList implements List //your List interface must be in same dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }

  public void add(int index, String x) {
    LLNode newNode = new LLNode(x,null);

    if (index == 0) {//Changes the head to the new node, and points the new node to the old head
      newNode.setNext(_head);
      _head = newNode;
      return;
    }

    LLNode temp = _head;
    for (int i = 0; i < index-1; i++) {
      temp = temp.getNext();
    }
    newNode.setNext(temp.getNext());
    temp.setNext(newNode);
    _size++;
  }

  public String remove(int index) {
    String output;
    if (index == 0) {//Changes the head if index is 0
      output = _head.getCargo();
      _head = _head.getNext();
      _size--;
      return output;
    }
    LLNode node = _head;
    for (int i = 0; i < index-1; i++) {
      node = node.getNext();
    }
    output = node.getNext().getCargo();
    node.setNext(node.getNext().getNext());
    _size--;
    return output;
  }

  public String get( int index )
  {
    if ( index < 0 || index >= size() )
    throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
    tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
    throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
    tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
      retStr += tmp.getCargo() + "->";
      tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    System.out.println(james.remove(3));

    System.out.println( james );

    james.add(2,"my");
    james.add(3,"dad");
    james.add(5,"cow");

    System.out.println( james );
  }

}//end class LList
