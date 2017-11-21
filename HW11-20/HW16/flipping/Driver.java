/*
Kevin Lin
APCS1 pd8
HW15 -- Get It While You Can
2017-10-12
*/

public class Driver
{
  public static void main( String[] args )
  {

    //build Objects from blueprint specified by class Coin

    //test default constructor

    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) {
	    System.out.println( "Matchee matchee!" );
    }
    else {
	    System.out.println( "No match. Firestarter you can not be." );
    }
    
    int x = 1000;
    int y = 2000;
    int matchNum = 0;
    wayne.reset();
    
    System.out.println("Part 1A");
    while (x > 0) {
    	x -= 1;
    	wayne.flip();
    }
    
    System.out.println("wayne info");
    wayne.flipInfo();
    wayne.reset();
	yours.reset();
	
    while (y > 0) {
    	wayne.flip();
    	yours.flip();
    	if (yours.equals(wayne)) {
    		y -= 1;
    	}
    }
    
    System.out.println("Part 1B");
    System.out.println("wayne info");
    wayne.flipInfo();
    System.out.println("yours info");
    yours.flipInfo();
    wayne.reset();
	yours.reset();
	
	while (matchNum < 13000 || matchNum % 2001 != 0) {
		wayne.flip();
		yours.flip();
		if (yours.equals(wayne)) {
			matchNum += 1;
		}
	}
	
	System.out.println(matchNum % 2001);
	System.out.println("Part 1C");
	System.out.println("wayne info");
    wayne.flipInfo();
    System.out.println("yours info");
    yours.flipInfo();
    
  }//end main()

}//end class
