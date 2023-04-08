/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class BT19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String inputString = sc.nextLine();

        char inputChar = 'a';
        int count = 0;
        Pattern pattern = Pattern.compile(String.valueOf(inputChar), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputString);
        boolean matchFound = matcher.find();
        if (matchFound) {
            char charArray[] = inputString.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (inputChar == charArray[i]) {
                    count++;
                }
            }
            System.out.println("Kí tự 'a' xuất hiện " + count + "lần");
        } else {
            System.out.println("Không tồn tại trong chuỗi");
        }
    }

}
