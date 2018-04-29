//Team Cake (Bing Li, Kerwin Chen, Kevin Lin)
//APCS2 Pd1
//HW36 -- Now Let’s Consider You Lot at Fake Terry’s
//2018-04-18

/*****************************************************
* class RQueue
* A linked-list-based, randomized queue
* (a collection with FIIDKO property)
*
*       -------------------------------
*   end |  --->   Q U E U E   --->    | front
*       -------------------------------
*
*  linkages point opposite direction for O(1) en/dequeuing
*            N <- N <- ... <- N <- N
*      _end -^                     ^- _front
*
******************************************************/


public class RQueue<T> implements Queue<T>
{
  //instance variables
  private LLNode<T> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = null;
    _end = null;
    _size = 0;
  }//end default constructor


  public void enqueue( T enQVal )
  {//Places a new node in a random position
    LLNode<T> input = new LLNode<T>(enQVal,null);
    if (_front == null) {//Empty queue
      _front = input;
      _end = _front;
    }
    else {
      int target = (int) ( Math.random() * (_size+1) );
      System.out.println(target);
      if (target == 0) {//If the node is to be added at the front
        input.setNext(_front);
        _front = input;
      }
      else if (target == _size) {//If the node is to be added at the end
        _end.setNext(input);
        _end = input;
        return;
      }
      else {
        LLNode<T> temp = _front;
        for (int i = 0; i < target-1; i++) {
          temp = temp.getNext();
        }
        input.setNext(temp.getNext());
        temp.setNext(input);
      }
    }
    _size++;
  }//end enqueue()


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue()
  {
    if (isEmpty()) {return null;}
    T output = _front.getValue();
    _front = _front.getNext();
    _size--;
    return output;
  }//end dequeue()


  public T peekFront()
  {
    if (isEmpty()) return null;
    return _front.getValue();
  }


  /******************************************
  * void sample() -- a means of "shuffling" the queue
  * Algo:
  * 1. Select a random index
  * 2. Bring the number at the index to the front
  * 3. Return steps 1 and 2 _size times
  ******************************************/
  public void sample ()
  {
    for (int times = 0; times < _size; times++) {
      LLNode<T> temp = _front;
      int target = (int) (Math.random() * _size);
      if (target == 0) {return;}
      for (int i = 0; i < target-1; i++) {
        temp = temp.getNext();
      }
      if (target == _size - 1) _end = temp;
      LLNode<T> save = temp.getNext();
      temp.setNext(save.getNext());
      save.setNext(_front);
      _front = save;
    }
  }//end sample()


  public boolean isEmpty()
  {
    return (_front == null);
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    LLNode<T> temp = _front;
    String output = "";
    while (temp.getNext() != null) {
      output += temp.getValue() + " ";
      temp = temp.getNext();
    }
    return output;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    RQueue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Robert");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...
    PirateQueue.sample();
    System.out.println( PirateQueue );

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...");
    System.out.println( PirateQueue.dequeue() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
