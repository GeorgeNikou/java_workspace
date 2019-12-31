package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JMenuItem;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.RestaurantBean;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditView;

public class MenuBar2RestaurantController{
	

	public RestaurantEditView editView;
	public RestaurantDeleteView deleteView;
	public RestaurantCreateView restoCreateView;
	//TODO: add all the views that contains all the menus
	
	//TODO: pass every view to this constructor
	public MenuBar2RestaurantController(RestaurantCreateView restoCreateView, RestaurantEditView editView, RestaurantDeleteView deleteView) {
		this.restoCreateView = restoCreateView;
				
		restoCreateView.getMnResturant().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.getTxtfield_name().setText("");
				restoCreateView.getTxtfield_address().setText("");
				restoCreateView.getTxtfield_telephone().setText("");
				restoCreateView.getTextField().setText("");
				restoCreateView.comboResetHour();
				restoCreateView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				restoCreateView.getList().setModel(model);
			}
		});
		
		restoCreateView.getMnResturant().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.getTxtfield_name().setText("");
				restoCreateView.getTxtfield_address().setText("");
				restoCreateView.getTxtfield_telephone().setText("");
				restoCreateView.getTextField().setText("");
				restoCreateView.comboResetHour();
				restoCreateView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				restoCreateView.getList().setModel(model);
				restoCreateView.setVisible(false);
				editView.setVisible(true);
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> modelResto = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						modelResto.addElement(item);  				
					}
					editView.getRestoJList().setModel(modelResto);			
					
				}		
				
				editView.getRestoJList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestoJList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		editView.getTxtfield_name().setText(rb.getRestoName());
		                		editView.getTxtfield_address().setText(rb.getRestoAddress());
			                	editView.getTxtfield_telephone().setText(rb.getPhoneNum());
			                			
			                	editView.getDeliveryJList().setModel(rb.getDeliveryArea());
			                	
			                	//TODO: Populate comboxes	                	
			                	editView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
			                	editView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
			                	editView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
			                	editView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
			                	
			                	editView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
			                	editView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
			                	editView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
			                	editView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
			                	
			                	editView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
			                	editView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
			                	editView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
			                	editView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
			                	
			                	editView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
			                	editView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
			                	editView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
			                	editView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
			                	
			                	editView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
			                	editView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
			                	editView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
			                	editView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
			                	
			                	editView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
			                	editView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
			                	editView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
			                	editView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
			                	
			                	editView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
			                	editView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
			                	editView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
			                	editView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
			                	
			                	
			                	
		                	}
		                	
		                }
		            }
		        });
			}
		});
		
		restoCreateView.getMnResturant().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.getTxtfield_name().setText("");
				restoCreateView.getTxtfield_address().setText("");
				restoCreateView.getTxtfield_telephone().setText("");
				restoCreateView.getTextField().setText("");
				restoCreateView.comboResetHour();
				restoCreateView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				restoCreateView.getList().setModel(model);
				restoCreateView.setVisible(false);
				deleteView.setVisible(true);
				
				DefaultListModel<RestaurantBean> modelDel = new DefaultListModel<>();
				for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
					RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
					modelDel.addElement(item);
				}
				deleteView.getList().setModel(modelDel);
				
				deleteView.getList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		deleteView.getTxtfield_name().setText(rb.getRestoName());
		                		deleteView.getTxtfield_address().setText(rb.getRestoAddress());
		                		deleteView.getTxtfield_telephone().setText(rb.getPhoneNum());
			                	
		                		deleteView.getList_1().setModel(rb.getDeliveryArea());
		                		
			                	//TODO: Populate comboxes	                	
		                		deleteView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
		                		deleteView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
		                		deleteView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
		                		deleteView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
		                		
		                		deleteView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
		                		deleteView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
		                		deleteView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
		                		deleteView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
		                		
		                		deleteView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
		                		deleteView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
		                		deleteView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
		                		deleteView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
		                		
		                		deleteView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
		                		deleteView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
		                		deleteView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
		                		deleteView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
		                		
		                		deleteView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
		                		deleteView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
		                		deleteView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
		                		deleteView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
		                		
		                		deleteView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
		                		deleteView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
		                		deleteView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
		                		deleteView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
		                		
		                		deleteView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
		                		deleteView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
		                		deleteView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
		                		deleteView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
		                		
		                		
			                	
		                	}
		                	
		                	
		                	
		                }
		            }
		        });
			}
		});
		
		editView.getMnResturant().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	
				editView.getTxtfield_name().setText("");
				editView.getTxtfield_address().setText("");
				editView.getTxtfield_telephone().setText("");
				editView.getTextField().setText("");
				editView.comboResetHour();
				editView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				editView.getDeliveryJList().setModel(model);					
				editView.setVisible(false);
				restoCreateView.setVisible(true);					
			}
		});
		
		editView.getMnResturant().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				editView.getTxtfield_name().setText("");
				editView.getTxtfield_address().setText("");
				editView.getTxtfield_telephone().setText("");
				editView.getTextField().setText("");
				editView.comboResetHour();
				editView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				editView.getDeliveryJList().setModel(model);	
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> modelResto = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						modelResto.addElement(item);  				
					}
					editView.getRestoJList().setModel(modelResto);			
					
				}	
				
				editView.getRestoJList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestoJList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		editView.getTxtfield_name().setText(rb.getRestoName());
		                		editView.getTxtfield_address().setText(rb.getRestoAddress());
			                	editView.getTxtfield_telephone().setText(rb.getPhoneNum());
			                			
			                	editView.getDeliveryJList().setModel(rb.getDeliveryArea());
			                	
			                	//TODO: Populate comboxes	                	
			                	editView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
			                	editView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
			                	editView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
			                	editView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
			                	
			                	editView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
			                	editView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
			                	editView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
			                	editView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
			                	
			                	editView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
			                	editView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
			                	editView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
			                	editView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
			                	
			                	editView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
			                	editView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
			                	editView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
			                	editView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
			                	
			                	editView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
			                	editView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
			                	editView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
			                	editView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
			                	
			                	editView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
			                	editView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
			                	editView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
			                	editView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
			                	
			                	editView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
			                	editView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
			                	editView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
			                	editView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
			                	
			                	
			                	
		                	}
		                	
		                }
		            }
		        });
			}
		});
		
		editView.getMnResturant().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				editView.getTxtfield_name().setText("");
				editView.getTxtfield_address().setText("");
				editView.getTxtfield_telephone().setText("");
				editView.getTextField().setText("");
				editView.comboResetHour();
				editView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				editView.getDeliveryJList().setModel(model);					
				editView.setVisible(false);
				deleteView.setVisible(true);
				
				DefaultListModel<RestaurantBean> modelDel = new DefaultListModel<>();
				for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
					RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
					modelDel.addElement(item);
				}
				deleteView.getList().setModel(modelDel);		
				
				deleteView.getList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		deleteView.getTxtfield_name().setText(rb.getRestoName());
		                		deleteView.getTxtfield_address().setText(rb.getRestoAddress());
		                		deleteView.getTxtfield_telephone().setText(rb.getPhoneNum());
		                		
		                		deleteView.getList_1().setModel(rb.getDeliveryArea());
			                	
			                	//TODO: Populate comboxes	                	
		                		deleteView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
		                		deleteView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
		                		deleteView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
		                		deleteView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
		                		
		                		deleteView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
		                		deleteView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
		                		deleteView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
		                		deleteView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
		                		
		                		deleteView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
		                		deleteView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
		                		deleteView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
		                		deleteView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
		                		
		                		deleteView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
		                		deleteView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
		                		deleteView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
		                		deleteView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
		                		
		                		deleteView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
		                		deleteView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
		                		deleteView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
		                		deleteView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
		                		
		                		deleteView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
		                		deleteView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
		                		deleteView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
		                		deleteView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
		                		
		                		deleteView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
		                		deleteView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
		                		deleteView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
		                		deleteView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
		                		
		                		
			                	
		                	}
		                	
		                	
		                	
		                }
		            }
		        });
			}
		});
		
		deleteView.getMnResturant().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	
				deleteView.getTxtfield_name().setText("");
				deleteView.getTxtfield_address().setText("");
				deleteView.getTxtfield_telephone().setText("");
				deleteView.getTextField().setText("");
				deleteView.comboResetHour();
				deleteView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();				
				deleteView.getList_1().setModel(model);					
				deleteView.setVisible(false);
				restoCreateView.setVisible(true);				
			}
		});
		
		deleteView.getMnResturant().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteView.getTxtfield_name().setText("");
				deleteView.getTxtfield_address().setText("");
				deleteView.getTxtfield_telephone().setText("");
				deleteView.getTextField().setText("");
				deleteView.comboResetHour();
				deleteView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();				
				deleteView.getList_1().setModel(model);	
				deleteView.setVisible(false);
				editView.setVisible(true);
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> modelResto = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						modelResto.addElement(item);  				
					}
					editView.getRestoJList().setModel(modelResto);			
					
				}
				
				editView.getRestoJList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestoJList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		editView.getTxtfield_name().setText(rb.getRestoName());
		                		editView.getTxtfield_address().setText(rb.getRestoAddress());
			                	editView.getTxtfield_telephone().setText(rb.getPhoneNum());
			                			
			                	editView.getDeliveryJList().setModel(rb.getDeliveryArea());
			                	
			                	//TODO: Populate comboxes	                	
			                	editView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
			                	editView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
			                	editView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
			                	editView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
			                	
			                	editView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
			                	editView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
			                	editView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
			                	editView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
			                	
			                	editView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
			                	editView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
			                	editView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
			                	editView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
			                	
			                	editView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
			                	editView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
			                	editView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
			                	editView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
			                	
			                	editView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
			                	editView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
			                	editView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
			                	editView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
			                	
			                	editView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
			                	editView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
			                	editView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
			                	editView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
			                	
			                	editView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
			                	editView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
			                	editView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
			                	editView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
			                	
			                	
			                	
		                	}
		                	
		                }
		            }
		        });
			}
		});
		
		deleteView.getMnResturant().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteView.getTxtfield_name().setText("");
				deleteView.getTxtfield_address().setText("");
				deleteView.getTxtfield_telephone().setText("");
				deleteView.getTextField().setText("");
				deleteView.comboResetHour();
				deleteView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();				
				deleteView.getList_1().setModel(model);					
				
				DefaultListModel<RestaurantBean> modelDel = new DefaultListModel<>();
				for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
					RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
					modelDel.addElement(item);
				}
				deleteView.getList().setModel(modelDel);
				
				deleteView.getList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		deleteView.getTxtfield_name().setText(rb.getRestoName());
		                		deleteView.getTxtfield_address().setText(rb.getRestoAddress());
		                		deleteView.getTxtfield_telephone().setText(rb.getPhoneNum());
		                		
		                		deleteView.getList_1().setModel(rb.getDeliveryArea());
			                	
			                	//TODO: Populate comboxes	                	
		                		deleteView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
		                		deleteView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
		                		deleteView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
		                		deleteView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
		                		
		                		deleteView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
		                		deleteView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
		                		deleteView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
		                		deleteView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
		                		
		                		deleteView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
		                		deleteView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
		                		deleteView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
		                		deleteView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
		                		
		                		deleteView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
		                		deleteView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
		                		deleteView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
		                		deleteView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
		                		
		                		deleteView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
		                		deleteView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
		                		deleteView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
		                		deleteView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
		                		
		                		deleteView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
		                		deleteView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
		                		deleteView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
		                		deleteView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
		                		
		                		deleteView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
		                		deleteView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
		                		deleteView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
		                		deleteView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
		                		
		                	}
		                	
		                			                	
		                }
		            }
		        });
				
			}
		});

		
	}
}
