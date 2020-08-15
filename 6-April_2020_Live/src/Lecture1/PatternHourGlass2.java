package Lecture1;

import java.util.*;

public class PatternHourGlass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int inc = 1; // right side
		int dec = 1;// left side
		int row = 1;
		int nsp = 2 * n - 1;// no of spaces
		int rows = 2 * n + 1;
		while (row <= rows) {
			int col = 1;
			int value = n;
			while (col <= dec) {
				if (value == 0) {
					System.out.print("");
					col++;
					value--;
				} else {
					System.out.print(value + " ");
					value--;
					col++;
				}
			}
			col = 1;
			while (col <= nsp) {
				System.out.print("  ");
				col++;
			}
			col = 1;
			value++;
			while (col <= inc) {
				System.out.print(value + " ");
				value++;
				col++;
			}
			if (row <= rows / 2) {
				inc++;
				dec++;
				nsp = nsp - 2;
			} else {
				inc--;
				dec--;
				nsp = nsp + 2;
			}
			System.out.println("");
			row++;
		}
	}
}
