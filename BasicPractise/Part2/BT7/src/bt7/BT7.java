/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }

}
