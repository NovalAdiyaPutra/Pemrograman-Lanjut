package Pertemuan3.Operator;

public class ContohOperator {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        double a = (i+1)/(j+1);
        double b = (double) (i+1)/(j+1);
        double c = (i+1)/ (double)(j+1);
        double d = (i+1.0)/(j+1.0);

        System.out.println(a+ " " +b+ " " +c+ " " +d);
    }
}
