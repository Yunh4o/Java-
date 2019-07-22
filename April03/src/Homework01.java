
public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [20];
		
		for (int i = 0; i < arr.length; i++) {
			int r = (int)Math.floor(Math.random() *( 97 - 23 + 1 ))+ 23;
			arr[i] = r;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
		}
		
		int maxIndex = 0 ;
		int max2Index = 0;
		int minIndex = 0;
		for (int i = maxIndex + 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				max2Index = maxIndex;
				maxIndex = i;
			}else if (arr[i] > arr[max2Index]) {
				max2Index = i;
			}	
			
			if (arr[minIndex] > arr[i]) {
				minIndex = i ;
			}
		}
		
		System.out.println(maxIndex + "max:" + arr[maxIndex]);
		System.out.println(max2Index + "max2:" + arr[max2Index]);
		System.out.println(minIndex + "min:" + arr[minIndex]);
	}

}
