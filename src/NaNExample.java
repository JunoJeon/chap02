
public class NaNExample {
	/*
	 * 1. +0, -1
	 * 2. Infinity, -Infinity
	 * 3. NaN
	 */

	public static void main(String[] args) {
		double d1 = Double.NaN;
		double d2 = 0.0/0.0;
		
		System.out.println("dl = " + d1);
		System.out.println("d2 = " + d2);
	}

}
