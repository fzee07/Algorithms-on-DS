package Recursion;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMazePath(2, 2, 0, 0, "");
	}

	public static void printMazePath(int endRow, int endColumn, int currentRow, int currentColumn, String res) {
		if (currentRow > endRow || currentColumn > endColumn) {
			return;
		}
		if (currentRow == endRow && currentColumn == endColumn) {
			System.out.println(res);
			return;
		}

		printMazePath(endRow, endColumn, currentRow, currentColumn + 1, res + "H");
		printMazePath(endRow, endColumn, currentRow + 1, currentColumn, res + "V");
	}

}
