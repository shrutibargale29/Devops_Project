package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

//import src.main.java.com.example.DataStore;
//import src.main.java.com.example.DisplayResult;
//import src.main.java.com.example.Student;

public class DisplayResultTest {

    @BeforeEach
    void setUp() {
        DataStore.students.clear();
        DataStore.students.add(new Student(1, "Amit", 85));
        DataStore.students.add(new Student(2, "Neha", 90));
    }

    @AfterEach
    void tearDown() {
        DataStore.students.clear();
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("All tests finished");
    }

    @Test
    void testDisplayResultNotEmpty() {
        String result = DisplayResult.getDisplayResult();
        assertNotNull(result);
        assertTrue(result.contains("Amit"));
        assertTrue(result.contains("Neha"));
        assertTrue(result.contains("85"));
        assertTrue(result.contains("90"));
    }

    @Test
    void testDisplayResultEmpty() {
        DataStore.students.clear();
        String result = DisplayResult.getDisplayResult();
        assertEquals("No records available", result);
    }

    @RepeatedTest(2)
    void testRepeatedExecution() {
        String result = DisplayResult.getDisplayResult();
        assertFalse(result.isEmpty());
    }
}
