package main;

import Controller.AddDelivController;
import Controller.AddDelivEditController;
import Controller.AddMenuController;
import Controller.CreateRestoDashController;
import Controller.CreateRestoMenuController;
import Controller.CreateRestoMenuDash;
import Controller.DelDelivRestaurant;
import Controller.DelDeliveryAreaController;
import Controller.DelDeliveryAreaDeleteController;
import Controller.DelRestoController;
import Controller.DeleteMenuController;
import Controller.DeleteRestoDashController;
import Controller.DeleteRestoMenuDash;
import Controller.DeliveryGuyEditController;
import Controller.EditAddMenuController;
import Controller.EditDeleteItemMenuController;
import Controller.EditEditMenuController;
import Controller.EditRestaurantController;
import Controller.EditRestaurantListController;
import Controller.EditRestoMenuController;
import Controller.EditRestoMenuDash;
import Controller.LoginConnectController;
import Controller.LoginQuitController;
import Controller.ManagerDashController;
import Controller.MenuBar1AdminDashController;
import Controller.MenuBar1MenuController;
import Controller.MenuBar1RestaurantController;
import Controller.MenuBar2DashController;
import Controller.MenuBar2RestaurantController;
import Controller.MenuBar3Dash;
import Controller.ModEditRestaurant;
import Controller.ModRestaurantController;
import Controller.SaveRestaurantController;
import model.RestaurauntModel;
import model.UserModel;
import view.AdminDash;
import view.ChefView;
import view.ClientDashView;
import view.DeliveryAcceptView;
import view.DeliveryCreateView;
import view.DeliveryDashView;
import view.DeliveryDeleteView;
import view.DeliveryDoneView;
import view.DeliveryEditView;
import view.DeliveryGuyDashView;
import view.DeliveryView;
import view.LoginView;
import view.ManagerView;
import view.RestaurantCreateMenuView;
import view.RestaurantCreateView;
import view.RestaurantDeleteMenuView;
import view.RestaurantDeleteView;
import view.RestaurantEditMenuView;
import view.RestaurantEditView;

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
		DeliveryAcceptView deliveryAcceptView = new DeliveryAcceptView();
		DeliveryCreateView deliveryCreateView = new DeliveryCreateView();
		DeliveryDoneView deliveryDoneView = new DeliveryDoneView();
		DeliveryEditView deliveryEditView = new DeliveryEditView();
		DeliveryDeleteView deliveryDeleteView = new DeliveryDeleteView();
		DeliveryView deliveryView = new DeliveryView();
		DeliveryGuyDashView deliveryGuyDashView = new DeliveryGuyDashView();
				
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
		
		DeliveryGuyEditController guyEditController = new DeliveryGuyEditController(null, deliveryEditView);
		
//		MenuBar2MenuController menu2ViewController= new MenuBar2MenuController(createView, editView, deleteView);
		
	}

}
