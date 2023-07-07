
public class NumberExample {

	public static void main(String[] args) {
		byte num1;
		num1 = 100;
		
		byte num2 = 0b01100100;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		
		byte num3 = -100;
		/*
		 *  01100100 (+100)
		 *  10011011 (1의 보수)
		 *       + 1 (2의 보수)
		 *       
		 *==================================
		 *       
		 *  10011100 (-100) => 100의 2의 보수
		 */
		byte num4 = (byte)0b10011100;
		
		System.out.println("num3=" + num3);
		System.out.println("num4=" + num4);
	}

}
