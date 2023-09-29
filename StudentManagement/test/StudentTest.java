/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import studentmanagement.StudentManagementApp;

/**
 *
 * @author applemac
 */

public class StudentTest {

public class StudentManagementAppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCaptureStudent() {
        // Prepare simulated user input
        String simulatedInput = "John Doe\n15\n18\nS12345\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Call the method you want to test
        StudentManagementApp.captureStudent();

        // Check if the output contains the expected message
        String expectedOutput = "Student details saved successfully.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }


    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }
}

}

    

