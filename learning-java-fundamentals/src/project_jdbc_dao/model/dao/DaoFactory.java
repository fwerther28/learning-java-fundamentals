package project_jdbc_dao.model.dao;

import project_jdbc_dao.model.dao.imp.DepartmentDaoJDBC;
import project_jdbc_dao.model.dao.imp.SellerDaoJDBC;
import theory_concepts.jdbc.db.DB;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
