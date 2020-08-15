package Array;

import java.util.*;

public class SortinLinearTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		sortInLinearTime(arr);
		display(arr);

	}

	public static void sortInLinearTime(int[] arr) {

		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
