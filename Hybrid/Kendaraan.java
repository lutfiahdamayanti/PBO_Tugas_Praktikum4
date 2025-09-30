package Hybrid;

public class Kendaraan {
    String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void info() {
        System.out.println("Merk Kendaraan: " + merk);
    }
}