//Team Cookie (Kendrick Liang, Kevin Lin)
//APCS2 Pd1
//HW35 -- ...Nor Do Aussies
//2018-04-17

import java.util.ArrayList;

public class ALQueue<T> implements Queue<T> {

  ArrayList<T> _queue;
  int _frontIndex;

  public ALQueue() {
    _queue = new ArrayList<T>();
    _frontIndex = 0;
  }

  public T dequeue() {
    if (isEmpty()) return null;
    //Leaves a lot of junk in the front of the underlying ArrayList in exchange for constant runtime
    return _queue.get(_frontIndex++);
  }

  public void enqueue(T x) {_queue.add(x);}

  public T peekFront() {
    if (isEmpty()) return null;
    return _queue.get(_frontIndex);
  }

  public boolean isEmpty() {return _queue.size() == _frontIndex;}

  public static void main(String[] args) {
    ALQueue<Integer> q = new ALQueue<Integer>();

    for (int i = 0; i < 10; i++) {
      q.enqueue(i);
    }

    while(!q.isEmpty()) {
      System.out.println(q.peekFront());
      System.out.println(q.dequeue());
    }

    System.out.println(q.dequeue());
    System.out.println(q.peekFront());
  }
}
