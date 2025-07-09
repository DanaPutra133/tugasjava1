import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
    public static void main(String[] args) {
        String fileName = "contoh.txt";
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("File " + fileName + " ditemukan. Isi file:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kesalahan: File '" + fileName + "' tidak ditemukan.");
        }
    }
}