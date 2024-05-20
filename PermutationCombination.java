package Recursion.String;

import java.util.Scanner;

public class PermutationCombination {
    public static void swap(char[] arr, int idx, int idx2) {
        char temp = arr[idx];
        arr[idx] = arr[idx2];
        arr[idx2] = temp;

    }
    public static void permutationFun(char[] arr, int idx){
        if (idx == arr.length-1){
            System.out.println(String.valueOf(arr) + " ");
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            permutationFun(arr,idx+1);
            swap(arr, idx, i);
        }

    }
    public static void main(String[] args) {
        System.out.println("Q : Print all permutation combination of given string");
        System.out.print("\n Enter the string to generate permutation : ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        permutationFun(str.toCharArray(),0);

    }
}
