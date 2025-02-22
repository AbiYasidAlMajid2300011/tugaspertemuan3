package com.abiyasidalmajid2300011.tugaspertemuan3;

import java.util.Scanner;

public class SisiKubus {

    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        int x, y, z;

        System.out.print("Masukkan sisi pertama: ");
        x = MyInput.nextInt();
        System.out.print("Masukkan sisi kedua: ");
        y = MyInput.nextInt();
        System.out.print("Masukkan sisi ketiga: ");
        z = MyInput.nextInt();

        System.out.println("Sisi: x = " + x + ", y = " + y + ", z = " + z);
        if (x == y && y == z) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
