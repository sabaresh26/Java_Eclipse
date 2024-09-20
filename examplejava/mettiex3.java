package examplejava;
import java.util.*;
// decrypt example ABC means ZAB 
public class mettiex3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		// stringbuilder is used for addor append ,insert,delete,replace ,reverse  the element in the variable 
		StringBuilder s=new StringBuilder();
		for(int i=0;i<n.length();i++) {	
			char c=n.charAt(i);
			if(c=='a') {
				s.append('z');
			}
			else {
				s.append((char)(c-1));
			}
		}
		System.out.println(s.toString());
		
		
		
	}
}
