package methods;

	
public class StaticVariable {
	String brandname;
	int price;
	static String name;
	static int count;
	
	//static block
	static {
		
		name="mobile";
	}
	void show() {
		System.out.println("brandname :" +brandname +"price : " +price +"name :"  +name );
	}
	//actually static method cannot access non static variables with object reference we can access.
	static String colour(StaticVariable obj) {
		System.out.println("brandname :" +obj.brandname +"price : " +obj.price +"name :"  +name );
		return "blue";
		
	
		
		
	}
	
	public static void main(String[] args) {
		StaticVariable neethu=new StaticVariable();
		
		
		neethu.brandname="samsung";
		neethu.price=56000;
		StaticVariable.colour(neethu);
		
		
		StaticVariable nithin=new StaticVariable();
		
		nithin.brandname="nokia";
		nithin.price=15000;
		StaticVariable.colour(nithin);
		
		//StaticVariable.name="mobile";
		
		
		neethu.show();
		nithin.show();
		
		
	}

}
