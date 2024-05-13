package Recursion;


import java.util.Scanner;

class Basic {

    static void printHello(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println("Hello");
        printHello(num - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prints: ");
        int num = input.nextInt();
        printHello(num);
        input.close();
    }
}
