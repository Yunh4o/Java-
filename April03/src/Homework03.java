
public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {1,3,3,5,8,6,6,5,4,6,5,9,2};
		int minIndex = 0;
		int maxIndex = arr.length - 1;
		int midIndex = ( minIndex + maxIndex ) / 2;
		int number = 8;
		for (int i = 0; i < arr.length ; i++) {
			
			if (arr[midIndex] > number) {
				maxIndex = midIndex;
			}else if(arr[midIndex] < number){
				minIndex = midIndex;
			}else {
				System.out.println(number+" : "+arr[midIndex]);
				System.out.println(i);
				break;
			}
			
		}
	}

}
