/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikumpbo_5;

/**
 *
 * @author asus1
 */
public class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        System.out.println("==========");
        super.tampilkanInfo();
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}
