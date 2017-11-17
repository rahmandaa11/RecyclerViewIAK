package com.example.randa.recyclerviewiak;

/**
 * Created by randa on 27/11/2016.
 */

public class AnimalModel {
    String namaIndo, namaEng;
    int gambar;

    //method construct method untuk membangun sebuah class biar bisa dipakai kelas lainnya
    public AnimalModel(String namaIndo, String namaEng,int gambar){
        //inisialisasi untuk mengisi nilai dari variabel global agar bisa dipakai
        this.namaIndo = namaIndo;
        this.namaEng = namaEng;
        this.gambar = gambar;
    }

    //getter dan setter, fungsinya ketika data dimasukkan ke dlm model dan adapter diterapkan ke layout.
    //karna kita sudah membuat method construct maka setter tidak digunakan lagi
    //cara : klik kanan generate


    public String getNamaIndo() {
        return namaIndo;
    }

    public void setNamaIndo(String namaIndo) {   //tidak perlu diset lagi karna sudah ada method construct, fungsinya sama aja
        this.namaIndo = namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public void setNamaEng(String namaEng) { //tidak perlu diset lagi karna sudah ada method construct, fungsinya sama aja
        this.namaEng = namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {   //tidak perlu diset lagi karna sudah ada method construct, fungsinya sama aja
        this.gambar = gambar;
    }
}
