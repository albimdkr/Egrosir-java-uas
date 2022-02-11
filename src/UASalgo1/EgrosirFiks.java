/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASalgo1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
//import java.util.calendar;


/**
 * Kelompok 3 - algoritma pemograman 1
 * tif rp - 21 D
 * @author albi mudakar nasyabi
 * @author asep sutrisna
 * @author rizky fauzi
 * @author nisa 
 * @author berlian sya'bani
 * 
 */
public class EgrosirFiks {

    /**
     * @param args the command line arguments
     */
    
    

    public static final String NORMAL = "\u001b[0m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";
    public static final String BLINK = "\u001b[5m";
    
    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi dan Inisialisasi
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        int pilihListUtama, pilihListProduk, pilihProduk;//varibel for pilih list utama dan list produk
        String ulangPesan1;
        
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndo.setDecimalFormatSymbols(formatRp);
   
        
        //Array Produk Harga 2 dimensi
        String listProdukHarga [][] = {
        //list sembako
        //list beras
        {"Beras / Liter          ", "9000"}, {"Beras / Karung         ", "255000" }, 
        //list telor
        {"Telor 1/4 Kg           ", "6500" },{"Telor 1/2 Kg           ", "12000" }, 
        {"Telor Kg               ", "24000" }, 
        
        //minyak dan mentega
        {"Fortune 1              ","19000"}, {"Fortune 2              ","37500"},
        {"Sedap                  ","19000"}, {"Minyak curah 1/4 Kg    ","5000"},
        {"Minyak curah 1/2 Kg    ","9500"},  {"Minyak curah Kg        ","19000"},
        {"Mentega                ","3500"},  {"Mentega Palmia         ","9500"},
        
        //list MIE
        {"Indomie Bawang         ", "94000" },{"Indomie Soto            ", "94000" },
        {"Indomie Empal Gentong  ", "100000" },{"Indomie Kocok Bandung   ", "100000" },
        {"Indomie Goreng         ", "99000" },{"Sedap Goreng            ", "98000" },
        {"Sedap Korea            ", "98000" },{"Sukses Isi 2            ","73000" },
        
        //list bumbu dapur
        {"Royco Ayam 1           ", "5000"}, {"Royco Sapi 1           ", "5000"},
        {"Bumbu racik ayam goreng", "15000"},{"Bumbu Racik Nasi Goreng", "15000"},
        {"Bumbu Racik tempe      ", "15000"},{"Micin 50 Gram          ", "2500"},
        {"Lada                   ", "5000"}, {"Kecap                  ", "5000"},
        {"Garam 1                ", "50000"},{"Saus Indofood          ", "9000"},
        {"Royco Ayam 2           ", "5000"}, {"Royco Sapi 2           ", "5000"},
        {"Garam 2                ", "2000"}, {"Santan                 ", "3500"},
        {"Micin 1/4 Pcs          ", "9500"},
        
        //list tepung
        {"Tepung Kanji 1/4 Kg    ", "2500"}, {"Tepung Tapioka 1/4 Kg  ", "3000"},
        {"Tepung Kanji 1/2 Kg    ", "4000"}, {"Tepung Tapioka 1/2 Kg  ", "4500"},
        {"Tepung Kanji           ", "7000"}, {"Tepung Tapioka         ", "7000"},
        
        //list kerpuk
        {"Kerupuk Mp 1/4 Kg      ", "3500"}, {"Krpk SumberSari 1/4 Kg ", "5500"},
        {"Makroni Kecil 1/4 Kg   ", "4500"}, {"Makroni Besar 1/4 Kg   ", "4500"},
        {"Kerupuk Mp             ", "13000"},{"Kerupuk Sumber Sari    ", "20000"},
        {"Makroni Kecil          ", "15500"},{"Makroni Besar          ", "15500"},
        //end Sembako
        
        //---------------------------------------------------------------------
        //list makanan dan minuman
        //makanan
        {"Nabati rolls           ", "9500"}, {"Nabati wafer keju      ", "8500"}, 
        {"Nabati wafer coklat    ", "8500"}, {"Nabati ahh             ", "8500"}, 
        {"Nabati Sip             ", "8500"}, {"Chocolatos             ", "10500"},
        {"Oreo Soft cake         ", "21000"},{"Oreo Biskuit           ", "21000"},
        {"Tango Wafer            ", "8500"}, {"Chocopy                ", "20000"},
        {"Bengbeng               ", "27000"},{"Slai Olay              ", "10500"},
        {"Qtela                  ", "17000"},{"Japota                 ", "17000"},
        {"Lays                   ", "18000"},{"Taro                   ", "9000"},
        {"Malkis Aroma           ", "8500"}, {"Malkis Abon            ", "8500"},
        {"Sosis Sonice           ", "19000"},
        
        //minuman
        {"Kopi Luak              ", "10500"},{"Kopi Good Day          ", "10000"},
        {"Kopi ABC susu          ", "10000"},{"Kopi creamelatte       ", "13500"},
        {"Kopi Tora Duo          ", "10500"},{"Kopi Kapal Api         ", "10500"},
        {"Kopi Tora Susu         ", "10000"},{"Susu Indomilk vanilla  ", "7500"},
        {"Susu Indomilk coklat   ", "7500"}, {"Susu Frisienflag vanila", "7500"},
        {"Susu Frisienflag coklat", "7500"}, {"Energen vanila         ", "13000"},
        {"Energen coklat         ", "13000"},{"Marimas                ", "3000"},
        {"Teh Sisri              ", "3000"}, {"Galon Aqua             ", "18000"},
        {"Lemineral              ", "19000"},{"Floridina              ", "29500"},
        {"Milku                  ", "29000"},{"Sprit                  ", "45000"},
        {"Golda                  ", "27500"},{"Fanta                  ", "45000"},
        {"Isoplus                ", "27000"},{"Sierra Botol           ", "39000"},
        {"Teh Pucuk              ", "53000"},{"Mizone                 ", "39000"},
        {"Pocari Sweet           ", "116000"},{"Larutan Cap Kaki Tiga  ", "120000"},
        {"Adem Sari Chingku      ", "125000"},{"Susu Beruang           ", "267000"},
        {"Larutan Anak           ", "55000"},{"Teh Kotak              ", "67000"},
        {"Indomilk vanilla       ", "96000"},{"Indomilk Coklat        ", "96000"},
        {"Indomilk Stoberry      ", "96000"},{"Kopikap                ", "19500"},
        {"Teh Sisri 2            ", "19000"},{"Power-F                ", "18000"},
        {"Ale-Ale                ", "18000"},{"Sierra Gelas           ", "17500"},
        {"Teh Rio                ", "18000"},{"Teh Ngaso              ", "19500"},
        {"Teh Hijau              ", "10500"},{"Larutan                ", "17500"},
        //End list makanan dan minuman
        //---------------------------------------------------------------------
        
        
        //list sabun alat mandi
        //sabun mandi
          
        {"Sabun give             ", "2000"}, {"Sabun lifeboy          ", "3500"},
        {"Sabun nuvo             ", "2000"}, {"Sabun Dettol           ", "4500"},
        {"Ciptadent              ", "3000"}, {"Pepsodent              ", "3500"},
        {"Kodomo                 ", "3500"}, {"Sikat gigi Formula     ", "3000"},
        {"Sikat gigi sistema     ", "5500"}, {"Sikat gigi ciptaden    ", "3500"},
        {"Gillate                ", "7500"}, {"Sampo sunsilk          ","10000"},
        {"Sampo zinc             "," 5000"}, {"Sampo lifeboy          ","10000"},
        {"Sampo pantene          ","10000"}, {"Sampo head and sholder ","10000"},
        
        //sabun cuci
        {"Sunlight               ","1000"},  {"Sunlight Besar         ","2000"},
        {"Mamalemon              ","1000"},  {"Mamalemon Besar        ","2000"},
        {"Agung Besar            ","5000"},  {"Agung                  ","1000"},
        {"Wypoll                 ","1000"},  {"Daya                   ","5000"},
        {"Boom                   ","5000"},  {"Rinso                  ","5000"},
        {"Daya                   ","5000"},  {"Molto                  ","5000"},
        {"Downy                  ","5000"},  {"Liquid                 ","5000"},
        {"Soklin Lantai          ","5000"},  {"Spon                   ","2000"},
        //End list sabun alat mandi
        //---------------------------------------------------------------------
        
        //list obat
        {"Bodrex                 ","8500"},  {"Misagrip               ","2500"},
        {"Paramex                ","2500"},  {"Oskadon                ","2000"},
        {"Nafacin                ","3000"},  {"Kontreksin             ","1000"},
        {"Neoromasil             ","8000"},  {"Poldanmilk             ","3000"},
        {"Promagh                ","8500"},  {"Vitacimin              ","3000"},
        {"Kontreksin             ","1000"},  {"Tolak angin            ","3000"},
        {"Antangin               ","3000"},  {"Madu Rasa              ","2000"},
        //End list obat
        //---------------------------------------------------------------------
        
        
        //list produk keseharian
        
        {"Roko Super 1           ","19000"}, {"Roko Magnum            ","17500"},
        {"Roko Djarum Coklat 1   ","13500"}, {"Roko Gudang Garam Merah","13000"},
        {"Roko GudangGaram FIL   ","19500"}, {"Roko Sampoerna Kretek  ","13000"},
        {"Roko Sampoerna Mild    ","25000"}, {"Roko Dji Sam Soe Kretek","18000"},
        {"Roko DjiSamSoe Premium ","20000"}, {"Roko Super 2           ","180500"},
        {"Roko Djarum Coklat 2   ","128500"},{"Roko Magnum 2          ","167000"},
        {"Roko Gudang Garam Merah","126000"},{"Protex                 ","5000"},
        {"Kotex                  ","5000"},  {"Pamper (S)             ","18500"},
        {"Pamper (M)             ","19000"}, {"Pamper (L)             ","9000"},
        {"Pamper (XL)            ","24000"}, {"Citra                  ","9000"},
        {"Hit Magic              ","10000"}, {"Rexona Men             ","3500"},
        {"Rexona Women           ","3500"},  {"Tissue                 ","1000"},
        {"Marina                 ","3500"},  {"Sidia                  ","15000"},
        {"Bygon                  ","3500"},
        //End list produk keseharian
      
        //list gas
        
        {"Gas LPG 3 Kg           ","24000"}, {"Gas Korek api Tokkai   ","2000"},
        //End list gas
        };
        
