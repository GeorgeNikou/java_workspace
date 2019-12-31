package exo3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.temporal.IsoFields;

import javax.swing.JButton;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	public Frame() {
		setSize(new Dimension(600, 500));
		frame = this;
		frame.setTitle("Shapes");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(topPanel, BorderLayout.NORTH);

		JLabel lbl_shapeName = new JLabel("Name of Shape");
		lbl_shapeName.setFont(new Font("Tahoma", Font.BOLD, 16));
		topPanel.add(lbl_shapeName);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		bottomPanel.setPreferredSize(new Dimension(10, 110));
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));

		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(10, 35));
		bottomPanel.add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.setLayout(new GridLayout(0, 5, 0, 0));
		// buttons
		JButton circleButton = new JButton("Circle");
		buttonPanel.add(circleButton);

		JButton squareButton = new JButton("Square");
		buttonPanel.add(squareButton);

		JButton triangleButton = new JButton("Triangle");
		buttonPanel.add(triangleButton);

		JButton fillButton = new JButton("Fill");
		buttonPanel.add(fillButton);

		JButton eraseButton = new JButton("Erase");
		buttonPanel.add(eraseButton);

		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setPreferredSize(new Dimension(10, 20));
		bottomPanel.add(descriptionPanel, BorderLayout.NORTH);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		descriptionPanel.setLayout(fl_panel);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		descriptionPanel.add(lblDescription);

		JPanel panel = new JPanel();
		bottomPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lbl_position = new JLabel("Posistion (x,y)");
		lbl_position.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_position.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.add(lbl_position);

		JLabel lbl_length = new JLabel("Length");
		lbl_length.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_length);

		JLabel lbl_area = new JLabel("Area");
		lbl_area.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_area);

		JLabel lbl_perimeter = new JLabel("Perimeter");
		lbl_perimeter.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_perimeter);

		ShapePan shapePanel = new ShapePan();

		Circle circle = new Circle(Color.blue, 100.5f);
		Square square = new Square(Color.red, 125.5f);
		Triangle triangle = new Triangle(Color.green, 150.5f);
		
		//calculating area and perimeter
		String circle_a = circle.calculateArea() + "";
		String circle_p= circle.calculatePerimeter() + "";
		
		String square_a = square.calculateArea() + "";
		String square_p = square.calculatePerimeter() + "";
		
		String triangle_a = triangle.calculateArea() + "";
		String triangle_p = triangle.calculatePerimeter() + "";
		
		
		
		
		

		circleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shapePanel.setShape(circle);
				lbl_shapeName.setText("CIRCLE");
				lbl_area.setText(circle_a);// setting label to area of circle
				lbl_perimeter.setText(circle_p); // Perimeter
				lbl_length.setText(circle.getRadius() + ""); // Length (radius)
				
				if (shapePanel.isFilled()) {
					shapePanel.setFilled(false);
				} else
					shapePanel.setFilled(true);

			}
		});

		squareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shapePanel.setShape(square);
				lbl_shapeName.setText("SQUARE");
				lbl_area.setText(square_a); // setting label to area of square
				lbl_perimeter.setText(square_p); // Perimeter
				lbl_length.setText(square.getWidth() + "");
				
				if (shapePanel.isFilled()) {
					shapePanel.setFilled(false);
				} else
					shapePanel.setFilled(true);

			}
		});

		triangleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shapePanel.setShape(triangle);
				lbl_shapeName.setText("TRIANGLE");
				lbl_area.setText(square_a); // setting label to area of square
				lbl_perimeter.setText(square_p); // Perimeter
				lbl_length.setText(triangle.getSide() + "");
				if (shapePanel.isFilled()) {
					shapePanel.setFilled(false);
				} else
					shapePanel.setFilled(true);

			}
		});

		fillButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shapePanel.isFilled()) {
					shapePanel.setFilled(false);
				} else
					shapePanel.setFilled(true);


			}
		});

		eraseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_shapeName.setText("NAME OF SHAPE");
				lbl_position.setText("position (x,y)");
				lbl_area.setText("area");
				lbl_perimeter.setText("Perimeter");
				lbl_length.setText("Length");
				shapePanel.setShape(null);
				repaint();
				revalidate();
				

			}
		});

		shapePanel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				shapePanel.removeAll();
				shapePanel.setX(e.getX());
				shapePanel.setY(e.getY());
				// setting positions (x,y)
				String xPos = e.getX() + "";
				String yPos = e.getY() + "";
				lbl_position.setText("X position: " + xPos + " | " + "Y position: " + yPos);
				
				
				
				shapePanel.repaint();
				shapePanel.revalidate();
				
				contentPane.add(shapePanel, BorderLayout.CENTER);
				
				
				

				frame.repaint();
				frame.revalidate();
			}
		});
		
		
		contentPane.add(shapePanel, BorderLayout.CENTER);
		
		JMenuItem pop1 = new JMenuItem("red");
		JMenuItem pop2 = new JMenuItem("blue");
		JMenuItem pop3 = new JMenuItem("green");
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.add(pop1);
		popupMenu.add(pop2);
		popupMenu.add(pop3);
		
		shapePanel.setComponentPopupMenu(popupMenu);
		
		pop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				circle.setColor(Color.RED);
				square.setColor(Color.RED);
				triangle.setColor(Color.RED);
				
			}
		});
		
		pop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circle.setColor(Color.BLUE);
				square.setColor(Color.BLUE);
				triangle.setColor(Color.BLUE);
				
			}
		});
		
		pop3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circle.setColor(Color.GREEN);
				square.setColor(Color.GREEN);
				triangle.setColor(Color.GREEN);
				
			}
		});
		
		
		
		frame.setVisible(true);
		this.setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
