public class Dosen {
    private String nama;
    private boolean gender;
    private String matkul;
    private String Fak;
    private String nip;
    private boolean absen;


    public Dosen(String nama, String matkul, String Fak, boolean gender, String nip, boolean absen ) {
        this.nama = nama;
        this.matkul = matkul;
        this.Fak = Fak;
        this.gender = gender;
        this.nip = nip;
        this.absen = absen;
    }

    public void setabsen() {

        if (absen) {
            System.out.println("dosen masuk");
        }
        else {
            System.out.println("dosen tidak hadir");
        }
    }

    public void setmatkul() {
        switch(matkul) {
            case "kimia":
                System.out.println("dosen nya maniak bom");
                break;
            case "fisika":
                System.out.println("dosen nya pintar");
                break;
            case "mtklanjut":
                System.out.println("dosen nya serem");
                break;
            default:
                System.out.println("dosen tidak mengajar apa apa");
        }
    }

    public void setfak() {
        System.out.println("dosen itu merupakan bagian dari " + Fak + " di gunadarma dia mengajar matakuliah " + matkul);
    }


    public static void main(String[] args) {
        Dosen dosen = new Dosen("yono","mtklanjut","fakultas ilmu komunikasi", true,"123", false);
        dosen.setabsen();
        dosen.setmatkul();
        dosen.setfak();
    }

}
