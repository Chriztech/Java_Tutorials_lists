package methods;

public class MethodOverloading {
	int add(int x,int y,int z) {
		return x+y+z;
	}
	//1)no.of arguments diff
	int add(int x, int y) {
		return x+y;
	}
	//2)return type,args datatype diff
	double add(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		MethodOverloading o=new MethodOverloading();
		System.out.println(o.add(9, 9));
		System.out.println(o.add(5.6, 6.5));
		System.out.println(o.add(1, 2, 3));
	
		
	}

}
