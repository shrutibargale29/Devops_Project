public class DisplayResult {

    public static String getDisplayResult() {
        if (DataStore.students.isEmpty()) {
            return "No records available";
        }

        StringBuilder sb = new StringBuilder();
        for (Student s : DataStore.students) {
            sb.append("Roll: ")
              .append(s.roll)
              .append(", Name: ")
              .append(s.name)
              .append(", Marks: ")
              .append(s.marks)
              .append("\n");
        }
        return sb.toString().trim();
    }
}
