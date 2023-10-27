import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRecord{

    public static void main(String[] args) {
        Map<String, Student> studentRecords = new HashMap<>();
        Map<String, String> courses = initializeCourses();
        Map<String, String> departments = initializeDepartments();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Create Student Record");
            System.out.println("2. Update Student Record");
            System.out.println("3. Display Student Details");
            System.out.println("4. Exit");
            System.out.println();

            System.out.print("Enter Selection: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createStudentRecord(studentRecords, courses, departments, scanner);
                    break;
                case 2:
                    updateStudentRecord(studentRecords, courses, departments, scanner);
                    break;
                case 3:
                    displayStudentDetails(studentRecords, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static Map<String, String> initializeCourses() {
        Map<String, String> courses = new HashMap<>();
        courses.put("BSIT", "Bachelor of Science in Information Technology (College of Computer Studies Department)");
        courses.put("BSCS", "Bachelor of Science in Computer Science (College of Computer Studies Department)");
        courses.put("ACT", "Associate of Computer Technology (College of Computer Studies Department)");
        courses.put("BSME", "Bachelor of Science in Mechanical Engineering (College of Engineering Department)");
        courses.put("BSCE", "Bachelor of Science in Civil Engineering (College of Engineering Department)");
        return courses;
    }

    private static Map<String, String> initializeDepartments() {
        Map<String, String> departments = new HashMap<>();
        departments.put("CCS", "College of Computer Studies Department");
        departments.put("COE", "College of Engineering Department");
        return departments;
    }

  private static void createStudentRecord(Map<String, Student> studentRecords, Map<String, String> courses, Map<String, String> departments, Scanner scanner) {
    System.out.print("Enter student ID: ");
    String studentId = scanner.nextLine();
    System.out.print("Enter first name: ");
    String firstName = scanner.nextLine();
    System.out.print("Enter middle name: ");
    String middleName = scanner.nextLine();
    System.out.print("Enter last name: ");
    String lastName = scanner.nextLine();
    System.out.print("Enter suffix: ");
    String suffix = scanner.nextLine();
    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    // Input course code and validate it
    String courseCode;
    do {
        System.out.print("Enter course code (e.g., BSIT): ");
        courseCode = scanner.nextLine().toUpperCase();
    } while (!courses.containsKey(courseCode));

    System.out.print("Enter year level: ");
    int yearLevel = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    System.out.print("Enter phone number: ");
    String phoneNumber = scanner.nextLine();
    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    Student student = new Student(studentId, firstName, middleName, lastName, suffix, age, yearLevel, courses.get(courseCode), courseCode, departments.get(courseCode), phoneNumber, email);
    studentRecords.put(studentId, student);

    System.out.println("Student record for " + firstName + " " + lastName + " created successfully.");
}

private static void updateStudentRecord(Map<String, Student> studentRecords, Map<String, String> courses, Map<String, String> departments, Scanner scanner) {
    System.out.print("Enter student ID to update: ");
    String studentId = scanner.nextLine();
    if (studentRecords.containsKey(studentId)) {
        System.out.print("Update student ID: ");
        String newStudentId = scanner.nextLine();
        if (!studentId.equals(newStudentId)) {
            // Check if the new student ID is not already in use
            if (studentRecords.containsKey(newStudentId)) {
                System.out.println("Student ID " + newStudentId + " is already in use. Update failed.");
                return;
            }
        }

        System.out.print("Enter new first name: ");
        String newFirstName = scanner.nextLine();
        System.out.print("Enter new middle name: ");
        String newMiddleName = scanner.nextLine();
        System.out.print("Enter new last name: ");
        String newLastName = scanner.nextLine();
        System.out.print("Enter new suffix: ");
        String newSuffix = scanner.nextLine();
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        System.out.print("Enter new Year Level: ");
        int newYearLevel = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Display course selection menu
        System.out.println("Select new course:");
        int courseChoice = 0;
        for (Map.Entry<String, String> entry : courses.entrySet()) {
            courseChoice++;
            System.out.println(courseChoice + ". " + entry.getValue() + " (" + entry.getKey() + ")");
        }
        System.out.print("Enter the number of the selected course: ");
        courseChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] courseCodes = courses.keySet().toArray(new String[0]);
        if (courseChoice >= 1 && courseChoice <= courseCodes.length) {
            String newCourseCode = courseCodes[courseChoice - 1];
            String courseDescription = courses.get(newCourseCode);
            String newCourse = courseDescription != null ? courseDescription : "N/A";

            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();

            System.out.print("Enter new email: ");
            String newEmail = scanner.nextLine();

            Student oldStudent = studentRecords.get(studentId);
            Student newStudent = new Student(newStudentId, newFirstName, newMiddleName, newLastName, newSuffix, newAge, newYearLevel, newCourse, newCourseCode, departments.get(newCourseCode), newPhoneNumber, newEmail);

            // Update the student record
            studentRecords.remove(studentId);
            studentRecords.put(newStudentId, newStudent);

            System.out.println("Student record for ID " + studentId + " updated successfully.");
        } else {
            System.out.println("Invalid course choice.");
        }
    } else {
        System.out.println("Student with ID " + studentId + " not found.");
    }
}

private static void displayStudentDetails(Map<String, Student> studentRecords, Scanner scanner) {
    System.out.print("Enter student ID to display details: ");
    String studentId = scanner.nextLine();
    if (studentRecords.containsKey(studentId)) {
        Student student = studentRecords.get(studentId);

        System.out.println("\nStudent Profile Details:");
        System.out.println("Student ID No: " + student.getStudentId());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("Age: " + student.getAge());
        System.out.println("Year Level: " + student.getYearLevel());
        System.out.println("Phone Number: " + student.getPhoneNumber());
        System.out.println("Email: " + student.getEmail());

        System.out.println("\nStudent Course Details:");
        System.out.println("Course Name: " + student.getCourse());
        System.out.println("Course Code: " + student.getCourseCode());
        System.out.println("Department: " + student.getDepartment());
    } else {
        System.out.println("Student with ID " + studentId + " not found.");
    }
}
}

class Student {
    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private int yearLevel;
    private String course;
    private String courseCode; // New property for course code
    private String department; // New property for department
    private String phoneNumber;
    private String email;

    public Student(String studentId, String firstName, String middleName, String lastName, String suffix, int age, int yearLevel, String course, String courseCode, String department, String phoneNumber, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
        this.yearLevel = yearLevel;
        this.course = course;
        this.courseCode = courseCode;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentID(String studentId) {
       this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getYearLevel() {
       return yearLevel;
    }
    
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getCourse() {
        return course;
    }
    
    public void setCourse(String Course) {
        this.course = course;
    }
    
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}