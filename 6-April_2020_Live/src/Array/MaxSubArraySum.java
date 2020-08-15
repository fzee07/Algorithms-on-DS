package Array;

import java.util.*;

public class MaxSubArraySum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<arr.length; i++) {
				arr[i]=s.nextInt();
			}
			System.out.println(maxSubArraySum(arr));
			t--;
		}
		
	}

	public static int maxSubArraySum(int[] arr) {
		int max_subArraySum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max + arr[i]);
			if (max > max_subArraySum) {
				max_subArraySum = max;
			}
		}
		return max_subArraySum;
	}
}
