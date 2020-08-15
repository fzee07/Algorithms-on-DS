package Lecture1;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = 0;
		while(row <= n) {
			int col = 1;
			while(col <= nsp) {
				System.out.print(" ");
				col++;
			}
			 col = 1;
			while(col <= nst) {
				System.out.print("*");
				col++;
			}
			
			System.out.println();
			nst--;
			nsp = nsp + 2;
			row++;
		}
	}

}
