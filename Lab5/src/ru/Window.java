package ru;

import javax.swing.*;
import ru.Opener;

class Window extends JFrame
{
    public Window(String path)
    {
        Opener component = new Opener(path);
        setSize(component.imageWidth, component.imageHeight);
        add(component);
    }

}