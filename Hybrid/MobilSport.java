package Hybrid;

public class MobilSport extends Mobil {
    int kecepatanMaks;

    public MobilSport(String merk, int kapasitas, int kecepatanMaks) {
        super(merk, kapasitas);
        this.kecepatanMaks = kecepatanMaks;
    }

    public void infoKecepatan() {
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks + " km/h");
    }
}
