package examplejava;

import java.util.Scanner;

public class zigzag {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		char[] arr=n.toCharArray();
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+"   ");
		}
		System.out.println("");
		
		for(int i=1;i<arr.length;i+=2) {
			if(i==1) {
				System.out.print("  "+arr[i]);
			}
			else {
				System.out.print("   "+arr[i]);
			}
		}

	}
}
