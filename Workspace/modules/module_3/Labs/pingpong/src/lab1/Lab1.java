package pingpong;

import java.util.Random;

public class Lab1 implements Runnable {
	
	private String name;
	private int sum;

	public Lab1(String name) {
		this.name = name;
	}

	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			randomTen();
		}
		System.out.println(this.name + " : " + sum + " sum");
		

	}

	// function to generate random numbers between 10
	public void randomTen() {
		Random r = new Random();
		int rand = r.nextInt(10);

		/*try {
			Thread.sleep(500);
		} catch (Exception e) {
		}*/

		System.out.println(this.name + " : " + rand + " random");
		sum += rand;
		
	}
	



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sum
	 */
	public synchronized int getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	

}
