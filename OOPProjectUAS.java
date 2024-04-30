/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectuas;
import java.util.*;
public class OOPProjectUAS {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        printTable table = new printTable();
        
        //Inisialisasi Variabel
        int inputAwal,inputMembeli,totalHarga;
        String tanya ="";
        
        
        //Inisialisasi Array
        int hargaBarang [] = new int[10];
        double diskon [] = new double[10];
        int subTotal [] = new int [10];
        int jumlah [] = new int  [10];
        String inputUkuran [] = new String[10];
        String namaBarang [] = new String[10];
        String [][] data= {
            {"No", "Nama Barang","Harga","Ukuran"},
            {"1","Kemeja Hawai","Rp.135.000","S,M,L,XL"},
            {"2","Kemeja Pria (Lengan Pendek)","Rp.250.000","S,M,L,XL"},
            {"3","Kemeja Pria (Lengan Panjang)","Rp.225.000","S,M,L,XL"},
            {"4","Kaos Katun Premium","Rp.65.000","S,M,L,XL,XXL,XXXL"},
            {"5","Kaos Polos Premium","Rp.50.000","S,M,L,XL,XXL,XXXL"}
        };
        
        
        do{
        //Output awal
        System.out.println("            \"TOKO BAJU KELOMPOK 1\"          ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Selamat Datang Silahkan Berbelanja!!");
        System.out.println("1. Membeli");
        System.out.println("2. Keluar ");
        System.out.print("Pilih Menu:");
        inputAwal = input.nextInt();
        
        //inisialisasi inputAwal
            switch (inputAwal){
                case 1:
                    System.out.println("\n\n--------------------------------------------------------------");
                    table.printTable(data);
                    System.out.print("Masukan Nomor Pembelian:");
                    inputMembeli = input.nextInt(); 
                    
                    //intput Ukuran
                     System.out.println("Masukkan ukuran (S, M, L, XL):");
                     inputUkuran[inputAwal] = input.next();
                    //Inisialisasi Barang
                    if (inputMembeli == 1){
                        namaBarang[inputMembeli - 1]= "Kemeja Hawai";
                        hargaBarang[inputMembeli - 1]= 135000;
                        diskon[inputMembeli - 1] = 0.01;
                        break;
                    }else if (inputMembeli == 2){
                        namaBarang[inputMembeli - 2 ] = "Kemeja Pria (Lengan Pendek)";
                        hargaBarang[inputMembeli - 2] = 250000;
                        diskon[inputMembeli - 2] = 0.20;
                        break;
                    }else if (inputMembeli == 3){
                        namaBarang[inputMembeli - 3 ] = "Kemeja Pria (Lengan Panjang)";
                        hargaBarang[inputMembeli - 3] = 225000;
                        diskon[inputMembeli - 3] = 0.10;
                        break;
                    }else if (inputMembeli == 4){
                        namaBarang[inputMembeli - 4] = "Kaos Katun Premium";
                        hargaBarang[inputMembeli - 4]= 64000;
                        diskon[inputMembeli - 4] = 0;
                            if (inputUkuran.equals("XXL") || inputUkuran.equals("XXXL")){
                                hargaBarang[inputMembeli - 4]+= 10000;
                            }
                        break;
                    }else if (inputMembeli == 5){
                        namaBarang[inputMembeli -5] = "Kaos Polos Premium";
                        hargaBarang[inputMembeli -5]= 50000;
                        diskon[inputMembeli -5] = 0.05;
                        if (inputUkuran.equals("XXL") || inputUkuran.equals("XXXL")){
                                hargaBarang[inputMembeli - 5]+= 5000;
                            }
                        break;
                    }else {
                        System.out.println("Inputan yang dimasukan tidak tersedia, Silahkan coba lagi!");
                        break;
                    }
                
                
                
                
                case 2:
                    break;
            }
        System.out.println("Ingin Menginput Ulang pencet Y: ");
        tanya = input.nextLine();
        }while (tanya.equalsIgnoreCase("Y"));
                
        
        
        
        
        
        
        
        
    }
    
    
}
