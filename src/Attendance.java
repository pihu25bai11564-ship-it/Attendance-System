import java.util.HashMap;
import java.util.ArrayList;

public class Attendance {
    private HashMap<Integer, ArrayList<Boolean>> attendanceRecords;

    public Attendance() {
        attendanceRecords = new HashMap<>();
    }

    public void markAttendance(int rollNumber, boolean isPresent) {
        attendanceRecords.putIfAbsent(rollNumber, new ArrayList<>());
        attendanceRecords.get(rollNumber).add(isPresent);
        System.out.println("Attendance marked for Roll No " + rollNumber + ": " + (isPresent ? "Present" : "Absent"));
    }

    public double calculatePercentage(int rollNumber) {
        ArrayList<Boolean> records = attendanceRecords.get(rollNumber);

        if (records == null || records.isEmpty()) {
            System.out.println("No attendance records found for Roll No " + rollNumber);
            return 0.0;
        }

        int totalDays = records.size();
        int presentDays = 0;

        for (boolean present : records) {
            if (present) {
                presentDays++;
            }
        }

        return ((double) presentDays / totalDays) * 100;
    }

    public void checkAttendanceStatus(int rollNumber) {
        double percentage = calculatePercentage(rollNumber);
        System.out.printf("Roll No %d Attendance: %.2f%%\n", rollNumber, percentage);

        if (percentage < 75.0) {
            System.out.println("Warning: Attendance below 75%!");
        }
    }
}
