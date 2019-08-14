package Java;

import java.util.Scanner;

public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        int i = A.compareTo(B);
        System.out.println(i > 0 ? "Yes" : "No");

        System.out.println(toTitleCase(A) + " " + toTitleCase(B));
    }

    private static String toTitleCase(String a) {
        char[] chars = a.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);

        return String.valueOf(chars);
    }
}
