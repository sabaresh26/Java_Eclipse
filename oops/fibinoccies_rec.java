package oops;
import java.util.*;
public class fibinoccies_rec {
	public static int fibi(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1 || n==2) {
			return 1;
		}
		return fibi(n-2)+fibi(n-1);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fibi(i)+" ");
		}
	}
}
