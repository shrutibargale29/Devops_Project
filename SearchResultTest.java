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

    // ✅ Normal case: student found
    @Test
    void testSearchFound() {
        Student s = SearchResult.searchByRoll(1);
        assertNotNull(s);
        assertEquals("Amit", s.name);
    }

    // ❌ Normal case: student not found
    @Test
    void testSearchNotFound() {
        Student s = SearchResult.searchByRoll(10);
        assertNull(s);
    }

    // 🔹 EDGE CASE 1: Empty student list
    @Test
    void testSearchWhenListIsEmpty() {
        DataStore.students.clear();   // no students
        Student s = SearchResult.searchByRoll(1);
        assertNull(s);
    }

    // 🔹 EDGE CASE 2: Negative roll number
    @Test
    void testSearchWithNegativeRoll() {
        Student s = SearchResult.searchByRoll(-5);
        assertNull(s);
    }

    // 🔹 EDGE CASE 3: Roll number zero
    @Test
    void testSearchWithZeroRoll() {
        Student s = SearchResult.searchByRoll(0);
        assertNull(s);
    }

    // 🔹 EDGE CASE 4: Very large roll number
    @Test
    void testSearchWithLargeRoll() {
        Student s = SearchResult.searchByRoll(999999);
        assertNull(s);
    }

    // 🔹 EDGE CASE 5: Duplicate roll numbers
    @Test
    void testSearchWithDuplicateRolls() {
        DataStore.students.add(new Student(1, "Rahul", 70));

        Student s = SearchResult.searchByRoll(1);

        assertNotNull(s);
        // Should return FIRST match
        assertEquals("Amit", s.name);
    }
}
