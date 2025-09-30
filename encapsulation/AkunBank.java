public class AkunBank {
    private int saldo;

    // Constructor
    public AkunBank(int saldo){
        this.saldo = saldo;
    }

    // Setter
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    // Getter
    public int getSaldo(){
        return this.saldo;
    }

    // Method menabung
    public int menabung(int jumlah){
        if(jumlah > 0){
            this.saldo += jumlah;
            System.out.println("Menabung: " + jumlah);
            return this.saldo;
        } else {
            System.out.println("Jumlah tabungan tidak valid!");
            return this.saldo;
        }
    }

    // Method tarik tunai
    public void tarikTunai(int jumlah){
        if(jumlah > 0 && this.saldo >= jumlah){
            this.saldo -= jumlah;
            System.out.println("Tarik tunai berhasil sebesar: " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid!");
        }
    }
}