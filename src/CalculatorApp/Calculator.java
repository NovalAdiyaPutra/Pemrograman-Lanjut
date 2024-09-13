package CalculatorApp;

public class Calculator {
    private double hasil = 0;
    private String operator = "";
    private boolean hasilTentu = false;

    public double getHasil() {
        return hasil;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isHasilTentu() {
        return hasilTentu;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setHasilTentu(boolean hasilTentu) {
        this.hasilTentu = hasilTentu;
    }

    public void reset() {
        hasil = 0;
        operator = "";
        hasilTentu = false;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public double kalkulasiHasil(double operand) {
        switch (operator) {
            case "+":
                hasil += operand;
                break;
            case "-":
                hasil -= operand;
                break;
            case "*":
                hasil *= operand;
                break;
            case "/":
                hasil /= operand;
                break;
        }
        return hasil;
    }

    public double kalkulasiPersen(double operand) {
        if (hasil != 0) {
            return hasil * (operand / 100);
        } else {
            return operand / 100;
        }
    }
}
