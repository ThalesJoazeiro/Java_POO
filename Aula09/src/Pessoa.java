public class Pessoa{
    private String nome;
    private int idade;
    private String sexo;


    public Pessoa(String no, int id, String se){
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }

    public void fazerAniver(){
        setIdade(getIdade() + 1);
        System.out.println(getNome() + " completou " + getIdade() + " anos de idade!");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String se){
        this.sexo = se;
    }
}