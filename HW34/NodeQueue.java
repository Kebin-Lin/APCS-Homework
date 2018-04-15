//Kevin Lin
//APCS2 Pd1
//HW34 -- The English Do Not Wait In Line for Soup or Anything Else; They "Queue Up"
//2018-04-16

public class NodeQueue<T> implements Queue<T> {

  LLNode<T> _head;
  LLNode<T> _tail;

  public NodeQueue() {
    _head = null;
    _tail = null;
  }

  public T dequeue() {
    if (isEmpty()) return null;
    if (_head == _tail) _tail = null;
    T output = _head.getValue();
    _head = _head.getNext();
    return output;
  }

  public void enqueue(T input) {
    LLNode<T> val = new LLNode<T>(input,null);
    if (_head == null) {
      _head = val;
      _tail = val;
    }
    else {
      _tail.setNext(val);
      _tail = val;
    }
  }

  public boolean isEmpty() {return (_head == null);}

  public T peekFront() {
    if (isEmpty()) return null;
    return _head.getValue();
  }

  public static void main(String[] args) {
    NodeQueue<Integer> q = new NodeQueue<Integer>();

    for (int i = 0; i < 10; i++) {
      q.enqueue(i);
    }

    while(!q.isEmpty()) {
      System.out.println(q.dequeue());
    }

    System.out.println(q.dequeue());
  }
}
