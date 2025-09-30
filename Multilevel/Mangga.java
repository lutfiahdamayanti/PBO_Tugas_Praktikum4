package Multilevel;

public class Mangga extends Pohon {
    String rasa;

    public Mangga(String jenis, int tinggi, String rasa) {
        super(jenis, tinggi); // panggil constructor Pohon
        this.rasa = rasa;
    }

    public void tampilkanRasa() {
        System.out.println("Rasa Buah Mangga: " + rasa);
    }
}
