import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchResultTest {

    @BeforeEach
    void setUp() {
        DataStore.students.clear();
        DataStore.students.add(new Student(1, "Amit", 85));
        DataStore.students.add(new Student(2, "Neha", 90));
    }

    @Test
    void testSearchFound() {
        Student s = SearchResult.searchByRoll(1);
        assertNotNull(s);
        assertEquals("Amit", s.name);
    }

    @Test
    void testSearchNotFound() {
        Student s = SearchResult.searchByRoll(10);
        assertNull(s);
    }
}
