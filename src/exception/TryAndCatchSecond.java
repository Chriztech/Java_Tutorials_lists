package exception;

public class TryAndCatchSecond {
	public static void main(String[] args) {
		String s=null;
	    try {
	      //int  y= 8/0;
	      //int[] myNumbers = {1, 2, 3};
	      //System.out.println(myNumbers[10]);
	      System.out.println(s.length());
	      
	      
	    
	    } 
	    catch (ArithmeticException e) {
		      System.out.println("Something went wrong."+e);
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println("Something went wrong."+e);
	    }
	    catch (Exception e) {
	      System.out.println("Something went wrong."+e);
	    } finally {
	      System.out.println("The 'try catch' is finished.");
	    }
	  
}}
