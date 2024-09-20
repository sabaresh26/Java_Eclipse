package oops;
import java.util.ArrayList;
public class arraylist {
public static void main(String[] args) {
	ArrayList <Integer> arr=new ArrayList();
	arr.add(4);
	arr.add(5);
	arr.add(9);
	arr.add(7);
	for(int i:arr) {
		System.out.print(i+" ");
	}
	arr.remove(0);

	int x=arr.size();
	System.out.println(x);
	
	for(int i:arr) {
		System.out.print(i+" ");
	}
	
	
}
}
