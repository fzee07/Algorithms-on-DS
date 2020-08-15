package Array;

import java.util.*;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] A = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = s.nextInt();
			}
		}
		int x, k = 0, l = 0;
		x = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (A[i][j] == x) {
					k = i;
					l = j;
				}

			}
		}
		if (A[k][l] == x) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}

}
