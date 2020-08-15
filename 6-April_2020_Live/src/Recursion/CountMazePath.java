package Recursion;

public class CountMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMazePath(2, 2, 0, 0, ""));
	}

	public static int countMazePath(int endRow, int endColumn, int currentRow, int currentColumn, String res) {
		if (currentRow > endRow || currentColumn > endColumn) {
			return 0;
		}
		if (currentRow == endRow && currentColumn == endColumn) {
//			System.out.println(res);
			return 1;
		}
		int ans = 0;
		ans = ans + countMazePath(endRow, endColumn, currentRow, currentColumn + 1, res + "H");
		ans = ans + countMazePath(endRow, endColumn, currentRow + 1, currentColumn, res + "V");
		return ans;
	}

}
