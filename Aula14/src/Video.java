public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if (this.reproduzindo == false){
            this.reproduzindo = true;
            this.views ++;
            System.out.println("Reproduzindo vídeo!");
        }
        else {
            System.out.println("Video ja esta sendo reproduzido.");
        }
    }

    @Override
    public void pause() {
        if(this.reproduzindo == true){
            this.reproduzindo = false;
            System.out.println("Video pausado!");
        }
        else {
            System.out.println("Video já esta pausado.");
        }
    }

    @Override
    public void like() {
        this.curtidas ++;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
