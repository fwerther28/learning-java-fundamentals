package project_jdbc_dao.application;

import java.util.List;

import project_jdbc_dao.model.dao.DaoFactory;
import project_jdbc_dao.model.dao.DepartmentDao;
import project_jdbc_dao.model.entities.Department;

public class DepartmentApplication {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		System.out.println(depDao.findById(1));
		
		System.out.println("=== TEST 2: findAll ===");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 3: insert ===");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId());
	}
}