         //variabel penampung pesanan pelanggan
        String namaProduk [] = new String [1000];
        int hargaProduk [] = new int [1000];
        int jumlahPesan [] = new int [1000];
        int totalHarga []  = new int [1000]; 
        int a = 0, i =0, n = 1; 
        String jawaban3 = null;
        
    
        
        //Penjumlahan all
        int totalJenis, totalBayarJenis,totalBayar,uangBayar, kurang, kembalian;
        uangBayar = 0;
        totalJenis = 0;
        totalBayarJenis = 0;
        totalBayar = 0;
        kurang = 0;
        kembalian = 0;
        //End Deklarasi dan Inisialisasi
        

    
        //nama toko
        while (true) {
        System.out.println("╓──────────────────────────╖");
        System.out.println("║"+BLUE+RED+"██████████"+BLUE+"║E-GROSIR║"+RED+"█████████"+NORMAL+"║");
        System.out.println("╠══════════════════════════╣");
        System.out.println("│╔═══════╣"+BLUE+"Src Dua Putra"+NORMAL+"╠═══════╗│");
        System.out.println(NORMAL+"│║"+BLUE+RED+"  Jl. H.Idris-Sukamukti-Kec.Majalaya  "+NORMAL+"║│");
        System.out.println("│║"+BLUE+RED+"         Kab.Bandung 40392            "+NORMAL+"║│");
        System.out.println("│╠════════════════════════╣│");
        System.out.println("│║"+BLUE+"          Pilih List Program          "+NORMAL+"║│");
        System.out.println("│╠════════════════════════╣│");
        System.out.println("│║"+BLUE+"     (1) Cara Penggunaan E-Grosir     "+NORMAL+"║│");
        System.out.println("│║"+BLUE+"     (2) Lihat List Produk            "+NORMAL+"║│");
        System.out.println("│║"+BLUE+"     (3) Pesan Produk                 "+NORMAL+"║│");
        System.out.println("│║"+BLUE+"     (4) Keluar Program               "+NORMAL+"║│");
        System.out.println("│╚════════════════════════╝│");
        System.out.println("╙──────────────────────────╜");
        System.out.print    (BLUE_BOLD+"► Pilih (1-4) : "+NORMAL);
        pilihListUtama=input.nextInt();
        
        
        //list utama
        if (pilihListUtama == 1){
             
          System.out.println("\n");
          System.out.println("─────────────────────────────────────────");
          System.out.println("▒▒▒▒▒▒▒▒▒│Cara Pengunaan System E-Grosir│▒▒▒▒▒▒▒▒▒▒▒");
          System.out.println("─────────────────────────────────────────");
          System.out.println("1. Buka aplikasi                                                ");
          System.out.println("2. Lalu masuk                                                   ");
          System.out.println("3. Jika anda telah masuk dan  menemukan list pilihan program ");
          System.out.println("   seperti dibawah ini : ↓");
          System.out.println("╓──────────────────────────╖");
        System.out.println("║"+BLUE+RED+"██████████"+BLUE+"║E-GROSIR║"+RED+"█████████"+NORMAL+"║");
        System.out.println("╠══════════════════════════╣");
        System.out.println("│╔═══════╣"+BLUE+"Src Dua Putra"+NORMAL+"╠═══════╗│");
        System.out.println(NORMAL+"│║"+BLUE+RED+"  Jl. H.Idris-Sukamukti-Kec.Majalaya  "+NORMAL+"║│");
        System.out.println("│║"+BLUE+RED+"         Kab.Bandung 40392            "+NORMAL+"║│");
        System.out.println("│╠════════════════════════╣│");
        System.out.println("│║"+BLUE+"          Pilih List Program          "+NORMAL+"║│");
        System.out.println("│╠════════════════════════╣│");
        System.out.println("│║"+BLUE+"     (1) Cara Penggunaan E-Grosir     "+NORMAL+"║│");
        System.out.println("│║"+BLUE+"     (2) Lihat List Produk            "+NORMAL+"║│");
        System.out.println("│║"+BLUE+"     (3) Pesan Produk                 "+NORMAL+"║│");
        System.out.println("│║"+BLUE+"     (4) Keluar Program               "+NORMAL+"║│");
        System.out.println("│╚════════════════════════╝│");
        System.out.println("╙──────────────────────────╜");
          System.out.print    (BLUE_BOLD+"► Pilih (1-4) : "+NORMAL);
          System.out.println("\n");
          System.out.println("4. Silahkan masukan nomor pilihan anda dari ");
          System.out.println("   no. 1 sampai dengan 4 sesuai pilihan anda");
          System.out.println("   Misalkan Seperti dibawah ini :");
          System.out.println(BLUE_BOLD+"  ► Pilih (1-4) : "+NORMAL+"(Jika Pilih no 1)");
          System.out.println("     Maka Akan Di Arahkan Ke Tutorial Penggunaan E-Grosir");
            System.out.println("");
          System.out.println(BLUE_BOLD+"  ► Pilih (1-4) : "+NORMAL+"(Jika Pilih no 2)");
          System.out.println("     Maka Akan Di Arahkan Ke Menu List Produk ");
            System.out.println("");
          System.out.println(BLUE_BOLD+"  ► Pilih (1-4) : "+NORMAL+"(Jika Pilih no 3)");
          System.out.println("     Maka kita akan diarahkan menuju program Pesan Produk");
            System.out.println("");
          System.out.println(BLUE_BOLD+"  ► Pilih (1-4) : "+NORMAL+"(Jika Pilih no 4)");
          System.out.println("     Untuk Mematikan Program");
            System.out.println("");
          System.out.println("──────────────────────────────────────────");
            
            
        }else if(pilihListUtama == 2){
            
        System.out.println("\n");
        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║"+BLUE+"                         LIST PRODUK                      "+NORMAL+"║");
        System.out.println("╠═════════════════════════════════════╣");
        System.out.println("║"+BLUE+"                   1). Sembako                            "+NORMAL+"║ ");
        System.out.println("║"+BLUE+"                   2). Makanan dan minuman                "+NORMAL+"║ ");
        System.out.println("║"+BLUE+"                   3). Alat cuci dan sabun                "+NORMAL+"║ ");
        System.out.println("║"+BLUE+"                   4). Obat-obatan                        "+NORMAL+"║ ");
        System.out.println("║"+BLUE+"                   5). Produk keseharian                  "+NORMAL+"║ ");
        System.out.println("║"+BLUE+"                   6). Gas                                "+NORMAL+"║ ");
        System.out.println("║"+BLUE+"                   7). Tampilkan Semua                    "+NORMAL+"║ ");
        System.out.println("╚═════════════════════════════════════╝");

        //input list Produk
        System.out.print(BLUE+"► Pilih List Produk : ");
        pilihListProduk=input.nextInt();
        
        switch (pilihListProduk){
            case 1 :
           System.out.println("\n");
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                      LIST PRODUK SEMBAKO(1-50)                 ");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"BERAS"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  1. Beras                       Rp.9000               /liter  ");//9000
           System.out.println("  2. Beras                       Rp.255000             /karung ");//255000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"TELOR"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  3. Telor                       Rp.6500                1/4 Kg  ");//6500
           System.out.println("  4. Telor                       Rp.1200                1/2 Kg  ");//1200
           System.out.println("  5. Telor                       Rp.24000               1 Kg    ");//24000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"MINYAK/MENTEGA"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  6. Fortune                     Rp.19000               1 Liter ");//19000
           System.out.println("  7. Fortune                     Rp.37500               2 Liter ");//37500
           System.out.println("  8. Sedap                       Rp.19000               1 Liter ");//19000
           System.out.println("  9. Minyak                      Rp.5000                1/4 Kg  ");//5000
           System.out.println("  10. Minyak                     Rp.9500                1/2 Kg  ");//9500
           System.out.println("  11. Minyak                     Rp.19000               1   Kg  ");//19000
           System.out.println("  12 Mentega                     Rp.3500                1/4 Kg  ");//3500
           System.out.println("  13. Palmia                     Rp.9500                1   Pcs ");//9500
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"MIE"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  14. Indomie Bawang             Rp.94000                 /Dus  ");//94000
           System.out.println("  15. Indomie Soto               Rp.94000                 /Dus  ");//94000
           System.out.println("  16. Indomie Empal Gentong      Rp.100000                /Dus  ");//100000
           System.out.println("  17. Indomie Kocok Bandung      Rp.100000                /Dus  ");//100000
           System.out.println("  18. Indomie Goreng             Rp.99000                 /Dus  ");//99000
           System.out.println("  19. Mie Sedap Goreng           Rp.98000                 /Dus  ");//98000
           System.out.println("  20. Mie Sedap Korea            Rp.98000                 /Dus  ");//98000
           System.out.println("  21. Mie Sukses isi 2           Rp.73000                 /Dus  ");//73000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"BUMBU DAPUR"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  22. Royco Ayam                 Rp.5000                /Renceng");//5000
           System.out.println("  23. Royco Sapi                 Rp.5000                /Renceng");//5000
           System.out.println("  24. Bumbu racik Ayam goreng    Rp.15000               /Renceng");//15000
           System.out.println("  25. Bumbu racik Nasi goreng    Rp.15000               /Renceng");//15000
           System.out.println("  26. Bumbu racik Tempe          Rp.15000               /Renceng");//15000
           System.out.println("  27. Micin 50 Gram              Rp.2500                /Renceng");//2500
           System.out.println("  28. Lada                       Rp.5000                /Renceng");//5000
           System.out.println("  29. Kecap                      Rp.5000                /Renceng");//5000
           System.out.println("  30. Garam                      Rp.50000                /Pack  ");//50000
           System.out.println("  31. Saos Indofood              Rp.9000                 /Pack  ");//9000
           System.out.println("  32. Royco Ayam 250 gram        RP.5000                 /Pcs   ");//5000
           System.out.println("  33. Royco Sapi 250 gram        Rp.5000                 /Pcs   ");//5000
           System.out.println("  34. Garam                      Rp.2000                 /Pcs   ");//2000
           System.out.println("  35. Santan                     Rp.3500                 /Pcs   ");//3500
           System.out.println("  36. Micin                      Rp.9500                 1/4 Pcs");//9500
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"Tepung"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  37. Tepung Kanji               Rp.2500                 1/4 Kg ");//2500
           System.out.println("  38. Tepung Tapioka             Rp.3000                 1/4 Kg ");//3000
           System.out.println("  39. Tepung Kanji               Rp.4000                 1/2 Kg ");//4000
           System.out.println("  40. Tepung Tapioka             Rp.4500                 1/2 Kg ");//4500
           System.out.println("  41. Tepung Kanji               Rp.7000                 /Kg    ");//7000
           System.out.println("  42. Tepung Tapioka             Rp.7000                 /Kg    ");//7000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"Kerupuk"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  43. Kerupuk Mp (Seblak)        Rp.3500                 1/4 Kg ");//3500
           System.out.println("  44. Kerupuk Sumber sari        Rp.5500                 1/4 Kg ");//5500
           System.out.println("  45. Makroni Kecil              Rp.4500                 1/4 Kg ");//4500
           System.out.println("  46. Makroni Besar              Rp.4500                 1/4 Kg ");//4500
           System.out.println("  47. Kerupuk Mp (Seblak)        Rp.13000                   /Kg ");//13000
           System.out.println("  48. Kerupuk Sumber Sari        Rp.20000                   /Kg ");//20000
           System.out.println("  49. Makroni Kecil              Rp.15500                   /Kg ");//15500
           System.out.println("  50. Makroni Besar              Rp.15500                   /Kg ");//15500
           System.out.println("───────────────────────────────────────────");
                System.out.println("───────────────────────────────────────────");
        
           break;
           
            case 2 :
                
           System.out.println("\n");
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                     LIST PRODUK MAKANAN (51-69)                   ");
           System.out.println("├─────────────────────────────────────────┤");//harga
           System.out.println(" 51. Nabati Rolls              Rp.8500              /Dus       ");//8500
           System.out.println(" 52. Nabati Wafer Keju         Rp.8500              /Dus       ");//8500
           System.out.println(" 53. Nabati Wafer Coklat       Rp.8500              /Dus       ");//8500
           System.out.println(" 54. Nabati Ahh                Rp.8500              /Dus       ");//8500
           System.out.println(" 55. Nabati SIP                Rp.8500              /Dus       ");//8500
           System.out.println(" 56. Chocolatos                Rp.10500             /Dus       ");//10500
           System.out.println(" 57. Oreo Soft cake            Rp.21000             /Dus       ");//21000
           System.out.println(" 58. Oreo Biskuit              p.21000              /Dus       ");//21000
           System.out.println(" 59. Tango Wafer               Rp.8500              /Dus       ");//8500
           System.out.println(" 60. Chocopy                   Rp.20000             /Dus       ");//20000
           System.out.println(" 61. Bengbeng                  Rp.27000             /Dus       ");//27000
           System.out.println(" 62. Slai Olay                 Rp.10500             /Dus       ");//10500
           System.out.println(" 63. Qtela                     Rp.17000             /Renceng   ");//17000
           System.out.println(" 64. Japota                    Rp.17000             /Renceng   ");//17000
           System.out.println(" 65. Lay's                     Rp.18000             /Renceng   ");//18000
           System.out.println(" 66. Taro                      Rp.9000              /Renceng   ");//9000
           System.out.println(" 67. Malkis Aroma              Rp.8500              /Renceng   ");//8500
           System.out.println(" 68. Malkis Abon               Rp.8500              /Renceng   ");//8500
           System.out.println(" 69. Sosis Sonice              Rp.19000             /Toples    ");//19000
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("");
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                      LIST PRODUK MINUMAN (70-113)                 ");
           System.out.println("├─────────────────────────────────────────┤");//harga
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"MINUMAN SEDUH"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 70. Kopi Luak                 Rp.10500             /Renceng   ");//10500
           System.out.println(" 71. Kopi Good Day             Rp.10000             /Renceng   ");//10000
           System.out.println(" 72. Kopi ABC susu             Rp.10000             /Renceng   ");//10000
           System.out.println(" 73. Kopi creamelatte          Rp.13500             /Renceng   ");//13500
           System.out.println(" 74. Kopi Tora Duo             Rp.10500             /Renceng   ");//10500
           System.out.println(" 75. Kopi Kapal Api            Rp.10500             /Renceng   ");//10500
           System.out.println(" 76. Kopi Tora Susu            Rp.10000             /Renceng   ");//10000
           System.out.println(" 77. Susu Indomilk vanilla     Rp.7500              /Renceng   ");//7500
           System.out.println(" 78. Susu Indomilk coklat      Rp.7500              /Renceng   ");//7500
           System.out.println(" 79. Susu Frisienflag vanila   Rp.7500              /Renceng   ");//7500
           System.out.println(" 80. Susu Frisienflag coklat   Rp.7500              /Renceng   ");//7500
           System.out.println(" 81. Energen vanila            Rp.13000             /Renceng   ");//13000
           System.out.println(" 82. Energen coklat            Rp.13000             /Renceng   ");//13000
           System.out.println(" 83. Marimas                   Rp.3000              /Renceng   ");//3000
           System.out.println(" 84. Teh Sisri                 Rp.3000              /Renceng   ");//
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"MINUMAN KEMASAN"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 85. Galon Aqua                Rp.18000              /Galon    ");//18000
           System.out.println(" 86. Lemineral                 Rp.19000              /Galon    ");//19000
           System.out.println(" 87. Floridina                 Rp.29500              /Pack     ");//29500
           System.out.println(" 88. Milku                     Rp.29000              /Pack     ");//29000
           System.out.println(" 89. Sprit                     Rp.45000              /Pack     ");//45000
           System.out.println(" 90. Golda                     Rp.27500              /Pack     ");//27500
           System.out.println(" 91. Fanta                     Rp.45000              /Pack     ");//45000
           System.out.println(" 92. Isoplus                   Rp.27000              /Pack     ");//27000
           System.out.println(" 93. Sierra Botol              Rp.39000              /Dus      ");//39000
           System.out.println(" 94. Teh Pucuk                 Rp.53000              /Dus      ");//53000
           System.out.println(" 95. Mizone                    Rp.39000              /Dus      ");//39000
           System.out.println(" 96. Pocari Sweet              Rp.116000             /Dus      ");//116000
           System.out.println(" 97. Larutan Cap Kaki Tiga     Rp.120000             /Dus      ");//120000
           System.out.println(" 98. Adem Sari Chingku         Rp.125000             /Dus      ");//125000
           System.out.println(" 99. Susu Beruang              Rp.267000             /Dus      ");//267000
           System.out.println(" 100. Larutan Anak             Rp.55000              /Dus      ");//55000
           System.out.println(" 101. Teh Kotak                Rp.67000              /Dus      ");//67000
           System.out.println(" 102. Indomilk vanilla         Rp.96000              /Dus      ");//96000
           System.out.println(" 103. Indomilk Coklat          Rp.96000              /Dus      ");//96000
           System.out.println(" 104. Indomilk Stoberry        Rp.96000              /Dus      ");//96000
           System.out.println(" 105. Kopikap                  Rp.19500              /Dus      ");//19500
           System.out.println(" 106. Teh Sisri                Rp.19000              /Dus      ");//19000
           System.out.println(" 107. Power-F                  Rp.18000              /Dus      ");//18000
           System.out.println(" 108. Ale-Ale                  Rp.18000              /Dus      ");//18000
           System.out.println(" 109. Sierra Gelas             Rp.17500              /Dus      ");//17500
           System.out.println(" 110. Teh Rio                  Rp.18000              /Dus      ");//18000
           System.out.println(" 111. Teh Ngaso                Rp.19500              /Dus      ");//19500
           System.out.println(" 112. Teh Hijau                Rp.10500              /Dus      ");//10500
           System.out.println(" 113. Larutan                  Rp.17500              /Losin    ");//17500
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("───────────────────────────────────────────");
           
           break;
           
            case 3 :

           System.out.println("\n"); 
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("               LIST PRODUK ALAT MANDI SABUN (114-129)              ");
           System.out.println("├─────────────────────────────────────────┤");//harga
           System.out.println(" 114. Sabun give                 Rp.2000             /pcs       ");//2000
           System.out.println(" 115. Sabun lifeboy              Rp.3500             /pcs       ");//3500
           System.out.println(" 116. Sabun nuvo                 Rp.2000             /pcs       ");//2000   
           System.out.println(" 117. Sabun Dettol               Rp.4500             /pcs       ");//4500
           System.out.println(" 118. Ciptadent                  Rp.3000             /pcs       ");//3000
           System.out.println(" 119. Pepsodent                  Rp.3500             /pcs       ");//3500
           System.out.println(" 120. Kodomo                     Rp.3500             /pcs       ");//3500
           System.out.println(" 121. Sikat gigi Formula         Rp.3000             /pcs       ");//3000
           System.out.println(" 122. Sikat gigi sistema         Rp.5500             /pcs       ");//5500
           System.out.println(" 123. Sikat gigi ciptaden        RP.3500             /pcs       ");//3500
           System.out.println(" 124. Gillate                    Rp.7500             /pcs       ");//7500
           System.out.println(" 125. Sampo sunsik               Rp.10000            /renceng   ");//10000
           System.out.println(" 126. Sampo zinc                 Rp.5000             /renceng   ");//5000
           System.out.println(" 127. Sampo lifeboy              Rp.10000            /renceng   ");//10000
           System.out.println(" 128. Sampo pantene              Rp.10000            /renceng   ");//10000
           System.out.println(" 129. Sampo head and sholder     Rp.10000            /renceng   ");//10000
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("             LIST PRODUK ALAT CUCI DAN SABUN (130-145)             ");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"SABUN"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 130.  Sunlight                 Rp.1000             /pcs        ");//1000
           System.out.println(" 131.  Sunlight Besar           Rp.2000             /pcs        ");//2000
           System.out.println(" 132.  Mamalemon                Rp.1000             /pcs        ");//1000
           System.out.println(" 133.  Mamalemon Besar          Rp.2000             /pcs        ");//2000
           System.out.println(" 134.  Agung Besar              Rp.5000             /Pcs        ");//5000
           System.out.println(" 135.  Agung                    Rp.1000             /Pcs        ");//1000
           System.out.println(" 136.  Wypoll                   Rp.1000             /Pcs        ");//1000
           System.out.println(" 137.  Daya                     Rp.5000             /Pcs        ");//5000
           System.out.println(" 138.  Boom                     Rp.5000             /Pcs        ");//5000
           System.out.println(" 139. Rinso                     Rp.5000             /Renceng    ");//5000
           System.out.println(" 140. Daya                      Rp.5000             /Renceng    ");//5000
           System.out.println(" 141. Molto                     Rp.5000             /Renceng    ");//5000
           System.out.println(" 142. Downy                     Rp.5000             /Renceng    ");//5000
           System.out.println(" 143  Liquid                    Rp.5000             /Renceng    ");//5000
           System.out.println(" 144. Soklin Lantai             Rp.5000             /Renceng    ");//5000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"ALAT"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 145. Spon                      Rp.2000             /Pcs        ");//2000
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("───────────────────────────────────────────");
                System.out.println("");

           break;
           
            case 4 :
           System.out.println("\n");
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                     LIST OBAT-OBATAN  (146-159)                 ");
           System.out.println("├─────────────────────────────────────────┤");//harga
           System.out.println(" 146. Bodrex                    Rp.8500                /Lembar  ");//8500
           System.out.println(" 147. Misagrip                  Rp.2500                /lembar  ");//2500
           System.out.println(" 148. Paramex                   Rp.2500                /Lembar  ");//2500
           System.out.println(" 149. Oskadon                   Rp.2000                /Lembar  ");//2000
           System.out.println(" 150. Nafacin                   Rp.3000                /Lembar  ");//3000
           System.out.println(" 151. Kontreksin                Rp.1000                /Lembar  ");//1000
           System.out.println(" 152. Neoromasil                Rp.8000                /Lembar  ");//8000
           System.out.println(" 153. Poldanmilk                Rp.3000                /Lembar  ");//3000
           System.out.println(" 154. Promagh                   Rp.8500                /Lembar  ");//8500
           System.out.println(" 155. Vitacimin                 Rp.3000                /Lembar  ");//3000
           System.out.println(" 156. Kontreksin                Rp.1000                /Lembar  ");//1000
           System.out.println(" 157. Tolak angin               Rp.3000                /Pcs     ");//3000
           System.out.println(" 158. Antangin                  Rp.3000                /Pcs     ");//3000
           System.out.println(" 159. Madu Rasa                 Rp.2000                /Pcs     ");//2000
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("───────────────────────────────────────────");
                System.out.println("");
           
           break;
   
            case 5 :
                
           System.out.println("\n");
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                  LIST PRODUK KESEHARIAN  (160-186)             ");
           System.out.println("├─────────────────────────────────────────┤");//harga
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"LIST ROKOK"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 160. Super                     Rp.19000              /Bungkus  ");//19000
           System.out.println(" 161. Mangnum                   Rp.17500              /Bungkus  ");//17500
           System.out.println(" 162. Djarum Coklat             Rp.13500              /Bungkus  ");//13500
           System.out.println(" 163. Gudang Garam Merah        Rp.13000              /Bungkus  ");//13000
           System.out.println(" 164. Gudang Garam FIlter       Rp.19500              /Bungkus  ");//19500
           System.out.println(" 165. Sampoerna Kretek          Rp.13000              /Bungkus  ");//13000
           System.out.println(" 166. Sampoerna Mild            Rp.25000              /Bungkus  ");//25000
           System.out.println(" 167. Dji Sam Soe Kretek        Rp.18000              /Bungkus  ");//18000
           System.out.println(" 168. Dji Sam Soe Premium       Rp.20000              /Bungkus  ");//20000
           System.out.println(" 169. Roko Super                Rp.180500             /Pack     ");//180500
           System.out.println(" 170. Djarum Coklat             Rp.128500             /Pack     ");//128500
           System.out.println(" 171. Magnum                    Rp.167000             /Pack     ");//167000
           System.out.println(" 172. Gudang Garam Merah        Rp.126000             /Pack     ");//126000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ "+RED+"LIST PEMAKAIAN"+BLUE+" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 173. Protex                    Rp.5000               /Renceng  ");//5000
           System.out.println(" 174. Kotex                     Rp.5000               /Renceng  ");//5000
           System.out.println(" 175. Pamper (S)                Rp.18500              /Renceng  ");//18500
           System.out.println(" 176. Pamper (M)                Rp.19000              /Renceng  ");//19000
           System.out.println(" 177. Pamper (L)                Rp.19000              /Renceng  ");//19000
           System.out.println(" 178. Pamper (XL)               Rp.24000              /Renceng  ");//24000
           System.out.println(" 179. Citra                     Rp.9000               /Renceng  ");//9000
           System.out.println(" 180. Hit Magic                 Rp.10000              /Renceng  ");//10000 
           System.out.println(" 181. Rexona Men                Rp.3500               /Pcs      ");//3500
           System.out.println(" 182. Rexona Womwn              Rp.3500               /Pcs      ");//3500
           System.out.println(" 183. Tissue                    Rp.1000               /Pcs      ");//1000
           System.out.println(" 184. Marina                    Rp.3500               /Botol    ");//3500
           System.out.println(" 185. Sidia                     Rp.15000              /Botol    ");//15000
           System.out.println(" 186. Bygon                     Rp.3500               /Dus      ");//3500
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("───────────────────────────────────────────");
                System.out.println("");
           
           break;
           
            case 6 :
          
           System.out.println("\n");
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                        LIST PRODUK GAS (187-188)                ");
           System.out.println("├─────────────────────────────────────────┤");//harga
           System.out.println(" 187. Gas LPG                   Rp.24000                3 Kg    ");//24000
           System.out.println(" 188. Gas Korek api Tokkai      Rp.2000                 /Pcs    ");//2000
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("───────────────────────────────────────────");
                System.out.println("");
           
           break;
           
            case 7 :
           
           System.out.println("\n");
           
           System.out.println("┌─────────────────────────────────────────┐");
           System.out.println("                        LIST SEMUA PRODUK (1-188)                   ");
                System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" NO. NAMA PRODUK                HARGA                   SATUAN   ");
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println(" 1. Beras                       Rp.9000                 /liter   ");//9000
           System.out.println(" 2. Beras                       Rp.255000               /karung  ");//255000
           System.out.println(" 3. Telor                       Rp.6500                 1/4 Kg   ");//6500
           System.out.println(" 4. Telor                       Rp.1200                 1/2 Kg   ");//1200
           System.out.println(" 5. Telor                       Rp.24000                1 Kg     ");//24000
           System.out.println(" 6. Fortune                     Rp.19000                1 Liter  ");//19000
           System.out.println(" 7. Fortune                     Rp.37500                2 Liter  ");//37500
           System.out.println(" 8. Sedap                       Rp.19000                1 Liter  ");//19000
           System.out.println(" 9. Minyak                      Rp.5000                 1/4 Kg   ");//5000
           System.out.println(" 10. Minyak                     Rp.9500                 1/2 Kg   ");//9500
           System.out.println(" 11. Minyak                     Rp.19000                1   Kg   ");//19000
           System.out.println(" 12. Mentega                    Rp.3500                 1/4 Kg   ");//3500
           System.out.println(" 13. Palmia                     Rp.9500                 1   Pcs  ");//9500
           System.out.println(" 14. Indomie Bawang             Rp.94000                /Dus     ");//94000
           System.out.println(" 15. Indomie Soto               Rp.94000                /Dus     ");//94000
           System.out.println(" 16. Indomie Empal Gentong      Rp.100000               /Dus     ");//100000
           System.out.println(" 17. Indomie Kocok Bandung      Rp.100000               /Dus     ");//100000
           System.out.println(" 18. Indomie Goreng             Rp.99000                /Dus     ");//99000
           System.out.println(" 19. Mie Sedap Goreng           Rp.98000                /Dus     ");//98000
           System.out.println(" 20. Mie Sedap Korea            Rp.98000                /Dus     ");//98000
           System.out.println(" 21. Mie Sukses isi 2           Rp.73000                /Dus     ");//73000
           System.out.println(" 22. Royco Ayam                 Rp.5000                 /Renceng ");//5000
           System.out.println(" 23. Royco Sapi                 Rp.5000                 /Renceng ");//5000
           System.out.println(" 24. Bumbu racik Ayam goreng    Rp.15000                /Renceng ");//15000
           System.out.println(" 25. Bumbu racik Nasi goreng    Rp.15000                /Renceng ");//15000
           System.out.println(" 26. Bumbu racik Tempe          Rp.15000                /Renceng ");//15000
           System.out.println(" 27. Micin 50 Gram              Rp.2500                 /Renceng ");//2500
           System.out.println(" 28. Lada                       Rp.5000                 /Renceng ");//5000
           System.out.println(" 29. Kecap                      Rp.5000                 /Renceng ");//5000
           System.out.println(" 30. Garam                      Rp.50000                /Pack    ");//50000
           System.out.println(" 31. Saos Indofood              Rp.9000                 /Pack    ");//9000
           System.out.println(" 32. Royco Ayam 250 gram        RP.5000                 /Pcs     ");//5000
           System.out.println(" 33. Royco Sapi 250 gram        Rp.5000                 /Pcs     ");//5000
           System.out.println(" 34. Garam                      Rp.2000                 /Pcs     ");//2000
           System.out.println(" 35. Santan                     Rp.3500                 /Pcs     ");//3500
           System.out.println(" 36. Micin                      Rp.9500                 1/4 Pcs  ");//9500
           System.out.println(" 37. Tepung Kanji               Rp.2500                 1/4 Kg   ");//2500
           System.out.println(" 38. Tepung Tapioka             Rp.3000                 1/4 Kg   ");//3000
           System.out.println(" 39. Tepung Kanji               Rp.4000                 1/2 Kg   ");//4000
           System.out.println(" 40. Tepung Tapioka             Rp.4500                 1/2 Kg   ");//4500
           System.out.println(" 41. Tepung Kanji               Rp.7000                 /Kg      ");//7000
           System.out.println(" 42. Tepung Tapioka             Rp.7000                 /Kg      ");//7000
           System.out.println(" 43. Kerupuk Mp (Seblak)        Rp.3500                 1/4 Kg   ");//3500
           System.out.println(" 44. Kerupuk Sumber sari        Rp.5500                 1/4 Kg   ");//5500
           System.out.println(" 45. Makroni Kecil              Rp.4500                 1/4 Kg   ");//4500
           System.out.println(" 46. Makroni Besar              Rp.4500                 1/4 Kg   ");//4500
           System.out.println(" 47. Kerupuk Mp (Seblak)        Rp.13000                /Kg      ");//13000
           System.out.println(" 48. Kerupuk Sumber Sari        Rp.20000                /Kg      ");//20000
           System.out.println(" 49. Makroni Kecil              Rp.15500                /Kg      ");//15500
           System.out.println(" 50. Makroni Besar              Rp.15500                /Kg      ");//15500
           System.out.println(" 51. Nabati Rolls               Rp.8500                 /Dus     ");//8500
           System.out.println(" 52. Nabati Wafer Keju          Rp.8500                 /Dus     ");//8500
           System.out.println(" 53. Nabati Wafer Coklat        Rp.8500                 /Dus     ");//8500
           System.out.println(" 54. Nabati Ahh                 Rp.8500                 /Dus     ");//8500
           System.out.println(" 55. Nabati SIP                 Rp.8500                 /Dus     ");//8500
           System.out.println(" 56. Chocolatos                 Rp.10500                /Dus     ");//10500
           System.out.println(" 57. Oreo Soft cake             Rp.21000                /Dus     ");//21000
           System.out.println(" 58. Oreo Biskuit               Rp.21000                /Dus     ");//21000
           System.out.println(" 59. Tango Wafer                Rp.8500                 /Dus     ");//8500
           System.out.println(" 60. Chocopy                    Rp.20000                /Dus     ");//20000
           System.out.println(" 61. Bengbeng                   Rp.27000                /Dus     ");//27000
           System.out.println(" 62. Slai Olay                  Rp.10500                /Dus     ");//10500
           System.out.println(" 63. Qtela                      Rp.17000                /Renceng ");//17000
           System.out.println(" 64. Japota                     Rp.17000                /Renceng ");//17000
           System.out.println(" 65. Lay's                      Rp.18000                /Renceng ");//18000
           System.out.println(" 66. Taro                       Rp.9000                 /Renceng ");//9000
           System.out.println(" 67. Malkis Aroma               Rp.8500                 /Renceng ");//8500
           System.out.println(" 68. Malkis Abon                Rp.8500                 /Renceng ");//8500
           System.out.println(" 69. Sosis Sonice               Rp.19000                /Toples  ");//19000
           System.out.println(" 70. Kopi Luak                  Rp.10500                /Renceng ");//10500
           System.out.println(" 71. Kopi Good Day              Rp.10000                /Renceng ");//10000
           System.out.println(" 72. Kopi ABC susu              Rp.10000                /Renceng ");//10000
           System.out.println(" 73. Kopi creamelatte           Rp.13500                /Renceng ");//13500
           System.out.println(" 74. Kopi Tora Duo              Rp.10500                /Renceng ");//10500
           System.out.println(" 75. Kopi Kapal Api             Rp.10500                /Renceng ");//10500
           System.out.println(" 76. Kopi Tora Susu             Rp.10000                /Renceng ");//10000
           System.out.println(" 77. Susu Indomilk vanilla      Rp.7500                 /Renceng ");//7500
           System.out.println(" 78. Susu Indomilk coklat       Rp.7500                 /Renceng ");//7500
           System.out.println(" 79. Susu Frisienflag vanila    Rp.7500                 /Renceng ");//7500
           System.out.println(" 80. Susu Frisienflag coklat    Rp.7500                 /Renceng ");//7500
           System.out.println(" 81. Energen vanila             Rp.13000                /Renceng ");//13000
           System.out.println(" 82. Energen coklat             Rp.13000                /Renceng ");//13000
           System.out.println(" 83. Marimas                    Rp.3000                 /Renceng ");//3000
           System.out.println(" 84. Teh Sisri                  Rp.3000                 /Renceng ");//
           System.out.println(" 85. Galon Aqua                 Rp.18000                /Galon   ");//18000
           System.out.println(" 86. Lemineral                  Rp.19000                /Galon   ");//19000
           System.out.println(" 87. Floridina                  Rp.29500                /Pack    ");//29500
           System.out.println(" 88. Milku                      Rp.29000                /Pack    ");//29000
           System.out.println(" 89. Sprit                      Rp.45000                /Pack    ");//45000
           System.out.println(" 90. Golda                      Rp.27500                /Pack    ");//27500
           System.out.println(" 91. Fanta                      Rp.45000                /Pack    ");//45000
           System.out.println(" 92. Isoplus                    Rp.27000                /Pack    ");//27000
           System.out.println(" 93. Sierra Botol               Rp.39000                /Dus     ");//39000
           System.out.println(" 94. Teh Pucuk                  Rp.53000                /Dus     ");//53000
           System.out.println(" 95. Mizone                     Rp.39000                /Dus     ");//39000
           System.out.println(" 96. Pocari Sweet               Rp.116000               /Dus     ");//116000
           System.out.println(" 97. Larutan Cap Kaki Tiga      Rp.120000               /Dus     ");//120000
           System.out.println(" 98. Adem Sari Chingku          Rp.125000               /Dus     ");//125000
           System.out.println(" 99. Susu Beruang               Rp.267000               /Dus     ");//267000
           System.out.println(" 100. Larutan Anak              Rp.55000                /Dus     ");//55000
           System.out.println(" 101. Teh Kotak                 Rp.67000                /Dus     ");//67000
           System.out.println(" 102. Indomilk vanilla          Rp.96000                /Dus     ");//96000
           System.out.println(" 103. Indomilk Coklat           Rp.96000                /Dus     ");//96000
           System.out.println(" 104. Indomilk Stoberry         Rp.96000                /Dus     ");//96000
           System.out.println(" 105. Kopikap                   Rp.19500                /Dus     ");//19500
           System.out.println(" 106. Teh Sisri                 Rp.19000                /Dus     ");//19000
           System.out.println(" 107. Power-F                   Rp.18000                /Dus     ");//18000
           System.out.println(" 108. Ale-Ale                   Rp.18000                /Dus     ");//18000
           System.out.println(" 109. Sierra Gelas              Rp.17500                /Dus     ");//17500
           System.out.println(" 110. Teh Rio                   Rp.18000                /Dus     ");//18000
           System.out.println(" 111. Teh Ngaso                 Rp.19500                /Dus     ");//19500
           System.out.println(" 112. Teh Hijau                 Rp.10500                /Dus     ");//10500
           System.out.println(" 113. Larutan                   Rp.17500                /Losin   ");//17500
           System.out.println(" 114. Sabun give                Rp.2000                 /pcs     ");//2000
           System.out.println(" 115. Sabun lifeboy             Rp.3500                 /pcs     ");//3500
           System.out.println(" 116. Sabun nuvo                Rp.2000                 /pcs     ");//2000   
           System.out.println(" 117. Sabun Dettol              Rp.4500                 /pcs     ");//4500
           System.out.println(" 118. Ciptadent                 Rp.3000                 /pcs     ");//3000
           System.out.println(" 119. Pepsodent                 Rp.3500                 /pcs     ");//3500
           System.out.println(" 120. Kodomo                    Rp.3500                 /pcs     ");//3500
           System.out.println(" 121. Sikat gigi Formula        Rp.3000                 /pcs     ");//3000
           System.out.println(" 122. Sikat gigi sistema        Rp.5500                 /pcs     ");//5500
           System.out.println(" 123. Sikat gigi ciptaden       RP.3500                 /pcs     ");//3500
           System.out.println(" 124. Gillate                   Rp.7500                 /pcs     ");//7500
           System.out.println(" 125. Sampo sunsik              Rp.10000                /renceng ");//10000
           System.out.println(" 126. Sampo zinc                Rp.5000                 /renceng ");//5000
           System.out.println(" 127. Sampo lifeboy             Rp.10000                /renceng ");//10000
           System.out.println(" 128. Sampo pantene             Rp.10000                /renceng ");//10000
           System.out.println(" 129. Sampo head and sholder    Rp.10000                /renceng ");//10000
           System.out.println(" 130. Sunlight                  Rp.1000                 /pcs     ");//1000
           System.out.println(" 131. Sunlight Besar            Rp.2000                 /pcs     ");//2000
           System.out.println(" 132. Mamalemon                 Rp.1000                 /pcs     ");//1000
           System.out.println(" 133. Mamalemon Besar           Rp.2000                 /pcs     ");//2000
           System.out.println(" 134. Agung Besar               Rp.5000                 /Pcs     ");//5000
           System.out.println(" 135. Agung                     Rp.1000                 /Pcs     ");//1000
           System.out.println(" 136. Wypoll                    Rp.1000                 /Pcs     ");//1000
           System.out.println(" 137. Daya                      Rp.5000                 /Pcs     ");//5000
           System.out.println(" 138. Boom                      Rp.5000                 /Pcs     ");//5000
           System.out.println(" 139. Rinso                     Rp.5000                 /Renceng ");//5000
           System.out.println(" 140. Daya                      Rp.5000                 /Renceng ");//5000
           System.out.println(" 141. Molto                     Rp.5000                 /Renceng ");//5000
           System.out.println(" 142. Downy                     Rp.5000                 /Renceng ");//5000
           System.out.println(" 143  Liquid                    Rp.5000                 /Renceng ");//5000
           System.out.println(" 144. Soklin Lantai             Rp.5000                 /Renceng ");//5000
           System.out.println(" 145. Spon                      Rp.2000                 /Pcs     ");//2000
           System.out.println(" 146. Bodrex                    Rp.8500                 /Lembar  ");//8500
           System.out.println(" 147. Misagrip                  Rp.2500                 /lembar  ");//2500
           System.out.println(" 148. Paramex                   Rp.2500                 /Lembar  ");//2500
           System.out.println(" 149. Oskadon                   Rp.2000                 /Lembar  ");//2000
           System.out.println(" 150. Nafacin                   Rp.3000                 /Lembar  ");//3000
           System.out.println(" 151. Kontreksin                Rp.1000                 /Lembar  ");//1000
           System.out.println(" 152. Neoromasil                Rp.8000                 /Lembar  ");//8000
           System.out.println(" 153. Poldanmilk                Rp.3000                 /Lembar  ");//3000
           System.out.println(" 154. Promagh                   Rp.8500                 /Lembar  ");//8500
           System.out.println(" 155. Vitacimin                 Rp.3000                 /Lembar  ");//3000
           System.out.println(" 156. Kontreksin                Rp.1000                 /Lembar  ");//1000
           System.out.println(" 157. Tolak angin               Rp.3000                 /Pcs     ");//3000
           System.out.println(" 158. Antangin                  Rp.3000                 /Pcs     ");//3000
           System.out.println(" 159. Madu Rasa                 Rp.2000                 /Pcs     ");//2000
           System.out.println(" 160. Super                     Rp.19000                /Bungkus ");//19000
           System.out.println(" 161. Mangnum                   Rp.17500                /Bungkus ");//17500
           System.out.println(" 162. Djarum Coklat             Rp.13500                /Bungkus ");//13500
           System.out.println(" 163. Gudang Garam Merah        Rp.13000                /Bungkus ");//13000
           System.out.println(" 164. Gudang Garam FIlter       Rp.19500                /Bungkus ");//19500
           System.out.println(" 165. Sampoerna Kretek          Rp.13000                /Bungkus ");//13000
           System.out.println(" 166. Sampoerna Mild            Rp.25000                /Bungkus ");//25000
           System.out.println(" 167. Dji Sam Soe Kretek        Rp.18000                /Bungkus ");//18000
           System.out.println(" 168. Dji Sam Soe Premium       Rp.20000                /Bungkus ");//20000
           System.out.println(" 169. Roko Super                Rp.180500               /Pack    ");//180500
           System.out.println(" 170. Djarum Coklat             Rp.128500               /Pack    ");//128500
           System.out.println(" 171. Magnum                    Rp.167000               /Pack    ");//167000
           System.out.println(" 172. Gudang Garam Merah        Rp.126000               /Pack    ");//126000
           System.out.println(" 173. Protex                    Rp.5000                 /Renceng ");//5000
           System.out.println(" 174. Kotex                     Rp.5000                 /Renceng ");//5000
           System.out.println(" 175. Pamper (S)                Rp.18500                /Renceng ");//18500
           System.out.println(" 176. Pamper (M)                Rp.19000                /Renceng ");//19000
           System.out.println(" 177. Pamper (L)                Rp.19000                /Renceng ");//19000
           System.out.println(" 178. Pamper (XL)               Rp.24000                /Renceng ");//24000
           System.out.println(" 179. Citra                     Rp.9000                 /Renceng ");//9000
           System.out.println(" 180. Hit Magic                 Rp.10000                /Renceng ");//10000 
           System.out.println(" 181. Rexona Men                Rp.3500                 /Pcs     ");//3500
           System.out.println(" 182. Rexona Womwn              Rp.3500                 /Pcs     ");//3500
           System.out.println(" 183. Tissue                    Rp.1000                 /Pcs     ");//1000
           System.out.println(" 184. Marina                    Rp.3500                 /Botol   ");//3500
           System.out.println(" 185. Sidia                     Rp.15000                /Botol   ");//15000
           System.out.println(" 186. Bygon                     Rp.3500                 /Dus     ");//3500
           System.out.println(" 187. Gas LPG                   Rp.24000                3 Kg     ");//24000
           System.out.println(" 188. Gas Korek api Tokkai      Rp.2000                 /Pcs     ");//2000
           System.out.println("├─────────────────────────────────────────┤");
           System.out.println("  Total Produk : 188                                               ");
           System.out.println("└─────────────────────────────────────────┘");
                System.out.println("───────────────────────────────────────────");
                System.out.println("");
           
           break;
           
            default :
           System.err.println("───────────────────────────────────────────");
           System.err.println("                        Error, Harap Ulangi !!!                 ");
           System.err.println("───────────────────────────────────────────");
           
           break;
           }   
            
        
        }else if (pilihListUtama == 3){
         System.out.println("\n");     
           do{
               
               
//                TotalBayarPorsi = 0;┐│
//               TotalPorsi = 0;
         System.out.println("┌──────────────────────────────────────┐");
         System.out.println("│                        PESAN PRODUK                        │");
         System.out.println("└──────────────────────────────────────┘");
         String ulangPesan;
         //1.pake swtich case 1 sampai 188 dengan memanggil array
          int jumlahProduk = 0,totalProduk = 0;//varibel untuk menjumlahkan total sementara
          do { 
         System.out.print(BLUE+"► Masukan Nomor list Produk (1-188): ");
         pilihProduk=input.nextInt();
              System.out.println(RED+"↓"+NORMAL);
         
          
          switch (pilihProduk) {
                   case 1:
                       System.out.println("Pesanan anda              : "+ listProdukHarga[0][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[0][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan beras berapa liter  : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[0][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[0][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       
                       break; 
                   case 2 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[1][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[1][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan beras berapa karung  : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[1][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[1][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       
                       break;
                       
                   case 3 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[2][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[2][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan telor 1/4 kg (hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[2][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[2][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                   case 4 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[3][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[3][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan telor 1/2 kg (hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[3][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[3][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                   case 5 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[4][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[4][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa kg: ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[4][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[4][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                   case 6 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[5][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[5][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa pcs          : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[5][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[5][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break ;
                   case 7 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[6][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[6][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa pcs          : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[6][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[6][1])*jumlahProduk;
                       totalHarga  [i] = totalProduk;
                       break;
                   case 8 :
                       System.out.println("Pesanan anda              : "+ listProdukHarga[7][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[7][1]+ "  / Liter");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa pcs          : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[7][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[7][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                   case 9 :
                       //Minyak curah 15000
                       System.out.println("Pesanan anda              : "+ listProdukHarga[8][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[8][1]+ "  1/4 Ml");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Minyak 1/4 Ml (hanya 1):");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[8][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[8][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       
                       break;
                       
                    case 10://Minyak curah 2 9500
                       System.out.println("Pesanan anda              : "+ listProdukHarga[9][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[9][1]+ "  1 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Minyak 1/2 Kg(hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[9][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[9][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       
                       break;
                    
                    case 11://Minyak curah 31900
                       System.out.println("Pesanan anda              : "+ listProdukHarga[10][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[10][1]+ "  1 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Minyak Berapa Kg : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[10][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[10][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;                      
                       break;
                       
                    case 12://Mentega3500
                       System.out.println("Pesanan anda              : "+ listProdukHarga[11][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[11][1]+ "  1 Pcs");
                       System.out.print("► Pesan berapa Pcs            : ");
                       System.out.println(RED+"↓"+NORMAL);
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[11][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[11][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 13://Mentega Palmia9500
                       System.out.println("Pesanan anda              : "+ listProdukHarga[12][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[12][1]+ "  1 Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                        jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[12][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[12][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 14://indomie bawang
                       System.out.println("Pesanan anda              : "+ listProdukHarga[13][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[13][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                      jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[13][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[13][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 15://indomie bawang
                       System.out.println("Pesanan anda              : "+ listProdukHarga[14][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[14][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                        jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[14][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[14][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 16://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[15][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[15][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[15][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[15][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 17://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[16][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[16][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[16][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[16][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 18://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[17][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[17][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                      jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[17][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[17][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 19://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[18][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[18][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[18][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[18][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 20://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[19][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[19][1]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[19][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[19][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 21://End Mie
                       System.out.println("Pesanan anda              : "+ listProdukHarga[20][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[20]+ "  /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[20][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[20][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 22://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[21][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[21][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[21][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[21][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 23://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[22][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[22][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[22][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[22][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 24://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[23][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[23][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[23][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[23][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 25://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[24][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[24][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[24][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[24][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 26://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[25][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[25][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[25][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[25][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 27://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[26][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[26][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[26][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[26][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 28://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[27][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[27][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[27][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[27][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 29://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[28][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[28][1]+ "  /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[28][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[28][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 30://Micin satuan
                       System.out.println("► Pesanan anda              : "+ listProdukHarga[29][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[29][1]+ "  /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("Pesan berapa Pack           : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[29][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[29][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 31://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[30][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[30][1]+ "  /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack           : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[30][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[30][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 32://Bumbu Dapur
                       System.out.println("Pesanan anda              : "+ listProdukHarga[31][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[31][1]+ "  /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[31][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[31][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 33://Garam satuan 1
                       System.out.println("Pesanan anda              : "+ listProdukHarga[32][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[32][1]+ "  /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[32][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[32][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 34://Garam satuan 2
                       System.out.println("Pesanan anda              : "+ listProdukHarga[33][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[33][1]+ "  /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[33][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[33][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 35://Santan 
                       System.out.println("Pesanan anda              : "+ listProdukHarga[34][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[34][1]+ "  /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[34][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[34][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 36://saus indofood 
                       System.out.println("Pesanan anda              : "+ listProdukHarga[35][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[35][1]+ "  /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[35][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[35][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 37://Tepung kanji 1/4 Kg
                       System.out.println("Pesanan anda              : "+ listProdukHarga[36][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[36][1]+ "");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan tepung 1/4 Kg (hanya 1): ");
                      jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[36][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[36][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                     
                    case 38://Tepung tapioka 1/4 kg
                       System.out.println("Pesanan anda              : "+ listProdukHarga[37][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[37][1]+ "");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan tepung 1/4 Kg (hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[37][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[37][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                      
                    case 39://Tepung
                       System.out.println("Pesanan anda              : "+ listProdukHarga[38][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[38][1]+ "  1/2 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan tepung 1/2 Kg (hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[38][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[38][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                     
                    case 40://Tepung
                       System.out.println("Pesanan anda              : "+ listProdukHarga[39][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[39][1]+ "  1/2 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan tepung 1/2 Kg (hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[39][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[39][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 41://Tepung
                       System.out.println("Pesanan anda              : "+ listProdukHarga[40][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[40][1]+ "  1 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan tepung berapa Kg : ");
                      jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[40][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[40][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                      
                    case 42://Tepung
                       System.out.println("Pesanan anda              : "+ listProdukHarga[41][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[41][1]+ "  1 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan tepung berapa Kg : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[41][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[41][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 43://Keruupuk
                       System.out.println("Pesanan anda              : "+ listProdukHarga[42][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[42][1]+ "  1/4 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk 1/4 Kg(hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[42][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[42][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 44://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[43][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[43][1]+ "  1/4 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk 1 Kg (hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[43][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[43][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 45://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[44][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[44][1]+ "  1/4  Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk 1/4 Kg(hanya 1): ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[44][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[44][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 46://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[45][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[45][1]+ "  1/4 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk 1/4 Kg (hanya 1): ");
                      jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[45][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[45][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 47://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[46][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[46][1]+ "  /Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk berapa Kg     : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[46][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[46][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 48://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[47][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[47][1]+ "  /Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk berapa Kg     : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[47][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[47][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 49://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[48][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[48][1]+ " /Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk berapa Kg     : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[48][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[48][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                     case 50://Keruupuk satuan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[49][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[49][1]+ " /Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan Kerupuk berapa Kg     : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[49][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[49][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 51://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[50][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[50][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[50][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[50][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 52://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[51][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[51][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[51][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[51][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 53://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[52][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[52][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[52][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[52][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 54://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[53][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[53][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[53][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[53][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 55://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[54][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[54][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[54][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[54][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 56://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[55][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[55][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[55][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[55][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 57://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[56][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[56][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[56][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[56][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 58://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[57][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[57][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[57][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[57][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 59://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[58][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[58][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[58][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[58][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 60://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[59][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[59][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[59][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[59][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 61://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[60][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[60][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[60][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[60][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 62://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[61][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[61][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[61][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[61][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 63://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[62][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[62][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[62][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[62][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 64://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[63][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[63][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[63][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[63][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 65://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[64][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[64][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[64][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[64][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 66://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[65][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[65][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[65][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[65][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 67://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[66][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[66][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[66][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[66][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 68://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[67][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[67][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[67][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[67][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 69://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[68][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[68][1]+ " /Toples");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Toples        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[68][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[68][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 70://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[69][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[69][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[69][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[69][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 71://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[70][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[70][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[70][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[70][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 72://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[71][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[71][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[71][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[71][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 73://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[72][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[72][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[72][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[72][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 74://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[73][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[73][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[73][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[73][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 75://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[74][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[74][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[74][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[74][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                     
                    case 76://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[75][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[75][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[75][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[75][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 77://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[76][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[76][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[76][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[76][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 78://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[77][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[77][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[77][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[77][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 79://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[78][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[78][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[78][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[78][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 80://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[79][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[79][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[79][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[79][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 81://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[80][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[80][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[80][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[80][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 82://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[81][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[81][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[81][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[81][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 83://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[82][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[82][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[82][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[82][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    case 84://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[83][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[83][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[83][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[83][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 85://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[84][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[84][1]+ " /Galon");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Galon        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[84][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[84][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 86://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[85][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[85][1]+ " /Galon");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Galon        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[85][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[85][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 87://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[86][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[86][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[86][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[86][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 88://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[87][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[87][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[87][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[87][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 89://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[88][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[88][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[88][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[88][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 90://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[89][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[89][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[89][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[89][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                     case 91://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[90][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[90][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[90][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[90][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                     case 92://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[91][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[91][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[91][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[91][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 93://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[92][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[92][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[92][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[92][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 94://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[93][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[93][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[93][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[93][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 95://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[94][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[94][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[94][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[94][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 96://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[95][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[95][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[95][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[95][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                   
                    case 97://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[96][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[96][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[96][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[96][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;  
                       
                    case 98://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[97][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[97][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[97][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[97][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 99://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[98][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[98][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[98][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[98][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 100://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[99][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[99][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[99][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[99][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 101://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[100][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[100][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[100][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[100][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 102://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[101][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[101][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[101][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[101][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 103://Makanan
                       System.out.println("Pesanan anda              : "+ listProdukHarga[102][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[102][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[102][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[102][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                     case 104://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[103][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[103][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[103][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[103][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 105://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[104][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[104][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[104][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[104][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 106://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[105][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[105][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[105][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[105][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 107://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[106][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[106][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[106][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[106][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 108://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[107][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[107][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[107][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[107][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 109://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[108][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[108][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[108][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[108][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 110://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[109][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[109][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[109][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[109][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 111://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[110][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[110][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[110][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[110][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 112://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[111][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[111][1]+ " /Dus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Dus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[111][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[111][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 113://
                       System.out.println("Pesanan anda              : "+ listProdukHarga[112][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[112][1]+ " /Losin");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Losin        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[112][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[112][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 114://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[113][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[113][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[113][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[113][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 115://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[114][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[114][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[114][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[114][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 116://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[115][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[115][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[115][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[115][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 117://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[116][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[116][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[116][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[116][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                     
                    case 118://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[117][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[117][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[117][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[117][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 119://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[118][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[118][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[118][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[118][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 120://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[119][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[119][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[119][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[119][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 121://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[120][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[120][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[120][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[120][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 122://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[121][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[121][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[121][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[121][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 123://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[122][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[122][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[122][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[122][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 124://gillate
                       System.out.println("Pesanan anda              : "+ listProdukHarga[123][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[123][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[123][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[123][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 125://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[124][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[124][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[124][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[124][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 126://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[125][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[125][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[125][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[125][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 127://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[126][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[126][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[126][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[126][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 128://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[127][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[127][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[127][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[127][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 129://sabun
                       System.out.println("Pesanan anda              : "+ listProdukHarga[128][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[128][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[128][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[128][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 130://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[129][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[129][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                      namaProduk  [i] = listProdukHarga[129][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[129][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 131://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[130][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[130][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[130][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[130][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 132://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[131][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[131][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[131][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[131][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 133://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[132][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[132][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[132][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[132][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 134://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[133][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[133][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[133][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[133][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 135://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[134][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[134][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[134][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[134][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 136://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[135][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[135][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[135][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[135][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 137://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[136][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[136][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[136][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[136][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 138://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[137][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[137][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[137][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[137][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 139://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[138][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[138][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[138][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[138][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 140://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[139][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[139][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[139][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[139][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 141://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[140][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[140][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[140][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[140][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 142://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[141][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[141][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[141][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[141][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 143://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[142][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[142][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[142][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[142][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 144://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[143][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[143][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[143][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[143][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 145://sabun cuci
                       System.out.println("Pesanan anda              : "+ listProdukHarga[144][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[144][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[144][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[144][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 146://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[145][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[145][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[145][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[145][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 147://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[146][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[146][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[146][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[146][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 148://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[147][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[147][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[147][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[147][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 149://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[148][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[148][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[148][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[148][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 150://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[149][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[149][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[149][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[149][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 151://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[150][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[150][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[150][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[150][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 152://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[151][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[151][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[151][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[151][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 153://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[152][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[152][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[152][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[152][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 154://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[153][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[153][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[153][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[153][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 155://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[154][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[154][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[154][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[154][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 156://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[155][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[155][1]+ " /Lembar");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Lembar         : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[155][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[155][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 157://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[156][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[156][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[156][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[156][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 158://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[157][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[157][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[157][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[157][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 159://obat
                       System.out.println("Pesanan anda              : "+ listProdukHarga[158][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[158][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[158][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[158][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 160://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[159][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[159][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[159][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[159][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 161://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[160][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[160][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                      namaProduk  [i] = listProdukHarga[160][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[160][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 162://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[161][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[161][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[161][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[161][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 163://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[162][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[162][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[162][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[162][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 164://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[163][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[163][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[163][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[163][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 165://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[164][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[164][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[164][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[164][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 166://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[165][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[165][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[165][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[165][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 167://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[166][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[166][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[166][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[166][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 168://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[167][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[167][1]+ " /Bungkus");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Bungkus        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[167][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[167][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 169://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[168][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[168][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack           : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[168][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[168][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 170://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[169][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[169][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack           : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[169][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[169][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 171://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[170][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[170][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack           : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[170][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[170][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 172://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[171][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[171][1]+ " /Pack");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pack           : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[171][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[171][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 173://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[172][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[172][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[172][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[172][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 174://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[173][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[173][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[173][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[173][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 175://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[174][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[174][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[174][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[174][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 176://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[175][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[175][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[175][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[175][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 177://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[176][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[176][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[176][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[176][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 178://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[177][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[177][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[177][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[177][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 179://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[178][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[178][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       jumlahPesan [i] = jumlahProduk;
                       namaProduk  [i] = listProdukHarga[178][0];
                       totalProduk = Integer.parseInt(listProdukHarga[178][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 180://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[179][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[179][1]+ " /Renceng");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Renceng        : ");
                       jumlahProduk = input.nextInt();
                       jumlahPesan [i] = jumlahProduk;
                       namaProduk  [i] = listProdukHarga[179][0];
                       totalProduk = Integer.parseInt(listProdukHarga[179][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 181://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[180][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[180][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[180][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[180][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 182://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[181][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[181][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[181][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[181][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 183://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[182][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[182][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[182][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[182][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 184://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[183][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[183][1]+ " /Botol");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Botol          : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[183][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[183][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 185://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[184][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[184][1]+ " /Botol");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Botol          : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[184][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[184][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 186://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[185][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[185][1]+ " /Botol");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Botol          : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[185][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[185][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 187://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[186][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[186][1]+ " 3 Kg");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Gas Lpg 3Kg    : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[186][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[186][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                       
                    case 188://Produk Produkeseharian
                       System.out.println("Pesanan anda              : "+ listProdukHarga[187][0]);
                       System.out.println("Harga                     : Rp. "+ listProdukHarga[187][1]+ " /Pcs");
                       System.out.println(RED+"↓"+NORMAL);
                       System.out.print("► Pesan berapa Pcs            : ");
                       jumlahProduk = input.nextInt();
                       namaProduk  [i] = listProdukHarga[187][0];
                       jumlahPesan [i] = jumlahProduk;
                       totalProduk = Integer.parseInt(listProdukHarga[187][1]) * jumlahPesan[i];
                       totalHarga  [i] = totalProduk;
                       break;
                    
                    
                       default:
                       System.out.println("Maaf error");
                       break;
                    }
          i ++ ;
          System.out.println("────────────────────"+(i)+"───────────────────");
          System.out.print(BLUE+"■ Mulai memesan Lagi ? (y/n) : ");
                     ulangPesan = input.next();
                      while (!ulangPesan.equalsIgnoreCase("y") && !ulangPesan.equalsIgnoreCase("n")) {
                         System.err.println("Ulangi dengan memasukan Y atau N");
                         System.out.print("\n" + "Mulai memesan Lagi ? (y/n) : ");
                         ulangPesan = input.next();
                    }

                    }while(ulangPesan.equals("y"));
          //2.Perulangan pemesanan
                     
         //3.Bila berhenti memesan maka jumlahkan
         //4.cetak struk
         
         System.out.println("");
         System.out.println(""); 
         System.out.println("┌───────────────┬──────────┬───────────────┐");
         System.out.println("│───────────────│STRUK  BELANJAAN│───────────────│");
         System.out.println("├───────────────┴──────────┴───────────────┤");
         System.out.println("│No Pesanan "+(n++)+"                                                      │");
         System.out.println("├──────────────────────────────────────────┤");           
         System.out.println("│NO.   Nama Produk               Jumlah               Harga        │");
         System.out.println("└──────────────────────────────────────────┘");
         
        for(a = 0; a < i; a++){
            System.out.println("  "+(a+1)+"    " + (namaProduk[a]) + "      " + (jumlahPesan[a]) + "\t\t" + kursIndo.format(totalHarga[a]));
            totalBayar += totalHarga[a];
            
            
        }
        
        System.out.println();
        System.out.println("  Total Harga Belanjaan : " + kursIndo.format(totalBayar));
        System.out.println("┌──────────────────────────────────────────┐");
        
               System.out.print("  ► Uang Bayar : ");
               uangBayar = input.nextInt();
               
                if(uangBayar < totalBayar){
                kurang = totalBayar - uangBayar;
                System.out.println("└──────────────────────────────────────────┘");
                System.out.println(RED+" »»»»»»»»»»»»»»»»»»»»»»»»»»»»» WARNING!! ««««««««««««««««««««««««««««");
                System.out.println("  Total Harga Belanjaan : "+kursIndo.format(totalBayar));
                System.out.println("             Uang Bayar : "+kursIndo.format(uangBayar));
                System.out.println("                           ─────────");
                System.out.println("  Maaf Uang Anda Kurang = - " + kursIndo.format(kurang));
                System.out.println();
                    System.out.println("├──────────────────────────────────────────┤");
                    System.out.println("  Tanggal Transaksi : "+BLUE+date.toString());
                    System.out.println("├──────────────────────────────────────────┤");
                    System.out.println(BLUE+"                            Src Dua Putra"+NORMAL);
                    System.out.println(BLUE+RED+"                   Jl. H.Idris-Sukamukti-Kec.Majalaya  "+NORMAL);
                    System.out.println(BLUE+RED+"                           Kab.Bandung 40392            "+NORMAL);
                    System.out.println("├──────────────────────────────────────────┤");
                    System.out.println("                Terimakasih Telah belanja di Src Dua Putra                ");
                System.out.println("└──────────────────────────────────────────┘");
            }else{
                kembalian = uangBayar - totalBayar;
                System.out.println("└──────────────────────────────────────────┘");
                System.out.println("  Total Harga Belanjaan : "+kursIndo.format(totalBayar));
                System.out.println("             Uang Bayar : "+kursIndo.format(uangBayar));
                System.out.println("                           ─────────");
                System.out.println("  Kembalian = " + kursIndo.format(kembalian));
                System.out.println();
                    System.out.println("├──────────────────────────────────────────┤");
                    System.out.println("  Tanggal Transaksi : "+BLUE+date.toString());
                    System.out.println("├──────────────────────────────────────────┤");
                    System.out.println(BLUE+"                            Src Dua Putra"+NORMAL);
                    System.out.println(BLUE+RED+"                   Jl. H.Idris-Sukamukti-Kec.Majalaya  "+NORMAL);
                    System.out.println(BLUE+RED+"                           Kab.Bandung 40392            "+NORMAL);
                    System.out.println("├──────────────────────────────────────────┤");
                    System.out.println("                Terimakasih Telah belanja di Src Dua Putra                ");
                System.out.println("└──────────────────────────────────────────┘");
            }
           
        System.out.print("Apakah Anda Ingin Memesan Lagi : (Y/N) ");
        ulangPesan1=input.next();            System.out.println();
        
        i = 0 ;
        a = 0 ;
        totalBayar = 0;
        }while(ulangPesan1.equalsIgnoreCase("Y"));
           
           
         //5.perulangan ke list utama
        
        }else if (pilihListUtama == 4){
          System.out.println("\n");
          System.out.println("Terima kasih, jangan lupa matikan PC ☺");
          
          return;
        }else {
          System.err.println("──────────────────────────────────────");
          System.err.println("                  Error, Harapa Ulangi !!!              ");
          System.err.println("──────────────────────────────────────");
          
          return;
          
          
          
        }
           
        }    
    }//End publicStatic
}//End class
