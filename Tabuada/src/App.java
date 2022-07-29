public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraTabuada c1 = new CalculadoraTabuada();

        c1.setValor(2);
        System.out.println("Tabuada do: " + c1.getValor());
        c1.calcular();
    }
}
