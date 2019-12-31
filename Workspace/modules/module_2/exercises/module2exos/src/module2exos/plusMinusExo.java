package module2exos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class plusMinusExo extends JFrame {
	JFrame frame;
	int num = 00;
	public plusMinusExo() {
		this.setTitle("- and +");
		this.setSize(400, 175);
		frame = this;
		
		JPanel mainPan = new JPanel();
		JLabel number = new JLabel("00");
		JButton btnPlus = new JButton("+");
		JButton btnMinus = new JButton("-");
		
		mainPan.add(btnMinus);
		mainPan.add(number);
		mainPan.add(btnPlus);
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number.setText(""+ num--);
				
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number.setText(""+ num++);
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		this.add(mainPan);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
