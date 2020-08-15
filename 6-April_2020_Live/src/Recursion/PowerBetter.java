package Recursion;

public class PowerBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerBetter(2, 7));
	}

	public static int powerBetter(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int ans = 1;
		int pnb2 = powerBetter(x, n / 2);
		if (n % 2 == 1) {
			ans = x * pnb2 * pnb2;
		} else {
			ans = pnb2 * pnb2;
		}
		return ans;
	}

}
