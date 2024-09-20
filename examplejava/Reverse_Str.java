package examplejava;

import java.util.*;

public class Reverse_Str {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		ReverseStr(n);
		
	}
	public static void ReverseStr(String n) {
		char[] a=n.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
