package Recursion;

public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBoardPath(10, 0, "");
	}

	public static void printBoardPath(int end, int curr, String res) {
		if (curr == end) {
			System.out.println(res);
			return;
		}
		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			printBoardPath(end, curr + dice, res + dice);
		}
	}

}
