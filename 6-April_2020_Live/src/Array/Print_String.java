package Array;

import java.util.*;

public class Print_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
			str1 = str1 + Integer.toString(arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = s.nextInt();
			str2 = str2 + Integer.toString(arr2[i]); 
		}

		System.out.println(str1);
		System.out.println(str2);
	}

}
