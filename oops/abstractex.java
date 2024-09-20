package oops;
import java.util.*;
abstract class shape{
	abstract public double area();
}
class square extends shape{
	double area;
	square(double a){
		area=a;
	}
	public double area() {
		return area*area;
	}
}
class triangle extends shape{
	double len;
	double breath;
	triangle(double l,double b){
		len=l;
		breath=b;
	}
	public double area() {
		return (len*breath)/2;
	}
}
public class abstractex {
	public static void main(String[] args) {
		/*square s1=new square(12);
		System.out.println(s1.area());
		triangle t1=new triangle(12,22);
		System.out.println(t1.area());  
		
		shape[] s=new shape[4];
		s[0]=new square(2);
		s[1]=new square(3);
		s[2]=new triangle(34,39);
		s[3]=new triangle(7,3); 
		
		
		for(shape sha:s) {
			System.out.println(sha.area());
		} */
		
		
		ArrayList <shape> s=new ArrayList();  
		          
		s.add(new square(2));
		s.add(new square(5));
		s.add(new triangle(12,22));
		s.add(new triangle(7,3));
		
		for(shape sha:s) {
			System.out.println(sha.area());
		}
		
	}
	
}
