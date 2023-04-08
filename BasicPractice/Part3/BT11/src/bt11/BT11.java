/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int count = sc.nextInt();
        int[] n = new int[count];
        double result = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            result += n[i];
        }
        System.out.println("Giá trị trung bình là: " + (result/2));
    }

}
