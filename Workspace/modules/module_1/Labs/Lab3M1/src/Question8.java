import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
		//8. Compare if two arrays have the same content (doesn't matter if they aren't in order)
		
		int[] arr2 = { 1, 3, 5, 7, 9 };
		int[] arr3 = { 1, 3, 5, 9, 7};
		
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println("The arr2 and arr3 are " + "("+(Arrays.equals(arr2,arr3)+")"));
		
		}

	}


