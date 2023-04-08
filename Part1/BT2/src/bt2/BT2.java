/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String checkInputEmptyOrNot;
        int number;
        do {
            System.out.print("Nhập vào 1 số nguyên dạng số: ");
            checkInputEmptyOrNot = scanner.nextLine();
            if (checkInputEmptyOrNot.isEmpty()) {
                System.out.println("Hãy nhập đúng");
            } else {
                try {
                    number = Integer.parseInt(checkInputEmptyOrNot);
                    switch (number) {
                        case 0:
                            System.out.println("Không");
                            break;
                        case 1:
                            System.out.println("Một");
                            break;
                        case 2:
                            System.out.println("Hai");
                            break;
                        case 3:
                            System.out.println("Ba");
                            break;
                        case 4:
                            System.out.println("Bốn");
                            break;
                        case 5:
                            System.out.println("Năm");
                            break;
                        case 6:
                            System.out.println("Sáu");
                            break;
                        case 7:
                            System.out.println("Bảy");
                            break;
                        case 8:
                            System.out.println("Tám");
                            break;
                        case 9:
                            System.out.println("Chín");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập đúng");
                } catch (AssertionError ae){
                    System.out.println("Chỉ nhập từ 0-9");
                }
            }
        } while (true);
    }

}
