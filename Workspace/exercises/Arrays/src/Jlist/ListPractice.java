package Jlist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListPractice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
	private JButton btnDelete;
	private JButton btnAdd;
	private DefaultListModel<String> model;

	/**
	 * Create the frame.
	 */
	public ListPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 100));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		list = new JList();
		model = new DefaultListModel<>();
		list.setModel(model);
		panel.add(list, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		btnAdd = new JButton("add");
		panel_1.add(btnAdd);
		
		btnDelete = new JButton("delete");
		panel_1.add(btnDelete);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		this.setVisible(false);
	}
	
	
	

	/**
	 * @return the model
	 */
	public DefaultListModel<String> getModel() {
		return model;
	}




	/**
	 * @param model the model to set
	 */
	public void setModel(DefaultListModel<String> model) {
		this.model = model;
	}




	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * @return the list
	 */
	public JList getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(JList list) {
		this.list = list;
	}

	/**
	 * @return the btnDelete
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}

	/**
	 * @param btnDelete the btnDelete to set
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	/**
	 * @return the btnAdd
	 */
	public JButton getBtnAdd() {
		return btnAdd;
	}

	/**
	 * @param btnAdd the btnAdd to set
	 */
	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}
	
	
	

}
