
public class Question5 {

	public static void main(String[] args) {
		/*5. Given an array of int, return true if 6 appears as either the first or last element in the array. The array will be length 3 or more. 
				firstLast6({1, 2, 6}) — true 
				firstLast6({6, 1, 2, 3}) — true 
				firstLast6({3, 2, 1}) — false */

		int[] arr = {1,2,4,7,6,6};
		int[] arr2 = {6,5,4};
		int[] arr3 = {1,2,4,10};
		
			if (arr[0] == 6) {
				System.out.println("true");
			}else if(arr[arr.length -1] == 6) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			if (arr2[0] == 6) {
				System.out.println("true");
			}else if(arr2[arr2.length -1] == 6) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			if (arr3[0] == 6) {
				System.out.println("true");
			}else if(arr3[arr3.length -1] == 6) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			
			
		}
	}


