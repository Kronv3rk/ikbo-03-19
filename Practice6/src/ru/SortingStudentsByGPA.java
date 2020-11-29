package ru;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}
