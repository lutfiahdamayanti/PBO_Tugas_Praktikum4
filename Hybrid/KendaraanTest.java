package Hybrid;

public class KendaraanTest {

    public static void main(String[] args) {
        // Single + Multilevel
        MobilSport ferrari = new MobilSport("Ferrari", 2, 350);
        ferrari.info();
        ferrari.infoKapasitas();
        ferrari.infoKecepatan();

        System.out.println("----------------");

        // Hierarchical
        Motor honda = new Motor("Honda", true);
        honda.info();
        honda.infoHelm();
    }
}
