import java.util.Arrays;

@SuppressWarnings("unused")
public class Test04 {
	
	public static void main(String[] args) {
		int[] arr = {1,4,7,9,2,8,6,3,5};
		quickSort3(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort1(int [] array, int low, int high) {
		if (low >= high) {
			//递归出口 ， 当数据切片长度小于等于1，就结束递归
			return;
		}
		//i顺序遍历数据切片
		//j指向左边第一个比基准值（切片数据下标最大的值）大的元素
		int i = low, j = low;
		for (; i < high; i++) {
			if (array[i] < array[high]) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				j++;
			}
		}
		int temp = array[j];
		array[j] = array[high];
		array[high] = temp;
		
		//数据切分成功，左右数据切片分别递归，j是数据切片的分界点
		quickSort1(array, low, j - 1);
		quickSort1(array, j + 1, high);
	}
	
	public static void quickSort2(int [] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = high, j = high;
		for (; i > low; i--) {
			if (array[i] > array[low]) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				j--;
			}
		}
		int temp = array[j];
		array[j] = array[low];
		array[low] = temp;
		
		quickSort2(array, low, j - 1);
		quickSort2(array, j + 1, high);
	}
	
	public static void quickSort3(int [] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low;
		int j = high;
		int temp = array[i];
		
		while (i < j) {
			while (i < j && temp < array[j]) {
				j--;
			}
			if (i < j) {
				array[i] = array[j];
				i++;
			}
			
			while (i < j && temp > array[i]) {
				i++;
			}
			if (i < j) {
				array[j] = array[i];
				j--;
			}
		}
		array[j] = temp;
		
		quickSort3(array, low, j - 1);
		quickSort3(array, j + 1, high);
		
	}
	
	
}
