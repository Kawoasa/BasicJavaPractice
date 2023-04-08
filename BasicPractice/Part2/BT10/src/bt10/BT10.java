/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhập 5 mã số sinh viên");
        for (int i = 1; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã số sinh viên thứ " + i + ": ");
            String maSV = scanner.nextLine();

            if (maSV.matches("^B127[1-9]{4}$")) {
                System.out.println("Mã số sinh viên thứ " + i + " hợp lệ!");
            } else {
                System.out.println("Mã số sinh viên thứ " + i + " không hợp lệ!");
            }
        }
    }

}
