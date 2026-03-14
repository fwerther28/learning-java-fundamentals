package projeto_jdvc_dao.application;

import projeto_jdbc_dao.model.entities.Department;

public class DaoApplication {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);

	}

}
