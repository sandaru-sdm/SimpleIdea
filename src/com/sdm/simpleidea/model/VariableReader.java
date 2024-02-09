package com.sdm.simpleidea.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class VariableReader {

    // Method to read key-value pairs from the notepad file
    public static Map<String, String> readFromNotepad(String fileName) {
        Map<String, String> variableMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into key and value
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    variableMap.put(key, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return variableMap;
    }

    public static void main(String[] args) {
        // Example usage
        String notepadFileName = "variables.txt";

        // Read key-value pairs from notepad
        Map<String, String> variableMap = readFromNotepad(notepadFileName);

        // Example: Get values for USERNAME and PASSWORD
        String username = variableMap.get("USERNAME");
        String password = variableMap.get("PASSWORD");

        // Print values (you can assign them to final variables as needed)
        System.out.println("USERNAME: " + username);
        System.out.println("PASSWORD: " + password);
    }
}
