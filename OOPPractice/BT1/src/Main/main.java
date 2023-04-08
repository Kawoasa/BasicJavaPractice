/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import model.PhanSo;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        
        System.out.println("Nhap phan so 1:");
        ps1.nhap();
        System.out.println("Nhap phan so 2:");
        ps2.nhap();
        System.out.println("Phan so 1: ");
        ps1.xuat();
        System.out.println("Phan so 2: ");
        ps2.xuat();

        PhanSo psTong = ps1.cong(ps2);
        System.out.print("Tong hai phan so: ");
        psTong.xuat();

        PhanSo psHieu = ps1.tru(ps2);
        System.out.print("Hieu hai phan so: ");
        psHieu.xuat();

        PhanSo psTich = ps1.nhan(ps2);
        System.out.print("Tich hai phan so: ");
        psTich.xuat();

        PhanSo psThuong = ps1.chia(ps2);
        System.out.print("Thuong hai phan so: ");
        psThuong.xuat();
    }
}
