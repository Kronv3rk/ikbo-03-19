package ru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame{
    int mi=0;
    int ma=0;
    String ls="N/A";
    String win="DRAW";
    JPanel[] pnl = new JPanel[5];


    private String getW() {
        if (mi > ma) return "AC Milan";
        if (mi < ma) return "Real Madrid";
        return "DRAW";
    }


    public Window(){
        setLayout(new FlowLayout());
        for(int i = 0 ; i < pnl.length ; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel label1 = new JLabel("Result:" + mi + "X" + ma);
        JLabel label2 = new JLabel("Last Scorer: " +ls);
        JLabel label3 = new JLabel("Winner " +win);
        pnl[0].add(button1);
        pnl[1].add(label1);
        pnl[2].add(button2);
        pnl[3].add(label2);
        pnl[4].add(label3);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mi += 1;
                label1.setText("Result: " + mi + " X " + ma);
                label2.setText("Last Scorer: AC Milan");
                label3.setText("Winner: " + getW());
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ma += 1;
                label1.setText("Result: " + mi + " X " + ma);
                label2.setText("Last Scorer: Real Madrid");
                label3.setText("Winner: " + getW());
            }
        });
        setSize(400,150);
    }
}
