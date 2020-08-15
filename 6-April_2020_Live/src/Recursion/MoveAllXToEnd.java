package Recursion;

public class MoveAllXToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "axbdxccx";
		System.out.println(moveAllXToEnd(str));
	}

	public static String moveAllXToEnd(String str) {
		if (str.length() == 0) {
			return "";
		}

		String ans = "";
		char cc = str.charAt(0);
		if (cc == 'x') {
			String restAns = moveAllXToEnd(str.substring(1));
			ans = restAns + 'x';
		} else {
			String restAns = moveAllXToEnd(str.substring(1));
			ans = cc + restAns;
		}
		return ans;
	}

}
