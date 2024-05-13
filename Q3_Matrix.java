package Recursion;

public class Q3_Matrix {

    static int fun(int m, int n){
        if (m == 1 || n == 1){
            return 1;
        }
        return fun(m, n-1) + fun(m-1, n);
    }



    public static void main(String[] args) {
        System.out.println("Q : The matrix of way in n*m matrix ");
        int a = 4, b = 3;
        System.out.println("m*n matrix : " + fun(a, b));
    }
}

