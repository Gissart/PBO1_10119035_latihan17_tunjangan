package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung hasil tunjangan


public class tunjangan {
    public static void tunjangan(String menikah, int gaji){
        tampil(gaji,((menikah.equals("sudah")) ? gaji * 0.35 : 0));
    }

    public static void tampil(int gaji, double tunjangan){
        System.out.println("==========Hasil Perhitungan gaji anda==========");
        System.out.println("Gaji pokok \t\t: Rp "+gaji);
        System.out.println("Tunjangan \t\t: Rp "+tunjangan);
        System.out.println("Total Gaji \t\t: Rp "+(gaji+tunjangan));


    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda? Rp ");
        int gaji = scanner.nextInt();
        System.out.print("Apakah anda sudah menikah? (sudah/belum) : ");
        String menikah = scanner.next();
        tunjangan(menikah,gaji);
    }

}

