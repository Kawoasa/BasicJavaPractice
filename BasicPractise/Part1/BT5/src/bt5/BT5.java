/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt5;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class BT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã số sinh viên: ");
        String maSV = scanner.nextLine();

        if (maSV.matches("^B[1-9]{7}$")) {
            System.out.println("Mã số sinh viên hợp lệ!");
        } else {
            System.out.println("Mã số sinh viên không hợp lệ!");
        }
    }

}
