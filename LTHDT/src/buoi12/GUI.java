
package buoi12;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
 DanhSachSanPham quanLy = new DanhSachSanPham();
    DefaultTableModel dtm = new DefaultTableModel();
    public GUI() {
        initComponents();
      this.setTitle("Quan Ly Thiet Bi");
        // Thiết lập tiêu đề cột chuẩn cho 9 cột
        dtm.setColumnIdentifiers(new Object[]{
            "Mã sản phẩm", "Màu sắc", "Năm SX", "Hãng SX", "Chip", "Ram", "Đơn giá", "Số lượng", "Chiết khấu"
        });
        jtbhienthi.setModel(dtm);
   
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbhienthi = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jlbma = new javax.swing.JLabel();
        jtfma = new javax.swing.JTextField();
        jlbdongia = new javax.swing.JLabel();
        jtfdongia = new javax.swing.JTextField();
        jlbsoluong = new javax.swing.JLabel();
        jtfsoluong = new javax.swing.JTextField();
        jrbtivi = new javax.swing.JRadioButton();
        jrbmaytinh = new javax.swing.JRadioButton();
        jlbmau = new javax.swing.JLabel();
        jtfnam = new javax.swing.JTextField();
        jlbhang = new javax.swing.JLabel();
        jtfmau = new javax.swing.JTextField();
        jlbnam = new javax.swing.JLabel();
        jtfchip = new javax.swing.JTextField();
        jlbchip = new javax.swing.JLabel();
        jlbram = new javax.swing.JLabel();
        jtfhang1 = new javax.swing.JTextField();
        jtfram = new javax.swing.JTextField();
        jbtxoa = new javax.swing.JButton();
        jbtsapxep = new javax.swing.JButton();
        jbttimkiem = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jbtdocfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dự Án Quản Ly Điện Tử");

        jLabel2.setText("Bảng Danh Sach");

        jtbhienthi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbhienthi);

        jLabel3.setText("Nhập Thông Tin");

        jlbma.setText("Mã SP");

        jlbdongia.setText("Đơn Gia");

        jlbsoluong.setText("Số Lượng");

        jrbtivi.setText("TiVi");

        jrbmaytinh.setText("Máy Tính");

        jlbmau.setText("Màu");

        jlbhang.setText("Hang SX");

        jlbnam.setText("nam");

        jlbchip.setText("Chíp");

        jlbram.setText("Ram");

        jbtxoa.setText("Xoa");
        jbtxoa.addActionListener(this::jbtxoaActionPerformed);

        jbtsapxep.setText("Săp Xếp");
        jbtsapxep.addActionListener(this::jbtsapxepActionPerformed);

        jbttimkiem.setText("Tìm Kiếm");
        jbttimkiem.addActionListener(this::jbttimkiemActionPerformed);

        jbtthem.setText("Thêm");
        jbtthem.addActionListener(this::jbtthemActionPerformed);

        jButton5.setText("Tông Chiết Khấu");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jbtdocfile.setText("Đọc File");
        jbtdocfile.addActionListener(this::jbtdocfileActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(jrbtivi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jrbmaytinh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jlbdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jlbnam, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jlbma, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jlbsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jlbhang, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jlbmau, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtfnam, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfmau, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jlbram, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfram, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jlbchip, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfchip, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jtfhang1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)))
                                .addGap(0, 11, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtthem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtsapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jbtdocfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbtivi)
                        .addComponent(jrbmaytinh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbma)
                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbmau)
                    .addComponent(jtfmau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbchip)
                    .addComponent(jtfchip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdongia)
                    .addComponent(jtfdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbnam)
                    .addComponent(jlbram)
                    .addComponent(jtfram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbsoluong)
                    .addComponent(jtfsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbhang)
                    .addComponent(jtfhang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtxoa)
                    .addComponent(jbtsapxep)
                    .addComponent(jbttimkiem)
                    .addComponent(jButton5)
                    .addComponent(jbtthem)
                    .addComponent(jbtdocfile))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtdocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdocfileActionPerformed
       javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    
    
    int result = fc.showOpenDialog(this);
    
    if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
      
        String tenfile = fc.getSelectedFile().getPath();
        
        try {
            
            quanLy.docfile(tenfile);
            
            
            loadData(quanLy.a);
            
           
            javax.swing.JOptionPane.showMessageDialog(this, "Đọc file thành công!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi đọc file: " + e.getMessage(), "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jbtdocfileActionPerformed

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
     try {
            String ma = jtfma.getText();
            double dg = Double.parseDouble(jtfdongia.getText());
            double sl = Double.parseDouble(jtfsoluong.getText());
            
            if (jrbtivi.isSelected()) {
                String mau = jtfmau.getText();
                int nam = Integer.parseInt(jtfnam.getText());
                String hang = jtfhang1.getText();
                quanLy.a.add(new TiVi(ma, dg, sl, mau, nam, hang));
            } else {
                String chip = jtfchip.getText();
                double ram = Double.parseDouble(jtfram.getText());
                quanLy.a.add(new MayTinh(ma, dg, sl, chip, ram));
            }
            loadData(quanLy.a);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại định dạng dữ liệu!");
        }
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
       int row = jtbhienthi.getSelectedRow();
    
    
    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trong bảng để xóa!");
        return;
    }
    
    
    String ma = jtbhienthi.getValueAt(row, 0).toString();
    
    
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc chắn muốn xóa sản phẩm có mã: " + ma + " không?", 
            "Xác nhận xóa", javax.swing.JOptionPane.YES_NO_OPTION);
            
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
       
        if (quanLy.xoaSanPham(ma)) {
            
            loadData(quanLy.a);
            javax.swing.JOptionPane.showMessageDialog(this, "Đã xóa thành công!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm để xóa!");
        }
    }
    }//GEN-LAST:event_jbtxoaActionPerformed

    private void jbtsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsapxepActionPerformed
      quanLy.sapXepTheoChietKhau();
    
    
    loadData(quanLy.a);
    
    
    javax.swing.JOptionPane.showMessageDialog(this, "Đã sắp xếp danh sách theo chiết khấu tăng dần!");
    }//GEN-LAST:event_jbtsapxepActionPerformed

    private void jbttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimkiemActionPerformed
    
    
    String maCanTim = javax.swing.JOptionPane.showInputDialog(this, "Nhập mã sản phẩm cần tìm:");
    
    
    if (maCanTim == null || maCanTim.trim().isEmpty()) {
        return;
    }
    
    
    SanPham ketQua = quanLy.timKiemSanPham(maCanTim.trim());
    
    
    if (ketQua != null) {
        
        ArrayList<SanPham> listTam = new ArrayList<>();
        listTam.add(ketQua);
        loadData(listTam);
        javax.swing.JOptionPane.showMessageDialog(this, "Đã tìm thấy sản phẩm!");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm nào có mã: " + maCanTim);
        
        loadData(quanLy.a);
    }

    }//GEN-LAST:event_jbttimkiemActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      double tong = quanLy.tinhTongTienGiamGia();
    
   
    javax.swing.JOptionPane.showMessageDialog(this, "Tổng tiền chiết khấu của tất cả sản phẩm là: " + tong);
    }//GEN-LAST:event_jButton5ActionPerformed
