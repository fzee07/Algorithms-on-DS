package Strings;

import java.util.Scanner;

public class Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char[][] arr = new char[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		Piyush_Magical_Park(arr, m, n, k, s);

	}

	public static void Piyush_Magical_Park(char[][] arr, int m, int n, int k, int s) {
		boolean success = true;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				char ch = arr[i][j];
				if (s < k) {
					success = false;
					break;
				}
				if (ch == '*') {
					s += 5;
				} else if (ch == '.') {
					s -= 2;
				} else {
					break;
				}
				if (j != n - 1) {
					s--;
				}
			}
		}
		if (success) {
			System.out.println("Yes");
			System.out.println(s);
		} else {
			System.out.println("No");
		}
	}

}
