public class Student {
    private int rollNumber;
    private String name;
    private String studentClass;

    public Student(int rollNumber, String name, String studentClass) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.studentClass = studentClass;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Class: " + studentClass;
    }
}
