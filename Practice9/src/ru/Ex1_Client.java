package ru;

public class Ex1_Client {
    private String name;
    private String lastName;
    private String secondName;
    private String inn;

    public Ex1_Client(String name, String lastName, String secondName, String inn) throws Ex1_WrongINNCode {
        if (inn.length() > 10) {
            throw new Ex1_WrongINNCode("Wrong INN");
        }
        this.inn = inn;
        this.name= name;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
