/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5_Kompleks;

/**
 *
 * @author asus1
 */
public class main {
    public static void main (String[] args) {
        Kucing sumanto = new Kucing();
        sumanto.nama = "Sumanto Kucing Yang Jahat";
        sumanto.jenis = "Kucing Hoki";
        sumanto.suara = "Kyaaaa";
        sumanto.tinggal = "Daratan";
        
        Anjing dogy = new Anjing();
        dogy.nama = "Dogy Lucu";
        dogy.jenis = "Anjing Bulldog";
        dogy.suara = "Njegog";
        dogy.tinggal = "Daratan";
        
        sumanto.tampilkanInfo();
        dogy.tampilkanInfo();
    }
}