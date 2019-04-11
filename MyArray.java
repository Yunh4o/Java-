	/**
	 * 
	 * @author Administrator
	 *
	 */
public class MyArray {
	
	
	// Create Retrieve Update Delete

	// Create
	/**
	 * 
	 * @param srcArray
	 * @param beginIndex 起始位置
	 * @param length     子数组长度
	 * @return
	 */
	public static int[] fromArray(int[] srcArray, int beginIndex, int length) {
		int[] destArray = new int[length];
		for (int i = beginIndex; i < beginIndex + length; i++) {
			destArray[i - beginIndex] = srcArray[i];
		}
		return destArray;
	}

	/**
	 * 开始位置到最后
	 * 
	 * @param srcArray
	 * @param beginIndex
	 * @return
	 */
	public static int[] fromArray(int[] srcArray, int beginIndex) {
		return fromArray(srcArray, beginIndex, srcArray.length - beginIndex);
	}

	/**
	 * 通过一个数组拷贝生成一个新数组
	 * 
	 * @param srcArray
	 * @return
	 */
	public static int[] fromArray(int[] srcArray) {
		return fromArray(srcArray, 0, srcArray.length);
	}

	public static int[] clone(int[] srcArray) {
		return fromArray(srcArray);
	}

	// Retrieve
	/**
	 * 返回指定位置和长度的子数组
	 * 
	 * @param srcArray
	 * @param beginIndex
	 * @param length
	 * @return
	 */
	public static int[] subArray(int[] srcArray, int beginIndex, int length) {
		return fromArray(srcArray, beginIndex, length);
	}

	public static int[] subArray(int[] srcArray, int beginIndex) {
		return subArray(srcArray, beginIndex, srcArray.length - beginIndex);
	}

	// [fromIndex,toIndex)
	/**
	 * 返回从指定开始位置到指定结束位置的子数组[,)
	 * 
	 * @param array
	 * @param fromIndex
	 * @param toIndex
	 * @return
	 */
	public static int[] subArr(int[] array, int fromIndex, int toIndex) {
		return subArray(array, fromIndex, toIndex - fromIndex);
	}

	public static int[] subArrFrom(int[] array, int fromIndex) {
		return subArr(array, fromIndex, array.length - 1);//
	}

	public static int[] subArrTo(int[] array, int toIndex) {
		return subArr(array, 0, toIndex);
	}

