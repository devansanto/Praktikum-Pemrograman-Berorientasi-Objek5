/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praktikumpbo_5;

/**
 *
 * @author asus1
 */
public class PraktikumPBO_5 {

    public static void main(String[] args) {
       Mobil mobil = new Mobil();
       mobil.nama = "Toyota";
       mobil.kecepatan = 180;
       mobil.jumlahPintu = 4;
       mobil.tampilkanInfo();
       
       SepedaMotor motor = new SepedaMotor();
       motor.nama = "Yamaha";
       motor.kecepatan = 120;
       motor.jenisMesin = "2-tak";
       motor.tampilkanInfo();
    }
}
