package ru;

class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    @Override
    public String toString() {
        return new StringBuilder(surname)
                        .append(" ")
                        .append((!name.isEmpty())? name.charAt(0) + ".": "")
                        .append((!patronymic.isEmpty())? patronymic.charAt(0) + ".": "")
                        .toString();
    }
}
