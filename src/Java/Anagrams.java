package Java;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length()) {
            return false;
        }
        if (a.equalsIgnoreCase(b)) {
            return true;
        }

        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        for (int i = 0; i < aChars.length; i++) {
            for (int j = 0; j < bChars.length; j++) {
                if(aChars[i] == bChars[j]){
                    bChars[j] = ' ';
                    break;
                }
            }
        }

        if(String.valueOf(bChars).trim().isEmpty()){
            return true;
        }

        return false;
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
