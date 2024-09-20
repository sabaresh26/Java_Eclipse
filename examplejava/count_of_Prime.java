package examplejava;
import java.util.Scanner;
public class count_of_Prime {
	
	private static boolean isprime(int n) {
		
		if(n==1) {
			return false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int e=in.nextInt();
		int prime=0;
		for(int i=s;i<e;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					
				}
			}
			if(isprime(count)) {
				prime++;
			}
		}
		System.out.println(prime);
	}

}
