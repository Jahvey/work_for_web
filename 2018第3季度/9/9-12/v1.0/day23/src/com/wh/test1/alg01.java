package com.wh.test1;

public class alg01 {

	public static void bubbleSort02(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {

					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void quickSort01(int[] arr, int start, int end) {
		if (start > end)
			return;

		int i = start;
		int j = end;
		int base = arr[start];

		while (i < end && arr[i] < base)
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
			quickSort01(arr, i, end);

		if (j > start)
			quickSort01(arr, start, j);

	}

	public static void bubbleSort01(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void chooseSort01(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}

	}

	public static void InsertSort02(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			int base = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > base) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = base;
		}

	}

	public static void InsertSort01(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int base = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = base;

			}
		}

	}

	public static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { -9, -1, -2, -11, -13, -34, 0, 1, 9, 8, 7, 6, 5, 4, 3, 2, 11 };
		show(arr);
		// InsertSort02(arr);
		// chooseSort01(arr);
		// quickSort01(arr, 0, arr.length - 1);
		bubbleSort02(arr);
		show(arr);
	}

}
