package examplejava;
import java.util.*;

public class passcode {
	static List<Integer> timetaken(int n,String[] arr,String pass,int k) {
		List<Integer> result=new ArrayList();
		int time=0;
		int wrong=0;
		
		for(int i=0;i<n;i++) {
			time++;
			if(arr[i].equals(pass)) {
				
				result.add(time);
			}
			else {
				wrong++;
				if(wrong%k==0) {
					time+=5;
				}
			}
		}
		result.add(time);
		return result;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.next();
		}
		String pass=in.next();
		int k=in.nextInt();
		List<Integer> result=timetaken(n,arr,pass,k);
		for(int i:result) {
			System.out.println(i);
		}
	}
}
