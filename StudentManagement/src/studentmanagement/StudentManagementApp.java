/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author applemac
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String studentID;

    // Constructor
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // Getters and setters (you can generate them automatically in most IDEs)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StudentManagementApp {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int nextStudentID = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    captureStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    studentReport();
                    break;
                case 5:
                    exitStudentApplication();
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("Menu:");
        System.out.println("1. Capture a new student");
        System.out.println("2. Search for a student");
        System.out.println("3. Delete a student");
        System.out.println("4. View student report");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void captureStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");

        int age = -1;
        while (age < 16) {
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 16) {
                    System.out.println("Invalid age. Age must be greater than or equal to 16.");
                    System.out.print("Enter student age: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age (numeric).");
                System.out.print("Enter student age: ");
            }
        }

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        Student student = new Student(name, age, studentID);
        students.add(student);
        System.out.println("Student details saved successfully.");
    }

   public static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String searchID = scanner.nextLine();
        boolean found = false;

        for (Student student : students) {
            if (student.getStudentID().equals(searchID)) {
                System.out.println("Student found:");
                System.out.println("ID: " + student.getStudentID());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

   public static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String deleteID = scanner.nextLine();
        boolean deleted = false;

        for (Student student : students) {
            if (student.getStudentID().equals(deleteID)) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                deleted = true;
                break;
            }
        }

        if (!deleted) {
            System.out.println("Student not found.");
        }
    }

    public static void studentReport() {
        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentID());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println();
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Exiting Student Application.");
        scanner.close();
    }
}
