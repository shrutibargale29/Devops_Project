import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;

public class AddResultTest {
     @BeforeEach
    void setUp() {
        // Clear list before every test
        DataStore.students.clear();
    }
    @RepeatedTest(3)
void testRepeatedAdd() {
    AddResult.addStudent(5, "Test", 60);
    assertEquals(1, DataStore.students.size());
    
}

    @Test
    void testAddStudent() {
        int before = DataStore.students.size();

        AddResult.addStudent(1, "Sharvari", 92);

        int after = DataStore.students.size();

        assertEquals(before + 1, after);
        assertEquals("Sharvari", DataStore.students.get(after - 1).name);
        assertEquals(92, DataStore.students.get(after - 1).marks);
    }
     @Test
    void testMarksArePositive() {
        AddResult.addStudent(3, "Riya", 75);

        assertTrue(DataStore.students.get(0).marks >= 0);
    }

    @Test
void testMarksNotNegative() {
    AddResult.addStudent(4, "Neha", 50);

    assertFalse(DataStore.students.get(0).marks < 0);
}

        @Test
    void testAddMultipleStudents() {
        AddResult.addStudent(1, "Sharvari", 92);
        AddResult.addStudent(2, "Aditi", 88);

        assertEquals(2, DataStore.students.size());
        assertEquals("Aditi", DataStore.students.get(1).name);
    }
    @Test
void testMarksNotEqual() {
    AddResult.addStudent(6, "Isha", 70);

    assertNotEquals(80, DataStore.students.get(0).marks);
}


    @AfterEach
    void tearDown() {
        DataStore.students.clear();
    }
}
