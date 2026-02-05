import java.util.Iterator;
import java.util.Scanner;

public class DeleteResult {

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number to delete: ");
        int roll = sc.nextInt();

        Iterator<Student> itr = DataStore.students.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.roll == roll) {
                itr.remove();
                System.out.println("Result deleted successfully\n");
                return;
            }
        }
        System.out.println("Result not found\n");
    }
}
