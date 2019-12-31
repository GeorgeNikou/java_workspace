
public class Question6 {

	public static void main(String[] args) {
		
	/*	6. What are the  values of i, j and k?
				int i = 2;
				int j = 3;
				int k = 4;
				int x = i + j + k;

				i = x - i - j;  //i?           
				j = x - j - k;  //j?          
				k = x - i - k;  //k?          */
		
		int i = 2;
		int j = 3;
		int k = 4;
		int x = i + j + k;
		
		int a = x - i - j;
		System.out.println("i is equal to: " + a);
		
		int b = x - j - k;
		System.out.println("j is equal to: " + b);
		
		int c = x - i - k;
		System.out.println("k is equal to " + c);
		
		
		
		
	}

}
