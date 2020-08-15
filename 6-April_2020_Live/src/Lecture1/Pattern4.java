package Lecture1;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int num = 1;
		int nod = 1;
		while (row <= n) {
			int col = 1;
			while (col <= nod) {
				System.out.print(num + " ");
				col++;
				num++;
			}
			System.out.println();
			row++;
			nod++;
		}
	}

}
