public class DisplayResult {

    public static void display() {
        if (DataStore.students.isEmpty()) {
            System.out.println("No records available\n");
            return;
        }

        System.out.println("---- Student Results ----");
        for (Student s : DataStore.students) {
            System.out.println(
                "Roll: " + s.roll +
                ", Name: " + s.name +
                ", Marks: " + s.marks
            );
        }
        System.out.println();
    }
}