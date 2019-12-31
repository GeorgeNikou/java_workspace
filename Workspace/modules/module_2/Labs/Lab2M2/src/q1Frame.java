import javax.swing.JFrame;



public class q1Frame extends JFrame {
	public q1Frame() {
		this.setTitle("My First Frame");
		this.setSize(700, 700);
		
		this.add(new q1Panel());

		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
