/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt15;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] code = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 5 mã số");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập vào mã thứ " + (i + 1) + ": ");
            code[i] = sc.nextLine();
            if (!code[i].matches("^00[2-5]{1}L[0-9]{4}$")) {
                System.out.println("Sai rồi!");
                return;
            }
        }
        System.out.println("Đúng rồi!");
    }
}
