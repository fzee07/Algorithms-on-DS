package Array;

public class FormBiggestNumberRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public int[] arr = { 54, 546, 548, 90 };
//		FormBiggestNumber(arr);
		int i = 0, j = i+1;
		myCompare(Integer.toString(arr[i]), Integer.toString(arr[j]), arr);
	}

//	public static void FormBiggestNumber(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			int j = i + 1;
//			if (j == arr.length - 1) {
//				
//			}
//			if (myCompare(Integer.toString(arr[i]), Integer.toString(arr[j]))) {
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//			}
//			j++;
//			myCompare(Integer.toString(arr[i]), Integer.toString(arr[j]));
//		}
//		for (int val : arr) {
//			System.out.print(val);
//		}
//	}

	public static boolean myCompare(String x, String y, int[] arr) {
		String xy = x + y;
		String yx = y + x;

		if (xy.compareTo(yx) > 0) {
			return false;
		}else {
			return true;
		}	
		
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (j == arr.length - 1) {
				
			}
			if (myCompare(Integer.toString(arr[i]), Integer.toString(arr[j])), arr) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
			myCompare(Integer.toString(arr[i]), Integer.toString(arr[j]), arr);
		}
		for (int val : arr) {
			System.out.print(val);
		}
		
	}

}
