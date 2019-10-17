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
class Saldo {
    public void hitungSaldoTabungan(int saldoTabungan, double saldoPerbulan, double bunga) {
        int i;
        for(i = 1; saldoTabungan<=6000000; i++) {
            saldoPerbulan = bunga * saldoTabungan;
            saldoTabungan = (int) (saldoTabungan + saldoPerbulan);
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoTabungan);
        }
    }
}
