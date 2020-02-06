package my_first_package;
/* *
 * 快速排序
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("排序后:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			// 找寻基准数据的正确索引
//			int index = getIndex(arr, low, high);
			int index = FindIndex2(arr,low,high);

			// 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
			quickSort(arr, 0, index - 1);
			quickSort(arr, index + 1, high);
		}

	}
	//这种方法效率太低了
	private static int getIndex(int[] arr, int low, int high) {
		// 基准数据
		int tmp = arr[low];
		while (low < high) {
			// 当队尾的元素大于等于基准数据时,向前挪动high指针
			while (low < high && arr[high] >= tmp) {
				high--;
			}
			// 如果队尾元素小于tmp了,需要将其赋值给low
			arr[low] = arr[high];
			// 当队首元素小于等于tmp时,向前挪动low指针
			while (low < high && arr[low] <= tmp) {
				low++;
			}
			// 当队首元素大于tmp时,需要将其赋值给high
			arr[high] = arr[low];

		}
		// 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
		// 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
		arr[low] = tmp;
		return low; // 返回tmp的正确位置
	}
	private static int FindIndex2(int[] input, int start, int end) {
		int temp1 = input[end];
		input[end] = input[start]; //基准数字选为第一个数字
		input[start] = temp1;
		int small=start-1; //对比基准数小的数字计数，small就是基准数的位置
		for(int index=start;index<end;index++) {
			if(input[index]<input[end]) { //如果小于基准数 small就+1
				small++;
				if(index!=small) { //把比基准数小的都移到前面来
					int temp = input[small];
					input[small] = input[index];
					input[index] = temp;
				}
			}
		}
		small++; //比基准数小的数字的个数，small就是基准数的位置
		int temp = input[small];
		input[small] = input[end];
		input[end] = temp;
		return small;
		
	}
}
