package main;

import control_draft.AddDelivController;
import control_draft.AddDelivEditController;
import control_draft.AddMenuController;
import control_draft.CreateRestoDashController;
import control_draft.CreateRestoMenuController;
import control_draft.CreateRestoMenuDash;
import control_draft.DelDelivRestaurant;
import control_draft.DelDeliveryAreaController;
import control_draft.DelDeliveryAreaDeleteController;
import control_draft.DelRestoController;
import control_draft.DeleteMenuController;
import control_draft.DeleteRestoDashController;
import control_draft.DeleteRestoMenuDash;
import control_draft.EditAddMenuController;
import control_draft.EditDeleteItemMenuController;
import control_draft.EditEditMenuController;
import control_draft.EditRestaurantController;
import control_draft.EditRestaurantListController;
import control_draft.EditRestoMenuController;
import control_draft.EditRestoMenuDash;
import control_draft.LoginConnectController;
import control_draft.LoginQuitController;
import control_draft.ManagerDashController;
import control_draft.MenuBar1AdminDashController;
import control_draft.MenuBar1MenuController;
import control_draft.MenuBar1RestaurantController;
import control_draft.MenuBar2DashController;
import control_draft.MenuBar2MenuController;
import control_draft.MenuBar2RestaurantController;
import control_draft.MenuBar3Dash;
import control_draft.ModEditRestaurant;
import control_draft.ModRestaurantController;
import control_draft.SaveRestaurantController;
import model_draft.RestaurauntModel;
import model_draft.UserModel;
import view_draft.AdminDash;
import view_draft.ChefView;
import view_draft.ClientDashView;
import view_draft.DeliveryDashView;
import view_draft.LoginView;
import view_draft.ManagerView;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditMenuView;
import view_draft.RestaurantEditView;

public class RestaurantMain {

	public static void main(String[] args) {
		
		//RestaurantCreateView view = new RestaurantCreateView();
		RestaurauntModel model = new RestaurauntModel();
		RestaurantEditView editView = new RestaurantEditView();
		RestaurantCreateView createView = new RestaurantCreateView();
		RestaurantDeleteView deleteView = new RestaurantDeleteView();		
		UserModel userModel = new UserModel();
		LoginView loginView = new LoginView();		
		AdminDash adminDash = new AdminDash();		
		ManagerView managerDash = new ManagerView();		
		ChefView chefDash = new ChefView();		
		DeliveryDashView delivDash = new DeliveryDashView();		
		ClientDashView clientDash = new ClientDashView();
		RestaurantCreateMenuView restoCreateMenu = new RestaurantCreateMenuView();
		RestaurantEditMenuView restoEditMenu = new RestaurantEditMenuView();
		RestaurantDeleteMenuView restoDeleteMenu = new RestaurantDeleteMenuView();
				
		LoginConnectController loginController = new LoginConnectController(userModel, loginView, adminDash, managerDash, chefDash, delivDash, clientDash);
		
		EditRestaurantListController restoEdit = new EditRestaurantListController(model, adminDash, editView);
		
		EditRestaurantController editResto = new EditRestaurantController(model, editView);
		
		DeleteRestoDashController deleteResto = new DeleteRestoDashController(model, adminDash, deleteView);
		
		DelRestoController delResto = new DelRestoController(model, deleteView);
		
		CreateRestoDashController createResto  = new CreateRestoDashController(model, adminDash, createView);
		
		SaveRestaurantController resto  = new SaveRestaurantController(model, createView);
		
		AddDelivController addDeli = new AddDelivController(model, createView);
		
		DelDelivRestaurant deleteDeli = new DelDelivRestaurant(model, createView);
		
		ModRestaurantController modifyTime = new ModRestaurantController(model, createView);	
		
		ModEditRestaurant modifyTimeEdit = new ModEditRestaurant(model, editView);
		
		AddDelivEditController addDelivEdit = new AddDelivEditController(model, editView);
		
		DelDeliveryAreaController delDelivEdit = new DelDeliveryAreaController(model, editView);
		
		MenuBar2RestaurantController menuBarResto = new MenuBar2RestaurantController(createView, editView, deleteView);
		
		DelDeliveryAreaDeleteController delDeliveryDelete = new DelDeliveryAreaDeleteController(model, deleteView);
		
		ManagerDashController managerDashController = new ManagerDashController(managerDash, createView, editView, deleteView);
		
		MenuBar1AdminDashController menuBarResto2= new MenuBar1AdminDashController(loginView, adminDash);
		
		LoginQuitController loginQuitController= new LoginQuitController(loginView);
		
		MenuBar1RestaurantController menuBarResto1= new MenuBar1RestaurantController(loginView, adminDash, createView, editView, deleteView);
		
		CreateRestoMenuDash createMenuDash = new CreateRestoMenuDash(model, adminDash, restoCreateMenu);
		
		AddMenuController addMenu = new AddMenuController(restoCreateMenu, model);			
		
		MenuBar1MenuController menuViewController = new MenuBar1MenuController(loginView,adminDash,restoCreateMenu,restoEditMenu,restoDeleteMenu);
		
		CreateRestoMenuController createRestoMenu = new CreateRestoMenuController(model, restoCreateMenu);
		
		EditRestoMenuDash editRestoMenuDash = new EditRestoMenuDash(model, adminDash, restoEditMenu);
		
		EditAddMenuController editAddMenu = new EditAddMenuController(restoEditMenu, model);
		
		EditRestoMenuController editRestoMenu = new EditRestoMenuController(model, restoEditMenu);
		
		EditDeleteItemMenuController editDeleteItem = new EditDeleteItemMenuController(restoEditMenu, model);
		
		EditEditMenuController editEditMenu = new EditEditMenuController(restoEditMenu, model);
		
		MenuBar2DashController menu2Dash = new MenuBar2DashController(createView , editView , deleteView , adminDash );
		
		DeleteRestoMenuDash deleteRestoMenuDash = new DeleteRestoMenuDash(model, adminDash, restoDeleteMenu);
		
		DeleteMenuController deleteMenu = new DeleteMenuController(model, restoDeleteMenu);
		
		MenuBar3Dash menu3Dash = new MenuBar3Dash(restoCreateMenu, restoEditMenu, restoDeleteMenu, adminDash);
		
		//MenuBar2MenuController menu2ViewController= new MenuBar2MenuController(createView, editView, deleteView);
		
	}

}
