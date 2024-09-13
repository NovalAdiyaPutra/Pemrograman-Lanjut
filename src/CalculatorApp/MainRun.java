package CalculatorApp;

import javax.swing.*;

public class MainRun {
    public static void main(String[] args) {
        JFrame data = new JFrame("Calculator");
        CalculatorGui tampilan = new CalculatorGui();
        data.setContentPane(tampilan.getMain());
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setSize(325,330);
        data.setVisible(true);
    }
}