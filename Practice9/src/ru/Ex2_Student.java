package ru;

public class Ex2_Student implements Comparable<Ex2_Student> {
    private String firstName;
    private String secondName;
    private String lastName;
    private int idNumber;
    private int grade;

    public Ex2_Student(int idNumber, int grade, String firstName, String lastName, String secondName) throws Ex2_EmptyStringException {
        if (firstName.isEmpty()) {
            throw new Ex2_EmptyStringException("First Name is empty");
        }
        if (lastName.isEmpty()) {
            throw new Ex2_EmptyStringException("Last Name is empty");
        }
        if (secondName.isEmpty()) {
            throw new Ex2_EmptyStringException("Second Name is empty");
        }
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getidNumber() {
        return idNumber;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Ex2_Student o) {
        return Integer.valueOf(this.grade).compareTo(o.getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", iDNumber=" + idNumber +
                ", grade=" + grade +
                '}';
    }


}
