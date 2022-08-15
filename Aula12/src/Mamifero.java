public class Mamifero extends Animal{
    
    private String corPelo;

    public Mamifero(String corPelo){
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("Correndo.");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo ração.");
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo.");
    }
}
