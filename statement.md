**Problem Statement**

**The Problem**
In most schools and colleges, attendance is still marked on paper registers, and results are calculated manually using calculators or Excel sheets. This takes up a lot of teachers' time, is prone to human error (wrong totals, missed entries), and makes it hard to track a student's attendance percentage or ranking without going through piles of paperwork.

There's no simple, lightweight system that lets a teacher or admin quickly manage students, mark attendance, and generate results — all in one place — without needing expensive software or an internet connection.

**What This Project Solves**
This project is a Java-based desktop application that brings student records, attendance tracking, and result processing into one simple system. Instead of separate registers and spreadsheets, everything lives in one program:

- No more manually counting attendance percentages
- No more manually calculating totals, percentages, and grades
- No more flipping through pages to find a student's rank

**Scope of the Project**
This project focuses on the core academic administration tasks a teacher or class coordinator handles regularly:

- Adding and managing student profiles
- Marking day-to-day attendance
- Recording exam marks and generating results

It's built as a standalone Java application (not a full web-based school management system), so it's meant for use at the classroom or department level — not to replace an entire institution's ERP system.

 **Who This Is For**
- Teachers/Class Coordinators  – to quickly mark attendance and enter marks
- School/College Admin Staff   – to maintain student records and generate reports
-  Students (indirectly)       – benefit from more accurate attendance and result tracking

**What It Actually Does (High-Level Features)**
- Student Management   – add, update, delete, and search student records
- Attendance Tracking  – mark present/absent, view history, auto-calculate attendance %, flag students below 75% attendance
- Result Processing    – enter subject-wise marks, calculate totals/percentage/grade, and generate a class rank list


## NON FUNCTIONAL REQUIREMENTS ##   
**1. Performance**
The system should respond to user actions (adding a student, marking attendance, calculating results) instantly, since it uses in-memory data structures (ArrayList, HashMap) rather than slow file/database lookups. With a typical class size (30-60 students), all operations like search, sort, and rank generation should complete in well under a second.

**2. Reliability**
The system should consistently produce accurate results — correct attendance percentages, correct grade calculations, and correct rankings — every time, without data corruption during a session. Input validation (covered under error handling) ensures bad data never silently breaks calculations.

**3. Usability**
The system provides a simple, numbered menu (1-7) so any user — even someone unfamiliar with programming — can operate it without training. Clear prompts guide the user through each action step-by-step (e.g., "Enter Roll Number:", "Enter Marks (0-100):").

**4. Maintainability**
The code is organized into separate, single-responsibility classes (Student, StudentManager, Attendance, Result, Main), making it easy to update or extend one module (e.g., adding a new report type) without affecting the others. This modular structure also makes debugging easier.

**5. Error Handling Strategy**
The system anticipates and gracefully handles invalid input: non-numeric input where a number is expected (via try-catch), out-of-range marks (0-100 validation), and operations on non-existent roll numbers — all without crashing, always returning the user to the menu with a clear error message.

**6. Scalability**
Since student records, attendance, and results are stored in dynamic collections (ArrayList, HashMap) rather than fixed-size arrays, the system can handle a growing number of students, subjects, or attendance days without any code changes or size limits.

**7. Resource Efficiency**
As a lightweight console application with in-memory storage, the system has minimal memory and CPU footprint — no external database or heavy dependencies are required to run it, making it usable even on low-spec machines.

