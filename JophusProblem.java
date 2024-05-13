package Recursion;

public class JophusProblem {
    static int fun(int n, int k){
        if (n == 1){
            return 1;
        }
        return (fun(n-1, k-1)*k)%n+1;
    }
    public static void main(String[] args) {
        System.out.println("Jophus Problem");
        int n = 5, k = 3;
        System.out.println(" Answer : " + fun(n, k));
    }
}
