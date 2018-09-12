package com.wh.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author cwalk
 *
 */
public class server {

	public static void bubbleSort1(int[] arr) {

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

	public static void copyFile2() {
		System.out.println("请输入要拷贝的文件的绝对路径");

		Scanner scanner = new Scanner(System.in);

		// File fin = new File(scanner.next());
		File fin = new File("C:\\Users\\cwalk\\Desktop\\OpenStack安装命令（单节点）.txt");

		FileInputStream fins = null;
		FileOutputStream fous = null;
		try {
			fins = new FileInputStream(fin);
			fous = new FileOutputStream(new File("d:\\2.txt"));

			int content = 0;
			while ((content = fins.read()) != -1) {
				fous.write(content);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fins != null) {
				try {
					fins.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fous != null) {
				try {
					fous.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void copyFile1() {

		System.out.println("请输入要拷贝的文件的绝对路劲");

		Scanner scanner = new Scanner(System.in);

		File fin = new File(scanner.next());
		FileInputStream fins = null;
		FileOutputStream fous = null;

		try {
			fins = new FileInputStream(fin);
			fous = new FileOutputStream(new File("d:\2.txt"));
			int content = 0;
			while ((content = fins.read()) != -1) {

				fous.write(content);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fins != null) {
				try {
					fins.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fous != null) {
				try {
					fous.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void InsertSort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int leftindex = i - 1;
			while (leftindex >= 0 && arr[leftindex] >= temp) {
				arr[leftindex + 1] = arr[leftindex];
				leftindex--;
			}
			arr[leftindex + 1] = temp;
		}

	}

	public static void InsertSort1(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int leftindex = i - 1;
			while (leftindex >= 0 && arr[leftindex] >= temp) {
				arr[leftindex + 1] = arr[leftindex];
				leftindex--;
			}
			arr[leftindex + 1] = temp;
		}
	}

	/**
	 * 插入排序
	 * 
	 * @param arr
	 */
	public static void InsertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];//
			int leftindex = i - 1;
			while (leftindex >= 0 && arr[leftindex] >= temp) {
				arr[leftindex + 1] = arr[leftindex];
				leftindex--;
			}

			arr[leftindex + 1] = temp;
		}

	}

	public static void InsertSort4(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	public static void InsertSort3(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int base = arr[i];
			int leftnode = i - 1;
			while (leftnode >= 0 && arr[leftnode] > base) {
				arr[leftnode + 1] = arr[leftnode];
				leftnode--;
			}
			arr[leftnode + 1] = base;
		}

	}

	public static void chooseSort5(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = i;
			for (int j = minindex + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex])
					minindex = j;
			}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}

	}

	public static void chooseSort4(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}

	}

	public static void chooseSort3(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

	}

	public static void selectSort2(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

	}

	public static void SelectSort1(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

	}

	public static void getString() {
		Scanner s = new Scanner(System.in);
		File fin = new File(s.next());
		FileInputStream fins = null;
		FileOutputStream fous = null;
		try {
			fins = new FileInputStream(fin);

			fous = new FileOutputStream(new File("d://1.txt"));

			int content = 0;

			while ((content = fins.read()) != -1) {
				fous.write(content);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fins != null) {

				try {
					fins.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fous != null) {
				try {
					fous.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void quicksort(int[] arr, int start, int end) {

		if (start < end) {

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
				quicksort(arr, i, end);

			if (j > start)
				quicksort(arr, start, j);

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
		// quicksort(arr, 0, arr.length - 1);
		// show(arr);

		// getString();
		// copyFile2();
		// bubbleSort1(arr);
		// InsertSort(arr);
		// SelectSort1(arr);
		// InsertSort2(arr);
		// selectSort2(arr);
		// chooseSort3(arr);
		// chooseSort5(arr);
		// InsertSort3(arr);
		InsertSort4(arr);
		show(arr);
	}

}
