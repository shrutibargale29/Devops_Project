import java.util.Scanner;

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
}
