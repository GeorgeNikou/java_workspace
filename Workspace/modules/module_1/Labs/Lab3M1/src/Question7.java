import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		// 7. Compare if two arrays have the same content (in the same order).
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 1, 3, 5, 7, 9 };
		int[] arr3 = { 1, 3, 5, 9, 7 };
		
		//import java.util.arrays
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		

	}

}
