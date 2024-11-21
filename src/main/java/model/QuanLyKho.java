/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.io.Serializable;


/**
 *
 * @author chanh
 */
public class QuanLyKho implements Serializable{
    private HangHoa HangHoaKho;
    private String MaKe;
    private String TenKe;
    private String Tang;
    private String Ngan;
    
    public QuanLyKho(){}
    
    public QuanLyKho(HangHoa HangHoaKho, String MaKe, String TenKe, String Tang, String Ngan){
        this.HangHoaKho = HangHoaKho;
        this.MaKe = MaKe;
        this.TenKe = TenKe;
        this.Tang = Tang;
        this.Ngan = Ngan;
    }

    public HangHoa getHangHoaKho() {
        return HangHoaKho;
    }
    
    public String getMaKe() {
        return MaKe;
    }

    public String getTenKe() {
        return TenKe;
    }

    public String getTang() {
        return Tang;
    }

    public String getNgan() {
        return Ngan;
    }

    public void setHangHoaKho(HangHoa HangHoaKho) {
        this.HangHoaKho = HangHoaKho;
    }
    
    public void setMaKe(String MaKe) {
        this.MaKe = MaKe;
    }

    public void setTenKe(String TenKe) {
        this.TenKe = TenKe;
    }

    public void setTang(String Tang) {
        this.Tang = Tang;
    }

    public void setNgan(String Ngan) {
        this.Ngan = Ngan;
    }
}
