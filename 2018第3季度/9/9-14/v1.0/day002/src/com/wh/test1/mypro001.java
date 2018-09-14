package com.wh.test1;

import java.util.HashMap;
import java.util.Hashtable;

public class mypro001 {

	public static void show(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void insertSort001(int[] arr) {
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

	public static void selectSort001(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			int flag = i;
			int currentNode = arr[i];
			for (int j = i + 1; j < arr.length; j++) {

				if (currentNode < arr[j]) {// 使用这两行代码借尸还魂
					flag = j;
					currentNode = arr[j];
				}
			}

			// 选择排序的核心算法
			if (flag != i) {
				arr[flag] = arr[i];
				arr[i] = currentNode;
			}
		}

	}

	public static void insertSort002(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			int j = i - 1;
			int currentNode = arr[i];

			while (j >= 0 && arr[j] > currentNode) {
				arr[j + 1] = arr[j];// 千万注意，这两行的位置千万不能写反了
				j--;
			}

			arr[j + 1] = currentNode;// 核心思想都差不多，主要的差别是一个使用while 一个使用for循环
		}

	}

	public static void quickSort(int[] arr, int start, int end) {
		// if (end < start)
		// return;

		int i = start;
		int j = end;
		int base = arr[i];

		while (i < end && arr[i] < base)
			i++;

		while (j > start && arr[j] > base)
			j--;

		if (i <= j) {
			// 注意，这里的代码一定是小于等于，而不能全携程小于，会发生越界的错误

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		if (i < end)
			quickSort(arr, i, end);

		if (j > start)
			quickSort(arr, start, j);

	}

	public static void main(String[] args) {
		new HashMap<>();
		new Hashtable<>();
		int[] arr = { 99, 78, 56, 12, 32, 11, 22, 100, -100, -99, -88, 4, 3, 2, 1, 0, -1 };

		show(arr);
		// insertSort001(arr);
		// show(arr);
		// selectSort001(arr);
		// show(arr);
		// insertSort002(arr);
		// show(arr);
		System.out.println(1 << 4);
		quickSort(arr, 0, arr.length - 1);
		show(arr);

	}

}
