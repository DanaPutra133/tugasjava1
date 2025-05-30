public class Buah {
    private String warna;
    private String teksturKulit;
    private String teksturDaging;
    private String rasa;
    private boolean mateng;
    private String aroma;
    private String kegunaan;

    /* ini  constructor */
    public Buah(String warna, String teksturKulit, String teksturDaging, String rasa, boolean mateng, String aroma, String kegunaan) {
        this.warna = warna;
        this.teksturKulit = teksturKulit;
        this.teksturDaging = teksturDaging;
        this.rasa = rasa;
        this.mateng = mateng;
        this.aroma = aroma;
        this.kegunaan = kegunaan;
    }

    /* method pertama menggunakan if else  */

    public void setmateng() {

        if (mateng) {
            System.out.println("Apel ini sudah mateng cuyyy");
        }
        else {
            System.out.println("belum mateng bang jangan di petik");
        }
    }

    /* select case  */

    /* method masak */

    public void gettekstur() {
        switch(teksturDaging) {
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
                System.out.println("Tekstur daging apel tidak dikenal");
        }
    }

    public void masak() {
        System.out.println("Apel dibuat menjadi " + kegunaan);
    }


    public static void main(String[] args) {
        Buah apel1 = new Buah("merah", "halus", "kasar", "manis", true, "harum", "rujak");
        apel1.gettekstur();
        apel1.setmateng();
        apel1.masak();
    }
}
