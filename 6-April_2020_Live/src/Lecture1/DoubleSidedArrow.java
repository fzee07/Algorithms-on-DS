package Lecture1;

import java.util.*;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int outer_nsp = n - 1;
		int inner_nsp = -1;
		int left_dec = 1;
		int right_inc = 0;
		int row = 1;
		int value = 1;
		while (row <= n) {
			int col = 1;
			while (col <= outer_nsp) { // Outer Space
				System.out.print(" ");
				col++;
			}
			col = 1;
			value = left_dec;
			while (col <= left_dec) { // Left Decrement
				System.out.print(value);
				value--;
				col++;
			}
			col = 1;
			while (col <= inner_nsp) { // Inner Space
				System.out.print(" ");
				col++;
			}
			col = 1;
			if (row == 2) {
				right_inc = right_inc + 1;
			}
//			if(row == n-1) {
//				right_inc = 2;
//			}
			if(row == n) {
				right_inc = 0;
			}
			while (col <= right_inc) { // Right Increment
				System.out.print(col);
				col++;
			}

			if (row <= n / 2) {
				inner_nsp = inner_nsp + 2;
				outer_nsp = outer_nsp - 2;
				value++;
				left_dec++;
				right_inc++;
			} else {
				inner_nsp = inner_nsp - 2;
				outer_nsp = outer_nsp + 2;
				value--;
				left_dec--;
				right_inc--;
			}
			row++;
			System.out.println();
		}
	}

}
