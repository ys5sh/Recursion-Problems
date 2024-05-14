package Recursion.String;

import java.util.Scanner;

public class Palindrome {
    static boolean fun(String str, int low, int high){
        if (low>=high){
            return true;
        }
        if (str.charAt(low) != str.charAt(high)){
            return false;
        }
        return fun(str,low+1, high -1);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrome String in recursion");
        System.out.print("Enter the string : ");
        String str = input.nextLine();
         int low = str.length(); // start point
         int high = str.length() -1; // end point
        System.out.println("String is Palindrome (T/F) : "+ fun(str,low,high));;
    }
}
