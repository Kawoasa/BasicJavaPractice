/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mess = String.format("Nhập n: ");
        int count = checkInputInt(mess);
        int maxResult;
        int[] n = new int[count];
        for (int i = 0; i < n.length; i++) {
            String mes = String.format("Nhập phần tử thứ [%d]: ", i + 1);
            n[i] = checkInputInt(mes);
        }
        maxResult = n[0];
        for (int i = 0; i < n.length; i++) {
            if (maxResult < n[i]) {
                maxResult = n[i];
            }
        }
        System.out.println("Giá trị lớn nhất là: " + maxResult);
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
                System.out.println("Hãy nhập số nguyên dương");
                continue;
            }

            try {
                result = Double.parseDouble(input);
                if ((int) result < 0) {
                    throw new Exception();
                }
                if ((int) result != result) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Hãy nhập số nguyên dương");
            } catch (Exception e) {
                System.out.println("Hãy nhập số nguyên dương");
            }
        }

        return (int) result;
    }

}
