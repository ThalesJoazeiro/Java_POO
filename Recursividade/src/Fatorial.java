public class Fatorial {
    public int fatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * fatorial(num-1);
    }

    public int fibonacci(int x) {
        if (x < 2) {
          return x;
        }    
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}


