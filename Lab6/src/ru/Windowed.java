package ru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Windowed extends JFrame {
    Windowed(){
        JTextArea area = new JTextArea("Многострочное поле", 12, 30);
        setSize(500, 300);
        area.setTabSize(10);
        area.setFont(new Font("Arial", Font.PLAIN, 14));

        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area));
        setContentPane(contents);

        JMenu fontmenu = new  JMenu("Font");
        JMenu colormenu = new  JMenu("Color");

        JMenuItem TNR = new JMenuItem("Times New Roman");
        fontmenu.add(TNR);

        JMenuItem MSSS = new JMenuItem("MS Sans Serif");
        fontmenu.add(MSSS);

        JMenuItem CN = new JMenuItem("Courier New");
        fontmenu.add(CN);

        JMenuItem Blue = new JMenuItem("Blue");
        colormenu.add(Blue);

        JMenuItem Red = new JMenuItem("Red");
        colormenu.add(Red);

        JMenuItem Black = new JMenuItem("Black");
        colormenu.add(Black);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new  JMenu("Menu");
        menu.add(fontmenu);
        menu.add(colormenu);
        menuBar.add(menu);

        this.setJMenuBar(menuBar);
        TNR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });
        MSSS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });
        CN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });
        Blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.blue);            }
        });
        Red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.red);            }
        });
        Black.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.black);            }
        });


    }
}
