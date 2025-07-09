public class MainBuah_1 {
    public static void main(String[] args) {
        Apel_1 apel = new Apel_1(true);
        Mangga_1 mangga = new Mangga_1(false);
        Pisang_1 pisang = new Pisang_1(true);

        apel.deskripsi();
        apel.getTekstur();
        apel.setMateng();
        apel.masak();

        System.out.println();

        mangga.deskripsi();
        mangga.getTekstur();
        mangga.setMateng();
        mangga.masak();

        System.out.println();

        pisang.deskripsi();
        pisang.getTekstur();
        pisang.setMateng();
        pisang.masak();
    }
}

// ===== Superclass =====
class Buah_1 {
    private String warna;
    private String teksturKulit;
    private String teksturDaging;
    private String rasa;
    private boolean mateng;
    private String aroma;
    private String kegunaan;

    public Buah_1(String warna, String teksturKulit, String teksturDaging, String rasa, boolean mateng, String aroma, String kegunaan) {
        this.warna = warna;
        this.teksturKulit = teksturKulit;
        this.teksturDaging = teksturDaging;
        this.rasa = rasa;
        this.mateng = mateng;
        this.aroma = aroma;
        this.kegunaan = kegunaan;
    }

    public void setMateng() {
        if (mateng) {
            System.out.println("Buah ini sudah matang.");
        } else {
            System.out.println("Buah ini belum matang.");
        }
    }

    public void getTekstur() {
        switch (teksturDaging) {
            case "kasar":
                System.out.println("Tekstur daging buah kasar.");
                break;
            case "halus":
                System.out.println("Tekstur daging buah halus.");
                break;
            case "lembut":
                System.out.println("Tekstur daging buah lembut.");
                break;
            default:
                System.out.println("Tekstur daging buah tidak dikenal.");
        }
    }

    public void masak() {
        System.out.println("Buah ini dimasak menjadi: " + kegunaan);
    }
}

// ===== Subclass Apel =====
class Apel_1 extends Buah_1 {
    public Apel_1(boolean mateng) {
        super("Merah", "Halus", "lembut", "manis", mateng, "harum", "jus apel");
    }

    public void deskripsi() {
        System.out.println("Ini adalah buah Apel.");
    }
}

// ===== Subclass Mangga =====
class Mangga_1 extends Buah_1 {
    public Mangga_1(boolean mateng) {
        super("Hijau", "kasar", "halus", "manis-asam", mateng, "harum segar", "es buah");
    }

    public void deskripsi() {
        System.out.println("Ini adalah buah Mangga.");
    }
}

// ===== Subclass Pisang =====
class Pisang_1 extends Buah_1 {
    public Pisang_1(boolean mateng) {
        super("Kuning", "lembut", "halus", "manis", mateng, "sedap", "pisang goreng");
    }

    public void deskripsi() {
        System.out.println("Ini adalah buah Pisang.");
    }
}
