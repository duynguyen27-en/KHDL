
package Luyen6;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
  DanhMucSach a;
    DefaultTableModel dtm;
    
    public GUI() {
        initComponents();
        a = new DanhMucSach();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Tên","Nhà XB","Năm SX","Tác Giả","Số Trang","Giá Bán","Số Lượng","Khối Lớp","Thể Loại"});
        
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
        jtften = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfnhaxb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfnamxb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtftacgia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfgiaban = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfsotrang1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfsoluong = new javax.swing.JTextField();
        jrbsgk = new javax.swing.JRadioButton();
        jlbkhoilop = new javax.swing.JLabel();
        jtfkhoilop = new javax.swing.JTextField();
        jrbtt = new javax.swing.JRadioButton();
        jlbtheloai = new javax.swing.JLabel();
        jtftheloai = new javax.swing.JTextField();
        jbtdocfile = new javax.swing.JButton();
        jbtthongke = new javax.swing.JButton();
        jbtgiatienmax = new javax.swing.JButton();
        jbtttmax = new javax.swing.JButton();
        jbttong = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jbtxoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh Sách Danh Mục");

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

        jLabel3.setText("Tên");

        jLabel4.setText("Nhà XB");

        jLabel5.setText("Năm XB");

        jLabel6.setText("Tác Giả");

        jLabel7.setText("Số Trang");

        jLabel8.setText("Giá Bán");

        jLabel9.setText("Số Lượng");

        jrbsgk.setText("SGK");
        jrbsgk.addActionListener(this::jrbsgkActionPerformed);

        jlbkhoilop.setText("Khối Lớp");

        jrbtt.setText("TT");
        jrbtt.addActionListener(this::jrbttActionPerformed);

        jlbtheloai.setText("Thể Loại");

        jbtdocfile.setText("Đọc file");
        jbtdocfile.addActionListener(this::jbtdocfileActionPerformed);

        jbtthongke.setText("Thống Kê");
        jbtthongke.addActionListener(this::jbtthongkeActionPerformed);

        jbtgiatienmax.setText("Giá Tiên TT Max");
        jbtgiatienmax.addActionListener(this::jbtgiatienmaxActionPerformed);

        jbtttmax.setText("TT Max");
        jbtttmax.addActionListener(this::jbtttmaxActionPerformed);

        jbttong.setText("Tổng");
        jbttong.addActionListener(this::jbttongActionPerformed);

        jbtthem.setText("Thêm");
        jbtthem.addActionListener(this::jbtthemActionPerformed);

        jbtxoa.setText("Xóa");
        jbtxoa.addActionListener(this::jbtxoaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfnamxb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtften, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfnhaxb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jlbkhoilop, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jbtthem)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jbtxoa))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jtfkhoilop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(32, 32, 32)
                                                        .addComponent(jlbtheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jtftheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtdocfile)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfsotrang1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtthongke))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtgiatienmax)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtttmax)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbttong)))
                                .addGap(0, 30, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(jrbsgk, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbsgk)
                    .addComponent(jrbtt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtften, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtfgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbkhoilop)
                    .addComponent(jtfkhoilop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtheloai)
                    .addComponent(jtftheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfnhaxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jtfsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfnamxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtftacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtfsotrang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtdocfile)
                    .addComponent(jbtthongke)
                    .addComponent(jbtgiatienmax)
                    .addComponent(jbtttmax)
                    .addComponent(jbttong)
                    .addComponent(jbtthem)
                    .addComponent(jbtxoa))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbsgkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsgkActionPerformed
       jlbkhoilop.setVisible(true);
       jtfkhoilop.setVisible(true);
       jlbtheloai.setVisible(false);
       jtftheloai.setVisible(false);
    }//GEN-LAST:event_jrbsgkActionPerformed

    private void jrbttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbttActionPerformed
      jlbkhoilop.setVisible(false);
       jtfkhoilop.setVisible(false);
       jlbtheloai.setVisible(true);
       jtftheloai.setVisible(true);
    }//GEN-LAST:event_jrbttActionPerformed

    private void jbtdocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdocfileActionPerformed
                JFileChooser f = new JFileChooser();
                f.showOpenDialog(null);
                String tenfile = f.getSelectedFile().getPath();
                a.docfile(tenfile);
                LooDate(a.getA());

    }//GEN-LAST:event_jbtdocfileActionPerformed

    private void jbtthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthongkeActionPerformed
      javax.swing.JOptionPane.showMessageDialog(this,a.thongKe());
    }//GEN-LAST:event_jbtthongkeActionPerformed

    private void jbtgiatienmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtgiatienmaxActionPerformed
             ArrayList<DanhMuc> x = new ArrayList<> ();
             x.add(a.giaBansTTMax());
             if(x.isEmpty()){
                 javax.swing.JOptionPane.showMessageDialog(this," mảng trống rổng");
             }else{
                 LooDate(x);
                 javax.swing.JOptionPane.showMessageDialog(this,"Danh Sách Giá Bán Cao Nhất Tiểu Thuyêt");
             }
    }//GEN-LAST:event_jbtgiatienmaxActionPerformed

    private void jbtttmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtttmaxActionPerformed
       ArrayList<DanhMuc> x = new ArrayList<> ();
             x.add(a.sachThanhTienMax());
             if(x.isEmpty()){
                 javax.swing.JOptionPane.showMessageDialog(this," mảng trống rổng");
             }else{
                 LooDate(x);
                 javax.swing.JOptionPane.showMessageDialog(this,"Danh Sách Thành Tiền Cao Nhất");
             }
    }//GEN-LAST:event_jbtttmaxActionPerformed

    private void jbttongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttongActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"tổng thành tiền Là :"+a.TongThanhTien());
    }//GEN-LAST:event_jbttongActionPerformed

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
    
        String ten = jtften.getText();
      String nhaXB = jtfnhaxb.getText();
      String namXB = jtfnamxb.getText();
      String s[] = namXB.split("/");
      int ngay = Integer.parseInt(s[0].trim());
       int thang = Integer.parseInt(s[1].trim());
        int nam = Integer.parseInt(s[2].trim());
        NamXB n = new NamXB(ngay, thang, nam);
        String tacGia = jtftacgia.getText();
        int soTrang = Integer.parseInt(jtfsotrang1.getText());
        double giaBan = Double.parseDouble(jtfgiaban.getText());
          int soLuong = Integer.parseInt(jtfsoluong.getText());
        if(jrbsgk.isSelected()){
            String khoiLop = jtfkhoilop.getText();
           DanhMuc y = new SachGiaoKhoa(ten, nhaXB, n, tacGia, soTrang, giaBan, soLuong, khoiLop);
            a.them(y);
        } else if(jrbtt.isSelected()){
            String theLoai = jtftheloai.getText();
          DanhMuc y = new  tieuThuyet(ten, nhaXB, n, tacGia, soTrang, giaBan, soLuong, theLoai);
          a.them(y);
        }
        LooDate(a.getA());
       
        
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
     String ma = javax.swing.JOptionPane.showInputDialog(this,"Nhập Mã Cần Xóa");
             
    }//GEN-LAST:event_jbtxoaActionPerformed
  public void LooDate(ArrayList<DanhMuc> x){
      while(dtm.getRowCount()>0){
          dtm.removeRow(0);
      }
      for(DanhMuc dm:x){
          if(dm instanceof SachGiaoKhoa){
              dtm.addRow(new Object[]{dm.getTen(),dm.getNhaXB(),dm.getNamXB(),dm.getTacGia(),dm.getSoTrang(),dm.getGiaBan(),dm.getSoLuong()
                          ,((SachGiaoKhoa) dm).getKhoiLop(),""});
          } else if(dm instanceof tieuThuyet){
              dtm.addRow(new Object[]{dm.getTen(),dm.getNhaXB(),dm.getNamXB(),dm.getTacGia(),dm.getSoTrang(),dm.getGiaBan(),dm.getSoLuong()
                          ,"",((tieuThuyet) dm).getTheLoai()});
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtdocfile;
    private javax.swing.JButton jbtgiatienmax;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbtthongke;
    private javax.swing.JButton jbttong;
    private javax.swing.JButton jbtttmax;
    private javax.swing.JButton jbtxoa;
    private javax.swing.JLabel jlbkhoilop;
    private javax.swing.JLabel jlbtheloai;
    private javax.swing.JRadioButton jrbsgk;
    private javax.swing.JRadioButton jrbtt;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfgiaban;
    private javax.swing.JTextField jtfkhoilop;
    private javax.swing.JTextField jtfnamxb;
    private javax.swing.JTextField jtfnhaxb;
    private javax.swing.JTextField jtfsoluong;
    private javax.swing.JTextField jtfsotrang1;
    private javax.swing.JTextField jtftacgia;
    private javax.swing.JTextField jtften;
    private javax.swing.JTextField jtftheloai;
    // End of variables declaration//GEN-END:variables
}
