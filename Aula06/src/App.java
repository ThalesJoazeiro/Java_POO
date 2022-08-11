public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        System.out.println("Controle Padrao");
        c.ligar();
        c.maisVolume();
        c.abrirMenu();

        System.out.println("");
        System.out.println("");

        ControleDVD d = new ControleDVD();
        System.out.println("Controle Especifico DVD");
        d.ligar();
        d.maisVolume();
        d.abrirMenu();
    }
}
