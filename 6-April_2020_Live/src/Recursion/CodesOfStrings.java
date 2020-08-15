package Recursion;

public class CodesOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCodesOfStrings("1234", "");
	}

	public static void PrintCodesOfStrings(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		String fc = str.substring(0, 1);
		String RoS1 = str.substring(1);
		char code1 = getCode(fc);
		PrintCodesOfStrings(RoS1, res + code1);

		if (str.length() >= 2) {
			String dc = str.substring(0, 2);
			String RoS2 = str.substring(2);
			if (Integer.valueOf(dc) <= 26) {
				char code2 = getCode(dc);
				PrintCodesOfStrings(RoS2, res + code2);
			}
		}
	}

	public static char getCode(String str) {
		int value = Integer.valueOf(str);
		int ascii = 96 + value;
		return (char) (ascii);
	}

}
