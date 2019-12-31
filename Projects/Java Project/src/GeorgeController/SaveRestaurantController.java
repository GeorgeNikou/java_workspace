package GeorgeController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantDAO;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateView;



public class SaveRestaurantController implements ActionListener{
	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantCreateView view;
	private RestaurauntModel model;
	
	public SaveRestaurantController(RestaurauntModel model, RestaurantCreateView view) {
		this.model = model;
		this.view = view;
				
		view.getBtnAddRestaurant().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		restoBean = new RestaurantBean(view.getTxtfield_name().getText(), view.getTxtfield_address().getText(),view.getList().getModel(), view.getTxtfield_telephone().getText());
		
		// add the hours to the bean
		restoBean.setMondayOpenHour(((int)(view.getComboBox_4().getSelectedItem())));
		restoBean.setMondayCloseHour(((int)(view.getComboBox_6().getSelectedItem())));
		restoBean.setMondayOpenMinute((Integer.parseInt((String)(view.getComboBox_5().getSelectedItem()))));
		restoBean.setMondayCloseMinute(((Integer.parseInt((String)(view.getComboBox_7().getSelectedItem())))));
		
		
		restoBean.setTuesdayOpenHour((int)(view.getComboBox_8().getSelectedItem()));
		restoBean.setTuesdayCloseHour((int)(view.getComboBox_10().getSelectedItem()));
		restoBean.setTuesdayOpenMinute((Integer.parseInt((String)(view.getComboBox_9().getSelectedItem()))));
		restoBean.setTuesdayCloseMinute(((Integer.parseInt((String)(view.getComboBox_11().getSelectedItem())))));
		
		restoBean.setWednesdayOpenHour((int)(view.getComboBox_12().getSelectedItem()));
		restoBean.setWednesdayCloseHour((int)(view.getComboBox_14().getSelectedItem()));
		restoBean.setWednesdayOpenMinute((Integer.parseInt((String)(view.getComboBox_13().getSelectedItem()))));
		restoBean.setWednesdayCloseMinute(((Integer.parseInt((String)(view.getComboBox_15().getSelectedItem())))));
		
		restoBean.setThursdayOpenHour((int)(view.getComboBox_16().getSelectedItem()));
		restoBean.setThursdayCloseHour((int)(view.getComboBox_18().getSelectedItem()));
		restoBean.setThursdayOpenMinute((Integer.parseInt((String)(view.getComboBox_17().getSelectedItem()))));
		restoBean.setThursdayCloseMinute(((Integer.parseInt((String)(view.getComboBox_19().getSelectedItem())))));
		
		
		restoBean.setFridayOpenHour((int)(view.getComboBox_20().getSelectedItem()));
		restoBean.setFridayCloseHour((int)(view.getComboBox_22().getSelectedItem()));
		restoBean.setFridayOpenMinute((Integer.parseInt((String)(view.getComboBox_21().getSelectedItem()))));
		restoBean.setFridayCloseMinute(((Integer.parseInt((String)(view.getComboBox_23().getSelectedItem())))));
		
		restoBean.setSaturdayOpenHour((int)(view.getComboBox_24().getSelectedItem()));
		restoBean.setSaturdayCloseHour((int)(view.getComboBox_26().getSelectedItem()));
		restoBean.setSaturdayOpenMinute((Integer.parseInt((String)(view.getComboBox_25().getSelectedItem()))));
		restoBean.setSaturdayCloseMinute(((Integer.parseInt((String)(view.getComboBox_27().getSelectedItem())))));
		
    	restoBean.setSundayOpenHour((int)(view.getComboBox().getSelectedItem()));
		restoBean.setSundayCloseHour((int)(view.getClosingH_comboBox().getSelectedItem()));
		restoBean.setSundayOpenMinute((Integer.parseInt((String)(view.getComboBox_1().getSelectedItem()))));
		restoBean.setSundayCloseMinute(((Integer.parseInt((String)(view.getComboBox_3().getSelectedItem())))));
		
		/*//view.setTextArea(view.getTextField().getText());
		Object j = view.getTextField().getText();
		//view.setTextArea(j);
*/		
		restoDAO = new RestaurantDAO();
		restoDAO.createNewRestaurant(restoBean);
		
		System.out.println(DTO.getInstance().getRestaurauntList()); //post information into console
	

		//Show a confirmation that it was added
		int temp;
		temp = JOptionPane.showConfirmDialog(null, "Are you sure you would like to add this restaurant?");
		
		//Clear the fields after adding information
		if(temp == 0) {
			JOptionPane.showMessageDialog(null, "Restaurant has been added!");
			view.getTxtfield_name().setText("");
			view.getTxtfield_address().setText("");
			view.getTxtfield_telephone().setText("");
			view.getTextField().setText("");
			view.comboResetHour();
			view.comboResetMinute();
			DefaultListModel<String> model = new DefaultListModel<>();
			view.getList().setModel(model);
			
		}	
	}
}
