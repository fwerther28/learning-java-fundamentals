package projeto_jdbc_dao.model.dao;

import java.util.List;

import projeto_jdbc_dao.model.entities.Department;
import projeto_jdbc_dao.model.entities.Seller;

public interface SellerDao {
	
	void insert (Seller obj);
	void update (Seller obj);
	void deleteById (Seller obj);
	Department findById(Integer id);
	List<Department> findAll();	
}
