package ru;

import java.util.*;

public class Ex2_LabClassDriver implements Ex2_LabClassUI {

    private ArrayList<Ex2_Student> arr;

    public Ex2_LabClassDriver() {
        arr = new ArrayList<>();
    }
    @Override
    public Ex2_Student findStudent(String firstName, String secondName, String lastName) throws Ex2_StudentNotFoundException {
        for (Ex2_Student a : arr) {
            if (a.getFirstName().equals(firstName) && a.getLastName().equals(lastName) && a.getSecondName().equals(secondName)) {
                return a;
            }
        }
        throw new Ex2_StudentNotFoundException("Student doesn't exist");
    }

    @Override
    public void addStudents(List<Ex2_Student> l) {
        arr.addAll(l);
    }

    public void addStudent(Ex2_Student student) throws Ex2_EmptyStringException {
        arr.add(student);
    }

    @Override
    public void sortByLastName() {
        arr.sort(Comparator.comparing(Ex2_Student::getLastName));
    }

    @Override
    public void sortByMark() {
        Collections.sort(arr);
    }
    public List<Ex2_Student> getStudents() {
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Students\n");

        for (Ex2_Student s : arr) {
            str.append(s.getFirstName()).append(" ").append(s.getSecondName()).append(" ").append(s.getLastName()).append(" ").append(s.getGrade()).append("\n");
        }

        return str.toString();
    }
}
