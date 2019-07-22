
public class Test01 {

	public static void main(String[] args) {
		
		final int  COUNTS = 100; 
		int []numbers = new int[COUNTS];
		
		int a1 = 100;
		int a2 = 200;
		int a3 = 120;
		int a4 = 150;
		int sum  = a1 + a2 + a3 + a4 ;
		int max = a1;
		int min = a1;
		
		
//		//最大值
//		if (a2 > max) {
//			max = a2;
//		}
//		if (a3 > max) {
//			max = a3;
//		}
//		if (a4 > max) {
//			max = a4;
//		}
//		
//		//最小值
//		if (a2 < min) {
//			min = a2;
//		}
//		if (a3 < min) {
//			min = a3;
//		}
//		if (a4 < min) {
//			min =a4;	 
//		}
//		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		
	}

}
