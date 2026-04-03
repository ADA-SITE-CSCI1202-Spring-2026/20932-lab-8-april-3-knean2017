import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        // a. Create a map which stores names of students associated with their gpa.
        Map<String, Double> studentGrades = new HashMap<>();

        // b. Add some students to the map.
        studentGrades.put("Alice", 3.5);
        studentGrades.put("Bob", 3.8);
        studentGrades.put("Charlie", 3.2);
        studentGrades.put("David", 3.9);
        studentGrades.put("Eve", 3.6);

        // c. Find the student(s) with the highest gpa.
        double highestGpa = Double.MIN_VALUE;
        for (double gpa : studentGrades.values()) {
            if (gpa > highestGpa) {
                highestGpa = gpa;
            }
        }

        System.out.println("Student(s) with the highest GPA:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == highestGpa) {
                System.out.println(entry.getKey() + " with GPA: " + entry.getValue());
            }
        }

        // d. Find the average gpa of all the students.
        double totalGpa = 0;
        for (double gpa : studentGrades.values()) {
            totalGpa += gpa;
        }
        double averageGpa = totalGpa / studentGrades.size();
        System.out.println("Average GPA: " + averageGpa);

        // e. Find the number of students who have less gpa than the average
        int countBelowAverage = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGpa) {
                countBelowAverage++;
            }
        }
        System.out.println("Number of students with GPA less than average: " + countBelowAverage);
    }
}