package com.wh.test2;

public class mypro_0100 {

	public static void selectSort1(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int position = arr[i];
			int flag = i;// 将当前下标定义为最小下表
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < position) {
					position = arr[j];
					flag = j;
				}
			}

			if (flag != i) {
				arr[flag] = arr[i];
				arr[i] = position;

			}

		}

	}

	public static void InsertSort3(int[] arr) {

		if (null == arr || arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++) {

			int currentNode = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < currentNode) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = currentNode;// 注意上面的条件是while循环
		}

	}

	public static void InsertSort2(int[] arr) {

		if (arr.length < 2 || null == arr)
			return;

		/**
		 * 外层循环表示需要 排序的轮数
		 */
		for (int i = 1; i < arr.length; i++) {

			int index = i;
			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {

				if (arr[j] > currentNode) {

					arr[j] = arr[j - 1];
					index--;
				} else {
					break;
				}

			}

			arr[index] = currentNode;// 插入排序的核心思想就是这个

		}

	}

	public static void InsertSort1(int[] arr) {
		if (arr.length < 2 || arr == null)
			return;

		/**
		 * 找到相对应的元素 ，插入到制定的位置当中，不一定是最小的地方，但是是按照从小到大的顺序插入目标元素
		 */
		for (int i = 1; i < arr.length; i++) {

			int index = i;// 记录插入的标志位
			int currentNode = arr[i];// 保存要插入的元素

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > currentNode) {
					arr[j] = arr[j - 1];
					index -= 1;
				} else {
					break;// 如果不是则跳出这个循环，保存要插入的元素的下标值
				}
			}
			arr[index] = currentNode;// 最终排序结果的核心目标就是这个情况

		}

	}

	public static void bubbleSort2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {

					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	public static void bubbleSort1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {

					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void quickSort1(int[] arr, int start, int end) {

		if (start > end)
			return;

		int i = start;
		int j = end;
		int base = arr[start];

		while (i < end && base > arr[i])
			i++;

		while (j > start && arr[j] > base)
			j--;

		if (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		if (i < end)
			quickSort1(arr, i, end);

		if (j > start)
			quickSort1(arr, start, j);

	}

	public static void show(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void selectSort2(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int flag = i; // 将当前下标定义为最小值下标
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < temp) {// a[j] < temp 从小到大排序；a[j] > temp 从大到小排序
					temp = a[j];
					flag = j; // 如果有小于当前最小值的关键字将此关键字的下标赋值给flag
				}
			}
			if (flag != i) {
				a[flag] = a[i];
				a[i] = temp;
			}
		}

	}

	public static void InsertSort01(int[] arr) {

		if (arr.length < 2 || null == arr)
			return;

		for (int i = 1; i < arr.length; i++) {

			int index = i;
			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > currentNode) {
					arr[j] = arr[j - 1];
					index--;
				}
			}

			arr[index] = currentNode;
		}

	}

	public static void InsertSort02(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int index = i;
			int currentNode = arr[i];
			for (int j = i - 1; j >= 0; j--) {

				if (arr[j] < currentNode) {
					index--;
					arr[j + 1] = arr[j];
				}
			}

			arr[index] = currentNode;
		}

	}

	public static void InsertSort03(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int index = i;// 找到需要插入的索引值
			int currentNode = arr[i];// 定位到需要插入的节点值

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > currentNode) {
					index--;
					arr[j + 1] = arr[j];
				}
			}
			arr[index] = currentNode;// 插入排序的核心代码

		}

	}

	public static void InsertSort04(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int index = i;

			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {
				index--;
				arr[j + 1] = arr[j];
			}
			arr[index] = currentNode;
		}

	}

	public static void InsertSort05(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int currentNode = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] < currentNode) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = currentNode;
		}

	}

	public static void selectSort01(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int flag = i;
			int currentNode = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < currentNode) {

					flag = j;
					currentNode = arr[j];

				}
			}

			if (flag != i) {
				arr[flag] = arr[i];
				arr[i] = currentNode;
			}

		}

	}

	public static void selectSort02(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int currentNode = arr[i];
			int flag = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < currentNode) {

					flag = j;
					currentNode = arr[j];
				}
			}
			// 选择排序的核心代码
			if (flag != i) {
				arr[flag] = arr[i];
				arr[i] = currentNode;
			}

		}

	}

	public static void selectSort03(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int currentNode = arr[i];
			int flag = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > currentNode) {

					flag = j;
					currentNode = arr[j];
				}
			}
			if (flag != i) {

				arr[flag] = arr[i];
				arr[i] = currentNode;
			}
		}

	}

	public static void selectSort04(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int flag = i;
			int currentNode = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (currentNode > arr[j]) {
					flag = j;
					currentNode = arr[j];
				}
			}

			if (flag != i) {

				arr[flag] = arr[i];
				arr[i] = currentNode;
			}
		}

	}

	public static void insertSort0100(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			int flag = i;
			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < currentNode) {

					flag--;
					arr[j + 1] = arr[j];
				}

			}
			arr[flag] = currentNode;
		}

	}

	public static void selectSort0100(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int flag = i;
			int currentNode = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < currentNode) {
					currentNode = arr[j];
					flag = j;
				}
			}

			if (flag != i) {
				arr[flag] = arr[i];
				arr[i] = currentNode;
			}
		}

	}

	public static void insertSort0101(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int index = i;
			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {

				if (arr[j] < currentNode) {

					arr[j + 1] = arr[j];
					index--;
				}
			}
			arr[index] = currentNode;
		}

	}

	public static void selectSort0101(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int flag = i;
			int currentNode = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < currentNode) {
					currentNode = arr[j];
					flag = j;
				}
			}

			if (flag != i) {

				arr[flag] = arr[i];
				arr[i] = currentNode;
			}
		}

	}

	public static void insertSort0103(int[] arr) {

		if (arr.length < 2 || null == arr)
			return;
		for (int i = 1; i < arr.length; i++) {
			int index = i;
			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < currentNode) {
					index--;
					arr[j + 1] = arr[j];
				}
			}

			arr[index] = currentNode;
		}

	}

	public static void selectSort0103(int[] arr) {
		if (null == arr || arr.length < 2)
			return;

		for (int i = 0; i < arr.length; i++) {
			int flag = i;
			int currentNode = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (currentNode > arr[j]) {
					currentNode = arr[j];
					flag = j;
				}
			}
			if (flag != i) {
				arr[flag] = arr[i];
				arr[i] = currentNode;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 99, 111, 22, 333, 444, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1000, -99, -1, -2 };
		show(arr);
		/*
		 * bubbleSort2(arr); show(arr); InsertSort1(arr); // quickSort(arr, 0,
		 * arr.length - 1); show(arr); InsertSort2(arr); show(arr); InsertSort3(arr);
		 * show(arr); selectSort1(arr); show(arr); InsertSort01(arr); show(arr);
		 * InsertSort02(arr); show(arr); InsertSort03(arr); show(arr);
		 */
		InsertSort05(arr);
		show(arr);

		selectSort01(arr);
		show(arr);
		selectSort03(arr);
		show(arr);
		selectSort04(arr);
		show(arr);
		insertSort0100(arr);
		show(arr);
		selectSort0100(arr);
		show(arr);
		insertSort0101(arr);
		show(arr);
		selectSort0101(arr);
		show(arr);
		insertSort0103(arr);
		show(arr);
		selectSort0103(arr);
		show(arr);
	}

}
