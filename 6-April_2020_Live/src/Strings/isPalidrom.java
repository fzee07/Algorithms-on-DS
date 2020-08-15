package Strings;

import java.util.Scanner;

public class isPalidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		int left = 0;
//		int right = str.length() - 1;
		String copyStr = "";
		System.out.println(is_Palindrom(str, copyStr));
	}

	public static boolean is_Palindrom(String str, String copyStr) {
		for (int i = str.length() - 1; i >= 0; i--) {
			copyStr += str.charAt(i);
		}
		if (copyStr.equals(str)) {
			return true;
		} else {
			return false;
		}
	}

}
