package Recursion;

public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBoardPath(10, 0, ""));;
	}

	public static int countBoardPath(int end, int curr, String res) {
		if (curr == end) {
//			System.out.println(res);
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int ans = 0;
		for (int dice = 1; dice <= 6; dice++) {
			ans = ans + countBoardPath(end, curr + dice, res + dice);
		}
		return ans;
	}
}
