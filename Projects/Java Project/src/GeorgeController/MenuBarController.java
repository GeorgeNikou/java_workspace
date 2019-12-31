package GeorgeController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import view_draft.RestaurantCreateView;

public class MenuBarController implements ActionListener{
	
	
	public RestaurantCreateView restoCreateView;
	//TODO: add all the views that contains all the menus
	
	//TODO: pass every view to this constructor
	public MenuBarController(RestaurantCreateView restoCreateView) {
		this.restoCreateView = restoCreateView;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		/*restoCreateView.getMnResturant().getMenuComponent(1).addMouseListener(new MouseListener() {
			
						
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("hhhhhhhhhhhh");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("hhhhhhhhhhhh");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("hhhhhhhhhhhh");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("hhhhhhhhhhhh");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("hhhhhhhhhhhh");
				
			}
		

           
		
		});*/
		
	}

}
