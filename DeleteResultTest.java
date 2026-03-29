import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeleteResultTest {

    @BeforeEach
    void setup() {
        DataStore.students = new java.util.ArrayList<>(); // reset reference
        DataStore.students.add(new Student(1, "Aditi"));
        DataStore.students.add(new Student(2, "Rahul"));
    }

    @Test
    void testDeleteExisting() {
        boolean result = DeleteResult.delete(1);

        assertTrue(result);
        assertEquals(1, DataStore.students.size());
    }

    @Test
    void testDeleteNotFound() {
        boolean result = DeleteResult.delete(99);

        assertFalse(result);
        assertEquals(2, DataStore.students.size());
    }
}
