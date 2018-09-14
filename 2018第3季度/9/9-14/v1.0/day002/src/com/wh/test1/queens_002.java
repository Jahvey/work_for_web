
package com.wh.test1;

/**
 * 
 * @author Adonai
 * @qq 2807867265
 * @time 2018年9月13日
 * @address
 */
public class queens_002 {

	private int n = 8;

	public int total = 0;
	private int[] colums = new int[n];

	public boolean is_ok(int row) {

		for (int j = 0; j != row; j++) {

			if (colums[row] == colums[j] || //
					row - colums[row] == j - colums[j] || //
					row + colums[row] == j + colums[j]) {
				return false;

			}
		}

		return true;
	}

	public void queen(int row) {

		if (row == n) {
			// total++;
			showAnswer();

		} else {
			for (int col = 0; col != n; col++) {
				colums[row] = col;
				if (is_ok(row))
					queen(row + 1);
			}

		}

	}

	protected void showAnswer() {
		total++;
		System.out.println("\n解答 " + total);
		for (int y = 1; y <= 8; y++) {
			for (int x = 1; x <= 8; x++) {
				if (colums[y - 1] == x - 1) {
					System.out.print(" Q");
				} else {
					System.out.print(" .");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		queens_002 queens_002 = new queens_002();
		queens_002.queen(0);
		System.out.println(queens_002.total);
	}

}
