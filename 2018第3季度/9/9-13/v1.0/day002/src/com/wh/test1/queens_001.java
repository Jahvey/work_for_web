package com.wh.test1;

public class queens_001 {

	// 同栏是否又皇后，1表示有
	private static int[] column;

	// 右上至左下是否有皇后
	private static int[] rup;

	// 右下至左上是否有皇后
	private static int[] lup;

	// 解答
	private static int[] queen;

	// 解答编号
	private static int num;

	public queens_001() {

		column = new int[8 + 1];
		rup = new int[2 * 8 + 1];
		lup = new int[2 * 8 + 1];

		for (int i = 1; i <= 8; i++) {
			column[i] = 1;

		}

		for (int i = 1; i <= 2 * 8; i++) {
			rup[i] = lup[i] = 1;
		}
		queen = new int[8 + 1];
	}

	public static void show() {

		num++;

		System.out.println("\nanswer is" + num);

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if (queen[i] == j) {
					System.out.print(" Q");
				} else {
					System.out.print(" .");
				}
			}
			System.out.println();
		}

	}

	public static void backTrack(int i) {

		if (i > 8) {
			show();
		} else {
			for (int j = 1; j <= 8; j++) {
				if (column[j] == 1 && rup[i + j] == 1 && lup[i - j + 8] == 1) {
					queen[i] = j;
					// 设定为占用
					column[j] = rup[i + j] = lup[i - j + 8] = 0;

					backTrack(i + 1);
					column[j] = rup[i + j] = lup[i - j + 8] = 1;
				}
			}
		}

	}

	public static void main(String[] args) {
		queens_001.backTrack(1);

	}

}
