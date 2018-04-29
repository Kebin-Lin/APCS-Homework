//Kevin Lin
//APCS2 Pd1
//HW32 -- Leon Leonwood Stack
//2018-04-12

import java.util.LinkedList;

public class LLStack<T> implements Stack<T>{

  LinkedList<T> _stack;
  int _stackSize;

  public LLStack() {
    _stack = new LinkedList<T>();
    _stackSize = 0;
  }

  public boolean isEmpty() {return _stackSize == 0;}

  public T peek() {
    if (isEmpty()) return null;
    return _stack.getFirst();
  }

  public T pop() {
    if (isEmpty()) return null;
    T output = _stack.remove();
    _stackSize--;
    return output;
  }

  public void push(T x) {
    _stack.add(0,x);
    _stackSize++;
  }
}
