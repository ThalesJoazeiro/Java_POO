public class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    public void Apresentar(){

    }

    public void Status(){

    }

    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatarLuta(){

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float al){
        this.altura = al;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float pe){
        this.peso = pe;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setDerrotas(int de){
        this.derrotas = de;
    }

    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int em){
        this.empates = em;
    }
}