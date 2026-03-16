package project_jdbc_dao.model.dao;

import project_jdbc_dao.model.dao.imp.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
