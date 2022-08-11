import java.util.Random;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti, String aut, int tot, Pessoa le){
        this.titulo = ti;
        this.autor = aut;
        this.totPaginas = tot;
        this.leitor = le;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public void detalhes(){
        System.out.println("DETALHES DO LIVRO");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de Paginas: " + getTotPaginas());
        System.out.println("Pagina atual: " + getPagAtual());
        System.out.println("Livro esta aberto? " + getAberto());
        System.out.println("Leitor: " + leitor.getNome());
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear() {
        if (getAberto()){
            Random pagaleatoria = new Random();
            int pag =  pagaleatoria.nextInt(250) + 1;
            setPagAtual(pag);
            System.out.println("Chegamos à página " + getPagAtual() + ".");
        }
        else {
            System.out.println("Abra o livro antes de prosseguir!");
        }
    }

    @Override
    public void avancarPag() {
        if (getAberto() && getPagAtual() <= getTotPaginas()){
            setPagAtual(getPagAtual() + 1);
        }
        else {
            System.out.println("Abra o livro antes de prosseguir!");
        }
    }

    @Override
    public void voltarPag() {
        if (getAberto() 
        && getPagAtual() > 1 
        && getPagAtual() <= getTotPaginas()){
            setPagAtual(getPagAtual() - 1);
        }
        else {
            System.out.println("Abra o livro antes de prosseguir!");
        }
    }


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
    
}
