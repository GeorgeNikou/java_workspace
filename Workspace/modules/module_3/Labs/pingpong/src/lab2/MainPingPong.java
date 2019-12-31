package pingpong;

public class MainPingPong {

	public static void main(String[] args) {
		
	
		BoolClass hit = new BoolClass(true);
		
		
		PingPong george = new PingPong("George",hit,true);
		PingPong mushu = new PingPong("Mushu",hit,false);
		
		Thread t1 = new Thread(george);
		Thread t2 = new Thread(mushu);
		
		t1.start();
		t2.start();
	}

}
