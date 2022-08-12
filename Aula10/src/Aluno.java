public class Aluno extends Pessoa{
    private boolean matr;
    private String curso;

    public Aluno(String curso) {
        this.curso = curso;
        this.matr = true;
    }

    public void cancelarMatr(){
        setMatr(false);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }
}
