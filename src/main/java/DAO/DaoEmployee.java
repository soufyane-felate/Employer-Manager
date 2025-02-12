package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Employee;

public class DaoEmployee {
	private Connection connection;
	
	 public void createPerson(Employee employee) {
	        String query = "INSERT INTO person (nom, prenom, email, salaire,post) VALUES (?, ?, ?, ?)";
	        try (PreparedStatement pstm = connection.prepareStatement(query)) {
	        	pstm.setString(1,employee.getNom());
	        	pstm.setString(2, employee.getPrenom());
	        	pstm.setString(3, employee.getEmail());
	        	pstm.setDouble(4, employee.getSalaire());
	        	pstm.setString(5, employee.getPost());
	        	pstm.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

}
