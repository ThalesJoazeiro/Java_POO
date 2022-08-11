public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Joaza", 23, "Masculino");

        p1.fazerAniver();
        
        System.out.println("");

        Livro l1 = new Livro("Seila", "Joazeiro", 200, p1);
        
        l1.abrir();
        l1.folhear();
        l1.detalhes();
    }
}
