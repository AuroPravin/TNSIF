import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private String branch;
    private double cgpa;

    public Student(String name, String rollNumber, String branch, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class PlacementService {
    private List<Student> students;

    public PlacementService() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Branch: " + student.getBranch());
            System.out.println("CGPA: " + student.getCgpa());
            System.out.println("----------------------");
        }
    }
}

public class PlacementManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlacementService placementService = new PlacementService();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter branch: ");
                    String branch = scanner.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    Student student = new Student(name, rollNumber, branch, cgpa);
                    placementService.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    placementService.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}