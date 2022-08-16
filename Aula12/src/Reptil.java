public class Reptil extends Animal{

    private String corEscama;

    public Reptil(String corEscama){
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Ovos de passáros.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nada.");
        
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
