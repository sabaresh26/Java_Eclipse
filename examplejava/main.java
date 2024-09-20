package examplejava;
import java.util.*;


public class main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int sum=0;
		
		for(int i:a) {
			sum+=i;
		}
		System.out.println("Sum : "+sum);
		
	}
}







