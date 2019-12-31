package georgeFinalController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import view_draft.ManagerView;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditMenuView;
import view_draft.RestaurantEditView;

public class ManagerDashController{
	
	public ManagerView managerView;
	public RestaurantEditMenuView editView;
	public RestaurantDeleteMenuView deleteView;
	public RestaurantCreateMenuView restoCreateView;
	//TODO: add all the views that contains all the menus
	
	//TODO: pass every view to this constructor
	public ManagerDashController(ManagerView managerView, RestaurantCreateMenuView restoCreateView, RestaurantEditMenuView editView, RestaurantDeleteMenuView deleteView) {
		this.restoCreateView = restoCreateView;
		
		
		
		
		managerView.getBtnCreate().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				managerView.dispose(); //dashboardView.setVisible(false);
				restoCreateView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {
					restoCreateView.getMnRestaurant().setVisible(false);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoCreateView.getRestaurantSelect_list().setModel(model);	
					
					restoCreateView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoCreateView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoCreateView.getRestaurantSelect_list().getSelectedValue();

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		managerView.getBtnEdit().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				managerView.dispose(); 
				editView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {
					editView.getMnRestaurant().setVisible(false);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editView.getRestaurantSelect_list().setModel(model);	
					
					editView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});			
				
			}
		});
		
		managerView.getBtnDelete().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				managerView.dispose(); 
				deleteView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {
					deleteView.getMnRestaurant().setVisible(false);
				}
				
				deleteView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					deleteView.getRestaurantSelect_list().setModel(model);	
					
					deleteView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
			}
		});
		
		
	}
}
