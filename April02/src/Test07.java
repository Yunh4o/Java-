
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			int r = (int)Math.floor(Math.random()*100) + 1;
			a[i] = r;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
