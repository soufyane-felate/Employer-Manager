package com.test.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import DAO.DaoEmployee;
import Model.Employee;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    private DaoEmployee daoEmployee;

    public DisplayServlet() {
        super();
        this.daoEmployee = new DaoEmployee();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = daoEmployee.getAllEmployees();

        request.setAttribute("employees", employees);

        request.getRequestDispatcher("showEmployees.jsp").forward(request, response);
    }
}