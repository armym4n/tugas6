/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author B401
 */

interface barang{
    void data();
    void berat1();
   
    void jelas1();
    
    void gunakan1();
    

}


class baling implements barang{
    private int jumlah;
    @Override
    public void berat1() {
        System.out.println("2kg");
    }

    @Override
    public void jelas1() {
        System.out.println("Baling-baling yang digunakan dengan cara dipakai diatas kepala yang dapat membuat penggunanya terbang dengan leluasa");
    }

    @Override
    public void gunakan1() {
        System.out.println("dapat melihat Shizuka dan Nobita dari ketinggian.");
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void data() {
        System.out.println("1. Baling-baling bambu");
    }

  

    

}

class pintu implements barang{

    @Override
    public void berat1() {
        System.out.println("4kg");
    }

    @Override
    public void jelas1() {
         System.out.println("Pintu yang dapat membawa penggunanya kemanapun penggunanya inginkan");
    }

    @Override
    public void gunakan1() {
         System.out.println("menikmati siang hari di padang rumput di suatu desa di Belgia.");
    }

    @Override
    public void data() {
        System.out.println("2. Pintu kemana saja");
    }



}

class mesin implements barang{

    @Override
    public void berat1() {
         System.out.println("6kg");
    }

    @Override
    public void jelas1() {
         System.out.println("Alat yang dapat membawa penggunanya ke masa yang diinginkan oleh penggunanya dalam sekejap");
    }

    @Override
    public void gunakan1() {
        System.out.println("mempelajari banyak hal mengenai kehidupan masyarakat Majapahit di masa kejayaannya");
    }

    @Override
    public void data() {
        System.out.println("3. Mesin waktu");
    }



}
        
class roti implements barang{

    @Override
    public void berat1() {
        System.out.println("0.2kg");
    }

    @Override
    public void jelas1() {
        System.out.println("Roti yang membuat orang yang memakannya dapat mengingat semua yang pernah terlupakan oleh orang yang memakannya");
    }

    @Override
    public void gunakan1() {
        System.out.println("memperoleh 100 dalam ujian biologi hari ini.");
    }

    @Override
    public void data() {
        System.out.println("4. Roti pengingat");
    }


}
        
class koyaku implements barang{

    @Override
    public void berat1() {
         System.out.println("0.2kg");
    }

    @Override
    public void jelas1() {
        System.out.println("Konyaku yang jika dimakan, akan membuat penggunanya mengerti bahasa apapun dan dapat berbicara bahasa apapun");
    }

    @Override
    public void gunakan1() {
        System.out.println("bercengkeramah dengan mahasiswa pertukaran pelajar yang baru saja datang dari Perancis dengan mudah.");
    }

    @Override
    public void data() {
        System.out.println("5. Konyaku penerjemah");
    }

}
        
class kamera implements barang{

    @Override
    public void berat1() {
        System.out.println("0.8kg");
    }

    @Override
    public void jelas1() {
        System.out.println("Kamera yang dapat mengubah pakaian dari orang yang terpotret oleh kamera ini");
    }

    @Override
    public void gunakan1() {
        System.out.println("berhasil membuat kagum teman-temannya dengan baju barunya.");
    }

