package oops;

public class Stackdemo {
	public static void main(String[] args) {
		stack s1=new stack();
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(44);
		s1.push(6);
		s1.push(7);
		s1.push(44);
		s1.push(44);
		s1.push(2);
		s1.push(3);
		s1.push(44);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}
