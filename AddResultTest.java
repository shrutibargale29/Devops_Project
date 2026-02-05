import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddResultTest {

    @Test
    void testAddStudent() {
        int before = DataStore.students.size();

        AddResult.addStudent(1, "Sharvari", 92);

        int after = DataStore.students.size();

        assertEquals(before + 1, after);
        assertEquals("Sharvari", DataStore.students.get(after - 1).name);
        assertEquals(92, DataStore.students.get(after - 1).marks);
    }
}
