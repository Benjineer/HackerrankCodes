/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankcodes;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int c = 0;
        for (int i = 0; i < k; i++) {
            c = a[n - 1];
            for (int j = n - 1; j > 0; j--) {

                a[j] = a[j - 1];
            }
            a[0] = c;

        }

        for (int a0 = 0; a0 < q; a0++) {
            int index = in.nextInt();
            int ans = a[index];
            System.out.println(ans);

        }

    }

}
