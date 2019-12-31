package pingpong;

public class main {

	public static void main(String[] args) {
		
		int total= 0;
		
		Lab1 thread1 = new Lab1("Thread 1");
		Lab1 thread2 = new Lab1("Thread 2");
		Lab1 thread3 = new Lab1("Thread 3");
		Lab1 thread4 = new Lab1("Thread 4");
		Lab1 thread5 = new Lab1("Thread 5");
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		Thread t4 = new Thread(thread4);
		Thread t5 = new Thread(thread5);
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		total += thread1.getSum() + thread2.getSum() + thread3.getSum() + thread4.getSum() + thread5.getSum();
		System.out.println(total);
		
		
		

	}

}
