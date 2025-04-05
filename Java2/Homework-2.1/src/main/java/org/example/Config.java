package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

    public class Config {
        private static Config instance;
        private static final String CONFIG_FILE = "src/config.json";

        private String color;
        private int weight;
        private boolean isLoaded = false;

        private Config() {
            // Constructor privat
        }

        public static Config getInstance() {
            if (instance == null) {
                instance = new Config();
            }
            return instance;
        }

        private void loadConfig() {
            if (!isLoaded) {
                try (FileReader reader = new FileReader(CONFIG_FILE)) {
                    Gson gson = new Gson();
                    ConfigData data = gson.fromJson(reader, ConfigData.class);
                    this.color = data.getColor();
                    this.weight = data.getWeight();
                    isLoaded = true;
                } catch (IOException e) {
                    e.printStackTrace();
                    // setăm valori default dacă apar probleme
                    this.color = "#000000";
                    this.weight = 0;
                }
            }
        }

        public String getColor() {
            loadConfig();
            return color;
        }

        public int getWeight() {
            loadConfig();
            return weight;
        }
    }


