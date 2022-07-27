public class App {
    public static void main(String[] args) throws Exception {
        Conta p1 = new Conta();

        p1.setNumConta(111);
        p1.setDono("Joaza");
        p1.abrirConta("cc");
        p1.estadoAtual();
    }
}
