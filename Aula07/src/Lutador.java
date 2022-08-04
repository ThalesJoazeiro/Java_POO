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
        System.out.println("LUTADOR");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Data de nascimento: " + (2022 - this.getIdade()));
        System.out.println(this.getPeso() + " KGs");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void Status(){
        System.out.println("");
        System.out.println(this.getNome());
        System.out.println("E um lutador da categoria " + this.getCategoria() + ".");
        System.out.println("Possuindo " + this.getVitorias() + " vitorias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
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
        this.setCategoria();
        }
    

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
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