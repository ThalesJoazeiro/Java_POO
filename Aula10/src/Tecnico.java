public class Tecnico extends Aluno{

    private int registroprofi;

    public Tecnico(String curso, int nummat) {
        super(curso, nummat);
    }

    public void praticar(){
        System.out.println(this.nome + " praticando!");
    }

    public int getRegistroprofi() {
        return registroprofi;
    }

    public void setRegistroprofi(int registroprofi) {
        this.registroprofi = registroprofi;
    }
    
}
