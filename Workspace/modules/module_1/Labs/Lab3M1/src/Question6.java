
public class Question6 {

	public static void main(String[] args) {
		/*
		 * 6. Given an array of int, return true if the array’s length is bigger than or
		 * equal to 3, and the first and last element are the same.
		 * 
		 * sameFirstLast({1, 2, 3}) — false 
		 * sameFirstLast({1, 2, 3, 1}) — true
		 * sameFirstLast({1, 2, 1}) — true
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3, 1};
		int[] arr3 = {1, 2, 1};
		
		if(arr1.length>=3 && arr1[0] == arr1[arr1.length -1]) {
			System.out.println("true");
		}else 
			System.out.println("false");
		
		
		if(arr2.length>=3 && arr2[0] == arr2[arr2.length -1]) {
			System.out.println("true");
		}else 
			System.out.println("false");
		
		
		if(arr3.length>=3 && arr3[0] == arr3[arr3.length -1]) {
			System.out.println("true");
		}else 
			System.out.println("false");
	}

}
