package examplejava;
import java.util.*;

public class sumofFact {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(sum(n));
		
	}
	static int sum(int n) {
		int sum=0;
		int result=0;
		int p =1;
		while(n>0) {
			int x=n%10;
			sum+=x;
			n=n/10;
		}
		if(sum>= 10 && sum<=99) {
			while(sum>0) {
				int x=sum%10;
				result+=x;
				sum=sum/10;
			}
			for(int i=1;i<=result;i++) {
				p*=i;
			}
		}
		else {
			for(int i=1;i<=sum;i++) {
				p*=i;
			}
		}
		return p;
	}

}
