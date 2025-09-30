package Multilevel;

public class Pohon extends Tumbuhan {
    int tinggi;

    public Pohon(String jenis, int tinggi) {
        super(jenis); // panggil constructor Tumbuhan
        this.tinggi = tinggi;
    }

    public void tampilkanTinggi() {
        System.out.println("Tinggi Pohon: " + tinggi + " meter");
    }
}
