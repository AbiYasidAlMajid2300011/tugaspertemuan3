package com.abiyasidalmajid2300011.tugaspertemuan3;

import java.util.Scanner;

public class JamKerja {

    public static void main(String[] args) {
        Scanner MyInput = new Scanner(System.in);
        int JamMasuk, JamKeluar, LamaBekerja;

        System.out.print("Masukkan jam masuk: ");
        JamMasuk = MyInput.nextInt();
        System.out.print("Masukkan jam keluar: ");
        JamKeluar = MyInput.nextInt();

        if (JamKeluar >= JamMasuk) {
            LamaBekerja = JamKeluar - JamMasuk;
        } else {
            LamaBekerja = (12 - JamMasuk) + JamKeluar;
        }
        
        System.out.println("Lama Bekerja " + LamaBekerja + " Jam");
    }
}
