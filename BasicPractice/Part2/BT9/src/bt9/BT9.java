/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n(n <= 20 ): ");
        int n = sc.nextInt();
        int Fibo = calFibo(n);
        if (n == 0 || n == 1) {
            System.out.println("Fi(" + n + ") = " + Fibo);
            return;
        }        
        System.out.println("Fi(" + n + ") = " + "Fi(" + (n - 2) + ") + Fi(" + (n - 1) + ") = " + Fibo);
        
    }
    
    static int calFibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return calFibo(n - 1) + calFibo(n - 2);
    }
    
}
