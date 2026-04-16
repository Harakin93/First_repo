package org.example;
import java.util.*;

public class StudentGrades {

    private ArrayList<Integer> studentGradesList = new ArrayList<>();

    public void newArrayList() {
        studentGradesList = new ArrayList<>();
        System.out.println("New ArrayList created!");
    }

    public void addRandomGradesToArrayList() {
        Random random = new Random();
        int randomNumberOfGrades = (1 + random.nextInt(20));
        for (int q = 0; q < randomNumberOfGrades; q++) {
            int randomGrade = (1 + random.nextInt(6));
            studentGradesList.add(randomGrade);
            System.out.println("Grade " + randomGrade+ " has been added!");
        }
    }

    public  ArrayList<Integer> getStudentGradesList() {
        return studentGradesList;
    }

    public void showArrayList() {
        System.out.println("Current grades of a student:");
        for (int n = 0; n < studentGradesList.size(); n++) {
            System.out.println("Grade " + (n+1) + ": " + studentGradesList.get(n));
        }
        System.out.println("Displaying process is finished!");
    }
//
//    public void clearArrayList() {
//        studentGradesList.clear();
//        System.out.println("ArrayList is now clear and contains no elements.");
//    }

    public void sortArrayList() {
        Collections.sort(studentGradesList);
        System.out.println("Grades are now sorted!");
    }

    @Override
    public String toString() {
        return studentGradesList.toString();
    }
}