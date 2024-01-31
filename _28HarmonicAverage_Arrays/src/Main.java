public class Main {
    public static void main(String[] args) {
        System.out.println("        HARMONIC AVERAGE CALCULATOR         ");

        int[] list = {1,2,3,4,5,6};
        double total = 0.0 ;

        //We calculate harmonic sum.
        for (int i = 0; i < list.length ; i++){
            total = total + (1/list[i]); // 1/1 + 1/2 + 1/3 + 1/4 + 1/5
        }

        double harmonicAverage = (list.length)/total ; // 5/2.283333333333333

        System.out.println(harmonicAverage);
    }
}