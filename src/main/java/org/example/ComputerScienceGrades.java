package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class ComputerScienceGrades {

    private Double gradesSum = 0.0;
    private ArrayList<Integer> grades = new ArrayList<>();

    public void addElementToArrayList(Integer grade) {
        grades.add(grade);
        System.out.println("Grade "+ grade + " added to the list.");
    }

    public void listManipulator() {
        System.out.println("The first grade on the list before sorting is " + grades.getFirst() + " and the last grade is " + grades.getLast() + ".");
        System.out.println("The lowest grade on the list after sorting is " + grades.getFirst() + " and the highest grade is " + grades.getLast() + ".");
        Collections.sort(grades);
        System.out.println("Grades are now sorted!");
        for(Integer c: grades) {
            gradesSum += c;
        }
        double gradesAverage = gradesSum/grades.size();
        System.out.println("The average of grades before excluding the highest and the lowest grade is: " + gradesAverage + ".");
        double improvedGradesAverage = (gradesSum - grades.getFirst() - grades.getLast())/ (grades.size() -2);
        System.out.println("The average of grades after excluding the highest and the lowest grade is: " + improvedGradesAverage + ".");
    }
}

