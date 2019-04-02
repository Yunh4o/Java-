
public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = new int [20] ;
		a[0] = 1;
		a[1] = 1;
		
		for(int i = 2 ;i < a.length ; i++) {	
			a[i] = a[i-2] + a[i-1];
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
	
	}

}