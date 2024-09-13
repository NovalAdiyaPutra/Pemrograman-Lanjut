package Kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Calculatorr {
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

        private String InputBarusan = "";
        private double Hasil = 0;
        private String operator = "";
        private boolean HasilTentu = false;

        public JPanel getMain() {
            return main;
        }

        private JButton createButton(String text, int x, int y) {
            JButton button = new JButton(text);
            button.setBounds(x, y, 50, 50);
            main.add(button);
            return button;
        }

        //Desain kalkulator
        public Calculatorr() {
            //Main Panel
            main.setBackground(Color.black);
            main.setLayout(null);

            //InputdanOutput label
            TampilanOutput = new JLabel();
            TampilanOutput.setOpaque(true);
            TampilanOutput.setBackground(Color.lightGray);
            TampilanOutput.setBounds(10, 10, 290, 30);
            main.add(TampilanOutput);

            //Button
            main.add(ButtonHasil);
            ButtonHasil.setText("=");
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
                        if (HasilTentu) {
                            clearAll();
                        }
                        InputBarusan += text;
                        TampilanOutput.setText(TampilanOutput.getText() + text);
                    } else if ("+-*/".contains(text)) {
                        if (!InputBarusan.isEmpty()) {
                            if (!operator.isEmpty()) {
                                calculateResult();
                            } else {
                                Hasil = Double.parseDouble(InputBarusan);
                            }
                            operator = text;
                            InputBarusan = "";
                            TampilanOutput.setText(TampilanOutput.getText() + " " + text + " ");
                        } else if (HasilTentu) {
                            operator = text;
                            TampilanOutput.setText(Hasil + " " + text + " ");
                        }
                        HasilTentu = false;
                    } else if ("=".equals(text)) {
                        if (!InputBarusan.isEmpty() && !operator.isEmpty()) {
                            calculateResult();
                            operator = "";
                            HasilTentu = true;
                        }
                    } else if ("C".equals(text)) {
                        clearAll();
                    } else if ("De".equals(text)) {
                        if (!InputBarusan.isEmpty()) {
                            InputBarusan = InputBarusan.substring(0, InputBarusan.length() - 1);
                            TampilanOutput.setText(TampilanOutput.getText().substring(0, TampilanOutput.getText().length() - 1));
                        } else if (!TampilanOutput.getText().isEmpty()) {
                            String displayText = TampilanOutput.getText();
                            if (displayText.endsWith(" ")) {
                                displayText = displayText.substring(0, displayText.length() - 3);
                                operator = "";
                            } else {
                                displayText = displayText.substring(0, displayText.length() - 1);
                            }
                            TampilanOutput.setText(displayText);
                        }
                    } else if ("%".equals(text)) {
                        if (!InputBarusan.isEmpty()) {
                            double value = Double.parseDouble(InputBarusan) / 100;
                            InputBarusan = String.valueOf(value);
                            TampilanOutput.setText(InputBarusan);
                            HasilTentu = true;
                        }
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

        private void calculateResult() {
            double operand = Double.parseDouble(InputBarusan);
            switch (operator) {
                case "+":
                    Hasil += operand;
                    break;
                case "-":
                    Hasil -= operand;
                    break;
                case "*":
                    Hasil *= operand;
                    break;
                case "/":
                    Hasil /= operand;
                    break;
            }
            TampilanOutput.setText(String.valueOf(Hasil));
            InputBarusan = "";
        }

        private void clearAll() {
            InputBarusan = "";
            Hasil = 0;
            operator = "";
            TampilanOutput.setText("");
            HasilTentu = false;
        }
    }
