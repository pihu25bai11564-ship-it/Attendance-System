import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        Attendance attendance = new Attendance();
        Result result = new Result();

        int choice = 0;

        do {
            System.out.println("\n===== Student Result & Attendance Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Enter Marks");
            System.out.println("4. View Student Report");
            System.out.println("5. View All Students");
            System.out.println("6. View Rank List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Roll Number: ");
                        int roll = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Class: ");
                        String studentClass = sc.nextLine();
                        manager.addStudent(new Student(roll, name, studentClass));
                        break;

                    case 2:
                        System.out.print("Enter Roll Number: ");
                        int attRoll = sc.nextInt();
                        if (!manager.studentExists(attRoll)) {
                            System.out.println("Error: No student found with Roll Number " + attRoll);
                            break;
                        }
                        System.out.print("Present? (true/false): ");
                        boolean present = sc.nextBoolean();
                        attendance.markAttendance(attRoll, present);
                        break;

                    case 3:
                        System.out.print("Enter Roll Number: ");
                        int markRoll = sc.nextInt();
                        if (!manager.studentExists(markRoll)) {
                            System.out.println("Error: No student found with Roll Number " + markRoll);
                            break;
                        }
                        sc.nextLine();
                        System.out.print("Enter Subject: ");
                        String subject = sc.nextLine();
                        System.out.print("Enter Marks (0-100): ");
                        int marks = sc.nextInt();

                        if (marks < 0 || marks > 100) {
                            System.out.println("Error: Marks must be between 0 and 100.");
                            break;
                        }
                        result.addMarks(markRoll, subject, marks);
                        break;

                    case 4:
                        System.out.print("Enter Roll Number: ");
                        int reportRoll = sc.nextInt();
                        if (!manager.studentExists(reportRoll)) {
                            System.out.println("Error: No student found with Roll Number " + reportRoll);
                            break;
                        }
                        attendance.checkAttendanceStatus(reportRoll);
                        result.displayResult(reportRoll);
                        break;

                    case 5:
                        manager.displayAllStudents();
                        break;

                    case 6:
                                            
                        result.generateRankList(manager.getAllStudents());
                        break;

                    case 7:
                        System.out.println("Exiting... Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice, please enter a number between 1-7.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number, not text.");
                sc.nextLine(); 
                choice = 0;
            }

        } while (choice != 7);

        sc.close();
    }
}
