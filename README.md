 **Student Result & Attendance Management System**

  **What is this?**
Ever notice how much time teachers waste on attendance registers and marking sheets? This project tries to fix that. It's a Java console app that lets you manage students, mark their attendance, and calculate their results — all in one place, without a single paper register.

I built this as part of my Java course project to apply core OOP concepts to something that actually solves a real, everyday problem in schools and colleges.

   **What it can do**
- Manage students – add new students, update their details, remove them, or search by roll number/name
- Track attendance  – mark who's present or absent each day, check attendance history, and automatically calculate attendance percentage (with a warning if someone drops below 75%)
- Handle results – enter marks subject-wise, auto-calculate totals, percentages, and grades, and generate a class rank list so you can instantly see who's topping the class

 **vBuilt with**
- Java (Core Java + OOP – classes, inheritance, collections)
- ArrayList / HashMap for storing and retrieving data quickly
- File handling / JDBC for saving data permanently *(update this based on what you actually use)*
- Git & GitHub to track my progress along the way
 . How to run it yourself
1. Download or clone this repo
2. Make sure you've got Java installed (JDK 8 or above works fine)
3. Open the project folder in any IDE — IntelliJ, Eclipse, or even VS Code
4. Head into the `src` folder and compile: `javac Main.java`
5. Run it: `java Main`
6. You'll see a menu pop up in the console — just follow the prompts

  **How to test it**
- Add a couple of dummy students first
- Mark them present/absent across a few different days and check if the attendance % comes out right
- Enter some marks and see if the grade and rank calculations make sense
- Try breaking it on purpose too — enter invalid roll numbers or marks above 100 and see if it handles the error properly.
 
