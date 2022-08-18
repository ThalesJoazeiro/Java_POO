import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String teste = new String("Testando strings");
        String teste2 = new String("Testando Strings");
        String teste3 = new String("Testando");

        /*Comparação de Strings*/
        System.out.println(teste.equals(teste2));
        System.out.println(teste2.equals(teste3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println("");

        /*Concatenação com +=
          Há também o .concat
        */
        teste += "!";
        System.out.println(teste);
        System.out.println("");

        /*Verificando palavra final e inicial de uma String*/
        System.out.println(teste.endsWith("!"));
        System.out.println(teste.startsWith("Testando"));
        System.out.println("");

        System.out.println("O arnaldo e \nfoda!");
        System.out.println("Ola \t Joazeiro");
        System.out.println("\"Bons habitos ajudam voce a se tornar quem voce quer ser... e maus habitos vao devagarinho transformando voce em quem voce nao quer ser.\"");
        System.out.println("");

        /*Verificando qual caracter ocupa o indice passado por parâmetro*/
        System.out.println(teste.charAt(1));
        /*Verificando qual indice é ocupado pelo caracter passado por parâmetro*/
        System.out.println(teste.indexOf("s"));
        /*Verificando qual indice é ocupado pela palavra passado por parâmetro*/
        System.out.println(teste.indexOf("strings"));
        /*Verificando qual o últimno indice ocupado pelo caracter passado por parâmetro*/
        System.out.println(teste.lastIndexOf("s"));;
        System.out.println("");

        /*Substitui a palavra ou letra passada por parâmetro*/
        System.out.println(teste.replace("s", "S"));
        System.out.println(teste.replace("Testando", "Utilizando"));
        System.out.println("");

        /*Faz a contagem de strings a partir da quebra passada por parâmetro, neste caso o " "*/
        System.out.println(teste.split(" ").length);
        /*Imprime as strings a partir da quebra passada por parâmetro, neste caso o " "*/
        System.out.println(Arrays.toString(teste.split(" ")));
        System.out.println("");

        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println("");

        /*Imprime as strings a partir do indice inicial e indice final passados por parâmetro*/
        System.out.println(teste.substring(0, 4));
        /*Imprime as strings a partir do indice inicial passado por parâmetro*/
        System.out.println(teste.substring(4));

      }
}
