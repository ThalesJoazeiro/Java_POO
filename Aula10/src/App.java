public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("TI", 1111);

        a1.setNome("Joaza");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.fazerAniv();

        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista("TI", 1152, 950.0f);

        b1.setNome("Arnaldo");
        b1.setIdade(38);
        b1.setSexo("Indefinido");
        
        System.out.println(b1.toString());
        
    }
}
