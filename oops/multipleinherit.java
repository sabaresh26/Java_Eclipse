package oops;

class A{
	void display(){
		System.out.println("Welcome......");
	}
}
class B extends A{
	
}
class C extends B{
	
}

public class multipleinherit {
	public static void main(String[] args) {
		C c=new C();
		Object b=new B();
		
		c.display();
	}
}
