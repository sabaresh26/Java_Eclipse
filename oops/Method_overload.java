package oops;

public class Method_overload {
	static int avg(int a,int b) {
		int x=(a+b)/2;
		return x;
	}
	static double avg(double a,double b) {
		double x=(a+b)/2;
		return x;
	}
	public static void main(String[] args) {
		System.out.println(avg(2,3));
		System.out.println(avg(2.9,3.5));
	}
}
