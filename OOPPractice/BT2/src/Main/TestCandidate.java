/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import model.Candidate;

/**
 *
 * @author Admin
 */
public class TestCandidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng thí sinh n
        System.out.print("Enter number of candidates: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Candidate[] candidates = new Candidate[n];

        // Nhập thông tin cho các thí sinh
        for (int i = 0; i < n; i++) {
            System.out.println("Candidate " + (i+1) + ": ");
            System.out.print("Enter code: ");
            String code = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter date of birth: ");
            String dob = scanner.nextLine();

            System.out.print("Enter math score: ");
            float mathScore = scanner.nextFloat();

            System.out.print("Enter literature score: ");
            float literatureScore = scanner.nextFloat();

            System.out.print("Enter English score: ");
            float englishScore = scanner.nextFloat();

            candidates[i] = new Candidate(code, name, dob, mathScore, literatureScore, englishScore);
            scanner.nextLine(); // Đọc bỏ dấu Enter sau khi nhập điểm
        }

        // In ra thông tin các thí sinh có tổng điểm lớn hơn 15
        System.out.println("Candidates with total score greater than 15: ");
        for (Candidate candidate : candidates) {
            if (candidate.getTotalScore() > 15) {
                System.out.println(candidate.toString());
            }
        }
    }
}
