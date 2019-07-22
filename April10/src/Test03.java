

@SuppressWarnings("unused")
public class Test03 {
	public static void main(String[] args) {
		//递归调用  一个函数调用跟他功能和名字一样的函数
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		int sum1 = sum(100);
//		System.out.println(sum1);
//		printInt(123456);
//		printIntRecursion(123456);
//		reverseIntRecursion(123);
		
//		System.out.println(reverseIntRecursion(321));
		printOctal(16);
	}
	
	
	public static int sum(int x) {
		if (x == 1) {
			return 1;
		}
		return x + sum(x - 1);
	}
	
	public static void printInt(int x) {
		while (x > 0) {
			System.out.println(x % 10);
			x /= 10;
		}
	}
	
	public static void printIntRecursion(int x) {
		if (x == 0) {
			//递归出口
			return;
		}
		printIntRecursion(x / 10);
		System.out.println(x % 10);	
	}
	
	
	public static int reverseInt(int x) {
		int result = 0;
		while (x > 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		return result;
	}
	
//	public static int reverseIntRecursion(int x) {
//		
//		if (x == 0) {
//			return 0;
//		}
//		return x  % 10 * 10 + reverseIntRecursion(x / 10) ;
//	}
	
	public static void printBinary(int x) {
		if (x == 0) {
			return;
		}
		printBinary(x / 2);
		System.out.print(x % 2);
	}
	
	public static void printOctal(int x) {
		if (x == 0) {
			return;
		}
		printOctal(x / 8);
		System.out.print(x % 8);
	}
	
}
