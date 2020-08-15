package Array;

import java.util.*;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		int n = s.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
			str1 = str1 + Integer.toString(arr1[i]);
		}
		int m = s.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = s.nextInt();
			str2 = str2 + Integer.toString(arr2[i]);
		}
		sumOfTwoArrays(str1, str2);
	}

	public static void sumOfTwoArrays(String str1, String str2) {
		int num_of_array1 = Integer.parseInt(str1);
		int num_of_array2 = Integer.parseInt(str2);

		int added_num = num_of_array1 + num_of_array2;
		int rem = 0;
		int rev = 0;
		int count = 0;
		while (added_num > 0) {
			rem = added_num % 10;
			rev = rev * 10 + rem;
			added_num = added_num / 10;
			count++;
		}
		int[] arr = new int[count];
		int rem2 = 0;
		int i = 0;
		while (rev > 0) {
			rem2 = rev % 10;
			arr[i] = rem2;
			i++;
			rev = rev / 10;
		}

		for (int j = 0; j < count; j++) {
			System.out.print(arr[j] + ", ");
		}
		System.out.print("END");

	}
}
