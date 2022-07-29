public class CalculadoraTabuada{
    public int valor;

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void calcular(){
        setValor(valor);
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " x " + this.getValor() + " = ");
            System.out.println(i * this.getValor());
        }
    }
}