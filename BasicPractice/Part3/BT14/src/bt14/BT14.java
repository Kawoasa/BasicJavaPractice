/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int count = sc.nextInt();
        int[] n = new int[count];
        for (int i = 0; i < n.length; i++) {
            String mes = String.format("Nhập phần tử thứ [%d]: ", i + 1);
            n[i] = checkInputInt(mes);
        }
        //In ra mảng ban đầu
        System.out.println("Mảng trước khi đảo ngược: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        //Đảo ngược mảng
        for (int i = 0; i < n.length / 2; i++) {
            int reverse;
            reverse = n[i];
            n[i] = n[count - i - 1];
            n[count - i - 1] = reverse;
        }
        //In ra mảng sau khi đảo ngược
        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }

    static int checkInputInt(String mes) {
        Scanner sc = new Scanner(System.in);
        String input;
        double result;
        //loop until user input correct
        while (true) {
            System.out.print(mes);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Hãy nhập số nguyên");
                continue;
            }

            try {
                result = Double.parseDouble(input);

                if ((int) result != result) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Hãy nhập số nguyên");
            } catch (Exception e) {
                System.out.println("Hãy nhập số nguyên");
            }
        }

        return (int) result;
    }
}
