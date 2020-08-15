package Recursion;

public class PrintKeyBoardCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeyBoardsCodes("12", "");
	}

	public static void printKeyBoardsCodes(String str, String res) {
		if(str.length()==0) {
			
		}
		char cc = str.charAt(0);
		String RoS = str.substring(1);
		String code = getCode(cc);
		for (int i = 0; i < code.length(); i++) {
			printKeyBoardsCodes(RoS, res + code.charAt(i));
		}
	}

	public static String getCode(char cc) {
		if (cc == '1') {
			return "abc";
		}
		if (cc == '2') {
			return "def";
		}
		if (cc == '3') {
			return "ghi";
		}
		if (cc == '4') {
			return "jkl";
		}
		if (cc == '5') {
			return "mno";
		}
		if (cc == '6') {
			return "pqr";
		}
		if (cc == '7') {
			return "stu";
		}
		if (cc == '8') {
			return "vwx";
		}
		if (cc == '9') {
			return "yz";
		}
		return "";
	}

}
