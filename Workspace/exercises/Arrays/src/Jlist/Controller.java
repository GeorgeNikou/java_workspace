package Jlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class Controller {
	
	public ListPractice listView;
	
	
	public Controller(ListPractice listView) {
		this.listView = listView;
		listView.setVisible(true);
		
		listView.getBtnAdd().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				DefaultListModel<String> newModel = new DefaultListModel<>();
				String temp = listView.getTextField().getText();
				newModel.addElement(temp);
				listView.getList().setModel(newModel);
			
				
				
				
				
				/*if(listView.getList().getModel().getSize() > 0) {
					System.out.println("less than zero");
				}else {
					System.out.println("greater than zero");
					System.out.println(listView.getList().getModel().getSize());
				}*/
				
			}
		});
		
		listView.getBtnDelete().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("delete");
				
			}
		});
	}
	
	
	
	

}
