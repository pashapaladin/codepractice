package com.p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ShowDataServlet")
public class ShowDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Owner> owners = new ArrayList<>();

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/demo_schema";
        String username = "root";
        String dbPassword = "password";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection conn = DriverManager.getConnection(url, username, dbPassword);

            // SQL query to retrieve owners' data
            String sql = "SELECT * FROM new_table2";

            // Prepare statement
            PreparedStatement statement = conn.prepareStatement(sql);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                String fullName = resultSet.getString("fullName");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String animalName = resultSet.getString("animalName");
                String animalType = resultSet.getString("animalType");

                // Create Owner object and add it to the list
                Owner owner = new Owner(fullName, email, password, animalName, animalType);
                owners.add(owner);
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Redirect to an error page
            response.sendRedirect("error.html");
            return;
        }

        // Display owners' data
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Owners Data</title></head><body>");
        out.println("<h1>Owners Data</h1>");
        out.println("<table border=\"1\"><tr><th>Full Name</th><th>Email</th><th>Password</th><th>Animal Name</th><th>Animal Type</th></tr>");
        for (Owner owner : owners) {
            out.println("<tr><td>" + owner.getFullName() + "</td><td>" + owner.getEmail() + "</td><td>" + owner.getPassword() + "</td><td>" + owner.getAnimalName() + "</td><td>" + owner.getAnimalType() + "</td></tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }
}
