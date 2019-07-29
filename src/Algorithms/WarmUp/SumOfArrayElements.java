/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.WarmUp;

/**
 *
 * @author Benjineer
 */
public class SumOfArrayElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arraySize = 6;
//        arraySize = in.nextInt();
        String arrayElements = "1 2 3 4 10 11";
//        arrayElements = in.next();
        String[] stringArray = arrayElements.split(" ");
        int sum = 0;
        for (String string : stringArray) {
            sum = sum + Integer.parseInt(string);
        }
        System.out.println(sum);

    }

}
