package javaapplication9;

import java.util.ArrayList;
import java.util.Scanner;

interface IBarang {
    void cetakNama();
    void cetakBerat();
    void cetakInfo();
    void cetakPenggunaan();
    void totalPenggunaan();
    int getTotal();
}

class Baling implements IBarang{
    private int total = 0;
    
    @Override
    public void cetakNama() {
        System.out.println("Baling-baling bambu");
    }

    @Override
    public void cetakBerat() {
        System.out.println("2kg");
    }

    @Override
    public void cetakInfo() {
        System.out.println("Baling-baling yang digunakan dengan cara dipakai diatas kepala yang dapat membuat penggunanya terbang dengan leluasa");
    }

    @Override
    public void cetakPenggunaan() {
        System.out.println("dapat melihat Shizuka dan Nobita dari ketinggian.");
    }

    @Override
    public void totalPenggunaan() {
        total++;
    }

    @Override
    public int getTotal() {
        return total;
    }
}

class Pintu implements IBarang{
    private int total = 0;
    
    @Override
    public void cetakNama() {
        System.out.println("Pintu kemana saja");
    }

    @Override
    public void cetakBerat() {
        System.out.println("4 kg");
    }

    @Override
    public void cetakInfo() {
        System.out.println("Pintu yang dapat membawa penggunanya kemanapun penggunanya inginkan");
    }

    @Override
    public void cetakPenggunaan() {
        System.out.println("menikmati siang hari di padang rumput di suatu desa di Belgia.");
    }
    
    @Override
    public void totalPenggunaan() {
        total++;
    }
    
    @Override
    public int getTotal() {
        return total;
    }
}

public class JavaApplication9 {
    
    public static void main(String[] args) {
        ArrayList<IBarang> collectionBarang = new ArrayList<>();
        String nameUserString;
        Scanner inputScanner = new Scanner(System.in);
        //
        collectionBarang.add(new Baling());
        collectionBarang.add(new Pintu());
        
        System.out.println("masukan nama");
        nameUserString = inputScanner.nextLine();
        
        int optionMenu = -1;
        while(optionMenu != 7){
            awake(collectionBarang);
            int selectedItem = inputScanner.nextInt();
            selectedItem -= 1;
            optionMenu = -1;
            
            while(optionMenu != 99){
                System.out.println("1. Lihat berat barang");
                System.out.println("2. Lihat penjelasan barang");
                System.out.println("3. Gunakan barang");
                System.out.println("4. Sembunyikan barang");
                System.out.println("5. Ganti barang");
                System.out.println("6. Lihat barang yang paling sering digunakan");
                optionMenu = inputScanner.nextInt();

                switch(optionMenu){
                    case 1:
                        cetak(collectionBarang.get(selectedItem), 1);
                        break;
                    case 2:
                        cetak(collectionBarang.get(selectedItem), 2);
                        break;
                    case 3:
                        cetak(collectionBarang.get(selectedItem), 3);
                        break;
                    case 4:
                        collectionBarang.remove(selectedItem);
                        System.out.println("Barang di sembunyikan");
                        optionMenu = 99;
                        break;
                    case 5:
                        optionMenu = 99;
                        break;
                    case 6:
                        int max = -1;
                        int index = 0;
                        for (int i = 0; i < collectionBarang.size(); i++) {
                            if(max < collectionBarang.get(i).getTotal()){
                                max = collectionBarang.get(i).getTotal();
                                index = i;
                            }
                        }
                        System.out.print("Barang yang paling sering digunakan adalah ");
                        collectionBarang.get(index).cetakNama();
                        System.out.println("yang telah digunakan " + collectionBarang.get(index).getTotal() + " kali");
                        System.out.println();
                        break;
                    case 7:
                        break;
                }
            }
        }
    }
    
    static void awake(ArrayList<IBarang> barang){
        for (int i = 0; i < barang.size(); i++) {
            System.out.print((i+1) + " ");
            barang.get(i).cetakNama();
        }
    }
    
    static void cetak(IBarang barang,int type){
        switch(type){
            case 1:
                barang.cetakBerat();
                break;
            case 2:
                barang.cetakInfo();
                break;
            case 3:
                barang.cetakPenggunaan();
                barang.totalPenggunaan();
                break;
        }
        System.out.println();
    }
}