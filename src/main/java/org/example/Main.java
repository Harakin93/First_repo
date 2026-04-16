package org.example;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        GradesHashMap hashMap = new GradesHashMap();
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.addRandomGradesToArrayList();
        Student student1 = hashMap.createStudent("Zenon", "Martyniuk", 873234234);
        studentGrades.showArrayList();
        studentGrades.sortArrayList();
        hashMap.addEntryToHashMap(student1, studentGrades.getStudentGradesList());
        hashMap.showHashMap();
        studentGrades.newArrayList();
        studentGrades.addRandomGradesToArrayList();
        Student student2 = hashMap.createStudent("Borys", "Samogon", 234672342);
        studentGrades.sortArrayList();
        hashMap.addEntryToHashMap(student2,studentGrades.getStudentGradesList());
        hashMap.showHashMap();
        hashMap.showMapSize();
        hashMap.countGradesAverage();
    }
}