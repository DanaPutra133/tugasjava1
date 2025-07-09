import java.util.InputMismatchException;
import java.util.Scanner;

public class Pembagianangka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Masukkan angka pertama: ");
            try {
                num1 = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: Input tidak valid. Harap masukkan angka.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            System.out.print("Masukkan angka kedua: ");
            try {
                num2 = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: Input tidak valid. Harap masukkan angka.");
                scanner.next();
            }
        }

        try {
            if (num2 == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diizinkan.");
            }
            double result = num1 / num2;
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan aritmatika: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}