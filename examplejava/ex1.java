package examplejava;
import java.util.*;
public class ex1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			int e=in.nextInt();
			arr.add(e);
		}
		int x=in.nextInt();
		int y=in.nextInt();
		arr.add(x,y);
		System.out.println("Array after insertion is");
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
}
