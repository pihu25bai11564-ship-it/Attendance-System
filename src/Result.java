import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;

public class Result {
    private HashMap<Integer, HashMap<String, Integer>> studentMarks;

    public Result() {
        studentMarks = new HashMap<>();
    }

    public void addMarks(int rollNumber, String subject, int marks) {
        studentMarks.putIfAbsent(rollNumber, new HashMap<>());
        studentMarks.get(rollNumber).put(subject, marks);
        System.out.println("Marks added for Roll No " + rollNumber + " - " + subject + ": " + marks);
    }

    public int calculateTotal(int rollNumber) {
        HashMap<String, Integer> subjects = studentMarks.get(rollNumber);
        if (subjects == null) return 0;

        int total = 0;
        for (int marks : subjects.values()) {
            total += marks;
        }
        return total;
    }

    public double calculatePercentage(int rollNumber) {
        HashMap<String, Integer> subjects = studentMarks.get(rollNumber);
        if (subjects == null || subjects.isEmpty()) return 0.0;

        int total = calculateTotal(rollNumber);
        int maxMarks = subjects.size() * 100;
        return ((double) total / maxMarks) * 100;
    }

    public String calculateGrade(int rollNumber) {
        double percentage = calculatePercentage(rollNumber);

        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 40) return "C";
        else return "Fail";
    }

    public void displayResult(int rollNumber) {
        double percentage = calculatePercentage(rollNumber);
        String grade = calculateGrade(rollNumber);

        System.out.printf("Roll No %d - Total: %d, Percentage: %.2f%%, Grade: %s\n",
                rollNumber, calculateTotal(rollNumber), percentage, grade);
    }

    public void generateRankList(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available to rank.");
            return;
        }

        ArrayList<Student> sortedList = new ArrayList<>(students);

        sortedList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                double p1 = calculatePercentage(s1.getRollNumber());
                double p2 = calculatePercentage(s2.getRollNumber());
                return Double.compare(p2, p1);
            }
        });

        System.out.println("\n===== Class Rank List =====");
        int rank = 1;
        for (Student s : sortedList) {
            double percentage = calculatePercentage(s.getRollNumber());
            String grade = calculateGrade(s.getRollNumber());
            System.out.printf("Rank %d: %s (Roll No %d) - %.2f%% - Grade %s\n",
                    rank, s.getName(), s.getRollNumber(), percentage, grade);
            rank++;
        }
    }
}
