
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[20];
		
		
		for (int i = 0; i < arr.length; i++) {
			int r  = (int)Math.floor(Math.random() * (97 - 23 +1 )) +23;
			arr[i] = r;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+":"+arr[i]);
		}
		
		int max1 = 0;
		int max2 = 0;
		int max2Index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];	
			}else if (max2 < arr[i]) {
				max2 = arr[i];
			}		
			
		}		
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		for (int i = 0; i < arr.length; i++) {
			if (max2 < arr[i]) {
				max2 = arr[i];
				if (max2 > max1) {
					int temp = max1;
					max1 = max2;
					max2 = temp;
				}
			}
		}
		
	}

}
