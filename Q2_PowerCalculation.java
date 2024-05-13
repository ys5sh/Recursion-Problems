package Recursion;

public class Q2_PowerCalculation {
    static int fun(int a, int b){
        if ( b == 0) {
            return 1;
        }
        return fun(a, b-1) *a;

    }
    public static void main(String[] args) {
        System.out.println("Q : Calculate a^b using recursion");
        int a = 2, b = 4;
        System.out.println("2^4 power is : " + fun(a, b));
    }
}
