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
public class TaiKhoan  implements Serializable{
    private int ID_TaiKhoan;
    private String Ten_TaiKhoan;
    private String MatKhau_TaiKhoan;
    
    public TaiKhoan() {};
    
    public TaiKhoan(int ID_TaiKhoan, String Ten_TaiKhoan, String MatKhau_TaiKhoan) {
        this.ID_TaiKhoan = ID_TaiKhoan;
        this.Ten_TaiKhoan = Ten_TaiKhoan;
        this.MatKhau_TaiKhoan = MatKhau_TaiKhoan;
    }
    
    public int getID_TaiKhoan() {
        return ID_TaiKhoan;
    }
    
    public String getTen_TaiKhoan() {
        return Ten_TaiKhoan;
    }
    
    public String getMMatKhau_TaiKhoan(){
        return MatKhau_TaiKhoan;
    }
    
    public void setID_TaiKhoan(int ID_TaiKhoan) {
        this.ID_TaiKhoan = ID_TaiKhoan;
    }
    
    public void setTen_TaiKhoan(String Ten_TaiKhoan) {
        this.Ten_TaiKhoan = Ten_TaiKhoan;
    }
    
    public void setMatKhau_TaiKhoan(String MatKhau_TaiKhoan) {
        this.MatKhau_TaiKhoan = MatKhau_TaiKhoan;
    }
}
