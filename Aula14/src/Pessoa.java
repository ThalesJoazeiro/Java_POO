public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    protected void ganharExp(){
        this.experiencia ++; 
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo;
    }
}
