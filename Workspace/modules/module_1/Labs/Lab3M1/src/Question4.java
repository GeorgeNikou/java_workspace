
public class Question4 {

	public static void main(String[] args) {
//		4. Describe and explain what happens when you try to compile a program HugeArray.java with the following statement: 
//			public class HugeArray {  
			 
			    //public static void main(String[] args) {          int N = 200;         int[] a = new int[N*N*N*N];     } } 

		int N = 200;
		int[] a = new int[N*N*N*N];
		
		for(int i = 0;i<a.length; i++) {
			System.out.println(a[i]);
		}
		/*Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		at Question4.main(Question4.java:11)*/
				
	}

}
