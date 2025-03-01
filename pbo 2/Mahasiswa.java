/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Mohammad Rajaswa Umar / 24060123140121
 * Tanggal      : 26/02/2025
 */

import java.util.ArrayList;

public class Mahasiswa {
  /********** ATRIBUT **********/
  private String nim;
  private String nama;
  private String prodi;
  ArrayList<MataKuliah> listMatKul;
  private Dosen dosenWali;
  private Kendaraan kendaraan;

  /********** METHOD **********/

  // konstruktor untuk membuat mahasiswa tanpa parameter
  public Mahasiswa(){
    this.nim = "";
    this.nama = "";
    this.prodi = "";
    this.listMatKul = new ArrayList<>(50); // Inisialisasi ArrayList kosong
  }

  public Mahasiswa(String nim, String nama, String prodi){
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    this.listMatKul = new ArrayList<>(50);
  }

  public String getNim(){
    return this.nim;
  }

  public String getNama(){
    return this.nama;
  }

  public String getProdi(){
    return this.prodi;
  }

  public Dosen getDosenWali(){
    return this.dosenWali;
  }

  public Kendaraan getKendaraan(){
    return this.kendaraan;
  }

  public void setNim(String nim){
    this.nim = nim;
  }

  public void setNama(String nama){
    this.nama = nama;
  }

  public void setProdi(String prodi){
    this.prodi = prodi;
  }

  public void setDosenWali(Dosen dosenWali){
    this.dosenWali = dosenWali;
  }

  public void setKendaraan(Kendaraan kendaraan){
    this.kendaraan = kendaraan;
  }

  public void addMatkul(MataKuliah newMatKul){
    listMatKul.add(newMatKul);
  }

  public int getJumlahSks(){
    int totalSks = 0;

    for (int i = 0; i < listMatKul.size(); i++){
      totalSks = totalSks + listMatKul.get(i).getSks();
    }

    return totalSks;
  }

  public int getJumlahMatKul(){
    return listMatKul.size();
  }

  public void printMhs(){
    System.out.println("Nim: " + nim);
    System.out.println("Nama: " + nama);
    System.out.println("Prodi: " + prodi);
  }

  public void printDetailMhs(){
    System.out.println("Nim: " + nim);
    System.out.println("Nama: " + nama);
    System.out.println("Prodi: " + prodi);
    System.out.println("Dosen Wali: " + dosenWali);
    System.out.println("Kendaraan: " + kendaraan);

    for (int i = 0; i < listMatKul.size(); i++){
      System.out.println(listMatKul.get(i).getNama());
    }
  }
}