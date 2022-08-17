public class App {
    public static void main(String[] args) throws Exception {
        Gafanhoto g1 = new Gafanhoto("john", "Joaza", 23, "M");

        System.out.println(g1.toString()); 

        Video v1 = new Video("Aula14");

        Visualizacao vis = new Visualizacao(g1, v1);

        System.out.println(vis.toString());
        
    }   
}