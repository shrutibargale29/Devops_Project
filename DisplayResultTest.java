import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class DisplayResultTest {

    @BeforeEach
    void setUp() {
        DataStore.students.clear();
        DataStore.students.add(new Student(1, "Amit", 85));
    }

    @Test
    void testDisplayStudents() {
        List<Student> list = DisplayResult.getAllStudents();
        assertEquals(1, list.size());
        assertEquals("Amit", list.get(0).name);
    }
}
