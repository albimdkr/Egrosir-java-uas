/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASalgo1;

import java.util.Scanner;

/**
 * Kelompok 3 - algoritma pemograman 1
 * tif rp - 21 D
 * @author albi mudakar nasyabi
 * @author asep sutrisna
 * @author rizky fauzi
 * @author nisa hadidah
 * @author berlian sya'bani
 * 
 */
public class editEGROSIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi dan Inisialisasi
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int h = 0;
        int pilihListUtama;//varibel for pilih list utama
        int sembako, mm, alatSabun, obat, pSeharian, gas; //varibel for condisi list utama
        
        //1. sembako
        //beras
        int pilihBeras;
        int totalBeras [] = new int [100];
        int jumlahBeras [] = new int [100];
        //telor
        int pilihTelor, jumlahTelor,totalTelor;
        //minyak dan mentega
        int pilihMinyak,jumlahMinyak,totalMinyak;
        //Mie
        int pilihMie,jumlahMie,totalMie;
        //Bumbu Dapur
        int pilihBD, jumlahBD, totalBD;
        //tepung
        int pilihTepung, jumlahTepung, totalTepung;
        //kerupuk
        int pilihKerupuk, jumlahKerupuk, totalKerupuk;
        
        // 2. Makanan dan minuman
        int pilihMakanan, jumlahMakanan, totalMakanan;
        int pilihMinuman, jumlahMinuman, totalMinuman;
        
        //3. Alat cuci dan sabun
        int pilihSabunMandi, jumlahSabunMandi,totalSabunMandi;
        int pilihSabunCuci, jumlahSabunCuci,totalSabunCuci;
        
        //4. Obat-obatan
        int pilihObat, jumlahObat,totalObat;
        
        //5. Produk keseharia
        int pilihProdukKeseharian, jumlahProdukKeseharian,totalProdukKeseharian;
        
        //6. Gas
        int pilihGas, JumlahGas, totalGas;
        
        //Jawaban
        String jawabanUlangTransaksi;
 
        //array pilihan list utama
        String data[]={"admin","admin098"};//username/password
        String [] listUtama;
        listUtama = new String[6];
        listUtama[0]= "Sembako";
        listUtama[1]= "Makanan dan minuman";
        listUtama[2]= "Alat cuci dan sabun";
        listUtama[3]= "Obat-obatan";
        listUtama[4]= "Produk keseharian";
        listUtama[5]= "Gas";
        
        //array pilihan sub sembako
        String [] subSembako;
        subSembako = new String [7];
        subSembako[0] = " / Beras";
        subSembako[1] = " / Telor";
        subSembako[2] = " / Minyak dan mentega";
        subSembako[3] = " / Mie";
        subSembako[4] = " / Bumbu dapur";
        subSembako[5] = " / Tepung";
        subSembako[6] = " / Kerupuk";
        
        //array pilihan sub makanan dan minuman
        String [] subMakananMinuman;
        subMakananMinuman = new String [2];
        subMakananMinuman [0] = " / Makanan";
        subMakananMinuman [1] = " / Minuman";
    
        
        //Array Produk Harga 2 dimensi
        String listProdukHarga [][] = {
        //list sembako
        //list beras
        {"Beras / Liter", "9000"}, {"Beras / Karung ", "255000" }, 
        //list telor
        {"Telor 1/4 Kg ", "6500" }, {"Telor 1/2 Kg ", "12000" }, 
        {"Telor Kg ", "24000" }, 
        
        //minyak dan mentega
        {"Fortune 1","19000"},{"Fortune 2","37500"},
        {"Sedap","19000"},{"Minyak curah 1/4 Kg","5000"},
        {"Minyak curah 1/2 Kg ","9500"},{"Minyak curah Kg","19000"},
        {"Mentega ","3500"},{"Mentega Palmia ","9500"},
        
        //list MIE
        {"Indomie Bawang", "94000" },{"Indomie Soto", "94000" },
        {"Indomie Empal Gentong", "100000" },{"Indomie Kocok Bandung", "100000" },
        {"Indomie Goreng", "99000" },{"Sedap Goreng", "98000" },
        {"Sedap Korea", "98000" }, {"Sukses Isi 2","73000" },
        
        //list bumbu dapur
        {"Royco Ayam 1 ", "5000"},{"Royco Sapi 1 ", "5000"},
        {"Bumbu racik ayam goreng ", "15000"},{"Bumbu Racik Nasi Goreng ", "15000"},
        {"Bumbu Racik tempe ", "15000"},{"Micin 50 Gram ", "2500"},
        {"Lada ", "5000"},{"Kecap ", "5000"},
        {"Garam 1 ", "50000"},{"Saus Indofood ", "9000"},
        {"Royco Ayam 2 ", "5000"},{"Royco Sapi 2 ", "5000"},
        {"Garam 2 ", "2000"},{"Santan ", "3500"},
        {"Micin 1/4 Pcs ", "9500"},
        
        //list tepung
        {"Tepung Kanji 1/4 Kg ", "2500"},{"Tepung Tapioka 1/4 Kg ", "3000"},
        {"Tepung Kanji 1/2 Kg ", "4000"},{"Tepung Tapioka 1/2 Kg ", "4500"},
        {"Tepung Kanji ", "7000"},{"Tepung Tapioka ", "7000"},
        
        //list kerpuk
        {"Kerupuk Mp 1/4 Kg ", "3500"},{"Kerupuk Sumber Sari 1/4 Kg ", "5500"},
        {"Makroni Kecil 1/4 Kg ", "4500"},{"Makroni Besar 1/4 Kg", "4500"},
        {"Kerupuk Mp ", "13000"},{"Kerupuk Sumber Sari ", "20000"},
        {"Makroni Kecil ", "15500"},{"Makroni Besar ", "15500"},
        //end Sembako
        //---------------------------------------------------------------------
        //list makanan dan minuman
        //makanan
        {"Nabati rolls ", "9500"}, {"Nabati wafer keju ", "8500"}, 
        {"Nabati wafer coklat ", "8500"}, {"Nabati ahh ", "8500"}, 
        {"Nabati Sip ", "8500"},{"Chocolatos ", "10500"},
        {"Oreo Soft cake ", "21000"},{"Oreo Biskuit ", "21000"},
        {"Tango Wafer ", "8500"},{"Chocopy ", "20000"},
        {"Bengbeng ", "27000"},{"Slai Olay ", "10500"},
        {"Qtela ", "17000"},{"Japota ", "17000"},
        {"Lays ", "18000"},{"Taro ", "9000"},
        {"Malkis Aroma ", "8500"},{"Malkis Abon ", "8500"},
        {"Sosis Sonice ", "19000"},
        
        //minuman
        {"Kopi Luak ", "10500"},{"Kopi Good Day ", "10000"},
        {"Kopi ABC susu ", "10000"},{"Kopi creamelatte ", "13500"},
        {"Kopi Tora Duo ", "10500"},{"Kopi Kapal Api ", "10500"},
        {"Kopi Tora Susu ", "10000"},{"Susu Indomilk vanilla ", "7500"},
        {"Susu Indomilk coklat ", "7500"},{"Susu Frisienflag vanila ", "7500"},
        {"Susu Frisienflag coklat ", "7500"},{"Energen vanila ", "13000"},
        {"Energen coklat ", "13000"},{"Marimas ", "3000"},
        {"Teh Sisri ", "3000"},{"Galon Aqua ", "18000"},
        {"Lemineral ", "19000"},{"Floridina ", "29500"},
        {"Milku ", "29000"},{"Sprit ", "45000"},
        {"Golda ", "27500"},{"Fanta ", "45000"},
        {"Isoplus ", "27000"},{"Sierra Botol ", "39000"},
        {"Teh Pucuk ", "53000"},{"Mizone ", "39000"},
        {"Pocari Sweet ", "116000"},{"Larutan Cap Kaki Tiga ", "120000"},
        {"Adem Sari Chingku ", "125000"},{"Susu Beruang ", "267000"},
        {"Larutan Anak ", "55000"},{"Teh Kotak ", "67000"},
        {"Indomilk vanilla ", "96000"},{"Indomilk Coklat ", "96000"},
        {"Indomilk Stoberry ", "96000"},{"Kopikap ", "19500"},
        {"Teh Sisri 2 ", "19000"},{"Power-F ", "18000"},
        {"Ale-Ale ", "18000"},{"Sierra Gelas ", "17500"},
        {"Teh Rio ", "18000"},{"Teh Ngaso ", "19500"},
        {"Teh Hijau ", "10500"},{"Larutan ", "17500"},
        //End list makanan dan minuman
        //---------------------------------------------------------------------
        
        //list sabun alat mandi
        //sabun mandi
        {"Sabun give ", "2000"},{"Sabun lifeboy ", "3500"},
        {"Sabun nuvo ", "2000"},{"Sabun Dettol ", "4500"},
        {"Ciptadent ", "3000"},{"Pepsodent ", "3500"},
        {"Kodomo ", "3500"},{"Sikat gigi Formula ", "3000"},
        {"Sikat gigi sistema ", "5500"},{"Sikat gigi ciptaden ", "3500"},
        {"Gillate ", "7500"},{"Sampo sunsilk ","10000"},
        {"Sampo zinc "," 5000"},{"Sampo lifeboy ","10000"},
        {"Sampo pantene ","10000"},{"Sampo head and sholder ","10000"},
        
        //sabun cuci
        {"Sunlight ","1000"},{"Sunlight Besar ","2000"},
        {"Mamalemon ","1000"},{"Mamalemon Besar ","2000"},
        {"Agung Besar ","5000"},{"Agung ","1000"},
        {"Wypoll ","1000"},{"Daya ","5000"},
        {"Boom ","5000"},{"Rinso ","5000"},
        {"Daya ","5000"},{"Molto ","5000"},
        {"Downy ","5000"},{"Liquid ","5000"},
        {"Soklin Lantai ","5000"},{"Spon ","2000"},
        //End list sabun alat mandi
        //---------------------------------------------------------------------
        
        //list obat
        {"Bodrex ","8500"},{"Misagrip ","2500"},
        {"Paramex ","2500"},{"Oskadon ","2000"},
        {"Nafacin ","3000"},{"Kontreksin ","1000"},
        {"Neoromasil ","8000"},{"Poldanmilk ","3000"},
        {"Promagh ","8500"},{"Vitacimin ","3000"},
        {"Kontreksin ","1000"},{"Tolak angin ","3000"},
        {"Antangin ","3000"},{"Madu Rasa ","2000"},
        //End list obat
        //---------------------------------------------------------------------
        
        //list produk keseharian
        {"Roko Super 1 ","19000"},{"Roko Magnum ","17500"},
        {"Roko Djarum Coklat 1 ","13500"},{"Roko Gudang Garam Merah ","13000"},
        {"Roko Gudang Garam FIlter ","19500"},{"Roko Sampoerna Kretek ","13000"},
        {"Roko Sampoerna Mild ","25000"},{"Roko Dji Sam Soe Kretek ","18000"},
        {"Roko Dji Sam Soe Premium ","20000"},{"Roko Super 2 ","180500"},
        {"Roko Djarum Coklat 2 ","128500"},{"Roko Magnum 2" ,"167000"},
        {"Roko Gudang Garam Merah 2 ","126000"},{"Protex ","5000"},
        {"Kotex ","5000"},{"Pamper (S) ","18500"},
        {"Pamper (M) ","19000"},{"Pamper (L) ","9000"},
        {"Pamper (XL) ","24000"},{"Citra ","9000"},
        {"Hit Magic ","10000"},{"Rexona Men ","3500"},
        {"Rexona Women ","3500"},{"Tissue ","1000"},
        {"Marina ","3500"},{"Sidia ","15000"},
        {"Bygon ","3500"},
        //End list produk keseharian
        //---------------------------------------------------------------------

        //list gas
        {"Gas LPG 3 Kg ","24000"},{"Gas Korek api Tokkai ","2000"},
        //End list gas
        };//End Array Produk Harga 2 dimensi
        
        
        //Penjumlahan all
        int totalJenis, totalBayarJenis,totalBayar,uangBayar, kurang, kembalian;
        totalJenis = 0;
        totalBayarJenis = 0;
        totalBayar = 0;
        kurang = 0;
        kembalian = 0;
 //End Deklarasi dan Inisialisasi
        

        do {
        //nama toko
        System.out.println("E-GROSIR");
        System.out.println("Src Dua putra                  ");
        System.out.println("===============================");
        System.out.println("Jl. Ciuwur-uwur                ");
        //list utama
        System.out.println("Menyediakan berbagai kebutuhan sehari-hari");
        System.out.println("===============================");
        System.out.println("| NO |   LIST PRODUK UTAMA    |");
        System.out.println("===============================");
        System.out.println("| 1. |   Sembako              |");
        System.out.println("| 2. |   Makanan dan minuman  |");
        System.out.println("| 3. |   Alat cuci dan sabun  |");
        System.out.println("| 4. |   Obat-obatan          |");
        System.out.println("| 5. |   Produk keseharian    |");
        System.out.println("| 6. |   Gas                  |");
        System.out.println("===============================");
        //input list produk utama
        System.out.print("Pilih List Produk : ");
        pilihListUtama=input.nextInt();
        System.out.print("List produk yang dipilih");
        System.out.println("\n");//space atau enter
        //kondisi list utama
        //list Sembako
        boolean ListSembako = true;
        if (pilihListUtama == 1){
            while (ListSembako) {
           System.out.println("Anda memilih : "+listUtama[0]);
           System.out.println("---------------------------------------");
           System.out.println("          LIST PRODUK SEMBAKO          ");
           System.out.println("---------------------------------------");
           System.out.println(" 1. Beras                              ");
           System.out.println(" 2. Telor                              ");
           System.out.println(" 3. Minyak/mentega                     ");
           System.out.println(" 4. Mie                                ");
           System.out.println(" 5. Bumbu dapur                        ");
           System.out.println(" 6. Tepung                             ");
           System.out.println(" 7. Kerupuk                            ");
                System.out.println("8. Kembali");
           System.out.println("---------------------------------------");
         //End list Sembako 
         //input list produk utama
        System.out.print("Pilih List sembako : ");
        sembako=input.nextInt();
        System.out.println("\n");//space atau enter
            if(sembako == 1){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[0]);
                System.out.println("---------------------------------------");
                System.out.println("               LIST BERAS              ");
                System.out.println("---------------------------------------");//harga
                System.out.println(" 1. Beras        Rp. 9000       /liter ");//9000
                System.out.println(" 2. Beras        Rp. 255000     /karung");//255000
                System.out.println("---------------------------------------");
                //logic beras
                //int pilihBeras, jumlahBeras,totalBeras;
                System.out.print("Pilih List beras : ");
                pilihBeras=input.nextInt();
                    if (pilihBeras == 1){
                        System.out.print("Berapa jumlah liter : ");
                        jumlahBeras[h]=input.nextInt();
                        totalBeras[i] = Integer.parseInt(listProdukHarga[0][1]) * jumlahBeras[h];
                        
                        
                    }else if (pilihBeras == 2){
                        System.out.print("Berapa jumlah karung : ");
                        jumlahBeras[h]=input.nextInt();
                        totalBeras[i] = Integer.parseInt(listProdukHarga[1][1]) * jumlahBeras[h];
                        
                    }else {
                        System.out.print("Maaf error");
                    }
                      
            }else if (sembako == 2){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[1]);
                System.out.println("---------------------------------------");
                System.out.println("               LIST TELOR              ");
                System.out.println("---------------------------------------");//harga
                System.out.println(" 1. Telor        Rp.6500       1/4 Kg  ");//6500
                System.out.println(" 2. Telor        Rp.1200       1/2 Kg  ");//1200
                System.out.println(" 3. Telor        Rp.24000      1 Kg    ");//24000
                System.out.println("---------------------------------------");
                //logic telor
                //int pilihTelor, jumlahTelor,totalTelor;
                System.out.print("Pilih List Telor : ");
                pilihTelor=input.nextInt();
                    if (pilihTelor == 1){
                       System.out.println("Pesanan : "+listProdukHarga[2][0]);
                       System.out.println("Harga : Rp. "+listProdukHarga[2][1]);                                           
                    } else if (pilihTelor == 2){
                       System.out.println("Pesanan : "+listProdukHarga[3][0]);
                       System.out.println("Harga : Rp. "+listProdukHarga[3][1]);
                    } else if (pilihTelor == 3){
                        System.out.print("Berapa jumlah Kilogram  : ");
                        jumlahTelor=input.nextInt(); 
                        totalTelor = Integer.parseInt(listProdukHarga[4][1]) * jumlahTelor;
                        System.out.print("Jumlah bayar: "+totalTelor);
                    }else{
                        System.out.print("Maaf error");
                    }
            }else if (sembako == 3){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[2]);
                System.out.println("---------------------------------------");
                System.out.println("        LIST MINYAK DAN MENTEGA        ");
                System.out.println("---------------------------------------");//harga
                System.out.println("             Minyak Kemasan            ");
                System.out.println("---------------------------------------");
                System.out.println(" 1. Fortune     Rp.19000       1 Liter ");//19000
                System.out.println(" 2. Fortune     Rp.37500       2 Liter ");//37500
                System.out.println(" 3. Sedap       Rp.19000       1 Liter ");//19000
                System.out.println("---------------------------------------");
                System.out.println("              Minyak Curah             ");
                System.out.println("---------------------------------------");
                System.out.println(" 4. Minyak      Rp.5000        1/4 Kg  ");//5000
                System.out.println(" 5. Minyak      Rp.9500        1/2 Kg  ");//9500
                System.out.println(" 6. Minyak      Rp.19000       1   Kg  ");//19000
                System.out.println("---------------------------------------");
                System.out.println("                Mentega                ");
                System.out.println("---------------------------------------");
                System.out.println(" 7. Mentega     Rp.3500        1/4 Kg  ");//3500
                System.out.println(" 8. Palmia      Rp.9500        1   Pcs ");//9500
                System.out.println("---------------------------------------");
                //logic minyak dan mentega  
                System.out.print("Pilih List minyak/mentega : ");
                pilihMinyak=input.nextInt();
                    if (pilihMinyak == 1){
                        System.out.print("Berapa liter minyak : ");
                        jumlahMinyak=input.nextInt();
                        totalMinyak = Integer.parseInt(listProdukHarga[5][1])*jumlahMinyak;
                        System.out.println("Jumlah Bayar : Rp. "+totalMinyak);     
                    }else if(pilihMinyak == 2){
                        System.out.print("Berapa pesanan : ");
                        jumlahMinyak=input.nextInt();    
                        totalMinyak = Integer.parseInt(listProdukHarga[6][1])*jumlahMinyak;
                        System.out.println("Jumlah bayar : Rp. "+totalMinyak);  
                    }else if (pilihMinyak == 3){
                        System.out.print("Berapa pesanan : ");
                        jumlahMinyak=input.nextInt(); 
                        totalMinyak = Integer.parseInt(listProdukHarga[7][1])*jumlahMinyak;
                        System.out.println("Jumlah bayar : Rp. "+totalMinyak);     
                    }else if (pilihMinyak == 4){
                        System.out.println("Pesanan : "+listProdukHarga[8][0]);
                        System.out.println("Jumlah bayar : Rp. "+listProdukHarga[8][1]);             
                    }else if (pilihMinyak == 5){
                        System.out.println("Pesanan : "+listProdukHarga[9][0]);
                        System.out.println("Jumlah bayar : Rp. "+listProdukHarga[9][1]);               
                    }else if (pilihMinyak == 6){
                        System.out.print("Berapa pesanan : ");
                        jumlahMinyak=input.nextInt();                
                        totalMinyak = Integer.parseInt(listProdukHarga[10][1])*jumlahMinyak;
                        System.out.println("Jumlah bayar : Rp. "+totalMinyak);
                    }else if (pilihMinyak == 7){
                        System.out.println("Pesanan : "+listProdukHarga[11][0]);
                        System.out.println("Jumlah bayar : Rp. "+listProdukHarga[11][1]);
                    }else if (pilihMinyak == 8){
                        System.out.print("Berapa pesanan : ");
                        jumlahMinyak=input.nextInt();
                        totalMinyak = Integer.parseInt(listProdukHarga[12][1])*jumlahMinyak;
                        System.out.println("Jumlah bayar : Rp. "+totalMinyak);
                    }else {
                        System.out.println("Maaf error");
                    }
                
            }else if (sembako == 4){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[3]);
                System.out.println("-------------------------------------------------------");
                System.out.println("                         LIST MIE                      ");
                System.out.println("-------------------------------------------------------");//harga
                System.out.println(" 1. Indomie Bawang             Rp.94000           /Dus ");//94000
                System.out.println(" 2. Indomie Soto               Rp.94000           /Dus ");//94000
                System.out.println(" 3. Indomie Empal Gentong      Rp.100000          /Dus ");//100000
                System.out.println(" 4. Indomie Kocok Bandung      Rp.100000          /Dus ");//100000
                System.out.println(" 5. Indomie Goreng             Rp.99000           /Dus ");//99000
                System.out.println(" 6. Mie Sedap Goreng           Rp.98000           /Dus ");//98000
                System.out.println(" 7. Mie Sedap Korea            Rp.98000           /Dus ");//98000
                System.out.println(" 8. Mie Sukses isi 2           Rp.73000           /Dus ");//73000
                System.out.println("-------------------------------------------------------");
                //logic MIE
                //int pilihMie,jumlahMie,totalMie;
                System.out.print("Pilih List Mie : ");
                pilihMie=input.nextInt();
                
                    if(pilihMie == 1){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[13][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                    }else if(pilihMie == 2){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[14][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                    }else if(pilihMie == 3){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[15][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                    }else if(pilihMie == 4){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[16][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                       
                    }else if(pilihMie == 5){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[17][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                        
                    }else if(pilihMie == 6){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[18][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                        
                    }else if(pilihMie == 7){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[19][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
                        
                    }else if(pilihMie == 8){
                        System.out.print("Berapa Dus : ");
                        jumlahMie=input.nextInt();
                        totalMie = Integer.parseInt(listProdukHarga[20][1])* jumlahMie;
                        System.out.println("Jumlah Bayar : Rp. "+totalMie);
   
                    }else{
                        System.out.println("Maaf error");
                    }
                     
                
            }else if (sembako == 5){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[4]);
                System.out.println("------------------------------------------------------");
                System.out.println("                 LIST BUMBU DAPUR                     ");
                System.out.println("------------------------------------------------------");//harga
                System.out.println(" 1. Royco Ayam                 Rp.5000       /Renceng ");//5000
                System.out.println(" 2. Royco Sapi                 Rp.5000       /Renceng ");//5000
                System.out.println(" 3. Bumbu racik Ayam goreng    Rp.15000      /Renceng ");//15000
                System.out.println(" 4. Bumbu racik Nasi goreng    Rp.15000      /Renceng ");//15000
                System.out.println(" 5. Bumbu racik Tempe          Rp.15000      /Renceng ");//15000
                System.out.println(" 6. Micin 50 Gram              Rp.2500       /Renceng ");//2500
                System.out.println(" 7. Lada                       Rp.5000       /Renceng ");//5000
                System.out.println(" 8. Kecap                      Rp.5000       /Renceng ");//5000
                System.out.println(" 9. Garam                      Rp.50000      /Pack    ");//50000
                System.out.println(" 10. Saos Indofood             Rp.9000       /Pack    ");//9000
                System.out.println(" 11. Royco Ayam 250 gram       RP.5000       /Pcs     ");//5000
                System.out.println(" 12. Royco Sapi 250 gram       Rp.5000       /Pcs     ");//5000
                System.out.println(" 13. Garam                     Rp.2000       /Pcs     ");//2000
                System.out.println(" 14. Santan                    Rp.3500       /Pcs     ");//3500
                System.out.println(" 15. Micin                     Rp.9500    1/4 Pcs     ");//9500 
                System.out.println("------------------------------------------------------");
                //logic Bumbu dapur
                //int pilihBD, jumlahBD, totalBD;
                System.out.print("Pilih List Bumbu Dapur : ");
                pilihBD=input.nextInt();
                    if (pilihBD == 1){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[21][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 2){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[22][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 3){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[23][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);           
                    }else if(pilihBD == 4){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[24][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 5){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[25][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 6){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[26][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 7){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[27][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 8){
                        System.out.print("Berapa Renceng : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[28][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 9){
                        System.out.print("Berapa Pack : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[29][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 10){
                        System.out.print("Berapa Pack : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[30][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 11){
                        System.out.print("Berapa Pcs : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[31][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 12){
                        System.out.print("Berapa Pcs : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[32][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 13){
                        System.out.print("Berapa Pcs : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[33][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);   
                    }else if(pilihBD == 14){
                        System.out.print("Berapa Pcs : ");
                        jumlahBD=input.nextInt();
                        totalBD = Integer.parseInt(listProdukHarga[34][1])* jumlahBD;
                        System.out.println("Jumlah Bayar : Rp. "+totalBD);
                    }else if(pilihBD == 15){
                        System.out.println("Pesanan : "+listProdukHarga[35][0]);
                        System.out.println("Harga : Rp. "+listProdukHarga[35][1]);               
                    }else {
                        System.out.println("Maaf error");
                    }
                
            }else if (sembako == 6){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[5]);
                System.out.println("----------------------------------------------");
                System.out.println("                   LIST TEPUNG                ");
                System.out.println("----------------------------------------------");//harga
                System.out.println(" 1. Tepung Kanji         Rp.2500       1/4 Kg ");//2500
                System.out.println(" 2. Tepung Tapioka       Rp.3000       1/4 Kg ");//3000
                System.out.println(" 3. Tepung Kanji         Rp.4000       1/2 Kg ");//4000
                System.out.println(" 4. Tepung Tapioka       Rp.4500       1/2 Kg ");//4500
                System.out.println(" 5. Tepung Kanji         Rp.7000          /Kg ");//7000
                System.out.println(" 6. Tepung Tapioka       Rp.7000          /Kg ");//7000
                System.out.println("----------------------------------------------");
                //logic tepung
                //int pilihTepung, jumlahTepung, totalTepung;
                System.out.print("Pilih List Tepung : ");
                pilihTepung=input.nextInt();
                    if (pilihTepung == 1){
                        System.out.println("Pesanan : "+listProdukHarga[36][0]);
                        System.out.println("Harga : Rp. "+listProdukHarga[36][1]);
                    }else if (pilihTepung == 2){
                       System.out.println("Pesanan : "+listProdukHarga[37][0]);
                       System.out.println("Harga : Rp. "+listProdukHarga[37][1]);
                    }else if (pilihTepung == 3){
                       System.out.println("Pesanan : "+listProdukHarga[38][0]);
                       System.out.println("Harga : Rp. "+listProdukHarga[38][1]);
                    }else if (pilihTepung == 4){
                       System.out.println("Pesanan : "+listProdukHarga[39][0]);
                       System.out.println("Harga : Rp. "+listProdukHarga[39][1]); 
                    }else if (pilihTepung == 5){
                        System.out.print("Berapa Kilogram : ");
                        jumlahTepung=input.nextInt();
                        totalTepung = Integer.parseInt(listProdukHarga[40][1])* jumlahTepung;
                        System.out.println("Jumlah Bayar : Rp. "+totalTepung);
                    }else if (pilihTepung == 6){
                        System.out.print("Berapa Kilogram : ");
                        jumlahTepung=input.nextInt();
                        totalTepung = Integer.parseInt(listProdukHarga[41][1])* jumlahTepung;
                        System.out.println("Jumlah Bayar : Rp. "+totalTepung);
                    }else {
                        System.out.println("Maaf error");
                    }
          
            }else if(sembako == 7){
                System.out.println("Anda memilih : "+listUtama[0]+subSembako[6]);
                System.out.println("-------------------------------------------------");
                System.out.println("                   LIST KERUPUK                  ");
                System.out.println("-------------------------------------------------");//harga
                System.out.println(" 1. Kerupuk Mp (Seblak)      Rp.3500      1/4 Kg ");//3500
                System.out.println(" 2. Kerupuk Sumber sari      Rp.5500      1/4 Kg ");//5500
                System.out.println(" 3. Makroni Kecil            Rp.4500      1/4 Kg ");//4500
                System.out.println(" 4. Makroni Besar            Rp.4500      1/4 Kg ");//4500
                System.out.println(" 5. Kerupuk Mp (Seblak)      Rp.13000        /Kg ");//13000
                System.out.println(" 6. Kerupuk Sumber Sari      Rp.20000        /Kg ");//20000
                System.out.println(" 7. Makroni Kecil            Rp.15500        /Kg ");//15500
                System.out.println(" 8. Makroni Besar            Rp.15500        /Kg ");//15500
                System.out.println("-------------------------------------------------");
                //logic kerupuk
                //int pilihKerupuk, jumlahKerupuk, totalKerupuk;
                System.out.print("Pilih List Kerupuk : ");
                pilihKerupuk=input.nextInt();
                    if(pilihKerupuk == 1){
                        System.out.println("Pesanan : "+listProdukHarga[42][0]);
                        System.out.println("Harga : Rp. "+listProdukHarga[42][1]);
                    }else if (pilihKerupuk == 2){
                        System.out.println("Pesanan : "+listProdukHarga[43][0]);
                        System.out.println("Harga : Rp. "+listProdukHarga[43][1]);
                    }else if (pilihKerupuk == 3){
                        System.out.println("Pesanan : "+listProdukHarga[44][0]);
                        System.out.println("Harga : Rp. "+listProdukHarga[44][1]);
                    }else if (pilihKerupuk == 4){
                        System.out.println("Pesanan : "+listProdukHarga[45][0]);
                        System.out.println("Harga : Rp. "+listProdukHarga[45][1]);
                    }else if (pilihKerupuk == 5){
                        System.out.print("Berapa Kilogram : ");
                        jumlahKerupuk=input.nextInt();
                        totalKerupuk = Integer.parseInt(listProdukHarga[46][1])* jumlahKerupuk;
                        System.out.println("Jumlah Bayar : Rp. "+totalKerupuk);
                    }else if (pilihKerupuk == 6){
                        System.out.print("Berapa Kilogram : ");
                        jumlahKerupuk=input.nextInt();
                        totalKerupuk = Integer.parseInt(listProdukHarga[47][1])* jumlahKerupuk;
                        System.out.println("Jumlah Bayar : Rp. "+totalKerupuk);     
                    }else if (pilihKerupuk == 7){
                        System.out.print("Berapa Kilogram : ");
                        jumlahKerupuk=input.nextInt();
                        totalKerupuk = Integer.parseInt(listProdukHarga[48][1])* jumlahKerupuk;
                        System.out.println("Jumlah Bayar : Rp. "+totalKerupuk);
                    }else if (pilihKerupuk == 8){
                        System.out.print("Berapa Kilogram : ");
                        jumlahKerupuk=input.nextInt();
                        totalKerupuk = Integer.parseInt(listProdukHarga[49][1])* jumlahKerupuk;
                        System.out.println("Jumlah Bayar : Rp. "+totalKerupuk);
                        
                    }else {
                        System.out.println("Maaf error");
                    }                
            }else {
                break;
            }
            }
         //end Sembako

         //list Makanan/minuman
        }else if (pilihListUtama == 2){
            boolean ListMm = true;
            while (ListMm) {
           System.out.println("Anda memilih : "+listUtama[1]);
           System.out.println("---------------------------------------------");
           System.out.println("        LIST PRODUK MAKANAN/MINUMAN          ");
           System.out.println("---------------------------------------------");
           System.out.println(" 1. Makanan                                  ");
           System.out.println(" 2. Minuman                                  ");
           System.out.println("---------------------------------------------");
           //choice
           System.out.print("Pilih List Makanan/minuman : ");
           mm=input.nextInt();
           System.out.println("\n");//space atau enter
               if (mm == 1){
                   System.out.println("Anda memilih : "+listUtama[1]+subMakananMinuman[0]);
                   System.out.println("----------------------------------------------------------");
                   System.out.println("                    LIST PRODUK MAKANAN                   ");
                   System.out.println("----------------------------------------------------------");//harga
                   System.out.println(" 1. Nabati Rolls               Rp.8500           /Dus     ");//8500
                   System.out.println(" 2. Nabati Wafer Keju          Rp.8500           /Dus     ");//8500
                   System.out.println(" 3. Nabati Wafer Coklat        Rp.8500           /Dus     ");//8500
                   System.out.println(" 4. Nabati Ahh                 Rp.8500           /Dus     ");//8500
                   System.out.println(" 5. Nabati SIP                 Rp.8500           /Dus     ");//8500
                   System.out.println(" 6. Chocolatos                 Rp.10500          /Dus     ");//10500
                   System.out.println(" 7. Oreo Soft cake             Rp.21000          /Dus     ");//21000
                   System.out.println(" 8. Oreo Biskuit               Rp.21000          /Dus     ");//21000
                   System.out.println(" 9. Tango Wafer                Rp.8500           /Dus     ");//8500
                   System.out.println(" 10. Chocopy                   Rp.20000          /Dus     ");//20000
                   System.out.println(" 11. Bengbeng                  Rp.27000          /Dus     ");//27000
                   System.out.println(" 12. Slai Olay                 Rp.10500          /Dus     ");//10500
                   System.out.println(" 13. Qtela                     Rp.17000          /Renceng ");//17000
                   System.out.println(" 14. Japota                    Rp.17000          /Renceng ");//17000
                   System.out.println(" 15. Lay's                     Rp.18000          /Renceng ");//18000
                   System.out.println(" 16. Taro                      Rp.9000           /Renceng ");//9000
                   System.out.println(" 17. Malkis Aroma              Rp.8500           /Renceng ");//8500
                   System.out.println(" 18. Malkis Abon               Rp.8500           /Renceng ");//8500
                   System.out.println(" 19. Sosis Sonice              Rp.19000          /Toples  ");//19000
                   System.out.println("----------------------------------------------------------");
                   //logic makanan 
                   //int pilihMakanan, jumlahMakanan, totalMakanan;
                   System.out.print("Pilih List Makanan : ");
                   pilihMakanan=input.nextInt();
                        if (pilihMakanan == 1){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[50][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 2){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[51][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 3){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[52][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 4){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[53][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 5){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[54][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 6){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[55][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 7){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[56][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 8){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[57][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 9){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[58][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 10){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[59][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 11){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[60][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 12){
                            System.out.print("Berapa Dus : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[61][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 13){
                            System.out.print("Berapa Renceng : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[62][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 14){
                            System.out.print("Berapa Renceng : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[63][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 15){
                            System.out.print("Berapa Renceng : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[64][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                            
                        }else if(pilihMakanan == 16){
                            System.out.print("Berapa Renceng : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[65][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);   
                        }else if(pilihMakanan == 17){
                            System.out.print("Berapa Renceng : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[66][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 18){
                            System.out.print("Berapa Renceng : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[67][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else if(pilihMakanan == 19){
                            System.out.print("Berapa Toples : ");
                            jumlahMakanan=input.nextInt();
                            totalMakanan = Integer.parseInt(listProdukHarga[68][1])* jumlahMakanan;
                            System.out.println("Jumlah Bayar : Rp. "+totalMakanan);
                        }else{
                            System.out.println("Maaf error");
                        }

               }else if(mm == 2){
                   System.out.println("Anda memilih : "+listUtama[1]+subMakananMinuman[1]);
                   System.out.println("-----------------------------------------------------------");
                   System.out.println("                        LIST PRODUK MINUMAN                ");
                   System.out.println("-----------------------------------------------------------");//harga
                   System.out.println("                           Minuman Seduh                   ");
                   System.out.println("-----------------------------------------------------------");
                   System.out.println(" 1.  Kopi Luak                  Rp.10500          /Renceng ");//10500
                   System.out.println(" 2.  Kopi Good Day              Rp.10000          /Renceng ");//10000
                   System.out.println(" 3.  Kopi ABC susu              Rp.10000          /Renceng ");//10000
                   System.out.println(" 4.  Kopi creamelatte           Rp.13500          /Renceng ");//13500
                   System.out.println(" 5.  Kopi Tora Duo              Rp.10500          /Renceng ");//10500
                   System.out.println(" 6.  Kopi Kapal Api             Rp.10500          /Renceng ");//10500
                   System.out.println(" 7.  Kopi Tora Susu             Rp.10000          /Renceng ");//10000
                   System.out.println(" 8.  Susu Indomilk vanilla      Rp.7500           /Renceng ");//7500
                   System.out.println(" 9.  Susu Indomilk coklat       Rp.7500           /Renceng ");//7500
                   System.out.println(" 10. Susu Frisienflag vanila    Rp.7500           /Renceng ");//7500
                   System.out.println(" 11. Susu Frisienflag coklat    Rp.7500           /Renceng ");//7500
                   System.out.println(" 12. Energen vanila             Rp.13000          /Renceng ");//13000
                   System.out.println(" 13. Energen coklat             Rp.13000          /Renceng ");//13000
                   System.out.println(" 14. Marimas                    Rp.3000           /Renceng ");//3000
                   System.out.println(" 15. Teh Sisri                  Rp.3000           /Renceng ");//
                   System.out.println("-----------------------------------------------------------");
                   System.out.println("                          Minuman Kemasan                  ");
                   System.out.println("-----------------------------------------------------------");
                   System.out.println(" 16. Galon Aqua                 Rp.18000          /Galon   ");//18000
                   System.out.println(" 17. Lemineral                  Rp.19000          /Galon   ");//19000
                   System.out.println(" 18. Floridina                  Rp.29500          /Pack    ");//29500
                   System.out.println(" 19. Milku                      Rp.29000          /Pack    ");//29000
                   System.out.println(" 20. Sprit                      Rp.45000          /Pack    ");//45000
                   System.out.println(" 21. Golda                      Rp.27500          /Pack    ");//27500
                   System.out.println(" 22. Fanta                      Rp.45000          /Pack    ");//45000
                   System.out.println(" 23. Isoplus                    Rp.27000          /Pack    ");//27000
                   System.out.println(" 24. Sierra Botol               Rp.39000          /Dus     ");//39000
                   System.out.println(" 25. Teh Pucuk                  Rp.53000          /Dus     ");//53000
                   System.out.println(" 26. Mizone                     Rp.39000          /Dus     ");//39000
                   System.out.println(" 27. Pocari Sweet               Rp.116000         /Dus     ");//116000
                   System.out.println(" 28. Larutan Cap Kaki Tiga      Rp.120000         /Dus     ");//120000
                   System.out.println(" 29. Adem Sari Chingku          Rp.125000         /Dus     ");//125000
                   System.out.println(" 30. Susu Beruang               Rp.267000         /Dus     ");//267000
                   System.out.println(" 31. Larutan Anak               Rp.55000          /Dus     ");//55000
                   System.out.println(" 32. Teh Kotak                  Rp.67000          /Dus     ");//67000
                   System.out.println(" 33. Indomilk vanilla           Rp.96000          /Dus     ");//96000
                   System.out.println(" 34. Indomilk Coklat            Rp.96000          /Dus     ");//96000
                   System.out.println(" 35. Indomilk Stoberry          Rp.96000          /Dus     ");//96000
                   System.out.println(" 36. Kopikap                    Rp.19500          /Dus     ");//19500
                   System.out.println(" 37. Teh Sisri                  Rp.19000          /Dus     ");//19000
                   System.out.println(" 38. Power-F                    Rp.18000          /Dus     ");//18000
                   System.out.println(" 39. Ale-Ale                    Rp.18000          /Dus     ");//18000
                   System.out.println(" 40. Sierra Gelas               Rp.17500          /Dus     ");//17500
                   System.out.println(" 41. Teh Rio                    Rp.18000          /Dus     ");//18000
                   System.out.println(" 42. Teh Ngaso                  Rp.19500          /Dus     ");//19500
                   System.out.println(" 43. Teh Hijau                  Rp.10500          /Dus     ");//10500
                   System.out.println(" 44. Larutan                    Rp.17500          /Losin   ");//17500
                   System.out.println("-----------------------------------------------------------");
                   //logic minuman
                   //int pilihMinuman, jumlahMinuman, totalMinuman;
                   System.out.print("Pilih List Minuman : ");
                   pilihMinuman=input.nextInt();
                        if (pilihMinuman == 1){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[69][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 2){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[70][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 3){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[71][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 4){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[72][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 5){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[73][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 6){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[74][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 7){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[75][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 8){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[76][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 9){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[77][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 10){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[78][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 11){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[79][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 12){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[80][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 13){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[81][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 14){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[82][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 15){
                            System.out.print("Berapa Renceng : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[83][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 16){
                            System.out.print("Berapa Galon : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[84][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 17){
                            System.out.print("Berapa Galon : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[85][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 18){
                            System.out.print("Berapa Pack : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[86][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 19){
                            System.out.print("Berapa Pack : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[87][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 20){
                            System.out.print("Berapa Pack : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[88][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 21){
                            System.out.print("Berapa Pack : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[89][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 22){
                            System.out.print("Berapa Pack : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[90][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 23){
                            System.out.print("Berapa Pack : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[91][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 24){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[92][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 25){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[93][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 26){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[94][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 27){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[95][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 28){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[96][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 29){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[97][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 30){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[98][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 31){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[99][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 32){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[100][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 33){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[101][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 34){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[102][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 35){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[103][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 36){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[104][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 37){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[105][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 38){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[106][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 39){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[107][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 40){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[108][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 41){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[109][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 42){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[110][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 43){
                            System.out.print("Berapa Dus : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[111][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else if (pilihMinuman == 44){
                            System.out.print("Berapa Losin : ");
                            jumlahMinuman=input.nextInt();
                            totalMinuman = Integer.parseInt(listProdukHarga[112][1])* jumlahMinuman;
                            System.out.println("Jumlah Bayar : Rp. "+totalMinuman);  
                        }else {
                            System.out.println("Maaf error");
                        }
               } else {
                   break;
               }
                // End list Makanan/minuman
            }
        //list Sabun/Alat manndi   
        }else if (pilihListUtama == 3){
           System.out.println("Anda memilih : "+listUtama[2]);
           System.out.println("--------------------------------------------");
           System.out.println("         LIST PRODUK SABUN/ALAT MANDI       ");
           System.out.println("--------------------------------------------");
           System.out.println(" 1. Sabun/alat mandi                        ");
           System.out.println(" 2. Sabun/alat cuci                         ");
           System.out.println("--------------------------------------------");
           System.out.print("Pilih List Produk Sabun : ");
           alatSabun=input.nextInt();
           System.out.println("\n");//space atau enter
              if(alatSabun == 1){
                  System.out.println("-------------------------------------------------------------");
                  System.out.println("                    LIST PRODUK ALAT MANDI SABUN             ");
                  System.out.println("-------------------------------------------------------------");//harga
                  System.out.println(" 1. Sabun give                 Rp.2000             /pcs      ");//2000
                  System.out.println(" 2. Sabun lifeboy              Rp.3500             /pcs      ");//3500
                  System.out.println(" 3. Sabun nuvo                 Rp.2000             /pcs      ");//2000   
                  System.out.println(" 4. Sabun Dettol               Rp.4500             /pcs      ");//4500
                  System.out.println(" 5. Ciptadent                  Rp.3000             /pcs      ");//3000
                  System.out.println(" 6. Pepsodent                  Rp.3500             /pcs      ");//3500
                  System.out.println(" 7. Kodomo                     Rp.3500             /pcs      ");//3500
                  System.out.println(" 8. Sikat gigi Formula         Rp.3000             /pcs      ");//3000
                  System.out.println(" 9. Sikat gigi sistema         Rp.5500             /pcs      ");//5500
                  System.out.println(" 10. Sikat gigi ciptaden       RP.3500             /pcs      ");//3500
                  System.out.println(" 11. Gillate                   Rp.7500             /pcs      ");//7500
                  System.out.println(" 12. Sampo sunsik              Rp.10000            /renceng  ");//10000
                  System.out.println(" 13. Sampo zinc                Rp.5000             /renceng  ");//5000
                  System.out.println(" 14. Sampo lifeboy             Rp.10000            /renceng  ");//10000
                  System.out.println(" 15. Sampo pantene             Rp.10000            /renceng  ");//10000
                  System.out.println(" 16. Sampo head and sholder    Rp.10000            /renceng  ");//10000
                  System.out.println("-------------------------------------------------------------");
                  //logic sabun mandi
                  //int pilihSabunMandi, jumlahSabunMandi,totalSabunMandi;
                  System.out.print("Pilih List Sabun/alat : ");
                  pilihSabunMandi=input.nextInt();
                    if(pilihSabunMandi == 1){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[113][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi); 
                    }else if(pilihSabunMandi == 2){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[114][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 3){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[115][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 4){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[116][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 5){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[117][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 6){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[118][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 7){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[119][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 8){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[120][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 9){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[121][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 10){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[122][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 11){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[123][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 12){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[124][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 13){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[125][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 14){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[126][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 15){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[127][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else if(pilihSabunMandi == 16){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunMandi=input.nextInt();
                        totalSabunMandi = Integer.parseInt(listProdukHarga[128][1])* jumlahSabunMandi;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunMandi);
                    }else {
                        System.out.println("Maaf error");
                    }   
              }else if (alatSabun == 2){
                  System.out.println("---------------------------------------------------");
                  System.out.println("           LIST PRODUK ALAT CUCI DAN SABUN         ");
                  System.out.println("---------------------------------------------------");//harga
                  System.out.println("                          Sabun                    ");
                  System.out.println("---------------------------------------------------");
                  System.out.println(" 1.  Sunlight             Rp.1000         /pcs     ");//1000
                  System.out.println(" 2.  Sunlight Besar       Rp.2000         /pcs     ");//2000
                  System.out.println(" 3.  Mamalemon            Rp.1000         /pcs     ");//1000
                  System.out.println(" 4.  Mamalemon Besar      Rp.2000         /pcs     ");//2000
                  System.out.println(" 5.  Agung Besar          Rp.5000         /Pcs     ");//5000
                  System.out.println(" 6.  Agung                Rp.1000         /Pcs     ");//1000
                  System.out.println(" 7.  Wypoll               Rp.1000         /Pcs     ");//1000
                  System.out.println(" 8.  Daya                 Rp.5000         /Pcs     ");//5000
                  System.out.println(" 9.  Boom                 Rp.5000         /Pcs     ");//5000
                  System.out.println(" 10. Rinso                Rp.5000         /Renceng ");//5000
                  System.out.println(" 11. Daya                 Rp.5000         /Renceng ");//5000
                  System.out.println(" 12. Molto                Rp.5000         /Renceng ");//5000
                  System.out.println(" 13. Downy                Rp.5000         /Renceng ");//5000
                  System.out.println(" 14  Liquid               Rp.5000         /Renceng ");//5000
                  System.out.println(" 15. Soklin Lantai        Rp.5000         /Renceng ");//5000
                  System.out.println("---------------------------------------------------");
                  System.out.println("                          Alat                     ");
                  System.out.println("---------------------------------------------------");
                  System.out.println(" 16. Spon                 Rp.2000         /Pcs     ");//2000
                  System.out.println("---------------------------------------------------");
                  //logic sabun cuci
                  //int pilihSabunCuci, jumlahSabunCuci,totalSabunCuci;
                  System.out.print("Pilih List Sabun/alat : ");
                  pilihSabunCuci=input.nextInt();
                    if(pilihSabunCuci == 1){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[129][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 2){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[130][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 3){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[131][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 4){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[132][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 5){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[133][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 6){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[134][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 7){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[135][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 8){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[136][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 9){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[137][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 10){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[138][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 11){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[139][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 12){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[140][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 13){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[141][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 14){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[142][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 15){
                        System.out.print("Berapa Renceng : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[143][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else if (pilihSabunCuci == 16){
                        System.out.print("Berapa Pcs : ");
                        jumlahSabunCuci=input.nextInt();
                        totalSabunCuci = Integer.parseInt(listProdukHarga[144][1])* jumlahSabunCuci;
                        System.out.println("Jumlah Bayar : Rp. "+totalSabunCuci); 
                    }else {
                        System.out.println("Maaf error");
                    }

           }else {
                System.out.println("--------------------ERROR!!-----------------");
                System.out.println(" Silahkan masukan ulang nomor list alat cuci");
              }         
        // End list Sabun/Alat mandi
        //list obat-obatan
        }else if (pilihListUtama == 4){
           System.out.println("Anda memilih : "+listUtama[3]);
           System.out.println("----------------------------------------------------");
           System.out.println("                    LIST OBAT-OBATAN                ");
           System.out.println("----------------------------------------------------");//harga
           System.out.println(" 1. Bodrex               Rp.8500           /Lembar  ");//8500
           System.out.println(" 2. Misagrip             Rp.2500           /lembar  ");//2500
           System.out.println(" 3. Paramex              Rp.2500           /Lembar  ");//2500
           System.out.println(" 4. Oskadon              Rp.2000           /Lembar  ");//2000
           System.out.println(" 5. Nafacin              Rp.3000           /Lembar  ");//3000
           System.out.println(" 6. Kontreksin           Rp.1000           /Lembar  ");//1000
           System.out.println(" 7. Neoromasil           Rp.8000           /Lembar  ");//8000
           System.out.println(" 8. Poldanmilk           Rp.3000           /Lembar  ");//3000
           System.out.println(" 9. Promagh              Rp.8500           /Lembar  ");//8500
           System.out.println(" 10. Vitacimin           Rp.3000           /Lembar  ");//3000
           System.out.println(" 11. Kontreksin          Rp.1000           /Lembar  ");//1000
           System.out.println(" 12. Tolak angin         Rp.3000           /Pcs     ");//3000
           System.out.println(" 13. Antangin            Rp.3000           /Pcs     ");//3000
           System.out.println(" 14. Madu Rasa           Rp.2000           /Pcs     ");//2000
           System.out.println("----------------------------------------------------");
           // End list obat-obatan
           //int pilihObat, jumlahObat,totalObat;
           System.out.print("Pilih List Sabun/alat : ");
           pilihObat=input.nextInt();
                    if(pilihObat == 1){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[145][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 2){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[146][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 3){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[147][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 4){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[148][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 5){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[149][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 6){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[150][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 7){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[151][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 8){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[152][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 9){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[153][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 10){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[154][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 11){
                        System.out.print("Berapa Lembar : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[155][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 12){
                        System.out.print("Berapa Pcs : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[156][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 13){
                        System.out.print("Berapa Pcs : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[157][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else if (pilihObat == 14){
                        System.out.print("Berapa Pcs : ");
                        jumlahObat=input.nextInt();
                        totalObat = Integer.parseInt(listProdukHarga[158][1])* jumlahObat;
                        System.out.println("Jumlah Bayar : Rp. "+totalObat); 
                    }else {
                        System.out.println("Maaf error");
                    }
         //list Keseharian
        }else if (pilihListUtama == 5){
            System.out.println("Anda memilih : "+listUtama[4]);
           System.out.println("--------------------------------------------------------------");
           System.out.println("                     LIST PRODUK KESEHARIAN                   ");
           System.out.println("--------------------------------------------------------------");//harga
           System.out.println("                               List Roko                      ");
           System.out.println("--------------------------------------------------------------");
           System.out.println(" 1. Super                      Rp.19000              /Bungkus ");//19000
           System.out.println(" 2. Mangnum                    Rp.17500              /Bungkus ");//17500
           System.out.println(" 2. Djarum Coklat              Rp.13500              /Bungkus ");//13500
           System.out.println(" 4. Gudang Garam Merah         Rp.13000              /Bungkus ");//13000
           System.out.println(" 5. Gudang Garam FIlter        Rp.19500              /Bungkus ");//19500
           System.out.println(" 6. Sampoerna Kretek           Rp.13000              /Bungkus ");//13000
           System.out.println(" 7. Sampoerna Mild             Rp.25000              /Bungkus ");//25000
           System.out.println(" 8. Dji Sam Soe Kretek         Rp.18000              /Bungkus ");//18000
           System.out.println(" 9. Dji Sam Soe Premium        Rp.20000              /Bungkus ");//20000
           System.out.println(" 10. Roko Super                Rp.180500             /Pack    ");//180500
           System.out.println(" 11. Djarum Coklat             Rp.128500             /Pack    ");//128500
           System.out.println(" 12. Magnum                    Rp.167000             /Pack    ");//167000
           System.out.println(" 13. Gudang Garam Merah        Rp.126000             /Pack    ");//126000
           System.out.println("--------------------------------------------------------------");
           System.out.println("                               List Body                      ");
           System.out.println("--------------------------------------------------------------");
           System.out.println(" 14. Protex                    Rp.5000               /Renceng ");//5000
           System.out.println(" 15. Kotex                     Rp.5000               /Renceng ");//5000
           System.out.println(" 16. Pamper (S)                Rp.18500              /Renceng ");//18500
           System.out.println(" 17. Pamper (M)                Rp.19000              /Renceng ");//19000
           System.out.println(" 18. Pamper (L)                Rp.19000              /Renceng ");//19000
           System.out.println(" 19. Pamper (XL)               Rp.24000              /Renceng ");//24000
           System.out.println(" 20. Citra                     Rp.9000               /Renceng ");//9000
           System.out.println(" 21. Hit Magic                 Rp.10000              /Renceng ");//10000 
           System.out.println(" 22. Rexona Men                Rp.3500               /Pcs     ");//3500
           System.out.println(" 23. Rexona Womwn              Rp.3500               /Pcs     ");//3500
           System.out.println(" 24. Tissue                    Rp.1000               /Pcs     ");//1000
           System.out.println(" 25. Marina                    Rp.3500               /Botol   ");//3500
           System.out.println(" 26. Sidia                     Rp.15000              /Botol   ");//15000
           System.out.println(" 27. Bygon                     Rp.3500               /Dus     ");//3500
           System.out.println("--------------------------------------------------------------");
           //logic produk kesharian
           //int pilihProdukKeseharian, jumlahProdukKeseharian,totalProdukKeseharian;
           System.out.print("Pilih List Produk : ");
           pilihProdukKeseharian=input.nextInt();
                    if(pilihProdukKeseharian == 1){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[159][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 2){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[160][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 3){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[161][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 4){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[162][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 5){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[163][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 6){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[164][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 7){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[165][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 8){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[166][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 9){
                        System.out.print("Berapa Bungkus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[167][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 10){
                        System.out.print("Berapa Pack : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[168][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 11){
                        System.out.print("Berapa Pack : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[169][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 12){
                        System.out.print("Berapa Pack : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[170][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 13){
                        System.out.print("Berapa Pack : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[171][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 14){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[172][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 15){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[173][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 16){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[174][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 17){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[175][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 18){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[176][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 19){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[177][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 20){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[178][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 21){
                        System.out.print("Berapa Renceng : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[179][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 22){
                        System.out.print("Berapa Pcs : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[180][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 23){
                        System.out.print("Berapa Pcs : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[181][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 24){
                        System.out.print("Berapa Pcs : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[182][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 25){
                        System.out.print("Berapa Botol : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[183][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 26){
                        System.out.print("Berapa Botol : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[184][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }else if (pilihProdukKeseharian == 27){
                        System.out.print("Berapa Dus : ");
                        jumlahProdukKeseharian=input.nextInt();
                        totalProdukKeseharian = Integer.parseInt(listProdukHarga[185][1])* jumlahProdukKeseharian;
                        System.out.println("Jumlah Bayar : Rp. "+totalProdukKeseharian); 
                    }
           //End list Keseharian
          //List gas
        }else if (pilihListUtama == 6){
            System.out.println("Anda memilih : "+listUtama[5]);
            System.out.println("------------------------------------------------");
            System.out.println("                   LIST PRODUK GAS              ");
            System.out.println("------------------------------------------------");//harga
            System.out.println(" 1. Gas LPG                   Rp.24000     3 Kg ");//24000
            System.out.println(" 2. Gas Korek api Tokkai      Rp.2000      /Pcs ");//2000
            System.out.println("------------------------------------------------");
            //logic gas
            //int pilihGas, JumlahGas, totalGas;
            System.out.print("Pilih List Produk : ");
            pilihGas=input.nextInt();
                    if(pilihGas == 1){
                        System.out.print("Pesan Berapa Tabung : ");
                        JumlahGas=input.nextInt();
                        totalGas = Integer.parseInt(listProdukHarga[186][1])* JumlahGas;
                        System.out.println("Jumlah Bayar : Rp. "+totalGas); 
                    }else if(pilihGas == 2){
                        System.out.print("Pesan Berapa Pcs : ");
                        JumlahGas=input.nextInt();
                        totalGas = Integer.parseInt(listProdukHarga[187][1])* JumlahGas;
                        System.out.println("Jumlah Bayar : Rp. "+totalGas); 
                    }
          //End List gas
        }else {
            System.out.println("--------------------ERROR!!------------------");
            System.out.println("    Silahkan masukan ulang nomor list utama  ");
        } 
            System.out.println("Apakah Anda Ingin Melakukan Pemesanan lagi? ya/tidak");
            jawabanUlangTransaksi = input.next();
    } while (jawabanUlangTransaksi.equals("ya")) ; 
        
        int TotalBayar = 0;
        TotalBayar += totalBeras[i];
        System.out.println(TotalBayar + "Jumlah Pesanan" + jumlahBeras[h]);
    }//End publicStatic
}//End class