	/**
	 * 遍历查找 返回-1 未找到
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	public static int seek(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 折半查找
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	public static int halfSeek(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < target) {
				low = mid + 1;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	/**
	 * 判断数组是否有序 0 = disorder, 1 = ascending, 2 = descending, 3 = equal
	 * 
	 * @param array
	 * @return
	 */
	public static int isOrder(int[] array) {
		int ascCount = 0;
		int descCount = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				descCount++;
			}
			if (array[i] < array[i + 1]) {
				ascCount++;
			}
		}
		if (ascCount == 0 && descCount == 0) {
			return 3;
		} else if (ascCount == 0) {
			return 2;
		} else if (descCount == 0) {
			return 1;
		}
		return 0;
	}

	public static int maxIndex(int[] array, int beginIndex, int length) {
		int maxIndex = beginIndex;
		for (int i = beginIndex + 1; i < beginIndex + length; i++) {
			if (array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static int minIndex(int[] array, int beginIndex, int length) {
		int minIndex = beginIndex;
		for (int i = beginIndex + 1; i < beginIndex + length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static int maxIndex(int[] array) {
		return maxIndex(array, 0, array.length);
	}

	public static int minIndex(int[] array) {
		return minIndex(array, 0, array.length);
	}

	public static int max(int[] array) {
		return array[maxIndex(array)];
	}

	public static int min(int[] array) {
		return minIndex(array);
	}

	// Update
	// insert,replace,sort,reverse
	public static int[] insert(int[] destArray, int destBeginIndex, int[] srcArray, int srcBeginIndex, int length) {
		int[] newArray = new int[destArray.length + length];
		// 目标数组当前位置
		int destIndex = 0;
		// 新数组当前位置
		int newIndex = 0;
		// 源数组起始位置
		int srcIndex = srcBeginIndex;
		// 把目标数组从0开始到指定位置的元素复制到新数组
		while (destIndex <= destBeginIndex) {
			newArray[newIndex++] = destArray[destIndex++];
		}
		// 把源数组指定位置长度复制到新数组
		while (srcIndex < srcBeginIndex + length) {
			newArray[newIndex++] = srcArray[srcIndex++];
		}
		// 把目标数组的指定位置后的元素复制到新数组
		while (destIndex < destArray.length) {
			newArray[newIndex++] = destArray[destIndex++];
		}
		return newArray;
	}

	public static int[] insert(int[] destArray, int destBeginIndex, int[] srcArray) {
		return insert(destArray, destBeginIndex, srcArray, 0, srcArray.length);
	}

	public static int[] insert(int[] destArray, int destBeginIndex, int element) {
		return insert(destArray, destBeginIndex, new int[] { element });
	}

	public static int[] insertBefore(int[] destArray, int destBeginIndex, int[] srcArray, int srcBeginIndex,
			int length) {
		return insert(destArray, destBeginIndex - 1, srcArray, srcBeginIndex, length);
	}

	public static int[] insertBefore(int[] destArray, int destBeginIndex, int[] srcArray) {
		return insertBefore(destArray, destBeginIndex, srcArray, 0, srcArray.length);
	}

	public static int[] insertBefore(int[] destArray, int destBeginIndex, int element) {
		return insertBefore(destArray, destBeginIndex, new int[] { element });
	}

	/**
	 * 连接两个数组
	 * 
	 * @param destArray
	 * @param srcArray
	 * @return
	 */
	public static int[] concat(int[] destArray, int[] srcArray) {
		return insert(destArray, destArray.length - 1, srcArray);
	}

	// replace
	public static int[] replace(int[] destArray, int destBeginIndex, int destLength, int[] srcArray, int srcBeginIndex,int srcLength) {
		//单独完成算法 
		int[] newArray = new int [destArray.length - destLength + srcLength];
//		int newIndex = 0;
//		int destIndex = 0;
//		for (int i = 0; i < destBeginIndex; i++) {
//			newArray[i] = destArray[i];
//		}
//		for (int i = destBeginIndex; i < destBeginIndex + srcLength; ) {
//			newArray[i++] = srcArray[srcBeginIndex ++];
//		}
//		for (int i = destBeginIndex + srcLength; i < newArray.length; ) {
//			newArray[i++] = destArray[destBeginIndex+ destLength ++];
//		}
		int destIndex = 0;
		int newIndex = 0;
		int srcIndex = srcBeginIndex;
		while (destIndex < destBeginIndex) {
			newArray[newIndex++] = destArray[destIndex++];
		}
		while (srcIndex < srcBeginIndex + srcLength) {
			newArray[newIndex++] = srcArray[srcIndex++];
		}
		while (newIndex < newArray.length) {
			newArray[newIndex++] = destArray[destIndex+ destLength ++];
		}
		//跳过目标数组被替换的元素
//		destIndex = destBeginIndex + destLength;
//		while (destIndex < destArray.length) {
//			newArray[newIndex++] = destArray[destIndex++];
//		}
		return newArray;
//		return insert(delete(destArray, destBeginIndex, destLength), destBeginIndex - 1, srcArray, srcBeginIndex,srcLength);
	}

	public static int[] replace(int[] destArray, int destBeginIndex, int destLength, int[] srcArray) {
		return replace(destArray, destBeginIndex, destLength, srcArray, 0, srcArray.length);
	}

	// reverse
	public static int[] reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			swap(array, i, array.length - 1 - i);
		}
		return array;
	}

	// break
	/**
	 * 打乱数组（洗牌算法）
	 * 
	 * @param array
	 * @return
	 */
	public static int[] breakArray(int[] array) {

		for (int i = array.length - 1; i > 0; i--) {
			int r = (int) Math.floor(Math.random() * (i + 1));
			swap(array, r, i);
		}

		return array;
	}

	// Sort
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
		return array;
	}

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			swap(array, i, minIndex);
		}
		return array;
	}

	public static int[] insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			int temp = array[j];
			while (j > 0 && temp < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		return array;
	}

	public static int[] insertSort2(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				swap(array, j, j - 1);
			}
		}
		return array;
	}

	// Delete
	/**
	 * 删除指定位置开始长度的数组，
	 * 相当于替换的特例，用空数组替换
	 * @param array
	 * @param beginIndex
	 * @param length
	 * @return
	 */
	public static int[] delete(int[] array, int beginIndex, int length) {
		if (length < 0) {
			beginIndex += length + 1;
		}
		int[] newArray = new int[array.length - Math.abs(length)];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i < beginIndex || i >= beginIndex + Math.abs(length)) {
				newArray[j] = array[i];
				j++;
			}
		}
		return newArray;
//		return replace(array, beginIndex, length, new int[] {});
	}

	/**
	 * 删除指定位置的元素
	 * 
	 * @param array
	 * @param targetIndex
	 * @return
	 */
	public static int[] delete(int[] array, int targetIndex) {
		return delete(array, targetIndex, 1);
	}

	public static int[] deleteFrom(int[] array, int fromIndex) {
		return delete(array, fromIndex, array.length - fromIndex);
	}

	public static int[] deleteTo(int[] array, int toIndex) {
		return delete(array, 0, toIndex);
	}

	// tools
	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	/**
	 * 把数组通过指定分隔符连接成字符串
	 * 
	 * @param array
	 * @param separator
	 * @return
	 */
	public static String join(int[] array, String separator) {
		String arrayString = "";
		for (int i = 0; i < array.length - 1; i++) {
			arrayString += array[i] + separator;
		}
		return arrayString + array[array.length - 1];
	}

	public static String toString(int[] array) {
		return "[" + join(array, ", ") + "]";
	}

}
