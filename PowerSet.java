package Recursion.String;

public class PowerSet {
    static void funPowerSet(String str, int i, String curr) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        funPowerSet(str, i + 1, curr + str.charAt(i));
        funPowerSet(str, i + 1, curr);
    }

    public static void main(String[] args) {
        System.out.println("PowerSet of given string");
        String str = "abc";
        int i = 0;
        String curr = "";
        System.out.println("The power Set of the string is : ");
        funPowerSet(str, i, curr);
    }
}
