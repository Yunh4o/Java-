
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,8,7,6,5,4,3,2,1};
		
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Ã°ÅÝÅÅÐò
		for(int j = 0 ; j < arr.length - 1 ; j ++) {
			for(int i = 0 ; i < arr.length - 1 ; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]   = temp;
				}
			}
//			for(int i = 0 ; i < arr.length ; i ++) {
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
		}
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
