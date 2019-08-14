package Java;

import java.util.Objects;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rs = new StringBuilder(A).reverse().toString();
        if(Objects.equals(A, rs)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
