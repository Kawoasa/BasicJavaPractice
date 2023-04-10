/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author Admin
 */
public class StudentManagement {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    sortStudentByGpa();
                    break;
                case 5:
                    sortStudentByName();
                    break;
                case 6:
                    showStudent();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        System.out.println("Please enter student information: ");
        System.out.print("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                System.out.println("Id " + id + " exited.");
                return;
            }
        }
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(id, name, age, address, gpa);
        studentList.add(student);
    }

    private static void editStudent() {
        if (studentList.isEmpty()) {
            System.out.println("There dont have student to edit.");
            return;
        }
        System.out.print("Please enter student id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = findStudentIndexById(id);
        if (index == -1) {
            System.out.println("Cannot find student with id " + id);
            return;
        }

        System.out.println("Please enter new student information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        Student newStudent = new Student(id, name, age, address, gpa);
        studentList.set(index, newStudent);
        System.out.println("Student with id " + id + " has been updated.");
    }

    private static void deleteStudent() {
        if (studentList.isEmpty()) {
            System.out.println("There dont have student to delete.");
            return;
        }
        System.out.print("Please enter student id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = findStudentIndexById(id);
        if (index == -1) {
            System.out.println("Cannot find student with id " + id);
            return;
        }
        studentList.remove(index);
        System.out.println("Student with id " + id + " has been delete.");
    }

    private static void sortStudentByGpa() {
        if (studentList.isEmpty()) {
            System.out.println("There dont have student to sort.");
            return;
        }
        Collections.sort(studentList, (Student s1, Student s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        System.out.println("Sorted students by gpa:");
        showStudent();
    }

    private static void sortStudentByName() {
        if (studentList.isEmpty()) {
            System.out.println("There dont have student to sort.");
            return;
        }
        Collections.sort(studentList, (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted students by name:");
        showStudent();
    }

    private static void showStudent() {
        if (studentList.isEmpty()) {
            System.out.println("There dont have student to find.");
            return;
        }
        System.out.println("List of students:");
        String header = String.format("%-12s%-20s%-12s%-30s%s\n", "ID", "Name", "Age", "Address", "GPA");
        System.out.println(header);
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    private static int findStudentIndexById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
