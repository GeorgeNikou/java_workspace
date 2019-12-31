package extra;

import java.util.ArrayList;

public class MenuDAO {

	public void createMenu(MenuBean menu) {
		int id = DTO.getInstance().getMenuList().size();
		menu.setId(id);
		DTO.getInstance().getMenuList().add(menu);
	}

	public void editMenu(MenuBean menu) {
		DTO.getInstance().getMenuList().set(Integer.valueOf(menu.getId()), menu);
	}

	public void deleteMenu(MenuBean restaurantMenu) {
		int id = Integer.valueOf(restaurantMenu.getId());
		DTO.getInstance().getMenuList().remove(id);
	}

	public void deleteMenuByName(String name) {
		MenuBean menuBean;
		int id = 0;
		for (int i = 0; i < DTO.getInstance().getMenuList().size(); i++) {
			menuBean = null;
			menuBean = DTO.getInstance().getMenuList().get(i);
			if (menuBean.getItemName().equals(name))
				id = DTO.getInstance().getMenuList().indexOf(menuBean);
		}
	}

	public ArrayList<String> getRestaurantMenuList(String name) {
		ArrayList<String> restMenuList = new ArrayList<>();
		for (int i = 0; i < DTO.getInstance().getMenuList().size(); i++) {
		//	if (getSingleMenu(i).getName().equals(name)) {
			if (getSingleMenu(i).getItemName().equals(name)) {
				restMenuList.add(getSingleMenu(i).getItemName());
			}
		}
		return restMenuList;
	}

	public MenuBean getSingleMenu(int id) {
		return DTO.getInstance().getMenuList().get(id);
	}

	public ArrayList<MenuBean> getAllMenu() {
		return DTO.getInstance().getMenuList();
	}

}
