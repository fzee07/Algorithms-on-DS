package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintAllSubSequences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = s.next();
			ArrayList<String> result = new ArrayList<String>();
			result = PrintSub(str[i], "", result);
			Collections.sort(result);
			for (int j = 0; j < result.size(); j++) {
				System.out.println(result.get(j));
			}

		}

	}

	public static ArrayList<String> PrintSub(String str, String res, ArrayList<String> result) {
		if (str.length() == 0) {
			result.add(res);
			return result;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		PrintSub(ros, res, result);
		PrintSub(ros, res + cc, result);
		return result;
	}

}
