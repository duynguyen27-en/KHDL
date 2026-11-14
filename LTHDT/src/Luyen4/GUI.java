
package Luyen4;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
   QuanLySach a;
    DefaultTableModel dtm;
   
    public GUI() {
        initComponents();
        a = new QuanLySach();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mã","Họ Tên","Ngày Nhập","Đơn Giá","Số Lương","Tình Trạng","Thuế"});
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
        jtfhoten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfngaynhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfsoluong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfdongia1 = new javax.swing.JTextField();
        jrbsgk = new javax.swing.JRadioButton();
        jlbtinhtrang = new javax.swing.JLabel();
        jrbmoi = new javax.swing.JRadioButton();
        jrbcu = new javax.swing.JRadioButton();
        jrbstk = new javax.swing.JRadioButton();
        jlbthue = new javax.swing.JLabel();
        jtfthue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jbttimkiem = new javax.swing.JButton();
        jbttongsoluong = new javax.swing.JButton();
        jbtsapxep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bảng Danh Sách");

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

        jLabel5.setText("Ngay Nhập");

        jLabel6.setText("Đơn Giá");

        jLabel7.setText("Số Lượng");

        jrbsgk.setText("SGK");
        jrbsgk.addActionListener(this::jrbsgkActionPerformed);

        jlbtinhtrang.setText("Tình Trạng");

        jrbmoi.setText("Mới");

        jrbcu.setText("Cũ");

        jrbstk.setText("STK");
        jrbstk.addActionListener(this::jrbstkActionPerformed);

        jlbthue.setText("thuế");

        jButton1.setText("Đọc File");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jbttimkiem.setText("Tìm Kiếm");
        jbttimkiem.addActionListener(this::jbttimkiemActionPerformed);

        jbttongsoluong.setText("Tổng Số Lượng");
        jbttongsoluong.addActionListener(this::jbttongsoluongActionPerformed);

        jbtsapxep.setText("Sắp Xếp");
        jbtsapxep.addActionListener(this::jbtsapxepActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfdongia1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbsgk, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlbtinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jrbmoi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jrbcu))))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jlbthue, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfthue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 31, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jrbstk, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jbttimkiem)
                .addGap(44, 44, 44)
                .addComponent(jbttongsoluong)
                .addGap(40, 40, 40)
                .addComponent(jbtsapxep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbsgk)
                    .addComponent(jrbstk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfdongia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtinhtrang)
                    .addComponent(jrbmoi)
                    .addComponent(jrbcu)
                    .addComponent(jlbthue)
                    .addComponent(jtfthue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jtfsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jbttimkiem)
                    .addComponent(jbttongsoluong)
                    .addComponent(jbtsapxep))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbsgkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsgkActionPerformed
        jlbtinhtrang.setVisible(true);
        jrbmoi.setVisible(true);
        jrbcu.setVisible(true);
        
        jlbthue.setVisible(false);
        jtfthue.setVisible(false);
    }//GEN-LAST:event_jrbsgkActionPerformed

    private void jrbstkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbstkActionPerformed
        jlbtinhtrang.setVisible(false);
        jrbmoi.setVisible(false);
        jrbcu.setVisible(false);
        
        jlbthue.setVisible(true);
        jtfthue.setVisible(true);
    }//GEN-LAST:event_jrbstkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser f = new JFileChooser();
             f.showOpenDialog(null);
         String tenfile = f.getSelectedFile().getPath();
         a.docfile(tenfile);
         LooDate(a.getA());
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimkiemActionPerformed
       ArrayList<ISach> x= a.timSach();
        LooDate(x);
        javax.swing.JOptionPane.showMessageDialog(this,"Danh Sách Cuốn Sách Lớn hơn 500000");
    }//GEN-LAST:event_jbttimkiemActionPerformed

    private void jbttongsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttongsoluongActionPerformed
   javax.swing.JOptionPane.showMessageDialog(this,"Tổng Số Lượng Sách"+a.tinhTongSoLuong());
    }//GEN-LAST:event_jbttongsoluongActionPerformed

    private void jbtsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsapxepActionPerformed
       a.sapxep();
       
        LooDate(a.getA());
         javax.swing.JOptionPane.showMessageDialog(this,"Sắp Xếp Thành Công");
    }//GEN-LAST:event_jbtsapxepActionPerformed
  public void LooDate(ArrayList<ISach> x){
       while(dtm.getRowCount()>0){
           dtm.removeRow(0);
       }
       for(ISach s :x){
           Sach y = (Sach)s;
           if(y instanceof SachGiaoKhoa){
               dtm.addRow(new Object[]{y.getMa(),y.getTen(),y.getNgayNhap(),y.getDonGia(),y.getSoLuong(),
                              (((SachGiaoKhoa) y).isTinhTrang()?"Moi":"cu")});
           }else if(y instanceof SachThamKhao){
               dtm.addRow(new Object[]{y.getMa(),y.getTen(),y.getNgayNhap(),y.getDonGia(),y.getSoLuong(),
                              "",((SachThamKhao) y).getThue()});
           }
       }
  }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtsapxep;
    private javax.swing.JButton jbttimkiem;
    private javax.swing.JButton jbttongsoluong;
    private javax.swing.JLabel jlbthue;
    private javax.swing.JLabel jlbtinhtrang;
    private javax.swing.JRadioButton jrbcu;
    private javax.swing.JRadioButton jrbmoi;
    private javax.swing.JRadioButton jrbsgk;
    private javax.swing.JRadioButton jrbstk;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfdongia1;
    private javax.swing.JTextField jtfhoten;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfngaynhap;
    private javax.swing.JTextField jtfsoluong;
    private javax.swing.JTextField jtfthue;
    // End of variables declaration//GEN-END:variables
}
