/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
        } else {
            System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
        }
    }
}
