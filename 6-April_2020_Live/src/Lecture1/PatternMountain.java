package Lecture1;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int value;
		int row = 1;
		int inc = 1;
		int dec = 1;
		int nsp = n + 1;
		while (row <= n) {
			int col = 1;
			while (col <= inc) {
				System.out.print(col + " ");
				col++;
			}
			col = 1;
			while (col <= nsp) {
				System.out.print("  ");
				col++;
			}
			col = 1;
			if (row == n) {
				value = row - 1;
				dec--;
			} else {
				value = row;
			}
			while (col <= dec) {
				System.out.print(value + " ");
				col++;
				value--;
			}
			row++;
			inc++;
			dec++;
			nsp = nsp - 2;
			System.out.println();
		}
	}

}
