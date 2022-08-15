public final class Cachorro extends Mamifero {

    public Cachorro(String corPelo) {
        super(corPelo);
    }

    public final void enterrarOsso(){
        System.out.println("Enterrando osso.");
    }

    public final void abanarRabo(){
        System.out.println("Abanando rabo.");
    }

    @Override
    public final void alimentar() {
        System.out.println("Comendo ração.");
    }

    @Override
    public final void emitirSom() {
        System.out.println("Latindo.");
    }

    @Override
    public final void locomover() {
        System.out.println("Correndo.");
    }

    
    
}
