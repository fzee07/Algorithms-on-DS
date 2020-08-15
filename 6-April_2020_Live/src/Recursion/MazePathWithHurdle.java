package Recursion;

public class MazePathWithHurdle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,0,9,0},{0,0,9,0},{9,0,0,0},{0,9,0,0}};
		mazePathWithhurdle(arr, 3, 3, 0, 0);
	}

	public static void mazePathWithhurdle(int[][] arr, int er, int ec, int cc, int cr) {
		if (cc > ec || cr > er) {
			return;
		}
		if (cr == er && cc == ec) {
			arr[cr][cc] = 1;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("**********************");
			return;
		}
		if (arr[cr][cc] == 9) {
			return;
		}
		arr[cr][cc] = 1;
		mazePathWithhurdle(arr, er, ec, cc + 1, cr);
		mazePathWithhurdle(arr, er, ec, cc, cr + 1);
		arr[cr][cc] = 0;
	}

}
