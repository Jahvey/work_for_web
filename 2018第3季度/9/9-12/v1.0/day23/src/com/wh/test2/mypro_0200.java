package com.wh.test2;

public class mypro_0200 {

	public static void show(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void insertSort0100(int[] arr) {

		if (arr.length < 2 || null == arr) {
			return;
		}

		for (int i = 1; i < arr.length; i++) {

			int index = i;
			int currentNode = arr[i];

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > currentNode) {

					index--;
					arr[j + 1] = arr[j];
				}
			}
			arr[index] = currentNode;

		}
	}

	public static void selectSort0100(int[] arr) {

		if (null == arr || arr.length < 2)
			return;

		for (int i = 0; i < arr.length; i++) {
			int flag = i;
			int currentNode = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (currentNode < arr[j]) {
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

			int currentNode = arr[i];
			int index = i;
			for (int j = i - 1; j >= 0; j--) {

				if (arr[j] > currentNode) {

					index--;
					arr[j + 1] = arr[j];
				}
			}
			arr[index] = currentNode;
		}

	}

	public static void insertSort0102(int[] arr) {

		if (null == arr || arr.length < 2)
			return;

		for (int i = 1; i < arr.length; i++) {
			int currentNode = arr[i];
			int j = i - 1;
			do {

				arr[j + 1] = arr[j];
				j--;
			} while (j >= 0 && arr[j] > currentNode);

			arr[j + 1] = currentNode;// 插入排序的核心代码

		}

	}

	public static void insertSort0103(int[] arr) {

		if (null == arr || arr.length < 2)
			return;

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

	public static void insertSort0104(int[] arr) {

		if (null == arr || arr.length < 2) {
			return;
		}

		for (int i = 1; i < arr.length; i++) {

			int currentNode = arr[i];
			int index = i;
			for (int j = i - 1; j >= 0; j--) {

				if (arr[j] > currentNode) {
					index--;
					arr[j + 1] = arr[j];
				}
			}

			arr[index] = currentNode;
		}

	}

	public static void main(String[] args) {
		int[] arr = { -9, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -99, -1000, 100, 23, 47, 56 };

		show(arr);
		insertSort0100(arr);
		show(arr);
		selectSort0100(arr);
		show(arr);
		insertSort0101(arr);
		show(arr);
		insertSort0102(arr);
		show(arr);
		insertSort0103(arr);
		show(arr);

	}

}
