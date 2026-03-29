import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DeleteTest2 {

    // setUp + BeforeEach
    @BeforeEach
    void setUp() {
        // reset data before each test
        DataStore.students = new java.util.ArrayList<>();
        DataStore.students.add(new Student(1, "Aditi"));
        DataStore.students.add(new Student(2, "Rahul"));
    }

    // Test case 1
    @Test
    void testDeleteExisting() {
        boolean result = DeleteResult.delete(1);

        // assertTrue
        assertTrue(result);

        // assertEquals
        assertEquals(1, DataStore.students.size());

        // assertNotEquals
        assertNotEquals(2, DataStore.students.size());
    }

    // Test case 2
    @Test
    void testDeleteNotFound() {
        boolean result = DeleteResult.delete(99);

        // assertFalse
        assertFalse(result);

        // assertEquals
        assertEquals(2, DataStore.students.size());
    }

    // Repeated test
    @RepeatedTest(3)
    void repeatDeleteTest() {
        boolean result = DeleteResult.delete(2);
        assertTrue(result);
    }

    // Test exception if test fails
    @Test
    void testException() {
        assertThrows(NullPointerException.class, () -> {
            DataStore.students = null;
            DeleteResult.delete(1);
        });
    }

    // tearDown + AfterEach
    @AfterEach
    void tearDown() {
        // cleanup after test
        DataStore.students = null;
    }
}
