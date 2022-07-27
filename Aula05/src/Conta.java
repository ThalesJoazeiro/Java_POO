public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public Conta () {
        this.setSaldo(0);
        this.setStatus(false);;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    public void setStatus(boolean x){
        this.status = x;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        
        if (t == "cc") {
            setSaldo(50);
        }
        else if (t == "cp") {
            setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta com dinheiro.");
        }

        else if (saldo < 0) {
            System.out.println("Conta com saldo negativo.");
        }

        else {
            setStatus(false);
        }
    }

    public void depositar(float v){
       if (status = true){
        setSaldo(getSaldo() + v);
       }

       else {
        System.out.println("Conta inativa!");
       }
    }

    public void sacar (float v){
        if (status = true){
            if (getSaldo() >0){
                setSaldo(getSaldo() - v);
            }
            
            else{
                System.out.println("Saldo insuficiente.");
            }
        }

        else{
            System.out.println("Conta inativa.");
        }
    }

    public void pagarMensal(){
        float v;
        if (getTipo() == "cc"){
            v = 12;
        }
        else{
            v = 20;
        }

        if (getStatus() == true){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
            }
            else{
                System.out.println("Impossível pagar.");
            }
        }
    }




    /* abrirConta()
       fecharConta()
       depositar()
       sacar()
       pagarMensal()
       
       todos públicos
    */
}
