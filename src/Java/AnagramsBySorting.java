package Java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsBySorting {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equalsIgnoreCase(b)) {
            return true;
        }
        char[] aa = a.toCharArray();
        char[] ba = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(ba);

        return Arrays.equals(aa, ba);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
