package examplejava;
import java.util.*;

public class RemoveNonAlph {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		RemovenonAlph(n);
		
	}
	public static void RemovenonAlph(String n) {
		char[] a=n.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A' && a[i]<='Z' || a[i]>='a' && a[i]<='z' ) {
				System.out.print(a[i]);
			}
			else {
				continue;
			}
		}
	}
}


