package com.Tugas3SDA;

import java.util.LinkedList;

public class Tugas3_Briana {
    
    public static void main(String[] args) {
        
        //membuat linked list
        LinkedList<String> nim = new LinkedList<>();
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        //tambahkan elemen
        System.out.println("DATA AWAL");
        System.out.println("---------");
        nim.add("2111522024");
        nim.add("2111500001");
        nim.add("2111500002");

        nama.add("Briana");
        nama.add("Aditya");
        nama.add("Novelya");

        alamat.add("Labor");
        alamat.add("Andalas");
        alamat.add("Air Tawar");

        System.out.println("Output NIM\t:"+nim+", Ukuran :" +nim.size());
        System.out.println("Output Nama\t:"+nama+", Ukuran :" +nama.size());
        System.out.println("Output Alamat\t:"+alamat+", Ukuran :" +alamat.size());
        System.out.println("  \n");

        //add karakter lain
        System.out.println("FUNGSI MENAMBAHKAN KARAKTER LAIN");
        System.out.println("--------------------------------");
        System.out.println("Output Alamat Awal\t:"+alamat+", Ukuran :" +alamat.size());
        alamat.addFirst("Tabing");
        alamat.addLast("Ulak Karang");

        System.out.println("Output Alamat Baru\t:"+alamat+", Ukuran :" +alamat.size());
        System.out.println("  \n");

        //menyisipakan elemen
        System.out.println("FUNGSI MENYISIPKAN/MENGGANTI ELEMEN");
        System.out.println("-----------------------------------");
        System.out.println("Output NIM Awal\t:"+nim+", Ukuran :" +nim.size());
        nim.set(1, "2111500004");
        nim.set(2, "2111500006");

        System.out.println("Output NIM Baru\t:"+nim+", Ukuran :" +nim.size());
        System.out.println("  \n");

        //menghapus elemen
        System.out.println("FUNGSI MENGHAPUS ELEMEN");
        System.out.println("-----------------------");
        System.out.println("Output Alamat Awal\t:"+alamat+", Ukuran :" +alamat.size());
        alamat.removeFirst();
        alamat.removeLast();

        System.out.println("Output Alamat Baru\t:"+alamat+", Ukuran :" +alamat.size());
        System.out.println("  \n");

        //menghapus semua data pada alamat
        System.out.println("FUNGSI MENGHAPUS SEMUA DATA PADA ALAMAT");
        System.out.println("---------------------------------------");
        System.out.println("Output Alamat Awal\t:"+alamat+", Ukuran :" +alamat.size());
        alamat.clear();

        System.out.println("Output Alamat Baru\t:"+alamat+", Ukuran :" +alamat.size());
        System.out.println("  \n");


        //fungsi isEmpty
        System.out.println("FUNGSI IsEmpty");
        System.out.println("--------------");
        System.out.println("Is List empty?\t " +alamat.isEmpty());
    }
}
