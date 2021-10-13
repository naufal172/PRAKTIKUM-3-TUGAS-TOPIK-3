package com;

import java.util.ArrayList;

public class Jurusan {
    private String kode, nama;
    private ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();

    public  Jurusan(String kode, String nama){
        this.kode  = kode;
        this.nama = nama;
    }
    void addMhs (Mahasiswa mahasiswa){
        this.mahasiswa.add(mahasiswa);
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }

    public ArrayList<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }
}
