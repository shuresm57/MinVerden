package org.example.minverden.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public FileUtil(){}

    public static String readTextFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            String content = (line != null) ? line : "";

            while ((line = reader.readLine()) != null) {
                content += "\n" + line;
            }

            return content.trim();
        } catch (IOException e) {
            e.printStackTrace();
            return "Kunne ikke læse filen";
        }
    }
}
