import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList cesta  = new ArrayList();

        int valor = 10;
        double saldo = 100.5;
        int valor3;

        cesta.add("Cebola");
        cesta.add(valor);
        cesta.add(saldo);

        System.out.println(cesta.get(1));
        System.out.println("");


        /*Pode se usar também Set e HashSet 
          A interface Set não permite indices duplicados.
          Set<String> cesta = new HashSet<String>();
        */
        List<String> carrinho = new ArrayList<String>();

        System.out.println("Carrinho esta vazio? " + carrinho.isEmpty());

        carrinho.add("Tomate");
        carrinho.add("Cenoura");
        carrinho.add("Tomilho");
        carrinho.add("Tomate");
        carrinho.set(2, "Batata");
        carrinho.remove(0);

        System.out.println("Carrinho esta vazio? " + carrinho.isEmpty());
        System.out.println("Quantidade de itens no carrinho: " + carrinho.size());
        System.out.println("Item na posicao 2: " + carrinho.get(2));
        System.out.println("Contem tomate no carrinho? " + carrinho.contains("Tomate"));
        System.out.println("Primeira posicao do tomate no carrinho: " + carrinho.indexOf("Tomate"));
        System.out.println("Ultima posicao do tomate no carrinho: " + carrinho.lastIndexOf("Tomate"));
        System.out.println(carrinho.get(carrinho.indexOf("Tomate")));
        System.out.println("");

        Map<String, String> caixa = new HashMap<String, String>();

        caixa.put("M2225", "Fernando");
        caixa.put("M2226", "Maria");
        caixa.put("M2227", "Soraya");

        System.out.println("Caixa esta vazia? " + caixa.isEmpty());
        System.out.println("Quantidade de itens na caixa: " + caixa.size());
        System.out.println(caixa.containsKey("M2225"));
        System.out.println(caixa.containsValue("Fernando"));
        System.out.println(caixa);
    }
}
