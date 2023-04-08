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
        tu = 0;
        mau = 1;
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
        tu = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        mau = scanner.nextInt();
    }

    public void xuat() {
        System.out.println(tu + "/" + mau);
    }

    public double dinhGia() {
        return (double) tu / mau;
    }
}
