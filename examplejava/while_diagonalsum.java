package examplejava;
import java.util.*;


public class while_diagonalsum  {
	
	public static int diagonal(int[][] mat,int n) {
		int i=0,j=0,sum=0;
		while(i<n) {		
			sum+=mat[i][j];
			i++;
			j++;
			
		}
		i=0;
		j=n-1-i;
		while(i<n) {
			if(i!=j) {
				sum+=mat[i][j];
			}
			i++;
			j--;
		}
		return sum;
		
	}
	public static int[][] input() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Row and Coloumn : ");
		int n=in.nextInt();
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=in.nextInt();
			}
		}
		return mat;
	}
		
	public static void main(String[] args) {
		int[][] mat=input();
		int n=mat.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Sum = "+diagonal(mat,n));
		
	}
	
}







