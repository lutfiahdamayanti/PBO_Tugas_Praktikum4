public class Bunga {
    String warna;
    int jumlahKelopak;

    public Bunga(String warna, int jumlahKelopak) {
        this.warna = warna;
        this.jumlahKelopak = jumlahKelopak;
    }

    public void tampilkanInfo() {
        System.out.println("Bunga berwarna " + warna);
        System.out.println("Jumlah kelopak: " + jumlahKelopak);
    }
}
