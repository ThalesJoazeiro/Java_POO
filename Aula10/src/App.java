public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("TI");

        a1.setNome("Joaza");
        a1.setIdade(16);
        a1.fazerAniv();

        System.out.println(a1.toString());
        
    }
}
