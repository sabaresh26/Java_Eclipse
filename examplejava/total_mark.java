package examplejava;
//invoking method 
// Declaring main class in main method
import java.util.*;

class box{
	int n;
	int[] a;
	int marks() {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
}
public class total_mark {

	public static void main(String[] args) {
		box obj=new box();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Name :");
		String name=in.nextLine();
		System.out.print("Enter the Roll_No :");
		int roll_No=in.nextInt();
		System.out.print("How many Subject :");
		obj.n=in.nextInt();
		obj.a=new int[obj.n];
		for(int i=0;i<obj.n;i++) {
			System.out.print("Mark"+(i+1)+": ");
			obj.a[i]=in.nextInt();
			
			
		}
		int result=obj.marks();
		System.out.println("Total mark : "+result);
		
		
	}
	
}


