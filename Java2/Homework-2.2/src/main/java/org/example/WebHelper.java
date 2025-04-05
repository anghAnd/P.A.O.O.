package org.example;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WebHelper {

    private static WebHelper instance;

    private String content;

    // Constructor privat pentru a preveni instanțierea directă
    private WebHelper() {}

    // Metoda pentru obținerea instanței Singleton
    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    public String getWebSiteContent()throws IOException {
        if (content == null) {
            // Dacă nu avem deja conținutul, îl încărcăm
            loadContent();
        }
        return content;
    }

    // Metoda pentru a încărca conținutul paginii web
    private void loadContent() throws IOException {
        String urlString = "https://www.example.com";  // URL-ul hardcodat

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            StringBuilder contentBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                contentBuilder.append(scanner.nextLine()).append("\n");
            }
            content = contentBuilder.toString();
        }
    }


}
