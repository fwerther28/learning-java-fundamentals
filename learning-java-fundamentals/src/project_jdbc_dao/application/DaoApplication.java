package project_jdbc_dao.application;

import java.util.Date;

import project_jdbc_dao.model.dao.DaoFactory;
import project_jdbc_dao.model.dao.SellerDao;
import project_jdbc_dao.model.entities.Department;
import project_jdbc_dao.model.entities.Seller;

public class DaoApplication {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}
}
