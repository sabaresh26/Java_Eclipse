package examplejava;

import java.util.*;

public class Prime_Num {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		if(isPrime(n)==1) {
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
		sumofFact sumobj=new sumofFact();
		System.out.println(sumobj.sum(n));
		
	}
	static int isPrime(int n) {
		int c=1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c=0;
				break;
			}
		}
		if(c==1) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
}
