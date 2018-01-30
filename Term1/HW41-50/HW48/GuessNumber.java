//Kevin Lin
//APCS1 pd8
//HW48 -- Keep Guessing
//2017-12-07

/*==================================================
class GuessNumber -- fun fun fun!

eg, sample interaction with end user:
Guess a # fr 1-100: 50
Too high
Guess a # fr 1-49: 25
Too low
Guess a # fr 26-49: 38
Correct! It took 3 guesses
==================================================*/

import cs1.Keyboard;

public class GuessNumber
{
  //instance vars
  private int _lo, _hi, _guessCtr, _target;


  /*==================================================
  constructor -- initializes a guess-a-number game
  pre:
  post: _lo is lower bound, _hi is upper bound,
  _guessCtr is 1, _target is random int on range [_lo,_hi]
  ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = a;
    _hi = b;
    _guessCtr = 1;
    _target = (int) (Math.random() * (_hi + 1 - _lo)) + _lo;
  }


  /*==================================================
  void playRec() -- Prompts a user to guess until guess is correct.
  Uses recursion.
  pre:
  post:
  ==================================================*/
  public void playRec()
  {
    int input = -1;
    System.out.println("Guess a number between " + _lo + " and " + _hi +": ");
    while (!(input <= _hi && input >= _lo)) {
      input = Keyboard.readInt();
    }
    if (input == _target) System.out.println("Correct! It took " + _guessCtr + " guess(es).");
    else {
      _guessCtr++;
      if (input > _target) {
        System.out.println("Too high, try again...");
        _hi = input;
      }
      else {
        System.out.println("Too low, try again...");
        _lo = input;
      }
      playRec();
    }
  }


  /*==================================================
  void playIter() -- Prompts a user to guess until guess is correct.
  Uses iteration.
  pre:
  post:
  ==================================================*/
  public void playIter()
  {
    int input = -1;
    while (true) {
      input = -1;
      System.out.println("Guess a number between " + _lo + " and " + _hi +": ");
      while (!(input <= _hi && input >= _lo)) {
        input = Keyboard.readInt();
      }
      if (input == _target) {
        System.out.println("Correct! It took " + _guessCtr + " guess(es).");
        return;
      }
      else {
        _guessCtr++;
        if (input > _target) {
          System.out.println("Too high, try again...");
          _hi = input;
        }
        else {
          System.out.println("Too low, try again...");
          _lo = input;
        }
      }
    }
  }

  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    playRec();
    //playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);

    //start the game
    g.play();
  }//end main

}//end class
