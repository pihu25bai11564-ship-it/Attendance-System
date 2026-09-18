import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public Student searchStudent(int rollNumber) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNumber) {
                return s;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public boolean studentExists(int rollNumber) {
        return searchStudent(rollNumber) != null;
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
