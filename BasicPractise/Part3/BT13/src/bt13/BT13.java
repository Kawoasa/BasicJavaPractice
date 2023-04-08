/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int count = sc.nextInt();
        int minResult;
        int[] n = new int[count];
        for (int i = 0; i < n.length; i++) {
            String mes = String.format("Nhập phần tử thứ [%d]: ", i + 1);
            n[i] = checkInputInt(mes);
        }
        minResult = n[0];
        for (int i = 0; i < n.length; i++) {
            if (minResult > n[i]) {
                minResult = n[i];
            }
        }
        System.out.println("Giá trị lớn nhất là: " + minResult);
    }
//check user input a number integer

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
