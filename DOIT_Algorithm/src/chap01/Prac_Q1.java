package chap01;

public class Prac_Q1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max4(1,2,3,4) = "+max4(1,2,3,4));
		System.out.println("max4(123,32,43,5) = " + max4(123,32,43,5));

	}

}
