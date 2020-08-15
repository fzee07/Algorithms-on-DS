package Array;

import java.util.*;
import java.lang.*;

public class MaxCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(Max_Circular_Sum(arr));
			t--;
		}

//		int[] arr =  {5, -3, -2, 6, -1, 4};

	}

	public static int Max_Circular_Sum(int[] arr) {
		int max_sumsub_array = Integer.MIN_VALUE;
		int temp_max_sum = 0;

		int total_array_sum = 0;

		int min_sumsub_array = Integer.MAX_VALUE;
		int temp_min_sum = 0;

		for (int i = 0; i < arr.length; i++) {
			total_array_sum = total_array_sum + arr[i];
			temp_max_sum = temp_max_sum + arr[i];
			temp_min_sum = temp_min_sum + arr[i];

			if (temp_max_sum > max_sumsub_array) {
				max_sumsub_array = temp_max_sum;
			}
			if (temp_max_sum < 0) {
				temp_max_sum = 0;
			}

			if (temp_min_sum < min_sumsub_array) {
				min_sumsub_array = temp_min_sum;
			}
			if (temp_min_sum > 0) {
				temp_min_sum = 0;
			}
		}

		if (total_array_sum == min_sumsub_array) {
			return max_sumsub_array;
		}
		return Math.max(max_sumsub_array, (total_array_sum - min_sumsub_array));
	}
}
