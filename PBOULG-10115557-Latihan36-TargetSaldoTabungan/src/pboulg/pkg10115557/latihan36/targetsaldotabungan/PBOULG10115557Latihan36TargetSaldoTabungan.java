/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan36.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Target Saldo berbasis object
 */
public class PBOULG10115557Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoPerbulan = 0;

        Saldo tst = new Saldo();
        tst.hitungSaldoTabungan(saldoTabungan, saldoPerbulan, bunga);
        
    }
    
    
}
