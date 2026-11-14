
package Luyen3;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    QuanLyKho a;
    DefaultTableModel dtm;
    
    public GUI() {
        initComponents();
        a = new QuanLyKho();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mã","Họ Tên","Ngày Nhập","Giá Gốc","Thời Gian BH","Chất Liệu"});
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
        jLabel5 = new javax.swing.JLabel();
        jtfngaysinh = new javax.swing.JTextField();
        jtfhoten = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfthoigianbh = new javax.swing.JTextField();
        jrbhangdt = new javax.swing.JRadioButton();
        jlbthoigianbh = new javax.swing.JLabel();
        jtfgiagoc1 = new javax.swing.JTextField();
        jrbhgd = new javax.swing.JRadioButton();
        jlbchatlieu = new javax.swing.JLabel();
        jtfchatlieu = new javax.swing.JTextField();
        jbtdocfile = new javax.swing.JButton();
        jbttimsanpham = new javax.swing.JButton();
        jbttonggiaban = new javax.swing.JButton();
        jbtsapxep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh Sách Sản Phẩm");

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

        jLabel2.setText("Thông Tin");

        jLabel3.setText("Mã");

        jLabel4.setText("Họ Tên");

        jLabel5.setText("Ngày Sinh");

        jLabel6.setText("Giá Gốc");

        jrbhangdt.setText("HDT");
        jrbhangdt.addActionListener(this::jrbhangdtActionPerformed);

        jlbthoigianbh.setText("Thời Gian BH");

        jrbhgd.setText("HGD");
        jrbhgd.addActionListener(this::jrbhgdActionPerformed);

        jlbchatlieu.setText("Chất Liệu");

        jbtdocfile.setText("Đọc File");
        jbtdocfile.addActionListener(this::jbtdocfileActionPerformed);

        jbttimsanpham.setText("Tìm Sản Phẩm");
        jbttimsanpham.addActionListener(this::jbttimsanphamActionPerformed);

        jbttonggiaban.setText("Tổng Giá Bán");
        jbttonggiaban.addActionListener(this::jbttonggiabanActionPerformed);

        jbtsapxep.setText("Sáp Xếp");
        jbtsapxep.addActionListener(this::jbtsapxepActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtdocfile)
                                .addGap(18, 18, 18)
                                .addComponent(jbttimsanpham)
                                .addGap(30, 30, 30)
                                .addComponent(jbttonggiaban)
                                .addGap(47, 47, 47)
                                .addComponent(jbtsapxep))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfgiagoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jrbhangdt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jlbthoigianbh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfthoigianbh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbhgd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbchatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfchatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jrbhangdt)
                    .addComponent(jtfgiagoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbhgd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbthoigianbh)
                    .addComponent(jtfthoigianbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbchatlieu)
                    .addComponent(jtfchatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtdocfile)
                    .addComponent(jbttimsanpham)
                    .addComponent(jbttonggiaban)
                    .addComponent(jbtsapxep))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbhangdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbhangdtActionPerformed
       jlbthoigianbh.setVisible(true);
       jtfthoigianbh.setVisible(true);
       jlbchatlieu.setVisible(false);
       jtfchatlieu.setVisible(false);
    }//GEN-LAST:event_jrbhangdtActionPerformed

    private void jrbhgdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbhgdActionPerformed
       jlbthoigianbh.setVisible(false);
       jtfthoigianbh.setVisible(false);
       jlbchatlieu.setVisible(true);
       jtfchatlieu.setVisible(true);
    }//GEN-LAST:event_jrbhgdActionPerformed

    private void jbtdocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdocfileActionPerformed
        JFileChooser f = new JFileChooser();
        f.showOpenDialog(null);
        String tenfile = f.getSelectedFile().getPath();
        a.docfile(tenfile);
        LooDate(a.getA());
        
    }//GEN-LAST:event_jbtdocfileActionPerformed

    private void jbttimsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimsanphamActionPerformed
       String row = javax.swing.JOptionPane.showInputDialog(this,"Nhập Khoảng Sản Phẩm Cần Tìm Kiếm");
       String s[] = row.split(",");
       double canTren = Double.parseDouble(s[0].trim());
       double canDuoi = Double.parseDouble(s[1].trim());
        System.out.println("can tren :"+canTren+"can duoi :"+canDuoi);
       ArrayList<IKho> x = a.timSanPham(canTren, canDuoi);
        LooDate(x);
        javax.swing.JOptionPane.showMessageDialog(this,"Những Sản Phẩm Cần Tìm");
       
    }//GEN-LAST:event_jbttimsanphamActionPerformed

    private void jbttonggiabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttonggiabanActionPerformed
       javax.swing.JOptionPane.showMessageDialog(this,a.tinhTongGiaBan());
    }//GEN-LAST:event_jbttonggiabanActionPerformed

    private void jbtsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsapxepActionPerformed
     a.sapXepTheoChuCai();
        LooDate(a.getA());
    }//GEN-LAST:event_jbtsapxepActionPerformed
    public void LooDate(ArrayList<IKho> x){
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        for(IKho k:x){
            SanPham  y = (SanPham)k;
            if(y instanceof HangDienTu){
                dtm.addRow(new Object[]{y.getMa(),y.getHoTen(),y.getNgayNhap(),y.getGiaGoc(),((HangDienTu) y).getThoiGianBH()});
            } else if(y instanceof HangGiaDung){
                dtm.addRow(new Object[]{y.getMa(),y.getHoTen(),y.getNgayNhap(),y.getGiaGoc(),"",((HangGiaDung) y).getChatLieu()});
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
    private javax.swing.JButton jbtsapxep;
    private javax.swing.JButton jbttimsanpham;
    private javax.swing.JButton jbttonggiaban;
    private javax.swing.JLabel jlbchatlieu;
    private javax.swing.JLabel jlbthoigianbh;
    private javax.swing.JRadioButton jrbhangdt;
    private javax.swing.JRadioButton jrbhgd;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfchatlieu;
    private javax.swing.JTextField jtfgiagoc1;
    private javax.swing.JTextField jtfhoten;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfngaysinh;
    private javax.swing.JTextField jtfthoigianbh;
    // End of variables declaration//GEN-END:variables
}
