public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[5];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        l[0].Status();

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        l[1].Status();

        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65F, 80.9F, 12, 2, 1);

        l[2].Status();

        l[3] = new Lutador("Arnaldo", "Irlanda do Norte", 28, 1.80f, 100.5f, 0, 10, 0);

        l[3].Status();

        Luta luta1 = new Luta();

        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
    }
}
