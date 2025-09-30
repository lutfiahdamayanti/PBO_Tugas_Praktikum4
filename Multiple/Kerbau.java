package Multiple;

public class Kerbau implements Hewan {
    String nama;

    public Kerbau(String nama) {
        this.nama = nama;
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang memakan rumput.");
    }

    @Override
    public void tidur() {
        System.out.println(nama + " sedang tidur di padang rumput.");
    }

    public void suara() {
        System.out.println(nama + " mengeluarkan suara ngooh-ngooh.");
    }
}

