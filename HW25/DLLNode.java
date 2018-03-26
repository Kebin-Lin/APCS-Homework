/*****************************************************
* class DLLNode
* Implements a doubly-linked node,
* for use in lists and other collection classes.
* Stores data of type T
*****************************************************/

public class DLLNode<T>
{
  private T _cargo;    //cargo may only be of type T
  private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNodes

  public DLLNode( T value, DLLNode<T> next, DLLNode<T> prev ) {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }

  public T getCargo() {return _cargo;}
  public T setCargo(T s) {
    T output = _cargo;
    _cargo = s;
    return output;
  }

  public DLLNode<T> getNext() {return _nextNode;}
  public DLLNode<T> setNext(DLLNode<T> newNext) {
    DLLNode<T> output = _nextNode;
    _nextNode = newNext;
    return output;
  }

  public DLLNode<T> getPrev() {return _prevNode;}
  public DLLNode<T> setPrev(DLLNode<T> newPrev) {
    DLLNode<T> output = _prevNode;
    _prevNode = newPrev;
    return output;
  }

}//end class DLLNode
