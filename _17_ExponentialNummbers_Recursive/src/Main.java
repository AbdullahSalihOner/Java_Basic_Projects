public class Main {
    public static void main(String[] args) {
        System.out.println("           EXPONENTIAL CALCULATOR RECURSIVE          ");

        System.out.println(exponential(9,2));
    }

    static int result = 1; // global variable for recursive method

    static  int exponential(int a , int b){
        if (b == 0) return 1 ;

        result = result * a;
        exponential(a , b-1);

        return result;
    }
}