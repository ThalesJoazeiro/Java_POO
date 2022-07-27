public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int v){
        this.volume = v;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(boolean l){
        this.ligado = l;
    }

    public boolean getTocando(){
        return this.tocando;
    }

    public void setTocando(boolean t){
        this.tocando = t;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
        
    }

    @Override
    public void maisVolume() {
        if (getLigado()){
            setVolume(getVolume() + 1);
        }
        
    }

    @Override
    public void menosVolume() {
        if (getLigado()){
            setVolume(getVolume() - 1);
        }
    
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0){
            setVolume(0);
        }
       
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0){
            setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if (getLigado() && getTocando() == false){
            setTocando(true);
        }
        
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()){
            setTocando(false);
        }
        
    }


}
