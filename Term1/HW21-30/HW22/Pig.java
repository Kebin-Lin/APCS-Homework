/*
Kevin Lin
APCS pd8
HW22 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
2017-10-24
*/
/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
      if (w.indexOf(letter) == -1) {return false;}
      return true;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
      if (VOWELS.indexOf(letter.toLowerCase()) == -1) {return false;}
      return true;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
      w = w.toLowerCase();
      int ctr = 0;
      for (int i = 0; i < w.length(); i++) {
	  if (isAVowel(w.substring(i,i+1))) {ctr += 1;}
      }
      return ctr;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
      w = w.toLowerCase();
      for (int i = 0; i < w.length(); i++) {
	  if (isAVowel(w.substring(i,i+1))) {return true;}
      }
      return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
      String subt = "";
      for (int i = 0; i < w.length(); i++) {
	  if (isAVowel(w.substring(i,i+1))) {subt += w.substring(i,i+1);}
      }
      return subt;
  }


  public static void main( String[] args ) 
  {
      System.out.println(hasA("42Waffles","z")); //false
      System.out.println(hasA("42Waffles","a")); //true
      System.out.println(isAVowel("a")); //true
      System.out.println(isAVowel("A")); //true
      System.out.println(isAVowel("z")); //false
      System.out.println(countVowels("Hello")); //2
      System.out.println(countVowels("h3ll0")); //0
      System.out.println(hasAVowel("Hello")); //true
      System.out.println(hasAVowel("h3ll0")); //false
      System.out.println(allVowels("Hello")); //eo
      System.out.println(allVowels("h3ll0")); //
  }//end main()

}//end class Pig
