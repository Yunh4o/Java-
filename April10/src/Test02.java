
public class Test02 {

	public static void main(String[] args) {
				
		fn(0);
	}

	
	public static void fn(int count) {
		//递归调用必须有出口
		if (count > 10000) {
			return;
		}
		System.out.println(count);
		fn(count + 1);
	}	
	
}
