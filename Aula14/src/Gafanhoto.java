public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssitido;

    public Gafanhoto(String login, String nome, int idade, String sexo){
        this.login = login;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.totAssitido = 0;
    }

    public void viuMaisUm(){
        this.totAssitido ++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    public String toString(){
        return super.toString() + " Login: " + login;
    }
}
