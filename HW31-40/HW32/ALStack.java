import java.util.ArrayList;

public class ALStack<T> implements Stack<T>{

  ArrayList<T> _stack;
  int _stackSize;

  public ALStack() {
    _stack = new ArrayList<T>();
    _stackSize = 0;
  }

  public boolean isEmpty() {return _stackSize == 0;}

  public T peek() {
    if (_stackSize == 0) {return null;}
    return _stack.get(_stackSize - 1);
  }

  public T pop() {
    if (_stackSize == 0) {return null;}
    T output = _stack.get(--_stackSize);
    _stack.remove(_stackSize);
    return output;
  }

  public void push(T x) {
    _stack.add(x);
    _stackSize++;
  }
}
