//Kevin Lin
//APCS2 Pd1
//HW21c -- Rockin' Through the Night
//2018-03-20
public class LList implements List {

  private LLNode head;
  private int size;

  public LList() {
    head = null;
    size = 0;
  }

  public String get(int i) {
    LLNode node = head;
    for(int index = 0; index < i; index++) {
      node = node.getNext(); //Gets the next node of the node that we're currently on
    }
    return node.get();
  }

  public String set(int i, String x) {
    LLNode node = head;
    for(int index = 0; index < i; index++) {
      node = node.getNext();
    }
    return node.set(x);
  }

  public boolean add(String x) {
    LLNode newNode = new LLNode(x);
    if (head != null) {
      LLNode node = head;
      while(node.getNext() != null) {
        node = node.getNext();
      }
      node.setNext(newNode);
      size++;
      return true;
    }
    head = newNode;
    size++;
    return true;
  }

  public boolean remove(int index) {
    LLNode node = head;
    if (index == 0) {head = node.getNext(); size--; return true;}
    for (int i = 0; i < index-1; i++) {
      node = node.getNext();
    }
    node.setNext(node.getNext().getNext());
    size--;
    return true;
  }

  public int size() {return size;}

  public String toString() {
    String output = "[ ";
    LLNode node = head;
    for (int i = 0; i < size; i++) {
      output += node.get() + ",";
      node = node.getNext();
    }
    return output.substring(0,output.length()-1) + " ]";
  }

  public static void main(String[] args) {
    LList list = new LList();
    System.out.println(list); //[ ]
    list.add("Harry");
    list.add("Fred");
    list.add("George");
    System.out.println(list); //[ Harry,Fred,George ]

    System.out.println(list.get(1)); //Fred

    list.set(0,"Ron");
    System.out.println(list); //[ Ron,Fred,George ]

    list.remove(1);
    System.out.println(list); //[ Ron, George ]
  }
}
