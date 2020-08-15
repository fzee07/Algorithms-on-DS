package Array;

import java.util.*;

public class Arrays_Wave_PrintColoumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] A = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = s.nextInt();
			}
			// System.out.print(A[i][j]);
		}
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print(A[j][i] + ", ");
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					System.out.print(A[j][i] + ", ");
				}
			}
		}
		System.out.print("END");

	}

}
