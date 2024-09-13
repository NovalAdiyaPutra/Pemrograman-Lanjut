package Kalkulator;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        JFrame data = new JFrame();
        data.setContentPane(new Calculatorr().getMain());
        data.setSize(325,330);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }
}
