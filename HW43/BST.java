//Kevin Lin
//APCS2 Pd1
//HW42 -- BSTs is the Perfect Place for Shade that’s just how I feel
//2018-05-02

/*****************************************************
* class BST - v1:partial
* Implementation of the BINARY SEARCH TREE abstract data type (ADT)
*
* A BST maintains the invariant that, for any node N with value V,
* L<V && V<R, where L and R are node values in N's left and right
* subtrees, respectively.
* (Any value in a node's left subtree must be less than its value,
*  and any value in its right subtree must be greater.)
* This BST only holds ints (its nodes have int cargo)
*****************************************************/

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /*****************************************************
  * default constructor
  *****************************************************/
  BST( )
  {
    _root = null;
  }


  /*****************************************************
  * void insert( int )
  * Adds a new data element to tree.
  *****************************************************/
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      //if no left child, make newNode the left child
      if ( stRoot.getLeft() == null )
      stRoot.setLeft( newNode );
      else //recurse down left subtree
      insert( stRoot.getLeft(), newNode );
      return;
    }
    else { // new val >= curr, so look down right subtree
      //if no right child, make newNode the right child
      if ( stRoot.getRight() == null )
      stRoot.setRight( newNode );
      else //recurse down right subtree
      insert( stRoot.getRight(), newNode );
      return;
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null ) //stepped beyond leaf
    return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null ) //stepped beyond leaf
    return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null ) //stepped beyond leaf
    return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*****************************************************
  * TreeNode search(int)
  * returns pointer to node containing target,
  * or null if target not found
  *****************************************************/
  TreeNode search( int target )
  {
    return search(target,_root);
  }

  TreeNode search( int target, TreeNode sub ) {
    if (sub == null) return null;
    if (sub.getValue() == target) return sub;
    if (target < sub.getValue()) return search(target,sub.getLeft());
    else return search(target,sub.getRight());
  }

  /*****************************************************
  * int height()
  * returns height of this tree (length of longest leaf-to-root path)
  * eg: a 1-node tree has height 0
  *****************************************************/
  public int height()
  {
    return height(_root);
  }

  public int height(TreeNode sub) {
    if (sub == null) return -1;
    int left = 1 + height(sub.getLeft());
    int right = 1 + height(sub.getRight());
    return (left > right) ? left : right;
  }


  /*****************************************************
  * int numLeaves()
  * returns number of leaves in tree
  *****************************************************/
  public int numLeaves()
  {
    return numLeaves(_root);
  }

  public int numLeaves(TreeNode sub) {
    if (sub == null) return 0;
    if (sub.getLeft() == null && sub.getRight() == null) return 1;
    return numLeaves(sub.getLeft()) + numLeaves(sub.getRight());
  }




  //main method for testing
  public static void main( String[] args )
  {
    BST arbol = new BST();

    //PROTIP: sketch state of tree after each insertion
    //        ...BEFORE executing these.
    arbol.insert( 4 ); arbol.insert( 2 ); arbol.insert( 5 );
    arbol.insert( 6 ); arbol.insert( 1 ); arbol.insert( 3 );

    System.out.println( "\n-----------------------------");
    System.out.println("Number of leaves: " + arbol.numLeaves());
    System.out.println( "\n-----------------------------");
    System.out.println( "Height: " + arbol.height());
    System.out.println( "\n-----------------------------");
    System.out.println( "Search for 99: " + arbol.search(99));
    System.out.println( "\n-----------------------------");
    System.out.println( "Search for 6: " + arbol.search(6));

  }

}//end class
