import java.util.Scanner;

public class tugas3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama (while): ");
        String nama = input.nextLine();

        int i = 1;
        while (i <= 15) {
            System.out.println(nama);
            i++;
        }
    }
}
