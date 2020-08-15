package Array;

import java.util.*;

public class BiggestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			FormBiggestNumber(arr);
			t--;
		}
	}

	public static void FormBiggestNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (myCompare(Integer.toString(arr[i]), Integer.toString(arr[j]))) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int val : arr) {
			System.out.print(val);
		}
	}

	public static boolean myCompare(String x, String y) {
		String xy = x + y;
		String yx = y + x;

		if (xy.compareTo(yx) > 0) {
			return false;
		}
		return true;
	}
}