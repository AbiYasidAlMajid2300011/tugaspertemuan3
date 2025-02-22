package com.abiyasidalmajid2300011.tugaspertemuan3;

import java.util.Scanner;

public class VokalKonsonan {

    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        char a, b, c;

        System.out.print("Masukkan karakter pertama: ");
        a = MyInput.next().charAt(0);
        System.out.print("Masukkan karakter kedua: ");
        b = MyInput.next().charAt(0);
        System.out.print("Masukkan karakter ketiga: ");
        c = MyInput.next().charAt(0);

        if (!Character.isLetter(a) || !Character.isLetter(b) || !Character.isLetter(c) || Character.isUpperCase(a) || Character.isUpperCase(b) || Character.isUpperCase(c)) {
            System.out.println("Tolong hanya masukkan huruf kecil(a-z).");
        } else {
            boolean konsonan1 = (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u');
            boolean vokal = (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u');
            boolean konsonan2 = (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u');

            System.out.println("Karakter yang Anda masukkan: " + a + " - " + b + " - " + c);
            if (konsonan1 && vokal && konsonan2) {
                System.out.println("Karakter sesuai pola Konsonan-Vokal-Konsonan.");
            } else {
                System.out.println("Karakter tidak sesuai pola Konsonan-Vokal-Konsonan.");
            }
        }
    }
}
