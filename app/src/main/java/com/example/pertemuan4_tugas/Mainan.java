package com.example.pertemuan4_tugas;

public class Mainan {
        private String tipe,nama,tahun;
        private int foto;
        public Mainan(String tipe, String nama, String tahun, int foto){
            this.tipe = tipe;
            this.nama = nama;
            this.tahun = tahun;
            this.foto = foto;
        }

        public String getTipe(){
            return tipe;
        }
        public void setTipe(String tipe){
            this.tipe = tipe;
        }
        public String getNama(){
            return nama;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public String getTahun(){
            return tahun;
        }
        public void setTahun(String tahun){
            this.tahun = tahun;
        }
        public int getFoto() { return foto; }
        public void setFoto(int foto) { this.foto = foto; }
}
