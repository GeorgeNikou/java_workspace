
public class Question3 {

	public static void main(String[] args) {
		/*3. Describe and explain what happens when you try to compile a program HugeArray.java with the following statement: 
			public class HugeArray {  
			 
			    public static void main(String[] args) {          int N = 1000;         int[] a = new int[N*N*N*N];     } } 
*/
		
		int N = 1000;
		int[] a = new int[N*N*N*N];
		
		for (int i = 0; i<N; i++) {
			System.out.print(a[i]);
		}
	}/*Exception in thread "main" java.lang.NegativeArraySizeException
	at Question3.main(Question3.java:12)
*/
}
