/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.appbangundatar;

/**
 *
 * @author Kurnia R. Putra
 */
public class MainApp {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setNamaBangunDatar("Persegi Panjang");
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(5);
        System.out.println("Nama: " + persegiPanjang.getNamaBangunDatar());
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());
    }
}
