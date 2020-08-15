package Array;

import java.util.*;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] A = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = s.nextInt();
			}
			// System.out.print(A[i][j]);
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[j][i] + " ");
			}
			System.out.println();
		}

	}

}
