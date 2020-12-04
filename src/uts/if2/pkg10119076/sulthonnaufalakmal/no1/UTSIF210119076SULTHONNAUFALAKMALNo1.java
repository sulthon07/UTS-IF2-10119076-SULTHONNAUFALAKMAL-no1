/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119076.sulthonnaufalakmal.no1;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal\
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Tandanya Kamu
 */
public class UTSIF210119076SULTHONNAUFALAKMALNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Age age = new Age (2018);
        System.out.print(" Masukkan Tahun Lahir Anda : ");
        int tahunLahir = scanner.nextInt();
        age.setYearBirth(tahunLahir);
        
        System.out.println();
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari Ini Tahun : " + age.getYearNow());
        System.out.println("Umur Kamu Sampai Hari Ini Adalah : " + age.hitungUmur() + "Tahun");
        System.out.println("Tandanya Kamu : " + age.tandanyaKamu(age.hitungUmur()));
        
        
    }
    
}
