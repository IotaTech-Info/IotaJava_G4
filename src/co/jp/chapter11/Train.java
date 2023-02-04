package co.jp.chapter11;

public class Train {
	//定員5人
	  private static final int HUMAN_MAX= 5;
	//10両編成
	  private static final int TRAIN_CLASS = 10;
	  
	  private int numPassengers;
	  
	  public Train() {
	    this.numPassengers = 0;
	  }
	  
	  public boolean board(int num) {
	    if (numPassengers + num <= TRAIN_CLASS * HUMAN_MAX) {
	      numPassengers += num;
	      return true;
	    } else {
	      return false;
	    }
	  }
	  
	  public int getNumPassengers() {
	    return numPassengers;
	  }
}

