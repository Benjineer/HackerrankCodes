package Java;

import java.util.Scanner;

public class AnagramsByBitManipulation {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
        {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        // To store the xor value
        int value = 0;

        for (int i = 0; i < a.length(); i++)
        {
            value = value ^ (int) a.charAt(i);
            value = value ^ (int) b.charAt(i);
        }

        return value == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
