/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class BT16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = sc.nextLine();
        
        System.out.print("Nhập vào ký tự muốn kiểm tra:");
        char inputChar = sc.nextLine().charAt(0);
        
        Pattern pattern = Pattern.compile(String.valueOf(inputChar), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputString);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Có");
        } else {
            System.out.println("Không tồn tại trong chuỗi");
        }
    }
}
