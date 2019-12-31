package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;

import model.DeliveryBean;
import model.DeliveryDAO;
import model.DeliveryModel;
import model.HistoryDAO;
import model.HistoryModel;
import view.DeliveryAcceptView;


public class DeliveryAcceptController {
	
	public class DeliveryAccepController {
		private DeliveryAcceptView deliveryAcceptView;
		private HistoryModel historyModel;
		private ArrayList<HistoryDAO> customerOrders;
		private JList orderList;
		private DeliveryBean delivery;
		private DeliveryModel deliveryModel;
		private ArrayList <HistoryDAO> customersToDeliver;
		private ArrayList <DeliveryDAO> customerOrders1;
		private ArrayList <DeliveryDAO> customerToDeliver1;
		private String orderSelected;
		public void DeliveryAcceptController(DeliveryBean deliveryGuy) {
			this.delivery = delivery;
			this.deliveryAcceptView = new DeliveryAcceptView();
			this.historyModel = new HistoryModel();
			this.deliveryModel = new DeliveryModel();
			this.orderList = this.deliveryAcceptView.getDeliveryList();
			this.customerOrders = historyModel.getSingleHistory(id);
			this.deliveryAcceptView.getViewDeliveryMI().setText("Accepting a Delivery");
			this.deliveryAcceptView.getCompletebtn().setText("Accept Delivery");
			this.deliveryAcceptView.getSelectbtn().addActionListener(new SelectOrder());
			this.deliveryAcceptView.getCompletebtn().addActionListener(new AcceptOrder());
			for(int i = 0; i < this.customerOrders.size(); i++) {
				if(this.customerOrders1.get(i).getDeliveryList(0).equals(delivery.getDeliveryAddress().toString())) {
					customersToDeliver.add(customerOrders.get(i));
				}
			}
			for(int i = 0; i < customerToDeliver1.size(); i++) {
				this.deliveryModel.addElement(customerToDeliver1.get(i).getDeliveryList());
			}	
		}
		
		
		public class AcceptOrder implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
					if(orderSelected.equals(null)) {
						JOptionPane.showMessageDialog(deliveryAcceptView, "Select your order ", "Error", JOptionPane.WARNING_MESSAGE);
						return;
					}
					
			}	
		}
		public class GoBack implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
			deliveryAcceptView.setVisible(true);
			}
			
		}
		public class SelectOrder implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					orderSelected = orderList.getSelectedValue().toString();
					} catch (Exception e2) {
					JOptionPane.showMessageDialog(deliveryAcceptView, "Select your order ", "Error", JOptionPane.WARNING_MESSAGE);
					return;
				}
				int selectedIndex = orderList.getSelectedIndex();
				if (selectedIndex != -1) {
					deliveryAcceptView.getOrderNumberlbl2();
					deliveryAcceptView.getRestaurantNumberlbl2();
					deliveryAcceptView.getDeliveryAddresslbl2();
					deliveryAcceptView.getDeliveryPostalCodelbl2();
				}
			}	
		}
	}
}
