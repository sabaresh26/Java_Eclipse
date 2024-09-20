package examplejava;
import java.util.*;
//  1 2 1 2 5 3 3 4   if the first num + third num == second num add count like that increase the i to compare the next element 
class subarray{
	public int sum(int[] arr,int size){
		int count=0;
		for(int i=0;i<size-2;i++) {
		
			if(arr[i]+arr[i+2]==arr[i+1]) {
				count++;
			}
		}
		return count;
	}
}
public class mettiex {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the element of the array : ");
		String[] input=in.nextLine().split(" ");
		int[] arr=new int[input.length];
		System.out.println("Enter the size of Array : ");
		int size=in.nextInt();
		
		for(int i=0;i<size;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		subarray sub=new subarray();
		if(size!=input.length) {
			System.out.println("Given size doesn't match in given array");
		}
		else {
			System.out.println(sub.sum(arr, size));
		}
		
	}
}
