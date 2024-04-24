package Pertemuan4;

import java.util.Scanner;

public class MembuatArray {
    public static void main(String args[])
    {
        String[] hari=new String[7];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<hari.length;i++)
        {
            System.out.print("Hari ke- "+(i+1)+" \t:");
            hari[i]=input.nextLine();
        }
    }
}
