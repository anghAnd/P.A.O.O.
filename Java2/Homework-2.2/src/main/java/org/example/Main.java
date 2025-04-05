package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            WebHelper webHelper = WebHelper.getInstance();
            String content = webHelper.getWebSiteContent();
            System.out.println(content);
        } catch (IOException e) {
            // Tratează excepția aici (de ex., prin afișarea unui mesaj de eroare)
            System.err.println("A apărut o eroare la încărcarea paginii web: " + e.getMessage());
            e.printStackTrace();
        }
    }
}