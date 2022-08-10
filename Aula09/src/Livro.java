public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String ti){
        this.titulo = ti;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String au){
        this.autor = au;
    }

    public int getTotPaginas(){
        return this.totPaginas;
    }

    public void setTotPaginas(int tot){
        this.totPaginas = tot;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int pag){
        this.pagAtual = pag;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    public void setAberto(boolean ab){
        this.aberto = ab;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setLeitor(Pessoa le){
        this.leitor = le;
    }

    @Override
    public void abrir() {

        
    }

    @Override
    public void fechar() {

        
    }

    @Override
    public void folhear() {

        
    }

    @Override
    public void avancarPag() {

        
    }

    @Override
    public void voltarPag() {

        
    }
    
}
