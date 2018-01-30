//Kevin Lin
//APCS1 pd8
//HW58 -- Preparing to Launch
//2017-12-20

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column):
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1]
 *
 * TASK:
 * Implement methods below, categorize runtime of each.
 * Test in main method.
 ***/


public class Matrix
{
  //constant for default matrix size
  private final static int DEFAULT_SIZE = 2;

  private Object[][] matrix;

  //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
  public Matrix( )
	{
    matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
  }


  //constructor intializes an a*a matrix
  public Matrix( int a )
  {
    this();
    matrix = new Object[a][a];
  }


  //return size of this matrix, where size is 1 dimension
  private int size()
  {//O(1)
    return matrix.length;
  }


  //return the item at the specified row & column
  private Object get( int r, int c )
  {//O(1)
    return matrix[r][c];
  }


  //return true if this matrix is empty, false otherwise
  private boolean isEmpty()
  {//O(n)
    for (Object[] i : matrix) {
      for (Object i2 : i) {
        if (i2 != null) {return false;}
      }
    }
    return true;
  }


  //overwrite item at specified row and column with newVal
  //return old value
  private Object set( int r, int c, Object newVal )
  {//O(1)
    r--; c--;
    Object oldVal = matrix[r][c];
    matrix[r][c] = newVal;
    return oldVal;
  }


  //return String representation of this matrix
  // (make it look like a matrix)
  public String toString()
  {//O(n) Reads once
    String out = "";
    for (Object[] i : matrix) {
      out += "| ";
      for (Object i2 : i) {
        out += i2 + " ";
      }
      out += "|\n";
    }
    return out.substring(0,out.length()-1);
  }


  //override inherited equals method
  //criteria for equality: matrices have identical dimensions,
  // and identical values in each slot
  public boolean equals( Object rightSide )
  {//O(n) Reads both once
    if (!(rightSide instanceof Matrix)) {return false;}
    else if ( ((Matrix)rightSide).matrix.length != matrix.length ) {return false;}
    for (int i = 0; i < matrix.length; i++) {
      for (int i2 = 0; i2 < matrix.length; i2++) {
        if ( !((Matrix)rightSide).matrix[i][i2].equals(matrix[i][i2]) ) {return false;}
      }
    }
    return true;
  }


  //swap two columns of this matrix
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapColumns( int c1, int c2  )
  {//O(n) Reads both once
    c1--; c2--;
    Object temp;
    for (int i = 0; i < matrix.length; i++) {
      temp = matrix[i][c1];
      matrix[i][c1] = matrix[i][c2];
      matrix[i][c2] = temp;
    }
  }


  //swap two rows of this matrix
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapRows( int r1, int r2  )
  {//O(1)
    r1--; r2--;
    Object[] temp = matrix[r1];
    matrix[r1] = matrix[r2];
    matrix[r2] = temp;
  }


  //main method for testing
  public static void main( String[] args )
  {
    Matrix m1 = new Matrix();
    System.out.println("Printing default Matrix:");
    System.out.println(m1);

    System.out.println("\nIs this matrix empty? " + m1.isEmpty());

    Matrix m2 = new Matrix(4);
    System.out.println("\nPrinting empty Matrix of size 4:");
    System.out.println(m2);

    System.out.print("\nDoes m1.equals(m2)?");
    System.out.println(" " + m1.equals(m2));

    for (int i = 1; i <= m2.size(); i++) {
      for (int i2 = 1; i2 <= m2.size(); i2++) {
        m2.set(i, i2, ((i-1)*m2.size()) + i2);
      }
    }

    System.out.println("\nPopulated Matrix m2: \n" + m2);

    System.out.println("Is this matrix empty? " + m2.isEmpty());

    Matrix m3 = new Matrix(4);
    for (int i = 1; i <= m3.size(); i++) {
      for (int i2 = 1; i2 <= m3.size(); i2++) {
        m3.set(i, i2, ((i-1)*m3.size()) + i2);
      }
    }

    System.out.println("\nNew populated Matrix m3: \n" + m3);

    System.out.println("\nDoes m2.equals(m3)? " + m2.equals(m3));

    System.out.println("\nSwapping row 3 with 4 on m2");
    m2.swapRows(3,4);
    System.out.println(m2);

    System.out.println("Swapping column 3 with 4 on m2");
    m2.swapColumns(3,4);
    System.out.println(m2);
  }

}//end class Matrix
