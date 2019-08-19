package Java;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.isEmpty()){
            System.out.println(s.length());
            scan.close();
            System.exit(0);
        }
        String[] split = s.split("[ ,!,_,',@,\\.,\\?]+");

        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        scan.close();
    }
}
