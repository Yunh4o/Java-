import java.util.Arrays;

public class Test05 {
	public static void main(String [] args) {
		int [] arr = {9,8,45,65,6,1,2,7,6,1,8};	
//		for (int i = 0; i < arr.length - 1; i++) {
//			//������ð��
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp; 
//				}
//			}
//		}	
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			//i Ϊ�������ĵ�һ��λ��
			int minIndex = i;
			for (int j = minIndex + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j ;
				}
			}
			//����ǰ��������һ������
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
			
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
		}	
		
		
	}
}