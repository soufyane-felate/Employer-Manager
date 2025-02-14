package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Employee;
import com.test.util.DBConnection;

public class DaoEmployee {
    private Connection connection;

    public DaoEmployee() {
        this.connection = DBConnection.getConnection();
        if (this.connection == null) {
            System.err.println("Failed to initialize database connection.");
        }
    }

    public void createEmployee(Employee employee) {
        if (connection == null) {
            System.err.println("Database connection is null. Cannot create employee.");
            return;
        }

        String query = "INSERT INTO employees (nom, prenom, email, post, salaire) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstm = connection.prepareStatement(query)) {
            pstm.setString(1, employee.getNom());
            pstm.setString(2, employee.getPrenom());
            pstm.setString(3, employee.getEmail());
            pstm.setString(4, employee.getPost());
            pstm.setDouble(5, employee.getSalaire());
            pstm.executeUpdate();
            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        if (connection == null) {
            System.err.println("Database connection is null. Cannot retrieve employees.");
            return employees;
        }

        String query = "SELECT * FROM employees";
        try (PreparedStatement pstm = connection.prepareStatement(query);
             ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setNom(rs.getString("nom"));
                employee.setPrenom(rs.getString("prenom"));
                employee.setEmail(rs.getString("email"));
                employee.setPost(rs.getString("post"));
                employee.setSalaire(rs.getDouble("salaire"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}