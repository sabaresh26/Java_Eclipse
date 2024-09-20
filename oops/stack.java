package oops;

public class stack{
	int[] x=new int[9];
	int tos=-1;
	void push(int item){
		if(tos==8) {
			System.out.println("Stack is full");
		}
		else {
			x[++tos]=item;
		}
		
	}
	int pop() {
	    if(tos>=0) {
			return x[tos--];
		}
		else {
			System.out.print("Stack is Empty ");
			return -1;
		}
		
	}
}