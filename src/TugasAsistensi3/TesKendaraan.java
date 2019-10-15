/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TesKendaraan {
    public static void main ( String [] args){
        
        Scanner input = new Scanner (System.in);
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("PILIHAN");
        System.out.println("1. MOBIL");
        System.out.println("2. SEPEDA MOTOR");
        KendaraanClass k1 = new KendaraanClass();
        Mobil m1 = new Mobil();
        SepedaMotor s1 = new SepedaMotor();
        
        System.out.println();
        System.out.print("Memasukkan pilihan : ");
  
        int pilihan = masuk.nextInt();
        switch (pilihan) {

            case 1:
                System.out.println("");
                System.out.println("MOBIL");

                System.out.print("Masukkan Id Kendaraan\t\t: ");
                int id1 = masuk.nextInt();
                m1.setIdKendaraan(id1);

                System.out.print("Masukkan Nama Kendaraan\t\t: ");
                String na1 = masuk.next();
                m1.setNamaKendaraanM(na1);

                System.out.print("Masukkan Tipe Kendaraan\t\t: ");
                String t1 = masuk.next();
                m1.setTipeKendaraanM(t1);

                System.out.print("Masukkan Kapasitas Mesin\t: ");
                int k = masuk.nextInt();
                m1.setKapasitasMesinM(k);

                System.out.print("Masukkan Bahan Bakar Kendaraan\t: ");
                float b1 = masuk.nextFloat();
                k1.setBahanBakar(b1);

                System.out.print("Masukkan Jarak Tempuh Awal\t: ");
                float ja1 = masuk.nextFloat();
                k1.setJarakTempuhAwal(ja1);

                System.out.print("Masukkan Jarak Tempuh Kendaraan\t: ");
                float jt1 = masuk.nextFloat();
                k1.setJarakTempuh(jt1);  
                
                System.out.println("============================================");
                
                System.out.println("DATA MOBIL");

                System.out.println("");
                
                m1.infoKendaraan();
                k1.infoKendaraan();

                break;

            case 2:
                System.out.println("");
                System.out.println("SEPEDA MOTOR");

                System.out.print("Masukkan Id Kendaraan\t\t: ");
                int id2 = masuk.nextInt();
                s1.setIdKendaraan(id2);

                System.out.print("Masukkan Nama Kendaraan\t\t: ");
                String na2 = masuk.next();
                s1.setNamaKendaraanSM(na2);

                System.out.print("Masukkan Tipe Kendaraan\t\t: ");
                String t2 = masuk.next();
                s1.setTipeKendaraanSM(t2);

                System.out.print("Masukkan Bahan Bakar Kendaraan\t: ");
                float b2 = masuk.nextFloat();
                k1.setBahanBakar(b2);

                System.out.print("Masukkan Jarak Tempuh Awal\t: ");
                float ja2 = masuk.nextFloat();
                k1.setJarakTempuhAwal(ja2);

                System.out.print("Masukkan Jarak Tempuh Kendaraan\t: ");
                float jt2 = masuk.nextFloat();
                k1.setJarakTempuh(jt2);
                
                System.out.println("============================================");
                
                System.out.println("DATA SEPEDA MOTOR");

                System.out.println("");
                
                s1.infoKendaraan();
                k1.infoKendaraan();

                break;
        }

    }

}
        
        
