package TugasArray1;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca string dari user
        System.out.print("Masukkan Kata: ");
        String str = scanner.nextLine();

        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " adalah palindrome");
        } else {
            System.out.println(str + " ini bukanlah polindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("[\\s\\p{Punct}]", ""); // Menghapus spasi dan tanda baca
        char[] chars = str.toCharArray();
        int n = chars.length;

        // Membandingkan setiap karakter dari depan dan belakang
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != chars[n - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}

