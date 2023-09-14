package exception;

public class TryAndCatch {
  public static void main(String[] args) {
	  int y=9;
	  
	  try {
		 y= 8/0;
	  }
	  catch(ArithmeticException e ) {
		  System.out.println("exception occured" + e);
	  }
	  
	  System.out.println(y);
	
}
}
