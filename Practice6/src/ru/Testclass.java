package ru;

import java.util.*;

public class Testclass {

    public static Student makeStudent() {
        Random r = new Random();
        return new Student(r.nextInt(500), r.nextInt(500) % 10, "" + r.nextInt(500), " " + ((r.nextInt(500) % 10) +1));
    }

    public static Student[] mergeSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length + a2.length];
        int i = 0, j = 0,k = 0;
        for (k = 0; k < a3.length; k++) {
            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getGpa() < a2[j].getGpa()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }


    public static void main(String[] args) {

        System.out.println("\nEx1");
        IDNumber arr1 = new IDNumber(10);
        for (int i = 0; i < 10; i++) {
            arr1.add(makeStudent());
        }
        System.out.println(arr1);
        arr1.sort();
        System.out.println((arr1) + "\n\nEx2");
        Student[] arr2 = new Student[10];
        for (int i = 0; i < 10; i++) {
            arr2[i] = makeStudent();
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(arr2) + "\n\nEx3");
        Student[] student1 = new Student[10];
        Student[] student2 = new Student[10];
        for (int i = 0; i < 10; i++) {
            student1[i] = makeStudent();
            student2[i] = makeStudent();
        }
        Arrays.sort(student1, new SortingStudentsByGPA());
        Arrays.sort(student2, new SortingStudentsByGPA());
        System.out.println("№1:\t" + Arrays.toString(student1) + "\n№2:\t" + Arrays.toString(student2) + "\n№1&№2:\t" + Arrays.toString(mergeSort(student1, student2)));

    }


}
