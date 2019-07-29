package Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        // Write your code here.
        Locale locale = new Locale("en", "IN");

        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(locale);
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormatter.format(payment));
        System.out.println("India: " + indiaFormatter.format(payment));
        System.out.println("China: " + chinaFormatter.format(payment));
        System.out.println("France: " + franceFormatter.format(payment));
    }
}
