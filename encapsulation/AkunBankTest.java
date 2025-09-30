public class AkunBankTest {
    
    public static void main(String[] args) {
        AkunBank akun = new AkunBank(100000); // saldo awal 100000
        System.out.println("Saldo awal: " + akun.getSaldo());

        akun.menabung(50000);
        System.out.println("Saldo sekarang: " + akun.getSaldo());

        akun.tarikTunai(30000);
        System.out.println("Saldo sekarang: " + akun.getSaldo());

        akun.tarikTunai(200000); // gagal karena saldo kurang
        System.out.println("Saldo sekarang: " + akun.getSaldo());
    }
}