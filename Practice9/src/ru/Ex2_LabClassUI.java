package ru;

import java.util.List;

public interface Ex2_LabClassUI {

    public void sortByMark();
    public void sortByLastName();
    public void addStudent(Ex2_Student st) throws Ex2_EmptyStringException;
    public List<Ex2_Student> getStudents();
    public void addStudents(List<Ex2_Student> list);


    public Ex2_Student findStudent(String name, String lastName, String secondName) throws Ex2_StudentNotFoundException;


}