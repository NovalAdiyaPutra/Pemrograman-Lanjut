package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui {
    private JPanel main;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JButton Button0;
    private JButton ButtonKoma;
    private JButton ButtonHasil;
    private JButton ButtonTambah;
    private JButton ButtonKurang;
    private JButton ButtonKali;
    private JButton ButtonBagi;
    private JLabel TampilanOutput;
    private JButton ButtonClear;
    private JButton ButtonDelete;
    private JButton ButtonPersen;

    private String inputBarusan = "";
    private Calculator kalkulator    = new Calculator();
    private boolean persenTentu = false;

    public JPanel getMain() {
        return main;
    }

    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 50, 50);
        button.setBackground(Color.white);
        main.add(button);
        return button;
    }

    // Desain kalkulator
    public CalculatorGui() {
        main = new JPanel(); // Ini menambahkan panel utama
        // Main Panel
        main.setBackground(Color.black);
        main.setLayout(null);

        // Input dan Output label
        TampilanOutput = new JLabel();
        TampilanOutput.setOpaque(true);
        TampilanOutput.setBackground(Color.lightGray);
        TampilanOutput.setBounds(10, 10, 290, 30);
        main.add(TampilanOutput);

        // Buttons
        main.add(ButtonHasil);
        ButtonHasil.setText("=");
        ButtonHasil.setBackground(Color.white);
        ButtonHasil.setBounds(190, 230, 110, 50);


        Button1 = createButton("1", 10, 50);
        Button2 = createButton("2", 70, 50);
        Button3 = createButton("3", 130, 50);
        Button4 = createButton("4", 10, 110);
        Button5 = createButton("5", 70, 110);
        Button6 = createButton("6", 130, 110);
        Button7 = createButton("7", 10, 170);
        Button8 = createButton("8", 70, 170);
        Button9 = createButton("9", 130, 170);
        Button0 = createButton("0", 70, 230);
        ButtonKoma = createButton(".", 10, 230);
        ButtonTambah = createButton("+", 190, 50);
        ButtonKurang = createButton("-", 190, 110);
        ButtonKali = createButton("*", 190, 170);
        ButtonBagi = createButton("/", 250, 170);
        ButtonPersen = createButton("%", 250, 110);
        ButtonClear = createButton("C", 250, 50);
        ButtonDelete = createButton("De", 130, 230);

        addActionListeners();
    }

    private void addActionListeners() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String text = source.getText();

                if ("0123456789.".contains(text)) {
                    InputAngkaKoma(text);
                } else if ("+-*/".contains(text)) {
                    InputOperator(text);
                } else if ("=".equals(text)) {
                    InputSamaDengan();
                } else if ("C".equals(text)) {
                    clearAll();
                } else if ("De".equals(text)) {
                    InputDelete();
                } else if ("%".equals(text)) {
                    InputPersen();
                }
            }
        };

        Button1.addActionListener(listener);
        Button2.addActionListener(listener);
        Button3.addActionListener(listener);
        Button4.addActionListener(listener);
        Button5.addActionListener(listener);
        Button6.addActionListener(listener);
        Button7.addActionListener(listener);
        Button8.addActionListener(listener);
        Button9.addActionListener(listener);
        Button0.addActionListener(listener);
        ButtonKoma.addActionListener(listener);
        ButtonTambah.addActionListener(listener);
        ButtonKurang.addActionListener(listener);
        ButtonKali.addActionListener(listener);
        ButtonBagi.addActionListener(listener);
        ButtonHasil.addActionListener(listener);
        ButtonClear.addActionListener(listener);
        ButtonDelete.addActionListener(listener);
        ButtonPersen.addActionListener(listener);
    }

    private void InputAngkaKoma(String text) {
        if (kalkulator.isHasilTentu()) {
            clearAll();
        }
        if (persenTentu) {
            inputBarusan = "";
            TampilanOutput.setText("");
            persenTentu = false;
        }
        if (text.equals(".")) {
            if (inputBarusan.contains(".")) {
                return;
            }
            if (inputBarusan.isEmpty()) {
                inputBarusan = "0";
            }
        }
        inputBarusan += text;
        TampilanOutput.setText(TampilanOutput.getText() + text);
    }

    private void InputOperator(String text) {
        if (text.equals("-") && inputBarusan.isEmpty()) {
            inputBarusan = "-";
            TampilanOutput.setText(TampilanOutput.getText() + "-");
        } else {
            if (!inputBarusan.isEmpty() && !inputBarusan.equals("-")) {
                if (!kalkulator.getOperator().isEmpty()) {
                    kalkulasiHasil();
                } else {
                    kalkulator.setHasil(Double.parseDouble(inputBarusan));
                }
                kalkulator.setOperator(text);
                inputBarusan = "";
                TampilanOutput.setText(TampilanOutput.getText() + " " + text + " ");
            } else if (kalkulator.isHasilTentu()) {
                kalkulator.setOperator(text);
                TampilanOutput.setText(kalkulator.getHasil() + " " + text + " ");
            }
            kalkulator.setHasilTentu(false);
            persenTentu = false;
        }
    }

    private void InputSamaDengan() {
        if (!inputBarusan.isEmpty() && !kalkulator.getOperator().isEmpty() && !inputBarusan.equals("-")) {
            kalkulasiHasil();
            kalkulator.setOperator("");
            kalkulator.setHasilTentu(true);
        }
    }

    private void InputDelete() {
        if (!inputBarusan.isEmpty()) {
            inputBarusan = inputBarusan.substring(0, inputBarusan.length() - 1);
            TampilanOutput.setText(TampilanOutput.getText().substring(0, TampilanOutput.getText().length() - 1));
        } else if (!TampilanOutput.getText().isEmpty()) {
            String displayText = TampilanOutput.getText();
            if (displayText.endsWith(" ")) {
                displayText = displayText.substring(0, displayText.length() - 3);
                kalkulator.setOperator("");
            } else {
                displayText = displayText.substring(0, displayText.length() - 1);
            }
            TampilanOutput.setText(displayText);
        }
    }

    private void InputPersen() {
        if (!inputBarusan.isEmpty() && !inputBarusan.equals("-")) {
            double operand = Double.parseDouble(inputBarusan);
            operand = kalkulator.kalkulasiPersen(operand);
            inputBarusan = String.valueOf(operand);
            TampilanOutput.setText(inputBarusan);
            kalkulator.setHasilTentu(false);
            persenTentu = true;
        }
    }

    private void kalkulasiHasil() {
        double operand = Double.parseDouble(inputBarusan);
        double hasil = kalkulator.kalkulasiHasil(operand);
        TampilanOutput.setText(String.valueOf(hasil));
        inputBarusan = "";
    }

    private void clearAll() {
        inputBarusan = "";
        kalkulator.reset();
        TampilanOutput.setText("");
        persenTentu = false;
    }
}
