
package pertemuan2;

import java.util.Scanner;

public class dataBarang {
    private static double diskon,total,biaya;
    private static double ppn = 0.01;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bayar;
        barang[] brg = new barang[0];
        int jumlah, i, pil;
    
        do{
            System.out.println("MENU PILIHAN");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");

            System.out.println("===============================");
            System.out.println("Pilih Menu ? : ");
            pil = scan.nextInt();
            System.out.print(" ");

            switch(pil){
                case 1:
                    System.out.print("Jumlah Barang : ");
                    jumlah = scan.nextInt();
                    brg = new barang[jumlah];
                    
                    for(i = 0 ; i < jumlah; i++){
                        brg[i] = new barang();
                        System.out.println("Data Barang"+(i+1));
                        System.out.print("Kode Barang :"); 
                        brg[i].setKd_barang(scan.next());
                        System.out.print("Nama Barang :"); 
                        brg[i].setNm_barang(scan.next());
                        System.out.print("Harga Barang :"); 
                        brg[i].setHrg_barang(scan.nextInt());
                        System.out.print("Jml Beli :"); 
                        brg[i].setJml_beli(scan.nextInt());

                        System.out.print("Cara Bayar (Visa-Master/Debit/Cash)");
                        bayar = scan.next() ;
                        if(bayar.equals("Visa-Master") || bayar.equals("visa-master")){
                            biaya = (total / 0.03);
                        }
                    }
                    break;
                case 2:
                    System.out.println("DATA PENJUALAN BARANG "+"PT PAMULANG UTAMA");
                    System.out.println("Nama Kasir : (Muhamad Abdul Aziz) ");

                    int x = 0;
                    System.out.print("===================================================================================== \n");
                    System.out.print("No \t"+"Kode Barang \t"+"Nama Barang \t"+"Harga Barang \t"+"Jumlah Beli \t"+"Bayar \n");
                    System.out.println("===================================================================================== \n");
                    while(x < brg.length){
                        System.out.print((x+1)+" \t"+brg[x].getKd_barang()+" \t"+brg[x].getNm_barang()+" \t"+brg[x].getHrg_barang()+" \t \t"+brg[x].getJml_beli()+"\t \t"+brg[x].getJml_bayar()+" \n");
                        System.out.print("----------------------------------------------------------------------------------- \n");
                        total = brg[0].getJml_bayar()+brg[x].getJml_bayar(); 
                        x++;
                    } 
                        System.out.println("================================================================================= \n");
                        System.out.print("TOTAL \t : "+ total + "\n" );

                        if(total >= 500000){
                            diskon =  0.05;
                            total = total - diskon;
                        }else{
                            diskon = 0 ;
                        }

                        System.out.print("Diskon \t : "+ diskon + "\n" );
                        System.out.println("PPN  10% \t  : "+ (total *  10 / 100));
                        System.out.println("Biaya: Kartu Rp. "+ biaya );                    
                        System.out.println("Total Bayar \n : "+ (total + (10 / 100)) );
                    

                    break;
                case 3:
                    System.out.println("Selesai...");
                    break;                    
            }

        }while (pil != 3);
    }
    
}
