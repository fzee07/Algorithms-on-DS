package Array;

import java.util.*;

public class Maximum_Length_Bitonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] lis = new int[n];
		int[] lds = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i=0; i<n; i++) {
			lis[i] = 1;
			lds[i] = 1;
		}
		System.out.println(lbs(arr, lis, lds, n));
	}

	public static int lbs(int[] arr, int[] lis, int[] lds, int n) {
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if((arr[i]>arr[j]) && (lis[i]<(lis[j]+1))) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		for(int i=n-2; i>=0; i--) {
			for(int j=n-1; j>i; j--) {
				if((arr[i]>arr[j]) && (lds[i]<(lds[j]+1))) {
					lds[i] = lds[j] + 1;
				}
			}
		}
		
		int max = lis[0] + lds[0] - 1;
		for(int i=1; i<n; i++) {
			if(lis[i]+lds[i] - 1 > max) {
				max = lis[i]+lds[i] - 1;
			}
		}
		return max;
	}

}
