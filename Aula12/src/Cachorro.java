public final class Cachorro extends Mamifero {

    public Cachorro(String corPelo) {
        super(corPelo);
    }

    public void reagir(String frase){
        if (frase == "Toma comida!" || frase == "Olá!"){
            System.out.println("Abanar e latir");
            this.emitirSom();
        }
        else {
            System.out.println("Rosnar!");
        }
    }

    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        }
        else if (hora >= 18) {
            System.out.println();
        }
        else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }

    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("Abanar");
        }
        else {
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanar");
            }
        }
        else {
            if (peso < 10){
                System.out.println("Rosnar");
            }
            else {
                System.out.println("Ignorar");
            }
        }
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
