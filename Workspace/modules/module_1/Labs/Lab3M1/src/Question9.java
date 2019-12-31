
public class Question9 {

	public static void main(String[] args) {
		/*9. Give the Euclidean distance between the two 1D array below. Euclidean distance is equal to the absolute value of their numerical difference. Thus if x and y are two points on the real line, then the distance between them is given by: 
			 
			 
			 
			Array x:      13      4      5      16      7 
			 
			 
			Array y:               18             0            19             5           20*/
		int[] aboslute = new int[5];
		int abso = 0;
		int[] x = {13,4,5,16,7};
		int[] y = {18,0,19,5,20};
		
		for (int i = 0; i < x.length; i++) {
			abso = x[i] - y[i];
			System.out.println("the absolute of x and y: " + Math.abs(abso));
		}
	
	
	
	}
	
	
	
	
	
}
