package Lecture1;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int inc_value = 1;
		int dec_value = 0;
		int nsp = n - 1;
		while (row <= n) {
			int col = 1;
			while (col <= nsp) {
				System.out.print("\t");
				col++;
			}
			int value = row;
			col = 1;
			while (col <= inc_value) {
				System.out.print(value+"\t");
				value++;
				col++;
			}
			value = value - 2;
			col = 1;
			while (col <= dec_value) {
				System.out.print(value+"\t");
				value--;
				col++;
			}

			nsp--;
			inc_value++;
			dec_value++;
			row++;
			System.out.println();
		}
	}

}
