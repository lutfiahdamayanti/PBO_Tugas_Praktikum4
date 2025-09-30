public class Melati extends Bunga {
    String aroma;

    public Melati(String warna, int jumlahKelopak, String aroma) {
        super(warna, jumlahKelopak); // panggil constructor dari Bunga
        this.aroma = aroma;
    }

    public void tampilkanAroma() {
        System.out.println("Aroma melati: " + aroma);
    }
}
