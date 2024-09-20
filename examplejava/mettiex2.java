package examplejava;
import java.util.*;
//library question n is size of array which is "a" example n=2, k=4,a=[10,2]  
//check the 10<=k if true means add the 10 value in book like that we check the all the element in the array else means add the k value in book now print the book 
public class mettiex2 {
	public int maxbook(int n,int k,int[] a) {
		int book=0;
	    for(int i=0;i<n;i++) {
	    	/*if(k>=a[i]) {
	    		book+=a[i];
	    	}
	    	else {
	    		book+=k;
	    	}*/
	    	
	    	book+=Math.min(k,a[i]);
	    }
	    return book;

	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
	    int k=in.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=in.nextInt();
	    }
	    mettiex2 obj=new mettiex2();
	 
	    System.out.println(obj.maxbook(n,k,a));
	}
}
