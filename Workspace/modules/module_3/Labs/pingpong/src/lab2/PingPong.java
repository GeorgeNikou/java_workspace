package pingpong;

import java.util.ArrayList;
import java.util.Random;

public class PingPong extends Thread {

	Random r = new Random();
	private String name;
	private BoolClass bool;
	private boolean hitValue;
	private int count = 0;
	private long time;
	private long current;
	

	public PingPong(String name, BoolClass bool, boolean boolFalse) {
		this.name = name;
		this.bool = bool;
		this.hitValue = boolFalse;
	}

	public void run() {
		super.run();
		time = System.currentTimeMillis();

		try {

			while (true) {
				
				int rand = r.nextInt(10);

				if (this.bool.isBoolClass() == hitValue) {
					Thread.sleep(10);
					
					if(rand == 9) {
						System.out.println("SMASH! " + "("+this.name+")");
					}else {
						System.out.println("PING! " + "("+this.name+")");
						
					}
					count++;
					
					this.bool.setBoolClass(!hitValue);
					current = System.currentTimeMillis();
					
					
					if (count == 100 || current - time>= 120000) {
						break;
					}

				}
			}

		} catch (Exception e) {
		}
	}

}
