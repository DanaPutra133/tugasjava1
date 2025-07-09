import java.util.Scanner;

public class tugas3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama (do-while): ");
        String nama = input.nextLine();

        int i = 1;
        do {
            System.out.println(nama);
            i++;
        } while (i <= 15);
    }
}
