public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado =  ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }


    // Métodos Abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        if (getLigado()){
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        
        for (int i = 10; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        }
        else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
        
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(getVolume() + 1);
        }
        else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            setVolume(getVolume() - 1);
        }
        else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
                setVolume(0);
        }   
        else{
            System.out.println("Aparelho desligado.");
        }
    } 

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            setVolume(50);
        }
        else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            setTocando(true);
        }    
        else{
            System.out.println("Aparelho desligado.");
        } 
    }

    @Override
    public void pause() {
        if (this.getLigado() && getTocando()){
            setTocando(false);
        }  
        else{
            System.out.println("Aparelho desligado.");
        }
    }
}