    @Override
    public void data() {
        System.out.println("6. Kamera pengganti baju");
    }


}





public class Materi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        baling b = new baling();
        ArrayList<String> user = new ArrayList();
        //ArrayList<baling> b = new ArrayList();
        pintu p = new pintu();
        mesin m = new mesin();
        roti r = new roti();
        koyaku k = new koyaku();
        kamera km = new kamera();
       
        
        int menu=0,pil=0,baru=0;
        String nama;
         System.out.println("masukan nama");
               nama = s.nextLine();
               int jum=0;
               user.add(nama);
        while(menu!=7){
            b.data();
            p.data();
            m.data();
            r.data();
            k.data();
            km.data();
             menu=s.nextInt();
             
             if(menu==1){
                    while(pil<7){
                     System.out.println("1. Lihat berat barang");
                     System.out.println("2. Lihat penjelasan barang");
                     System.out.println("3. Gunakan barang");
                     System.out.println("4. Sembunyikan barang");
                     System.out.println("5. Ganti barang");
                     System.out.println("6. Lihat barang yang paling sering digunakan");
                     pil = s.nextInt();
                     
                     if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         b.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      b.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                         System.out.println(user+"Baling-baling bambu");
                         b.gunakan1();
                         jum++;
                        }
                        
                    }
                     if(pil==4){
                         while(pil<7){
                          p.data();
                          m.data();
                          r.data();
                          k.data();
                          km.data();
                          pil=s.nextInt();
                             if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         b.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      b.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                         System.out.println(user+"Baling-baling bambu");
                         b.gunakan1();
                         jum++;
                        }
                        
                    }
                          
                         
                         }
                         
                     
                     }
                     if(pil==5){
                      do{
                      System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         baru=s.nextInt();
                     
                     }while(baru<7);
             
             
             }
                 if(pil==6){
                     System.out.println("barang yang sering digunakan"+"Baling-baling bambu"+jum);  
                     
                     
                 }
               }
               
           }
             if(menu==2){
                   while(pil<7){
                     System.out.println("1. Lihat berat barang");
                     System.out.println("2. Lihat penjelasan barang");
                     System.out.println("3. Gunakan barang");
                     System.out.println("4. Sembunyikan barang");
                     System.out.println("5. Ganti barang");
                     System.out.println("6. Lihat barang yang paling sering digunakan");
                     pil = s.nextInt();
                     
                     if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         p.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      p.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                             System.out.println(user+"Baling-baling bambu");
                         p.gunakan1();
                         jum++;
                        }
                        
                    }
                     if(pil==4){
                         
                         do{
                       System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu!=7);
                     
                     }
                     if(pil==5){
                      do{
                      System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu<7);
             
             
             }
                 if(pil==6){
                     System.out.println("barang yang sering digunakan"+"Pintu kemana saja"+jum);  
                     
                     
                 }
               }
             
             
             }
             if(menu==3){
                   while(pil<7){
                     System.out.println("1. Lihat berat barang");
                     System.out.println("2. Lihat penjelasan barang");
                     System.out.println("3. Gunakan barang");
                     System.out.println("4. Sembunyikan barang");
                     System.out.println("5. Ganti barang");
                     System.out.println("6. Lihat barang yang paling sering digunakan");
                     pil = s.nextInt();
                     
                     if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         m.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      m.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                            System.out.println(user+"Baling-baling bambu");
                         m.gunakan1();
                         
                        }
                         jum++;
                    }
                     if(pil==4){
                         
                         do{
                       System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu!=7);
                     
                     }
                     if(pil==5){
                      do{
                      System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu<7);
             
             
             }
                 if(pil==6){
                     System.out.println("barang yang sering digunakan"+"Mesin waktu"+jum);  
                     
                     
                 }
               }
             
             
             }
             if(menu==4){
                   while(pil<7){
                     System.out.println("1. Lihat berat barang");
                     System.out.println("2. Lihat penjelasan barang");
                     System.out.println("3. Gunakan barang");
                     System.out.println("4. Sembunyikan barang");
                     System.out.println("5. Ganti barang");
                     System.out.println("6. Lihat barang yang paling sering digunakan");
                     pil = s.nextInt();
                     
                     if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         r.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      r.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                         System.out.println(user+"Baling-baling bambu");
                         r.gunakan1();
                         jum++;
                        }
                        
                    }
                     if(pil==4){
                         
                         do{
                       System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu!=7);
                     
                     }
                     if(pil==5){
                      do{
                      System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu<7);
             
             
             }
                 if(pil==6){
                     System.out.println("barang yang sering digunakan"+"Roti pengingat"+jum);  
                     
                     
                 }
               }
             
             
             }
             
             
             
             
             if(menu==5){
             
                   while(pil<7){
                     System.out.println("1. Lihat berat barang");
                     System.out.println("2. Lihat penjelasan barang");
                     System.out.println("3. Gunakan barang");
                     System.out.println("4. Sembunyikan barang");
                     System.out.println("5. Ganti barang");
                     System.out.println("6. Lihat barang yang paling sering digunakan");
                     pil = s.nextInt();
                     
                     if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         k.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      k.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                             System.out.println(user+"Baling-baling bambu");
                         k.gunakan1();
                         jum++;
                        }
                        
                    }
                     if(pil==4){
                         
                         do{
                       System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu!=7);
                     
                     }
                     if(pil==5){
                      do{
                      System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu<7);
             
             
             }
                 if(pil==6){
                     System.out.println("barang yang sering digunakan"+"Koyaku penerjemah"+jum);  
                     
                     
                 }
               }
             
             }
             if(menu==6){
             
                   while(pil<7){
                     System.out.println("1. Lihat berat barang");
                     System.out.println("2. Lihat penjelasan barang");
                     System.out.println("3. Gunakan barang");
                     System.out.println("4. Sembunyikan barang");
                     System.out.println("5. Ganti barang");
                     System.out.println("6. Lihat barang yang paling sering digunakan");
                     pil = s.nextInt();
                     
                     if(pil==1){
                         
                         System.out.println("Baling-baling bambu");
                         km.berat1();
                     
                     }
                     if(pil==2){
                         
                      System.out.println("Baling-baling bambu");
                      km.jelas1();
                     }
                     if(pil==3){
                         jum+=1;
                        for (int i = 0; i < user.size(); i++) {
                            System.out.println(user+"Baling-baling bambu");
                         km.gunakan1();
                         jum++;
                        }
                         
                    }
                     if(pil==4){
                         
                         do{
                       System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu!=7);
                     
                     }
                     if(pil==5){
                      do{
                      System.out.println("1. Baling-baling bambu");
                        System.out.println("2. Pintu kemana saja");
                        System.out.println("3. Mesin waktu");
                        System.out.println("4. Roti pengingat");
                        System.out.println("5. Konyaku penerjemah");
                        System.out.println("6. Kamera pengganti baju");
                         menu=s.nextInt();
                     
                     }while(menu<7);
             
             
             }
                 if(pil==6){
                     System.out.println("barang yang sering digunakan"+"kamera pengganti baju"+jum);  
                     
                     
                 }
               }
             
             
             
             }
        }
        
    }
    
}
