package examplejava;
//Remove a vowels and space in input
import java.util.*;
public class removeVowels {
	public static void main(String[] args) {
		 Scanner in =new Scanner(System.in);
		 String n=in.nextLine();
		 RemoveVowels(n);
		 
	}
	public static void RemoveVowels(String n){
		char[] a=n.toCharArray();
		for(int i=0;i<a.length;i++) {
			 if(a[i]==' '||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'|| a[i]=='I'||a[i]=='O'||a[i]=='U' ) {
				 continue;
			 }
			 else {
				 System.out.print(a[i]);
			 }
		 }
	}

}