/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5_Kompleks;

/**
 *
 * @author asus1
 */
public class Kucing extends HewanDarat { 
    String suara;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing: " + suara);
    }
}