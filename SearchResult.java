public class SearchResult {

    public static Student searchByRoll(int roll) {
        for (Student s : DataStore.students) {
            if (s.roll == roll) {
                return s;
            }
        }
        return null;
    }
}

