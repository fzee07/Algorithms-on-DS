package Array;

import java.util.*;

public class HelpRahulToSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = s.nextInt();
		}
		int x, k = 0;
		x = s.nextInt();
		// binary search start
		for (int i = 0; i < n; i++) {
			if (A[i] == x) {
				k = i;
			}
		}
		// binary search end
		if (A[k] == x) {
			System.out.print(k);
		} else {
			System.out.print(-1);
		}
	}

}
