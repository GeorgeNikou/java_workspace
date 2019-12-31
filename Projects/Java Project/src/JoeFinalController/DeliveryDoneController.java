package Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Controller.DeliveryAcceptController.DeliveryAccepController.AcceptOrder;
import Controller.DeliveryAcceptController.DeliveryAccepController.SelectOrder;
import model.DeliveryBean;
import model.HistoryDAO;
import model.HistoryModel;
import view.DeliveryView;

public class DeliveryDoneController {

	
	private DeliveryView deliveryView;
	private HistoryModel historyModel;
	private ArrayList<HistoryDAO> customerOrders;
	private JList orderList;
	private DeliveryBean delivery;
	private ArrayList <HistoryDAO> customersToDeliver;
	private String orderSelected;
	public void DeliveryViewController(DeliveryBean delivery) {
		this.delivery = delivery;
		this.deliveryView = new DeliveryView();
		this.historyModel = new HistoryModel();
		this.orderList = this.deliveryView.getDeliveryOrderList();
		this.customerOrders = historyModel.getSingleHistory(id);
		this.deliveryView.getSelectbtn().addActionListener(new SelectOrder());
		this.deliveryView.getCompletebtn().addActionListener(new AcceptOrder());
		
	}

	public void actionPerformed(ActionEvent e) {		
		
		DefaultListModel<String> model = new DefaultListModel<>();	
		
		for (int i = 0; i < deliveryView.getDeliveryOrderList().getModel().getSize(); i++) {
			if(i != deliveryView.getDeliveryOrderList().getSelectedIndex()) {
				String item = (String) deliveryView.getDeliveryOrderList().getModel().getElementAt(i);
				model.addElement(item);  
			}
		}
		deliveryView.getDeliveryOrderList().setModel(model);
		
	}
	
	public Complete actionPerformed(ActionEvent e) {
		
	}
}
 
