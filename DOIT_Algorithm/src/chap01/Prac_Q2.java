package chap01;

public class Prac_Q2 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("min3(1,2,3) = " + min3(1,2,3));
		System.out.println("min3(12,23,34) = " + min3(12,23,34));

	}

}
