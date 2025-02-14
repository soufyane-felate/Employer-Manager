package com.test.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.DaoEmployee;
import Model.Employee;




@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private DaoEmployee daoEmployee;

    public AddServlet() {
        super();
        this.daoEmployee = new DaoEmployee();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String post = request.getParameter("post");
        double salaire = Double.parseDouble(request.getParameter("salaire"));

        Employee employee = new Employee();
        employee.setNom(nom);
        employee.setPrenom(prenom);
        employee.setEmail(email);
        employee.setPost(post);
        employee.setSalaire(salaire);

        DaoEmployee daoEmployee = new DaoEmployee();
        daoEmployee.createEmployee(employee);
  

        response.sendRedirect("DisplayServlete");
    }
}