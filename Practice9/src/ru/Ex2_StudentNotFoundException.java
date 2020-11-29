package ru;

public class Ex2_StudentNotFoundException extends Exception{
    public Ex2_StudentNotFoundException(String no_student) {
        super("Student doesn't exist");
    }
}
