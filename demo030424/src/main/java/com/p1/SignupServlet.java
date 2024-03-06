package com.p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Signup")
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String fullName = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String animalName = request.getParameter("animalname");
        String animalType = request.getParameter("animaltype");

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/demo_schema";
        String username = "root";
        String dbPassword = "password";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection conn = DriverManager.getConnection(url, username, dbPassword);

            // SQL query to insert user and animal data
            String sql = "INSERT INTO new_table2 (fullname, email, password, animalName, animalType) VALUES (?, ?, ?,?,?)";
//            String sql2 = "INSERT INTO animals (animal_name, animal_type, user_id) VALUES (?, ?, LAST_INSERT_ID())";

            // Prepare statement
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fullName);
            statement.setString(2, email);
            statement.setString(3, password);
            statement.setString(4, animalName);
            statement.setString(5, animalType);

            // Execute the statement
            statement.executeUpdate();

            // Prepare statement for animal data
//            statement = conn.prepareStatement(sql2);

            // Execute the statement for animal data
//            statement.executeUpdate();

            // Close the connection
            conn.close();

            // Redirect to a success page
            response.sendRedirect("success.html");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Redirect to an error page
            response.sendRedirect("error.html");
        }
    }
}
