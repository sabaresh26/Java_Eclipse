package examplejava;
import java.util.*;
import java.sql.*;

public class for_diagonal {
	public static int diagonal(int n,int[][] mat) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					sum+=mat[i][j];
				}
				
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=n-1-i;j<=n-1-i;j++) {
				if(i!=j) {
					sum+=mat[i][j];
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		while_diagonalsum input=new while_diagonalsum();
		int[][] mat=input.input();
		int n=mat.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Sum = "+diagonal(n,mat));
		
	}
	
}







