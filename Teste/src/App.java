public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[10];
        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = 12;

        int total = 0;
        for (int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }
        System.out.println(total);

        System.out.println("______________________________");
        System.out.println("");


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posicao: " + numeros[i]);

        }

        System.out.println("______________________________");
        System.out.println("");

        for (int result: numeros){
            System.out.println(result);
        }

        System.out.println("______________________________");
        System.out.println("");


        for (int i = 0; i < numeros.length; i++){
            System.out.print("Posicao: " + i);
            System.out.println("  Valor: " + numeros[i]);
        }
    } 
}
