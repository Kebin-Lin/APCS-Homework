//Team Cookie - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 -- Pd1
//HW03 -- I Am Still Searching
//2018-02-02

//Algo Summary:
//The search starts at the top right corner, which allows it to move down if
//the number at the coordinates are smaller than the target, and move left if
//the number at the coordinates are larger than the larget. If the coordinates
//go out of bounds, then the algorithm returns the String "(-1,-1)".

public class MatrixFinder {

  public static String find(int[][] matrix, int target) {
    int column = matrix[0].length-1;
    int row = 0;
    while (row < matrix.length && column >= 0) {
      if (matrix[row][column] == target) {return "(" + row + "," + column + ")";}
      if (matrix[row][column] > target) {column -= 1;}
      else {row += 1;}
    }
    return "(-1,-1)";
  }

  public static void main(String[] args) {
    int[][] matrix = { {1,2,3,4},
                       {2,3,4,5},
                       {3,4,5,6},
                       {4,5,6,7} };
    int[][] matrix2 = { { 2, 4, 6, 8},
                        {10,12,14,16},
                        {18,20,22,24},
                        {26,28,30,32} };
    System.out.println(MatrixFinder.find(matrix,5)); //(1,3)
    System.out.println(MatrixFinder.find(matrix2,3)); //(-1,-1)
  }
}
