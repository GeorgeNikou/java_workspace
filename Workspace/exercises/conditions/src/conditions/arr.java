package conditions;

import java.util.ArrayList;

public class arr {

	public static void main(String[] args) {
	//String[] words = {"first","second","third"};
	
	
		/*ArrayList<String[]> words = new ArrayList<>();// <----- help?
		
		String profile1[] = { "1001", "George 1", "Boursiquot", "1", "01/01/2010", "Male", "514-514-5144",
				"email1@gmail.com", "123 Fake Street", "Montreal", "1", "1" };*/
		
		/*words.add("one");
		words.add("two");
		words.add("three");
		
		
*/		
		
	//System.out.println(addNumber(2,2));
		
		//arr tmp = new arr();
		//System.out.println(tmp.addNumber(12, 2));
		
		String profile1[] = { "1001", "George 1", "Boursiquot", "1", "01/01/2010", "Male", "514-514-5144",
				"email1@gmail.com", "123 Fake Street", "Montreal", "1", "1" };
		
		
		
		int num = 0;
		String info = "";
		int[] numbers  = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i<numbers.length; i++) {
			num += numbers[i];
			info += profile1[i] + ", ";
			
		
		}
		System.out.println(info);
		System.out.println("I miss my java experience!!");
		
		String[] juices = {"apple", "jelly","chips","orange", "truffle" };
		System.out.println("--------------------------------------------");
		System.out.println("List of items available");
		System.out.println();
		for (int i = 0; i <juices.length; i++) {
			
		
			System.out.println((i+1 + ": ") + juices[i]);
			
			
		}
		
		
		
	
		
		
		
		
		
	}
	public int addNumber(int i, int k) {
		int j;
		j =  i + k;
		return j;
	}
	
	
	
	
	
	
	
	}



