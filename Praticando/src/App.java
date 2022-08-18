public class App {
    public static void main(String[] args) throws Exception {
         Conta c[] = new Conta[2];

         c[0] = new Conta(1111, 15.5f, "Chuck");
         c[1] = new Conta(2222, 31, "John");

         for(int i=0; i < c.length; i++){
            System.out.println(c[i].toString());
         }

    }
}
