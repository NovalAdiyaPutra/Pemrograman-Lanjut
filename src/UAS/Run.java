package UAS;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        /*JFrame data = new JFrame();
        data.setContentPane(new kalkulator().KalkulatorUas);
        data.setSize(325,330);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);*/
        JFrame frame = new JFrame("kalkulator");
        frame.setContentPane(new kalkulator().KalkulatorUas);
        frame.setSize(325,330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
