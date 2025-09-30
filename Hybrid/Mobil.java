package Hybrid;

public class Mobil extends Kendaraan {
    int kapasitas;

    public Mobil(String merk, int kapasitas) {
        super(merk);
        this.kapasitas = kapasitas;
    }

    public void infoKapasitas() {
        System.out.println("Kapasitas Penumpang: " + kapasitas);
    }
}
