package ru;

class Shirt {
    private String number;
    private String model;
    private String color;
    private String size;

    public Shirt(String s) {
        String[] res = s.split(",");
        if (res.length != 4)
            throw new IllegalStateException("Неправильно введены исходные данные");
        number = res[0].trim();
        model = res[1].trim();
        color = res[2].trim();
        size = res[3].trim();
    }

    @Override
    public String toString() {
        return "number = " + number + "\nmodel = " + model + "\ncolor = " + color + "\nsize = " + size;
    }
}
