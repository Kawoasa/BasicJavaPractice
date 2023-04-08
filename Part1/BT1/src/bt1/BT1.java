/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String InputEmptyOrNot;
        int number;
        do {
            System.out.print("Nhập số nguyên: ");
            InputEmptyOrNot = scanner.nextLine();
            if (InputEmptyOrNot.isEmpty()) {
                System.out.println("Hãy nhập số nguyên");
            } else {
                try {
                    number = Integer.parseInt(InputEmptyOrNot);
                    if (number >= 0) {
                        System.out.println("Đây là số nguyên dương");
                        break;
                    } else {
                        System.out.println("Đây là số nguyên âm");
                        break;
                    }
                } catch (NumberFormatException n) {
                    System.out.println("Hãy nhập đúng số nguyên");
                }
            }
        } while (true);

    }

}
