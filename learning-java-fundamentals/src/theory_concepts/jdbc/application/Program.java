package theory_concepts.jdbc.application;

import java.sql.Connection;

import theory_concepts.jdbc.db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}
