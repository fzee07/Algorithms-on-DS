package Strings;

import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		String str = "IAmACompetitiveProgrammerAndIReallyWantAJob";
		CanYouReadThis(str);
	}

	public static void CanYouReadThis(String str) {
		int i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i + 1) >= 65 && str.charAt(i + 1) <= 90) {
				System.out.print(str.charAt(i) + "\n");
			} else {
				System.out.print(str.charAt(i));
			}
		}
		System.out.print(str.charAt(i));
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//		}
	}

}
