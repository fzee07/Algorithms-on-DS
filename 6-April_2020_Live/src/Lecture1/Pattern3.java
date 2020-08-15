package Lecture1;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int row = 1;
		int rows = 2 * n - 1;
		int nsp = 0;
		int nst = n;
		while (row <= rows) {
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}

			if (row < n) {
				nsp = nsp + 2;
				nst--;
			} else {
				nsp = nsp - 2;
				nst++;
			}
			System.out.println();
			row++;
		}
	}

}
