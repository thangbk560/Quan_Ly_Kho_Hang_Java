/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author chanh
 */
public class NhanVien implements Serializable {
    private String MaNhanVien;
    private String HoTen;
    private String SoDienThoai;
    private String DiaChi;
    private Date NgayVaoLam;
    
    public NhanVien() {}
    public NhanVien(String MaNV, String HoTen, String SoDienThoai, String DiaChi, Date NgayVaoLam)
    {
        this.MaNhanVien = MaNV;
        this.HoTen = HoTen;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.NgayVaoLam = NgayVaoLam;
    }
    
    public String getMaNhanVien() {
        return this.MaNhanVien;
    }
    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }
    public String getHoTen() {
        return this.HoTen;
    }
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public String getSoDienThoai() {
        return this.SoDienThoai;
    }
    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }
    public String getDiaChi() {
        return this.DiaChi;
    }
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    public Date getNgayVaoLam() {
        return this.NgayVaoLam;
    }
    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }
}