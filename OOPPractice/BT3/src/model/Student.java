/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        
        //        String row = String.format("%-12d%-12s%07d", id, name, age, address, gpa);
        //        System.out.println(header);
        //        System.out.println(row);
//        "ID: " + id + "\tName: " + name + "\t\tAge: " + age + "\t\tAddress: " + address + "\t\tGPA: " + gpa
        return String.format("%-12d%-20s%-12d%-30s%.3f\n", id, name, age, address, gpa);
    }

}
