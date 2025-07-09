import java.util.InputMismatchException;
import java.util.Scanner;

public class InputAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        try {
            int number = scanner.nextInt();
            System.out.println("Angka yang Anda masukkan adalah: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan: Input yang Anda masukkan bukan angka. Silakan masukkan angka.");
        } finally {
            scanner.close();
        }
    }
}