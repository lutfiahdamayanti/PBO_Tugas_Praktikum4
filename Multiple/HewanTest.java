package Multiple;

public class HewanTest {

    public static void main(String[] args) {
        AnakKerbau anakKerbau = new AnakKerbau("Besi", 6);

        // Method dari Kerbau (parent)
        anakKerbau.makan();
        anakKerbau.tidur();
        anakKerbau.suara();

        // Method khusus AnakKerbau
        anakKerbau.infoAnakKerbau();
    }
}