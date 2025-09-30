package Multiple;

public class AnakKerbau extends Kerbau {
    int umur;

    public AnakKerbau(String nama, int umur) {
        super(nama); // panggil constructor Kerbau
        this.umur = umur;
    }

    public void infoAnakKerbau() {
        System.out.println("Umur Anak Kerbau: " + umur + " bulan");
    }
}
