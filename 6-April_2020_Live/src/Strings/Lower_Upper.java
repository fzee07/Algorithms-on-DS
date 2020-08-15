package Strings;

import java.util.*;

public class Lower_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		LowerUpper(ch);
	}

	public static void LowerUpper(char ch) {
		if (ch >= 65 && ch <= 90) {
			System.out.println("UPPERCASE");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("lowercase");
		} else {
			System.out.println("Invalid");
		}
	}
}
