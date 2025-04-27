package org.example;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver {
    public void saveToFile(EquationResult result, String filename) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(result);

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}