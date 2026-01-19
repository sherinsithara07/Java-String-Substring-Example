import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Sample list of student names
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Alice Johnson");
        studentNames.add("Bob Smith");
        studentNames.add("Charlie Brown");
        studentNames.add("alice williams");  // Note: lowercase for case sensitivity demo

        // Sort alphabetically (case-sensitive by default)
        Collections.sort(studentNames);

        // Print sorted list
        System.out.println("Sorted Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        // For case-insensitive sorting, uncomment the next line:
        // Collections.sort(studentNames, String.CASE_INSENSITIVE_ORDER);
    }
}
