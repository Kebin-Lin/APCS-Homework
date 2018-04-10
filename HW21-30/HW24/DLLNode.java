/*****************************************************
* class DLLNode
* Implements a doubly-linked node,
* for use in lists and other collection classes.
* Stores data of type String
*****************************************************/

public class DLLNode
{
  private String _cargo;    //cargo may only be of type String
  private DLLNode _nextNode, _prevNode; //pointers to next, prev DLLNodes

  public DLLNode( String value, DLLNode next, DLLNode prev ) {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }

  public String getCargo() {return _cargo;}
  public String setCargo(String s) {
    String output = _cargo;
    _cargo = s;
    return output;
  }

  public DLLNode getNext() {return _nextNode;}
  public DLLNode setNext(DLLNode newNext) {
    DLLNode output = _nextNode;
    _nextNode = newNext;
    return output;
  }

  public DLLNode getPrev() {return _prevNode;}
  public DLLNode setPrev(DLLNode newPrev) {
    DLLNode output = _prevNode;
    _prevNode = newPrev;
    return output;
  }

}//end class DLLNode
