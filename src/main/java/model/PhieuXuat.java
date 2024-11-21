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
public class PhieuXuat implements Serializable{
    private String MaPhieuXuat;
    private Date NgayXuat;
    private NhanVien NhanVienXuat;
    private String KhachHang;
    private HangHoa HangHoaXuat;
    private int SoLuongXuat;
    private float ThanhTien;

    public PhieuXuat(){}

    public PhieuXuat(String MaPhieuXuat, Date NgayXuat, NhanVien NhanVienXuat, String KhachHang, HangHoa HangHoaXuat, int SoLuongXuat, float ThanhTien) {
        this.MaPhieuXuat = MaPhieuXuat;
        this.NgayXuat = NgayXuat;
        this.NhanVienXuat = NhanVienXuat;
        this.KhachHang = KhachHang;
        this.HangHoaXuat = HangHoaXuat;
        this.SoLuongXuat = SoLuongXuat;
        this.ThanhTien = ThanhTien;
    }
 
    public String getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }
    
    public NhanVien getNhanVienXuat() {
        return NhanVienXuat;
    }
    
    public String getKhachHang() {
        return KhachHang;
    }
    
    public HangHoa getHangHoaXuat() {
        return HangHoaXuat;
    }

    public int getSoLuongXuat() {
        return SoLuongXuat;
    }
    
    public float getThanhTien() {
        return ThanhTien;
    }

    public void setMaPhieuXuat(String MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }
    
    public void setNhanVienXuat(NhanVien NhanVienXuat) {
        this.NhanVienXuat = NhanVienXuat;
    }
    
    public void setKhachHang(String KhachHang) {
        this.KhachHang = KhachHang;
    }
    
    public void setHangHoaXuat(HangHoa HangHoaXuat) {
        this.HangHoaXuat = HangHoaXuat;
    }

    public void setSoLuongXuat(int SoLuongXuat) {
        this.SoLuongXuat = SoLuongXuat;
    } 
    
    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}