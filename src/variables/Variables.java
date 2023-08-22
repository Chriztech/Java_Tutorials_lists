package variables;

public class Variables {
	
	    static int m=100;//static variable  
	    void method()  
	    {    
	        int n=90;
	        int y=n*m;
	        System.out.println("output ="+y);
	        //local variable    
	    }  
	    public static void main(String args[])  
	    {  
	        int data=50;//instance variable
	        Variables v=new Variables();
	        v.method();
	        
	    }  
	}


