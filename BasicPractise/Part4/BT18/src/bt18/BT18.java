/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt18;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = sc.nextLine();
        if (!inputString.matches(".*\\d.*")) {
            System.out.println("Không");
            return;

        }
        System.out.println("Có");
    }

}
