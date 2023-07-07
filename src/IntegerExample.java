
public class IntegerExample {

	public static void main(String[] args) {
		int max = 0b01111111_11111111_11111111_11111111; //가장 큰수
		int min = 0b10000000_00000000_00000000_00000000; //가장 작은수
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		max = max+1;
		System.out.println("max = " + max); //오버플로어 현상
		min = min-1;
		System.out.println("min = " + min); //언더플로어 현상
		
	}

}
