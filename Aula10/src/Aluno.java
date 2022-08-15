public class Aluno extends Pessoa{
    protected boolean matr;
    protected String curso;
    protected int nummat;

    public Aluno(String curso, int nummat) {
        this.curso = curso;
        this.nummat = nummat;
        this.matr = true;
    }

    public void cancelarMatr(){
        setMatr(false);
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
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

    public int getNummat() {
        return nummat;
    }

    public void setNummat(int nummat) {
        this.nummat = nummat;
    }
}
