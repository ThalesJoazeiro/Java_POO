import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() 
        && (l1 != l2)){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }
        else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){
        if (getAprovada()){
            System.out.println("");
            this.desafiado.Apresentar();
            System.out.println("");
            this.desafiante.Apresentar();
            
            Random aleatorio = new Random();
            int vencedor =  aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                System.out.println("");
                System.out.println("Empate!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;
                case 1:
                System.out.println("");
                System.out.println("Desafiado ganhou!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
                case 2: 
                System.out.println("");
                System.out.println("Desafiante ganhou!");
                desafiado.perderLuta();
                desafiante.ganharLuta();
                break;
            }
                
        }
        else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }
}
