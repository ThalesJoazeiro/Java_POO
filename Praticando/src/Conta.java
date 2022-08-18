public class Conta {
    private int numero;
    private float saldo;
    private String nome;

    public Conta(int numero, float saldo, String nome){
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + numero + " Saldo: " + saldo + " Nome: " + nome;
    }
}