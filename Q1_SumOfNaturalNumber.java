package Recursion;


import java.util.Scanner;
public class Q1_SumOfNaturalNumber {
    static int sum(int num){
        if (num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("Find the sum of all natural number using recursion");
        System.out.print("Enter the natural number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Total of all natural number : "+sum(num));
        input.close();
    }
}
