package variables;

public class Equals {
 public static void main(String[] args) {
	String d="dog";
	String h="dog";
	String H="DOG";
	//equals
	if(d.equals(H)) {
		System.out.println("equals 1");
	}
	else if(d.equals(h)) {
		System.out.println("equals 2");
	}
	
	
	
	//==
	String n= new String("dog");
	String p= new String("dog");
	
	if(n.equals(p)) {
		System.out.println("equals 3");
	}
	if(n==p) {
		System.out.println("equals 4");
	}
	
	
	if(d==h)
		System.out.println("equals 5");
	if(d==H)
		System.out.println("equals 6");
	
	//equalignorecas
	if(d.equalsIgnoreCase(H)) {
		System.out.println("equals 7");
	}
	if(d.equalsIgnoreCase(h)) {
		System.out.println("equals 8");
	}
}
}
