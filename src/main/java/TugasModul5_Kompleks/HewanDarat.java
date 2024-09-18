/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5_Kompleks;

/**
 *
 * @author asus1
 */
public class HewanDarat extends Hewan {
    String tinggal;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tinggal di: " + tinggal);
    }
}
