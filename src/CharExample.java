import javax.print.attribute.SetOfIntegerSyntax;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';			// 2byte, utf-16(한글자를 16비트로표현한다)
		char c2 = 65;
		char c3 = 0b01000001;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		
		char c4 = '가';
		
		System.out.println("c4 = " + c4);
		
		int ga = c4;
		
		System.out.println("c4 = " + ga);
		
		char hit = '힣';
		
		System.out.println("hit = " + hit);
	}

}
