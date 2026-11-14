
package Luyen7;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
   DanhhSachHoaDon a;
    DefaultTableModel dtm;
    public GUI() {
        initComponents();
        a = new DanhhSachHoaDon();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mã","Tên Khách","Ngày HD","Đơn Giá","Số Giờ Thuê","Số Ngày thuê"});
        jtbhienthi.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbhienthi = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtftenkach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfngayhd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfdongia = new javax.swing.JTextField();
        jrbhdtg = new javax.swing.JRadioButton();
        jlbsogiothue = new javax.swing.JLabel();
        jtfsogiothue = new javax.swing.JTextField();
        jrbhdtn = new javax.swing.JRadioButton();
        jlbsongaythue = new javax.swing.JLabel();
        jtfsongaythhue = new javax.swing.JTextField();
        jbtdocfile = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jbttimkiem = new javax.swing.JButton();
        jbtxoa = new javax.swing.JButton();
        jbttinhtien = new javax.swing.JButton();
        jbttingaytongtienlonnhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh Sách Hóa Đơn");

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

        jLabel2.setText("Hóa Đơn");

        jLabel3.setText("Mã");

        jLabel4.setText("Tên Khách");

        jLabel5.setText("Ngày HD");

        jLabel6.setText("Đơn Giá");

        jrbhdtg.setText("HDTG");
        jrbhdtg.addActionListener(this::jrbhdtgActionPerformed);

        jlbsogiothue.setText("Số Giờ Thuê");

        jrbhdtn.setText("HDTN");
        jrbhdtn.addActionListener(this::jrbhdtnActionPerformed);

        jlbsongaythue.setText("Số Ngày Thuê");

        jbtdocfile.setText("Đọc File");
        jbtdocfile.addActionListener(this::jbtdocfileActionPerformed);

        jbtthem.setText("Thêm");
        jbtthem.addActionListener(this::jbtthemActionPerformed);

        jbttimkiem.setText("Tìm Kiếm");
        jbttimkiem.addActionListener(this::jbttimkiemActionPerformed);

        jbtxoa.setText("Xóa");
        jbtxoa.addActionListener(this::jbtxoaActionPerformed);

        jbttinhtien.setText("Tính Tiền");
        jbttinhtien.addActionListener(this::jbttinhtienActionPerformed);

        jbttingaytongtienlonnhat.setText("Tìm Ngày Tiền Max");
        jbttingaytongtienlonnhat.addActionListener(this::jbttingaytongtienlonnhatActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtftenkach, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfngayhd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addComponent(jlbsogiothue, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfsogiothue, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addComponent(jlbsongaythue, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfsongaythhue, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jrbhdtg, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbhdtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtdocfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtthem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbttimkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtxoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbttinhtien)
                .addGap(18, 18, 18)
                .addComponent(jbttingaytongtienlonnhat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbhdtg)
                    .addComponent(jrbhdtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsogiothue)
                    .addComponent(jtfsogiothue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsongaythue)
                    .addComponent(jtfsongaythhue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtftenkach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfngayhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtdocfile)
                    .addComponent(jbtthem)
                    .addComponent(jbttimkiem)
                    .addComponent(jbtxoa)
                    .addComponent(jbttinhtien)
                    .addComponent(jbttingaytongtienlonnhat))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbhdtgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbhdtgActionPerformed
  jlbsogiothue.setVisible(true);
  jtfsogiothue.setVisible(true);
  jlbsongaythue.setVisible(false);
  jtfsongaythhue.setVisible(false);
    }//GEN-LAST:event_jrbhdtgActionPerformed

    private void jrbhdtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbhdtnActionPerformed
 jlbsogiothue.setVisible(false);
  jtfsogiothue.setVisible(false);
  jlbsongaythue.setVisible(true);
  jtfsongaythhue.setVisible(true);
    }//GEN-LAST:event_jrbhdtnActionPerformed

    private void jbtdocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdocfileActionPerformed
  JFileChooser f = new JFileChooser();
  f.showOpenDialog(null);
  String tenfile = f.getSelectedFile().getPath();
  a.docfile(tenfile);
        LooDate(a.getA());
  
    }//GEN-LAST:event_jbtdocfileActionPerformed

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
       String ma = jtfma.getText();
       String ten = jtftenkach.getText();
       String ngays = jtfngayhd.getText();
       String s[] = ngays.split("/");
       int ngay = Integer.parseInt(s[0].trim());
        int thang = Integer.parseInt(s[1].trim());
         int nam = Integer.parseInt(s[2].trim());
         NgayHD n = new NgayHD(ngay, thang, nam);
         double donGia = Double.parseDouble(jtfdongia.getText());
         if(jrbhdtg.isSelected()){
             int soGioThue = Integer.parseInt(jtfsogiothue.getText());
             HoaDon x = new HoaDonTheoGio(ma, ten, n, donGia, soGioThue);
             a.them(x);
         } else   if(jrbhdtn.isSelected()){
             int soNgayThhue = Integer.parseInt(jtfsongaythhue.getText());
              HoaDon x = new HoaDonTheoNgay(ma, ten, n, donGia, soNgayThhue);
              a.them(x);
         } 
         LooDate(a.getA());
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jbttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimkiemActionPerformed
    String ma = javax.swing.JOptionPane.showInputDialog(this,"nhập Mã Cần Tìm");
        ArrayList<HoaDon> x = new ArrayList<>();
          x.add(a.timKiem(ma));
        if(x.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"Mảng Rổng");
        }else{
          
            LooDate(x);
            javax.swing.JOptionPane.showMessageDialog(this,"Tìm Kiếm Thành Công");
        }
        
    
       
    }//GEN-LAST:event_jbttimkiemActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
             String ma = javax.swing.JOptionPane.showInputDialog(this,"nhập Mã Cần xóa");
             a.xoa(ma);
             try {
                 LooDate(a.getA());
                javax.swing.JOptionPane.showMessageDialog(this,"Xóa Thành Công"); 
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtxoaActionPerformed

    private void jbttinhtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttinhtienActionPerformed
   javax.swing.JOptionPane.showMessageDialog(this,"Tổng Thành Tiền Tất Cả Hóa Đơn La :"+a.tinhTongTien()); 
    }//GEN-LAST:event_jbttinhtienActionPerformed

    private void jbttingaytongtienlonnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttingaytongtienlonnhatActionPerformed
         javax.swing.JOptionPane.showMessageDialog(this,a.ngayTongTienLonNhat()); 
    }//GEN-LAST:event_jbttingaytongtienlonnhatActionPerformed
  public void LooDate(ArrayList<HoaDon> x){
      while(dtm.getRowCount()>0){
          dtm.removeRow(0);
      }
      
      for(HoaDon hd:x){
          if(hd instanceof HoaDonTheoGio){
              dtm.addRow(new Object[]{hd.getMaHD(),hd.getTenKhach(),hd.getNgayHD(),hd.getDonGia(),
                      ((HoaDonTheoGio) hd).getSoGioThue()});
          } else  if(hd instanceof HoaDonTheoNgay){
              dtm.addRow(new Object[]{hd.getMaHD(),hd.getTenKhach(),hd.getNgayHD(),hd.getDonGia(),
                      "",((HoaDonTheoNgay) hd).getSoNgayThue()});
          }
          
      }
  }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtdocfile;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbttimkiem;
    private javax.swing.JButton jbttingaytongtienlonnhat;
    private javax.swing.JButton jbttinhtien;
    private javax.swing.JButton jbtxoa;
    private javax.swing.JLabel jlbsogiothue;
    private javax.swing.JLabel jlbsongaythue;
    private javax.swing.JRadioButton jrbhdtg;
    private javax.swing.JRadioButton jrbhdtn;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfdongia;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfngayhd;
    private javax.swing.JTextField jtfsogiothue;
    private javax.swing.JTextField jtfsongaythhue;
    private javax.swing.JTextField jtftenkach;
    // End of variables declaration//GEN-END:variables
}
