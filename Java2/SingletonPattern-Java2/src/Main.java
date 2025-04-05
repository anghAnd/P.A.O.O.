import java.util.ArrayList;
import java.util.List;

class VideoLibrary {
    private static VideoLibrary instance;  // Instanță unică
    private List<String> videos;           // Lista de videoclipuri

    // Constructor privat pentru a preveni instanțierea directă
    private VideoLibrary() {
        videos = new ArrayList<>();
    }

    // Metodă statică pentru a obține instanța unică
    public static synchronized VideoLibrary getInstance() {
        if (instance == null) {
            instance = new VideoLibrary();
        }
        return instance;
    }

    // Adaugă un videoclip în bibliotecă
    public void addVideo(String title) {
        videos.add(title);
        System.out.println("Video '" + title + "' adăugat în bibliotecă.");
    }

    // Listează videoclipurile disponibile
    public void listVideos() {
        if (videos.isEmpty()) {
            System.out.println("Biblioteca este goală.");
        } else {
            System.out.println("Videoclipuri în bibliotecă:");
            for (int i = 0; i < videos.size(); i++) {
                System.out.println((i + 1) + ". " + videos.get(i));
            }
        }
    }
}

// Clasa principală pentru testare
public class Main {
    public static void main(String[] args) {
        // Obținem instanța singleton
        VideoLibrary library1 = VideoLibrary.getInstance();
        library1.addVideo("Star Wars");
        library1.addVideo("Spiderman");

        // Obținem o altă referință către singleton
        VideoLibrary library2 = VideoLibrary.getInstance();
        library2.listVideos(); // Va afișa aceleași videoclipuri

        // Verificăm că cele două referințe sunt identice
        System.out.println(library1 == library2); // Va afișa "true"
    }
}