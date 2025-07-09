import java.util.Scanner;

// Superclass
class Buah {
    String warna;
    String teksturDaging;
    String rasa;
    boolean mateng;
    String kegunaan;

    public Buah(String warna, String teksturDaging, String rasa,
                boolean mateng, String kegunaan) {
        this.warna = warna;
        this.teksturDaging = teksturDaging;
        this.rasa = rasa;
        this.mateng = mateng;
        this.kegunaan = kegunaan;
    }
}

// Subclass
class Apel extends Buah {
    public Apel(String warna, String teksturDaging, String rasa,
                boolean mateng, String kegunaan) {
        super(warna, teksturDaging, rasa, mateng, kegunaan);
    }

    public void setMateng() {
        if (mateng) {
            System.out.println("Mateng nih bang apelnya");
        } else {
            System.out.println("Belum mateng bang apelnya, sabar dulu");
        }
    }

    public void getTekstur() {
        switch (teksturDaging.toLowerCase()) {
            case "kasar":
                System.out.println("Tekstur daging apel kasar");
                break;
            case "halus":
                System.out.println("Tekstur daging apel halus");
                break;
            case "lembut":
                System.out.println("Tekstur daging apel lembut");
                break;
            default:
                System.out.println("Mana ada apel teksturnya gitu bang");
        }
    }

    public void masak() {
        System.out.println("Apel bisa di" + kegunaan);
    }
}

// Main Class
public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan warna apel: ");
        String warna = input.nextLine();

        System.out.print("Masukkan tekstur daging apel (kasar/halus/lembut): ");
        String teksturDaging = input.nextLine();

        System.out.print("Masukkan rasa apel: ");
        String rasa = input.nextLine();

        System.out.print("Apakah apel sudah matang? (true/false): ");
        boolean mateng = input.nextBoolean();
        input.nextLine();

        System.out.print("Masukkan kegunaan apel: ");
        String kegunaan = input.nextLine();

        Apel apelUser = new Apel(warna, teksturDaging, rasa, mateng, kegunaan);

        // Memanggil method
        System.out.println("\nNi bang info apelnya:");
        apelUser.setMateng();
        apelUser.getTekstur();
        apelUser.masak();

        input.close();
    }
}



