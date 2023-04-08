/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {

    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public PhanSo cong(PhanSo ps) {
        int tuMoi = this.tu * ps.mau + this.mau * ps.tu;
        int mauMoi = this.mau * ps.mau;
        PhanSo psMoi = new PhanSo(tuMoi, mauMoi);
        return psMoi;
    }

    public PhanSo tru(PhanSo ps) {
        int tuMoi = this.tu * ps.mau - this.mau * ps.tu;
        int mauMoi = this.mau * ps.mau;
        PhanSo psMoi = new PhanSo(tuMoi, mauMoi);
        return psMoi;
    }

    public PhanSo nhan(PhanSo ps) {
        int tuMoi = this.tu * ps.tu;
        int mauMoi = this.mau * ps.mau;
        PhanSo psMoi = new PhanSo(tuMoi, mauMoi);
        return psMoi;
    }

    public PhanSo chia(PhanSo ps) {
        int tuMoi = this.tu * ps.mau;
        int mauMoi = this.mau * ps.tu;
        PhanSo psMoi = new PhanSo(tuMoi, mauMoi);
        return psMoi;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap mot so nguyen cho tu so: ");
            scanner.next();
        }
        this.tu = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Vui long nhap mot so nguyen cho mau so: ");
            scanner.next();
        }
        String input = scanner.next();
        while (input.isEmpty() || !input.matches("-?\\d+")) {
            System.out.println("Vui long nhap mot so nguyen khac 0 cho mau so: ");
            input = scanner.next();
        }
        this.mau = Integer.parseInt(input);
        while (this.mau == 0) {
            System.out.println("Mau so phai khac 0. Vui long nhap lai!");
            input = scanner.next();
            while (input.isEmpty() || !input.matches("-?\\d+")) {
                System.out.println("Vui long nhap mot so nguyen khac 0 cho mau so: ");
                input = scanner.next();
            }
            this.mau = Integer.parseInt(input);
        }
    }

    public void xuat() {
        System.out.println(tu + "/" + mau);
    }

    public double dinhGiaTri() {
        return (double) tu / mau;
    }
}
