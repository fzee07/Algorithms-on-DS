package Recursion;

public class PrintPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermutation("abc", "");
	}

	public static void printPermutation(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(0);
			String RoS = str.substring(0, i) + str.substring(i + 1);
			printPermutation(RoS, res + cc);
		}
	}

}
