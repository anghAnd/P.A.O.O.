import java.util.List;
import java.util.ArrayList;

// Interfață pentru clienți (observatori)
interface Client {
    void update(String eventInfo);
}