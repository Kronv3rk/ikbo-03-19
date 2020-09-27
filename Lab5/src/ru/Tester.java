package ru;

import ru.Opener;
import ru.Window;

import javax.swing.*;

public class Tester {
    public static void main(String[] argv) {
        Window w = new Window(argv[0]);
        w.setVisible(true);
    }
}
