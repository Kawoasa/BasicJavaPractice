/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt20;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        inputString = sc.nextLine();

        if (inputString.matches("^[A-Z][^\\s]{0,18}\\d$")) {
            System.out.println("Duyệt");
        } else {
            System.out.println("Không duyệt");
        }
    }
}


