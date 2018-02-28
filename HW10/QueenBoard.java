//Kevin Lin
//APCS2 Pd1
//HW10 -- [Freddie Mercury, Brian May, Roger Taylor, John Deacon] x n
//2018-02-28

/***
* class QueenBoard
* Generates solutions for N-Queens problem.
*/

public class QueenBoard
{
  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
  * precondition: board is filled with 0's only.
  * postcondition:
  * If a solution is found, board shows position of N queens,
  * returns true.
  * If no solution, board is filled with 0's,
  * returns false.
  */
  public boolean solve()
  {
    if (solveH(0)) {printSolution(); return true;}
    return false;
  }


  /**
  *Helper method for solve.
  */
  private boolean solveH( int col )
  {
    int i = 0;
    while (i < _board.length) {
      if (addQueen(i,col)) {
        if (col + 1 >= _board.length) {return true;} //All queens have been placed
        if(solveH(col + 1)) {return true;} //Try to place next queen
        removeQueen(i,col); //Remove queen placed
      }
      i++;
    }
    return false;
  }


  public void printSolution()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        if (_board[r][c] == 1) {ans += "Q\t";}
        else {ans += "_\t";}
      }
      ans += "\n";
    }
    System.out.println(ans);
  }



  //================= YE OLDE SEPARATOR =================

  /***
  * Places a queen on the given position
  * precondition: Board is not solved
  * postcondition: If a queen cannot be placed at the given position, return
  false
  If a queen can be placed at the given position, return true and decrement
  diagonals and the horizontal to the right
  */
  private boolean addQueen(int row, int col){
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
  * Removes a queen at a given position
  * precondition: Board is not solved
  * postcondition: If there is no queen at the position, return false
  Else remove the queen and increment diagonals and the horizontal to the right
  */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
  * Prints a string of the board
  * precondition: A board exists
  * postcondition: Return a string that reflects the state of the board
  */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(8);
    System.out.println(b);
    b.solve();
  }

}//end class
