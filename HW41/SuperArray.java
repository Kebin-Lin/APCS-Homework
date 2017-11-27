/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _data = new int[10];
      _size = 10;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
      String subt = "[";
      for (int i = 0; i < _size; i++) {
	  subt += _data[i] + ",";
      }
      return subt.substring(0,subt.length()-1) + "]";
  }


  //double capacity of SuperArray
  private void expand()
  {
      int[] a = new int[_size * 2];
      for (int i = 0; i < _size; i++) {
	  a[i] = _data[i];
      }
      _data = a;
      _size *= 2;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      _data[index] = newVal;
      return newVal;
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
 
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
         /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
