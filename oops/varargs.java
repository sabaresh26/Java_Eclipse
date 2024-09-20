package oops;
// min and max value using varargs
public class varargs {
	static int maxval(int... value) {
		int max=Integer.MIN_VALUE;
		for(int k:value) {
			if(k>max) {
				max=k;
			}
		}
		return max;
		
	}
	static double maxval(double... value) {
		double max=Integer.MIN_VALUE;
		for(double k:value) {
			if(k>max) {
				max=k;
			}
		}
		return max;
		
	}

	static int minval(int... value) {
		int min=Integer.MAX_VALUE;
		for(int k:value) {
			if(k<min) {
				min=k;
			}
		}
		return min;
		
	}
	static double minval(double... value) {
		double min=Integer.MAX_VALUE;
		for(double k:value) {
			if(k<min) {
				min=k;
			}
		}
		return min;
		
	}
	public static void main(String[] args) {
		int n=minval(2,3,5,77,4,1);
		System.out.println(n);
		double m=minval(2.3,2.4,99,33,23.3,2,1.3);
		System.out.println(m);
		
		System.out.println(minval());
		
	}
}
