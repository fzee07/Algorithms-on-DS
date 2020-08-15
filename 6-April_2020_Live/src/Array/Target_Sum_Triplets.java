package Array;

public class Target_Sum_Triplets {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 1, 2, 4, 6, 8, 3 };
		int target = 10;
		TargetSumTriplets(arr, target);
	}

	public static void TargetSumTriplets(int[] arr, int target) {
		for (int pass = 1; pass <= arr.length - 1; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		for (int i = 0; i < arr.length - 2; i++) {
			int l = i + 1;
			int r = arr.length - 1;
			while (l < r) { // 1 2 3 4 5 6 7 8 9
				if (target < arr[i] + arr[l] + arr[r]) {
					r--;
				}
				if (arr[i] + arr[l] + arr[r] == target) {
					
					if (arr[i] == arr[l]) {
						System.out.println(arr[i] + " and " + arr[r]);
					} else if (arr[i] == arr[r]) {
						System.out.println(arr[i] + " and " + arr[l]);
					} else if (arr[l] == arr[r]) {
						System.out.println(arr[i] + " and " + arr[l]);
					} else {
						System.out.println(arr[i] + ", " + arr[l] + " and " + arr[r]);
					}
					l++;
					r--;
				}
			}
		}
	}
}
