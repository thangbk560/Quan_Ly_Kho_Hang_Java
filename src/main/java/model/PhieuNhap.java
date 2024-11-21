/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author chanh
 */
public class PhieuNhap implements Serializable{
    private String MaPhieuNhap;
    private Date NgayNhap;
    private NhanVien NhanVienNhap;
    private String NhaCungCap;
    private HangHoa HangHoaNhap;
    private int SoLuongNhap;

    public PhieuNhap(){}

    public PhieuNhap(String MaPhieuNhap, Date NgayNhap, NhanVien NhanVienNhap, String NhaCungCap, HangHoa HangHoaNhap, int SoLuongNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.NgayNhap = NgayNhap;
        this.NhanVienNhap = NhanVienNhap;
        this.NhaCungCap = NhaCungCap;
        this.HangHoaNhap = HangHoaNhap;
        this.SoLuongNhap = SoLuongNhap;
    }
 
    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }
    
    public NhanVien getNhanVienNhap() {
        return NhanVienNhap;
    }
    
    public String getNhaCungCap() {
        return NhaCungCap;
    }
    
    public HangHoa getHangHoaNhap() {
        return HangHoaNhap;
    }

    public int getSoLuongNhap() {
        return SoLuongNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
    
    public void setNhanVienNhap(NhanVien NhanVienNhap) {
        this.NhanVienNhap = NhanVienNhap;
    }
    
    public void setNhaCungCap(String NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }
    
    public void setHangHoaNhap(HangHoa HangHoaNhap) {
        this.HangHoaNhap = HangHoaNhap;
    }

    public void setSoLuongNhap(int SoLuongNhap) {
        this.SoLuongNhap = SoLuongNhap;
    }   
}