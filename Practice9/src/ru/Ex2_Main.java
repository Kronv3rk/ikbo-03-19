package ru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_Main {

    public static void main(String[] args) throws Ex2_EmptyStringException, Ex2_StudentNotFoundException {
        Ex2_LabClassUI classUI = new Ex2_LabClass().getClassUI();
        List<Ex2_Student> arr = new ArrayList<>();
        arr.add(new Ex2_Student(4,4,"Алексей","Брунин","Петрович"));
        arr.add(new Ex2_Student(12,5,"Александр","Трунин","Петрович"));
        arr.add(new Ex2_Student(324,3,"Арсений","Нунин","Петрович"));

        classUI.addStudents(arr);
        System.out.println(classUI);

        classUI.sortByMark();
        System.out.println("По оценкам");
        System.out.println(classUI);

        classUI.sortByLastName();
        System.out.println("По фамилии");
        System.out.println(classUI);

        Scanner scan = new Scanner(System.in);
        System.out.println("Поиск: ");
        System.out.println(classUI.findStudent(scan.next(), scan.next(), scan.next()));
    }


}
