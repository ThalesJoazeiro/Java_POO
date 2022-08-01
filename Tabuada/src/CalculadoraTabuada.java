public class CalculadoraTabuada{
    public int valor;

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void calcular(int valor){
        setValor(valor);
        System.out.println("Tabuada do: " + getValor());
        for (int i = 0; i <= 10; i++){
            System.out.print(i + " x " + this.getValor() + " = ");
            System.out.println(i * this.getValor());
        }
    }
}