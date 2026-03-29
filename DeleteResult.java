import java.util.Iterator;

public class DeleteResult {

    public static boolean delete(int roll) {

        // 👇 ADD THIS DEBUG LINE
        System.out.println("LIST SIZE BEFORE DELETE = " + DataStore.students.size());

        Iterator<Student> itr = DataStore.students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.roll == roll) {
                itr.remove();
                System.out.println("DELETED");
                return true;
            }
        }

        System.out.println("NOT FOUND");
        return false;
    }
}
