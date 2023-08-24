package methods;

public class Method {
	int add(int x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Method m= new Method();
		int y=m.add(3, 4);
		System.out.println(y);
	}

}
