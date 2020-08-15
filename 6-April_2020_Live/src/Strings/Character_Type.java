package Strings;

import java.util.Scanner;

public class Character_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);

		if (ch >= 65 && ch <= 90) {
			System.out.println("U");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("L");
		} else {
			System.out.println("I");
		}
	}

}
