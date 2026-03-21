package project_jdbc_dao.application;

import java.util.List;
import java.util.Scanner;

import project_jdbc_dao.model.dao.DaoFactory;
import project_jdbc_dao.model.dao.DepartmentDao;
import project_jdbc_dao.model.entities.Department;

public class DepartmentApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		System.out.println(depDao.findById(1));
		
		System.out.println("\n=== TEST 2: findAll ===");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: insert ===");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId());
		
		System.out.println("\n=== TEST 4: update ===");
		Department department = depDao.findById(1);
		department.setName("Food");
		depDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		sc.close();
	}
}
