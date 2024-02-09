package com.sdm.simpleidea.model;

import java.sql.ResultSet;
import java.util.Map;

public class MySQLTest {

    public static void main(String[] args) {
        // Test the MySQL class
        testMySQL();

        // Test reading data from the variables.txt file
        testVariableReader();
    }

    private static void testMySQL() {
        try {
            // Assuming you have a table named 'your_table' in your database
            String query = "SELECT * FROM status";
            
            // Perform a search using MySQL class
            ResultSet resultSet = MySQL.search(query);

            // Print the results
            while (resultSet.next()) {
                System.out.println("Column 1: " + resultSet.getString(1));
                System.out.println("Column 2: " + resultSet.getString(2));
                // Add more columns as needed
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testVariableReader() {
        // Assuming your variables.txt file has key-value pairs like DATABASE, USERNAME, PASSWORD, and PORT
        Map<String, String> variableMap = VariableReader.readFromNotepad("variables.txt");

        // Print the data from the variables.txt file
        for (Map.Entry<String, String> entry : variableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
