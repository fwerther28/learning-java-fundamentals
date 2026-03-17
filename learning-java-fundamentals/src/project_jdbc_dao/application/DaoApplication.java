package project_jdbc_dao.application;

import project_jdbc_dao.model.dao.DaoFactory;
import project_jdbc_dao.model.dao.SellerDao;
import project_jdbc_dao.model.entities.Seller;

public class DaoApplication {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
