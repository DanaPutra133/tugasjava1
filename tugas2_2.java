import java.util.Scanner;

public class tugas2_2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input angka dari user
        System.out.print("masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("masukkan angka kedua: ");
        int b = input.nextInt();

        // === operator matematika ===
        System.out.println("\n=== operator matematika ===");
        System.out.println("penjumlahan: " + (a + b));
        System.out.println("pengurangan: " + (a - b));
        System.out.println("perkalian: " + (a * b));
        System.out.println("pemmbagian: " + (b != 0 ? a / b : "Error: bagi 0"));
        System.out.println("modules: " + (b != 0 ? a % b : "Error: modulus 0"));

        // === operator perbandingan ===
        System.out.println("\n=== operator perbandingan ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // === operator logika ===
        System.out.println("\n=== operator logika ===");
        System.out.println("kedua angka positif? " + (a > 0 && b > 0));

        // === operator penugasan ===
        int c = a;
        c += b;
        System.out.println("\n=== operator penugasan ===");
        System.out.println("Hasil dari c = a lalu c += b: " + c);

        // === operator ternary ===
        System.out.println("\n=== operator ternary ===");
        String lebihBesar = (a > b) ? "a lebih besar" : (a < b) ? "b lebih besar" : "keduanya sama";
        System.out.println("siapa lebih besar? " + lebihBesar);

        input.close();
    }
}
