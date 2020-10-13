package ru;

public class Complex {

    int real = 0;
    int image = 0;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {}

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real + ", image=" + image + '}';
    }
}
