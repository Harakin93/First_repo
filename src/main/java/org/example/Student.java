package org.example;

public class Student {

    private String firstName;
    private String lastName;
    private Integer studentId;

    public Student(String firstName, String lastName, Integer studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Id: " + studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public boolean equals(Object one) {
        Student two = (Student) one;
        return getFirstName().equals(two.getFirstName()) && getLastName().equals(two.getLastName()) && getStudentId().equals(two.getStudentId()) ;
    }
}
