import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Result");
            System.out.println("2. Delete Result");
            System.out.println("3. Search Result");
            System.out.println("4. Display Results");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    AddResult.add();
                    break;
                case 2:
                    DeleteResult.delete();
                    break;
                case 3:
                    SearchResult.search();
                    break;
                case 4:
                    DisplayResult.display();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice\n");
            }
        }
    }
}
