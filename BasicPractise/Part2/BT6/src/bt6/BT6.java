/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên dương: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.print(i);
                if (n % 2 == 0 && i != n) {
                    System.out.print(" + ");
                }
                if (n % 2 != 0 && i != n - 1) {
                    System.out.print(" + ");
                }

            }
        }
        System.out.println(" = " + sum);
    }

}
