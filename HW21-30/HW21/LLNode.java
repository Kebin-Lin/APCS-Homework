//Kevin Lin
//APCS2 Pd1
//HW21c -- We Got a Little Ol' Convoy...
//2018-03-20
public class LLNode {
    private LLNode next;
    private String cargo;

    public LLNode() {
      next = null;
      cargo = "";
    }

    public LLNode(String data) {
      this();
      cargo = data;
    }

    public String set(String data) {
      String save = cargo;
      cargo = data;
      return save;
    }

    public String get() {return cargo;}

    public LLNode setNext(LLNode newNext) {
      LLNode save = next;
      next = newNext;
      return save;
    }

    public LLNode getNext() {return next;}
}
