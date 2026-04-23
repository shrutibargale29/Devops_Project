package com.example;
import java.util.Scanner;

import com.example.DataStore;
import com.example.Student;

public class AddResult {

    // normal execution (uses Scanner)
    public static void add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();   // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        DataStore.students.add(new Student(roll, name, marks));
        System.out.println("Result added successfully");
    }

    // used only for JUnit testing
    public static void addStudent(int roll, String name, int marks) {
        DataStore.students.add(new Student(roll, name, marks));
    }

    ///// added main function just for jenkins and test files are ignored for jenkins
    public static void main(String[] args) {
        System.out.println("Running AddResult module...");

        // calling method without Scanner
        addStudent(1, "Sharvari", 95);

        System.out.println("Student added successfully (via Jenkins)");
    }
}
