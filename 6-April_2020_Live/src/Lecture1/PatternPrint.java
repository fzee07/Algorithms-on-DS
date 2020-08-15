package Lecture1;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, row = 1, nst = 1;

		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				System.out.print("*    ");
				col++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
