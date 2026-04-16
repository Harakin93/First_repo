package org.example;
import java.util.*;

public class GradesHashMap {

    private HashMap<Student, ArrayList<Integer>> studentGradesMap= new HashMap<>();
    private Double gradesSum = 0.0;

    Student createStudent(String firstName, String lastName, Integer studentId) {
        Student student = new Student(firstName, lastName, studentId);
        System.out.println("Object " + student + " has been created");
        return student;
    }

    public void addEntryToHashMap(Student student, ArrayList<Integer> studentGradesList) {
        studentGradesMap.put(student, studentGradesList);
        System.out.println("Entry has been added to the HashMap!");
    }

    public void showMapSize() {
        System.out.println("Map size is: " + studentGradesMap.size());
    }

    public void showHashMap() {
        for(Map.Entry<Student, ArrayList<Integer>> entry: studentGradesMap.entrySet()) {
            System.out.println("Entry: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public void countGradesAverage() {
        for(Map.Entry<Student, ArrayList<Integer>> entry2: studentGradesMap.entrySet()) {
            System.out.println(" ");
            List<Integer> list = entry2.getValue();
            System.out.println("Grades of student " + entry2.getKey() + " are " + entry2.getValue());
            if(list.size() >= 3) {
                for (Integer s : entry2.getValue()) {
                    gradesSum += s;
                }
                double improvedGradesSum = (gradesSum - list.getFirst() - list.getLast());
                System.out.println("This is the lowest grade: " + list.getFirst() + ".     This is the highest grade: " + list.getLast());
                System.out.println("This is sum of grades: " + gradesSum + ".    This is sum of grades after excluding the highest and the lowest grade: " + improvedGradesSum);
                System.out.println("This is the number of grades of a student: " + list.size() + ".   After excluding the lowest and the highest grade it is: " + (list.size() -2));
                System.out.println("Grades average after excluding the highest and the lowest grade is equal to: " + String.format("%.2f", (improvedGradesSum / (list.size() - 2))));
                gradesSum = 0.0;
            } else {
                System.out.println("To count grades average at least 3 grades are needed!");
            }
        }
    }
}
