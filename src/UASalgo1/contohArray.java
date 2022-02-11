/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASalgo1;

import java.util.*; //fungsi utama untuk memasukan sebuah nilai

/**
 *
 * @author albi mudakar
 */
public class contohArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       

  String data[]={"albi","albi45"};//pendeklarasian tipe data string dalam array

  String nama,sandi;//pendeklarasian variabel untuk menampung sebuah inputan

  int total=0;
  int maksimal;
  Scanner a=new Scanner(System.in);
  Scanner b=new Scanner(System.in);
  Scanner c=new Scanner(System.in);
    System.out.print("======================================");
    System.out.println("\n");
    System.out.print("=============SUZUYA MEULABOH===========");
    System.out.println("\n");
    System.out.print("======================================");
  Scanner apa=new Scanner(System.in);
  System.out.println("\n");
  System.out.print("nama : ");
  nama=apa.nextLine();
  System.out.println("\n");
  System.out.print("sandi : ");
  sandi=apa.nextLine();
  
  /**
  *percabangan untuk mengecek keberadaan
  *data
  */
  if(nama.equals(data[0])&&sandi.equals(data[1])){
     System.out.println("input menu :");
    
    System.out.println("\t\t\t==============================================");
    System.out.println("\t\t\t\t\t 1. Ciki ciki ");
    System.out.println("\t\t\t\t\t 2. Juice ");
    System.out.println("\t\t\t\t\t 3. Keluar ");
    System.out.println("\t\t\t==============================================");
    int menu;
    System.out.print("Masukkan Menu : ");
    menu=apa.nextInt();
  
   switch(menu){
    case 1:
  
     System.out.println("\t\t\t\t=======================================");
     System.out.println("\t\t\t\t ");
     System.out.println("\t\t\t\t- Ciki ciki -");
     System.out.println("\t\t\t\t ");
     System.out.println("\t\t\t\t=====================================\n");
  
     System.out.println("inputkan ciki ciki");
     System.out.print("inputkan jumlah ciki ciki :");
     maksimal=b.nextInt();
     int harga[]=new int[maksimal];
     int jumlah_barang[]=new int[maksimal];
     int kembalian,uang;
     String barang[]=new String [maksimal];
  
    for(int i=0;i<maksimal;i++){
  
     System.out.print("Nama Barang Ke "+(i+1)+"= ");
     barang[i]=a.nextLine();
     System.out.print("Jumlah Barang "+(i+1)+"= ");
     jumlah_barang[i]=b.nextInt();
     System.out.print("Harga Barang "+(i+1)+"= ");
     harga[i]=c.nextInt();
     
     System.out.println("Penginpuan Barang ke "+(i+1)+" Telah Selesai");
     System.out.println("========================================");
     total=total+jumlah_barang[i]*harga[i];
    }
     System.out.println("==================================================================================");
     System.out.println("||\tNo\t||\tNama Barang\t||Jumlah Barang\t\t||Harga barang\t||");
     System.out.println("==================================================================================");
    for(int i=0;i<maksimal;i++){
     
     System.out.println("||\t"+(i+1)+"\t||\t"+barang[i]+"\t\t||\t"+jumlah_barang[i]+"\t\t||\t"+harga[i]+"\t||");
     }
     System.out.println("==================================================================================");
     System.out.println("total \t: Rp. "+total);
     System.out.print("pembayaran \t: Rp. ");
       uang=a.nextInt();
      kembalian=uang-total;
     System.out.println("kembalian \t: Rp. "+kembalian);
    break;
  
    case 2:
      
     System.out.println("\t\t\t\t===================================================");
     System.out.println("\t\t\t\t ");
     System.out.println("\t\t\t\t= juice =");
     System.out.println("\t\t\t\t ");
     System.out.println("\t\t\t\t=================================================\n");
  
     System.out.println("inputkan juice ");
     System.out.print("inputkan jumlah juice yang dibeli :");
     maksimal=b.nextInt();
     int harga2[]=new int[maksimal];
     int jumlah_barang2[]=new int[maksimal];
     int kembalian2,uang2;
     String barang2[]=new String [maksimal];
  
    for(int i=0;i<maksimal;i++){
  
     System.out.print("Nama Barang Ke "+(i+1)+"= ");
     barang2[i]=a.nextLine();
     System.out.print("Jumlah Barang "+(i+1)+"= ");
     jumlah_barang2[i]=b.nextInt();
     System.out.print("Harga Barang "+(i+1)+"= ");
     harga2[i]=c.nextInt();
     
     System.out.println("Penginpuan Barang ke "+(i+1)+" Telah Selesai");
     System.out.println("=========================================================");
     total=total+jumlah_barang2[i]*harga2[i];
    }
     System.out.println("==================================================================================");
     System.out.print("||\tNo\t||\tNama Barang\t||Jumlah Barang\t||Harga barang\t||");
     System.out.println("==================================================================================");
     
    for(int i=0;i<maksimal;i++){
     System.out.println("||\t"+(i+1)+"\t||\t"+barang2[i]+"\t\t||\t"+jumlah_barang2[i]+"\t\t||\t"+harga2[i]+"\t||");
     }

     System.out.println("total \t: Rp. "+total);
     System.out.print("pembayaran \t: Rp. ");
       uang2=a.nextInt();
      kembalian2=uang2-total;
     System.out.println("kembalian2 \t: Rp. "+kembalian2);
    break;
  
     default : 
     System.out.print("Sorry no system code will come out"); 
  }

 }   
    else{
     System.out.print("Sorry username is not available");
  }
  }
 }

 

