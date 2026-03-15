package projeto_jdbc_dao.application;

import java.util.Date;

import projeto_jdbc_dao.model.entities.Department;
import projeto_jdbc_dao.model.entities.Seller;

public class DaoApplication {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
