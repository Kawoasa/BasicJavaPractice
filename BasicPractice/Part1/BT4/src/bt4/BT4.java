/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("Ba số là 3 cạnh của 1 tam giác vuông");
        } else {
            System.out.println("Ba số không phải là 3 cạnh của 1 tam giác vuông");
        }
    }

}