public void loadData(ArrayList<SanPham> list) {
        dtm.setRowCount(0);
        for (SanPham i : list) {
            Object[] row = new Object[9];
            row[0] = i.getMaSp(); // Mã
            row[6] = i.getDonGia();
            row[7] = i.getSoLuong();
            row[8] = i.tinhChietKhau();
            
            if (i instanceof TiVi) {
                TiVi tv = (TiVi) i;
                row[1] = tv.getMau();
                row[2] = tv.getNam();
                row[3] = tv.getHangSX();
            } else if (i instanceof MayTinh) {
                MayTinh mt = (MayTinh) i;
                row[4] = mt.getChip();
                row[5] = mt.getRam();
            }
            dtm.addRow(row);
        }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtdocfile;
    private javax.swing.JButton jbtsapxep;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbttimkiem;
    private javax.swing.JButton jbtxoa;
    private javax.swing.JLabel jlbchip;
    private javax.swing.JLabel jlbdongia;
    private javax.swing.JLabel jlbhang;
    private javax.swing.JLabel jlbma;
    private javax.swing.JLabel jlbmau;
    private javax.swing.JLabel jlbnam;
    private javax.swing.JLabel jlbram;
    private javax.swing.JLabel jlbsoluong;
    private javax.swing.JRadioButton jrbmaytinh;
    private javax.swing.JRadioButton jrbtivi;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfchip;
    private javax.swing.JTextField jtfdongia;
    private javax.swing.JTextField jtfhang1;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfmau;
    private javax.swing.JTextField jtfnam;
    private javax.swing.JTextField jtfram;
    private javax.swing.JTextField jtfsoluong;
    // End of variables declaration//GEN-END:variables
}
