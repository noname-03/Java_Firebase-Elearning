package com.example.crudfirebase.model;

import com.example.crudfirebase.R;

public class Absensi {
    private String id, nim, nama, matkul, pertemuan;

    public Absensi(String name, String email){

    }

    public Absensi(String nama, String nim, String matkul, String pertemuan){
        this.nama = nama;
        this.nim = nim;
        this.matkul = matkul;
        this.pertemuan = pertemuan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getPertemuan() {
        return pertemuan;
    }

    public void setPertemuan(String pertemuan) {
        this.pertemuan = pertemuan;
    }
}
