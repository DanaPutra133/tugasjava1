import java.util.Scanner;

public class tugas2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // perteamabahan
        System.out.println("=== Penjumlahan ===");
        System.out.print("masukan angka-1: ");
        int nilai1tambah = input.nextInt();
        System.out.print("masukan angka-2: ");
        int nilai2tambah = input.nextInt();
        int hasiltambah = nilai1tambah + nilai2tambah;
        System.out.println("Hasil = " + hasiltambah + "\n");

        // pengurangan
        System.out.println("=== Pengurangan ===");
        System.out.print("masukan angka-1: ");
        int nilai1kurang = input.nextInt();
        System.out.print("masukan angka-2: ");
        int nilai2kurang = input.nextInt();
        int hasilKurang = nilai1kurang - nilai2kurang;
        System.out.println("Hasil = " + hasilKurang + "\n");

        // Perkalian
        System.out.println("=== Perkalian ===");
        System.out.print("masukan angka-1: ");
        int nilai1kali = input.nextInt();
        System.out.print("masukan angka-2: ");
        int nilai2kali = input.nextInt();
        int hasilKali = nilai1kali * nilai2kali;
        System.out.println("Hasil = " + hasilKali + "\n");

        // Pembagian
        System.out.println("=== Pembagian ===");
        System.out.print("masukan angka-1: ");
        int nilai1bagi = input.nextInt();
        System.out.print("masukan angka-2: ");
        int nilai2bagi = input.nextInt();
        int hasilBagi = nilai1bagi / nilai2bagi;
        System.out.println("Hasil = " + hasilBagi + "\n");

        // Modulus
        System.out.println("=== Modulus (sisa bagi) ===");
        System.out.print("masukan angka-1: ");
        int nilai1mod = input.nextInt();
        System.out.print("masukan angka-2: ");
        int nilai2mod = input.nextInt();
            int hasilMod = nilai1mod % nilai2mod;
            System.out.println("Hasil = " + hasilMod);
        input.close();
    }
}

