import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int [] arr = {9,3,5,7,6,8,1,4,2};
//		System.out.println(MyArray.join(arr, ", "));
//		System.out.println(Arrays.toString(arr));
		System.out.println(MyArray.toString(arr));
//		int [] newArr = MyArray.fromArray(arr, 2, 4);
//		System.out.println(MyArray.toString(newArr));
//		System.out.println(MyArray.toString(MyArray.clone(arr)));
//		System.out.println(MyArray.toString(MyArray.subArrFrom(arr, 2)));
		int [] aaa = {3,4,5,6,7,8,9};
		// {9,3,6,7,8,9,8,1,4,2}
		//System.out.println(MyArray.isOrder(aaa));
		//System.out.println(MyArray.toString(MyArray.delete(arr, 2, 1)));
//		System.out.println(MyArray.toString(MyArray.insert(arr, 2, aaa, 2, 2)));
//		System.out.println(MyArray.toString(MyArray.concat(arr, aaa)));
//		System.out.println(MyArray.toString(MyArray.replace(arr, 2, 3, aaa, 3, 4)));
//		System.out.println(MyArray.toString(MyArray.bubbleSort(arr)));
//		System.out.println(MyArray.toString(MyArray.breakArray(aaa)));
//		System.out.println(MyArray.toString(MyArray.insertBefore(aaa, 0, arr, 0, 3)));
//		System.out.println(MyArray.toString(MyArray.replace(arr, 2, 3, aaa, 3, 4)));
		//{9,3,6,7,8,9,8,1,4,2}
//		int[] nul = {};
//		System.out.println(Arrays.toString(nul));
		
		
		
		
		System.out.println(MyArray.toString(MyArray.delete(arr, 2, 3)));
	}
}
