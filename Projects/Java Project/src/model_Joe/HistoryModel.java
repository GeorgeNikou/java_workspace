package model_Joe;

import java.util.ArrayList;

public class HistoryModel {
	
	private HistoryBean historyBean;
	private HistoryDAO historyDAO;
	
	public HistoryModel() {
		historyDAO = new HistoryDAO();
		
		this.createNewHistory(new HistoryBean("Pizza", 10, 2, "2019/02/05", "12:00", "H3C 0N5", "name1", "1234 Sunshine Road", 1));
		this.createNewHistory(new HistoryBean("Pie", 5, 4, "2019/02/07", "18:00", "H3C 0N5", "name3", "1234 Sunshine Road", 2));
		
	}
	
	public void createNewHistory(HistoryBean historyBean) {
		int id = historyDAO.getAllHistory().size();
		historyBean.setId(id);
		historyDAO.createNewHistory(historyBean);
	}
	
	public void deleteHistory(int id) {
		historyDAO.deleteHistory(id);
	}

	public ArrayList<HistoryBean> getAllHistory() {
		return historyDAO.getAllHistory();

	}

	public HistoryBean getSingleHistory(int id) {
		return historyDAO.getSingleHistory(id);
	}

}
