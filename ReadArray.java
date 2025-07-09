import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args) {
        int[] numbers = {2345, 567857, 12341, 4035673, 13452456};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan indeks array yang ingin diakses (0-4): ");
        try {
            int index = scanner.nextInt();
            System.out.println("Nilai pada indeks " + index + " adalah: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan: Indeks yang Anda masukkan di luar batas array.");
            System.out.println("Indeks yang valid adalah 0 sampai " + (numbers.length - 1) + ".");
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan: Input yang Anda masukkan bukan angka. Silakan masukkan angka.");
        } finally {
            scanner.close();
        }
    }
}