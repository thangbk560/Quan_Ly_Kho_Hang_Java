/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.DatabaseConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import model.TaiKhoan;

/**
 *
 * @author chanh
 */
public class pnlPhieuXuat extends javax.swing.JPanel {

    /**
     * Creates new form pnlPhieuXuat
     */
    
    private TaiKhoan taiKhoan;
    
    private void filterTable(String query) {
        DefaultTableModel model = (DefaultTableModel) tblPhieuXuat.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        tblPhieuXuat.setRowSorter(sorter);

        if (query.trim().isEmpty()) {
            sorter.setRowFilter(null); // Nếu ô tìm kiếm trống, hiển thị tất cả dữ liệu
        } else {
            // Lọc dữ liệu dựa trên chuỗi tìm kiếm, không phân biệt chữ hoa/thường
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
        }
    }
    
    private void loadTableData(TaiKhoan taiKhoan) {
        DefaultTableModel model = (DefaultTableModel) tblPhieuXuat.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        tblPhieuXuat.setRowSorter(sorter);
        model.setRowCount(0); // Xóa dữ liệu cũ trên bảng

        try (Connection conn = new DatabaseConnection().getConnection()) {
            String sql = "SELECT MaPhieuXuat, NgayXuat, MaNhanVien, KhachHang, MaHang, SoLuongXuat, ThanhTien FROM PhieuNhap WHERE ID_TaiKhoan = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, taiKhoan.getID_TaiKhoan());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getString("MaPhieuXuat"),
                    rs.getString("NgayXuat"),
                    rs.getString("MaNhanVien"),
                    rs.getString("KhachHang"),
                    rs.getString("MaHang"),
                    rs.getString("SoLuongXuat"),
                    rs.getString("ThanhTien")
                };
                model.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(pnlNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Không thể tải dữ liệu từ cơ sở dữ liệu!");
        }
    }
    
    public pnlPhieuXuat(TaiKhoan taiKhoan){
        initComponents();
        
        // Thêm DocumentListener cho ô tìm kiếm
        txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable(txtTimKiem.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable(txtTimKiem.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable(txtTimKiem.getText());
            }
        });
        
        loadTableData(taiKhoan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTimKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuXuat = new javax.swing.JTable();
        btnThemPhieuXuat = new javax.swing.JButton();
        btnSuaPhieuXuat = new javax.swing.JButton();
        btnXoaPhieuXuat = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        jLabel1.setText("Tìm kiếm:");

        tblPhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Ngày xuất", "Mã nhân viên", "Khách hàng", "Mã hàng hóa", "Số lượng xuất", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tblPhieuXuat);
        if (tblPhieuXuat.getColumnModel().getColumnCount() > 0) {
            tblPhieuXuat.getColumnModel().getColumn(2).setResizable(false);
        }

        btnThemPhieuXuat.setText("Thêm phiếu xuất");
        btnThemPhieuXuat.setPreferredSize(new java.awt.Dimension(150, 35));
        btnThemPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhieuXuatActionPerformed(evt);
            }
        });

        btnSuaPhieuXuat.setText("Sửa thông tin");
        btnSuaPhieuXuat.setPreferredSize(new java.awt.Dimension(150, 35));
        btnSuaPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPhieuXuatActionPerformed(evt);
            }
        });

        btnXoaPhieuXuat.setText("Xóa phiếu xuất");
        btnXoaPhieuXuat.setPreferredSize(new java.awt.Dimension(150, 35));
        btnXoaPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuXuatActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setPreferredSize(new java.awt.Dimension(150, 35));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnThemPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSuaPhieuXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoaPhieuXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThemPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhieuXuatActionPerformed
        new PX_Them(taiKhoan).setVisible(true);
        loadTableData(taiKhoan);
    }//GEN-LAST:event_btnThemPhieuXuatActionPerformed

    private void btnSuaPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhieuXuatActionPerformed
        int selectedRow = tblPhieuXuat.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu nhập để sửa!");
            return;
        }

        // Lấy thông tin
        String phieuXuat = tblPhieuXuat.getValueAt(selectedRow, 0).toString();
        String ngayXuat = tblPhieuXuat.getValueAt(selectedRow, 1).toString();
        String maNhanVien = tblPhieuXuat.getValueAt(selectedRow, 2).toString();
        String khachhang= tblPhieuXuat.getValueAt(selectedRow, 3).toString();
        String maHang = tblPhieuXuat.getValueAt(selectedRow, 4).toString();
        int soluongXuat = Integer.parseInt(tblPhieuXuat.getValueAt(selectedRow, 2).toString());

        PX_Sua suaForm = new PX_Sua(taiKhoan, phieuXuat, ngayXuat, maNhanVien, khachhang, maHang, soluongXuat);
        suaForm.setVisible(true);
        
        suaForm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                loadTableData(taiKhoan); // Cập nhật lại bảng sau khi sửa
            }
        });
    }//GEN-LAST:event_btnSuaPhieuXuatActionPerformed

    private void btnXoaPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuXuatActionPerformed
        int selectedRow = tblPhieuXuat.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu nhập để xóa!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa phiếu nhập này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String maPX = tblPhieuXuat.getValueAt(selectedRow, 0).toString();
            String maNV = tblPhieuXuat.getValueAt(selectedRow, 2).toString();
            String maHH = tblPhieuXuat.getValueAt(selectedRow, 4).toString();
            int soluongXuat = Integer.parseInt(tblPhieuXuat.getValueAt(selectedRow, 5).toString());

            try (Connection conn = new DatabaseConnection().getConnection()) {
                String sql = "DELETE FROM PhieuNhap WHERE MaPhieuNhap = ? AND MaNhanVien = ? AND MaHang = ? AND ID_TaiKhoan = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, maPX);
                ps.setString(2, maNV);
                ps.setString(3, maHH);
                ps.setInt(4, taiKhoan.getID_TaiKhoan());
                ps.executeUpdate();
                
                
                sql = "UPDATE HangHoa SET SoLuongTon = SoLuongTon + ? WHERE MaHang = ? AND ID_TaiKhoan = ?";
                ps.setInt(1, soluongXuat);
                ps.setString(2, maHH);
                ps.setInt(3, taiKhoan.getID_TaiKhoan());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                loadTableData(taiKhoan); // Cập nhật lại bảng sau khi xóa
            } catch (Exception ex) {
                Logger.getLogger(pnlNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
            }
        }
    }//GEN-LAST:event_btnXoaPhieuXuatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose(); // Đóng form chính
            new Login().setVisible(true); // Hiển thị form đăng nhập
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnSuaPhieuXuat;
    private javax.swing.JButton btnThemPhieuXuat;
    private javax.swing.JButton btnXoaPhieuXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhieuXuat;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}