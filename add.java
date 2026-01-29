import java.util.Scanner;

public class AddResult {

    public static void add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        DataStore.students.add(new Student(roll, name, marks));
        System.out.println("Result added successfully\n");
    }
}