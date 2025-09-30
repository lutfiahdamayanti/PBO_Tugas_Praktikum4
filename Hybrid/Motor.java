package Hybrid;

public class Motor extends Kendaraan {
    boolean helmWajib;

    public Motor(String merk, boolean helmWajib) {
        super(merk);
        this.helmWajib = helmWajib;
    }

    public void infoHelm() {
        System.out.println("Helm Wajib: " + helmWajib);
    }
}

