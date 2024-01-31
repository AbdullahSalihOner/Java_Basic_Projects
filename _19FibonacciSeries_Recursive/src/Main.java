public class Main {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n){
        if (n == 1 || n == 2){ // base case because fib(1) = 1 and fib(2) = 1
            return  1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}