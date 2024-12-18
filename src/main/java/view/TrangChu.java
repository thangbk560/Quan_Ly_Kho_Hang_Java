/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import model.TaiKhoan;

/**
 *
 * @author chanh
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    
    private TaiKhoan taiKhoan;
    private CardLayout cardLayout;
    private pnlNhanVien panel1;
    private pnlHangHoa panel2;
    private pnlPhieuNhap panel3;
    private pnlPhieuXuat panel4;
    private pnlViTriHangHoa panel5;
    
    public TrangChu(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        initComponents();
        
        cardLayout = new CardLayout();
        pnlMain.setLayout(cardLayout);
        
        panel1 = new pnlNhanVien(taiKhoan);
        panel2 = new pnlHangHoa(taiKhoan);
        panel3 = new pnlPhieuNhap(taiKhoan);
        panel4 = new pnlPhieuXuat(taiKhoan);
        panel5 = new pnlViTriHangHoa(taiKhoan);
        
        pnlMain.add(panel1, "NhanVien");
        pnlMain.add(panel2, "HangHoa");
        pnlMain.add(panel3, "PhieuNhap");
        pnlMain.add(panel4, "PhieuXuat");
        pnlMain.add(panel5, "ViTriHangHoa");
        
        cardLayout.show(pnlMain, "NhanVien");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnNhanVien = new javax.swing.JMenu();
        mnHangHoa = new javax.swing.JMenu();
        mnPhieu = new javax.swing.JMenu();
        mniPhieuNhap = new javax.swing.JMenuItem();
        mniPhieuXuat = new javax.swing.JMenuItem();
        mnViTiHangHoa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý kho hàng - Trang chủ");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        mnNhanVien.setText("Nhân Viên");
        mnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNhanVienMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNhanVien);

        mnHangHoa.setText("Hàng Hóa");
        mnHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnHangHoaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnHangHoa);

        mnPhieu.setText("Phiếu");
        mnPhieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mniPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniPhieuNhap.setText("Phiếu Nhập");
        mniPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPhieuNhapActionPerformed(evt);
            }
        });
        mnPhieu.add(mniPhieuNhap);

        mniPhieuXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniPhieuXuat.setText("Phiếu Xuất");
        mniPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPhieuXuatActionPerformed(evt);
            }
        });
        mnPhieu.add(mniPhieuXuat);

        jMenuBar1.add(mnPhieu);

        mnViTiHangHoa.setText("Vị Trí Hàng Hóa");
        mnViTiHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnViTiHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnViTiHangHoaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnViTiHangHoa);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPhieuNhapActionPerformed
        cardLayout.show(pnlMain, "PhieuNhap");
    }//GEN-LAST:event_mniPhieuNhapActionPerformed

    private void mniPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPhieuXuatActionPerformed
        cardLayout.show(pnlMain, "PhieuXuat");
    }//GEN-LAST:event_mniPhieuXuatActionPerformed

    private void mnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNhanVienMouseClicked
        cardLayout.show(pnlMain, "NhanVien");
    }//GEN-LAST:event_mnNhanVienMouseClicked

    private void mnHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnHangHoaMouseClicked
        cardLayout.show(pnlMain, "HangHoa");
        panel2.capnhatTable();
    }//GEN-LAST:event_mnHangHoaMouseClicked

    private void mnViTiHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnViTiHangHoaMouseClicked
        cardLayout.show(pnlMain, "ViTriHangHoa");
    }//GEN-LAST:event_mnViTiHangHoaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnHangHoa;
    private javax.swing.JMenu mnNhanVien;
    private javax.swing.JMenu mnPhieu;
    private javax.swing.JMenu mnViTiHangHoa;
    private javax.swing.JMenuItem mniPhieuNhap;
    private javax.swing.JMenuItem mniPhieuXuat;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
