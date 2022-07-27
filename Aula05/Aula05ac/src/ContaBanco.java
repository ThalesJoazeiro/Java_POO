public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status; 

    // Métodos Personalizados

    public void estadoAtual(){
        System.out.println("___________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);

        if (t == "cc"){
            this.setSaldo(50);
        }
        else if (t == "cp"){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Ainda ha dinheiro na conta.");
        }
        else if (getSaldo() < 0){
            System.out.println("Saldo negativo.");
        }
        else {
            this.setStatus(false);;
        }
    }

    public void depositar(float v){
        if (this.getStatus() == true){
            setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!");
        }
        else{
            System.out.println("Conta nao existe.");
        }
    }

    public void sacar(float v){
        if (this.getStatus() == true){
            if (this.getSaldo() >= 0){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso!");
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        }
        else {
            System.out.println("Conta inexistente.");
        }
        }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "cc"){
            v = 12;
        }
        else if (this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
        }
    }

    // Métodos Especiais
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean a){
        this.status = a;
    }
}
