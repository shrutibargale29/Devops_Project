import java.util.Scanner;

public class SearchResult {

    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number to search: ");
        int roll = sc.nextInt();

        for (Student s : DataStore.students) {
            if (s.roll == roll) {
                System.out.println("Roll: " + s.roll);
                System.out.println("Name: " + s.name);
                System.out.println("Marks: " + s.marks + "\n");
                return;
            }
        }
        System.out.println("Result not found\n");
    }
}
