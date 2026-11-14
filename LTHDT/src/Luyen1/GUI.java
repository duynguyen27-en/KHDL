
package Luyen1;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    DefaultTableModel dtm;
    DanhSachTuyenSinh a;
   
    public GUI() {
        initComponents();
        a= new DanhSachTuyenSinh();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mã","Họ Tên","Ngày Sinh","Giới tính","Tỉnh Thành","Trường","toan","anh","ly","van"});
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
        jlbma = new javax.swing.JLabel();
        jtfma = new javax.swing.JTextField();
        jlbhoten = new javax.swing.JLabel();
        jtfhoten = new javax.swing.JTextField();
        jlbngaysinh = new javax.swing.JLabel();
        jlbtinhthanh = new javax.swing.JLabel();
        jtfngaysin1 = new javax.swing.JTextField();
        jlbgt1 = new javax.swing.JLabel();
        jtftinhthanhh = new javax.swing.JTextField();
        jlbtentruong = new javax.swing.JLabel();
        jtftoan = new javax.swing.JTextField();
        jlbtoan = new javax.swing.JLabel();
        jtftentruong = new javax.swing.JTextField();
        jlbanh = new javax.swing.JLabel();
        jtfly = new javax.swing.JTextField();
        jrbdo1 = new javax.swing.JRadioButton();
        jrba01 = new javax.swing.JRadioButton();
        jlbly = new javax.swing.JLabel();
        jtfanh1 = new javax.swing.JTextField();
        jtfvan = new javax.swing.JTextField();
        jlbvan = new javax.swing.JLabel();
        jbtdocfile = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jrbnam = new javax.swing.JRadioButton();
        jrbnu = new javax.swing.JRadioButton();
        jbtthukhoa = new javax.swing.JButton();
        jbtsapxep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh Sách Tuyển Sinh");

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

        jlbma.setText("Mã ");

        jlbhoten.setText("Họ Tên");

        jlbngaysinh.setText("Ngay Sinh");

        jlbtinhthanh.setText("Tỉnh Thành");

        jlbgt1.setText("Giới Tính");

        jlbtentruong.setText("Tên Trường");

        jlbtoan.setText("Toán");

        jlbanh.setText("Anh");

        jrbdo1.setText("D01");
        jrbdo1.addActionListener(this::jrbdo1ActionPerformed);

        jrba01.setText("A01");
        jrba01.addActionListener(this::jrba01ActionPerformed);

        jlbly.setText("Lý");

        jlbvan.setText("Văn");

        jbtdocfile.setText("Đọc File");
        jbtdocfile.addActionListener(this::jbtdocfileActionPerformed);

        jbtthem.setText("Thêm");
        jbtthem.addActionListener(this::jbtthemActionPerformed);

        jrbnam.setText("Nam");

        jrbnu.setText("Nữ");

        jbtthukhoa.setText("Thủ Khoa");
        jbtthukhoa.addActionListener(this::jbtthukhoaActionPerformed);

        jbtsapxep.setText("Sắp Xếp");
        jbtsapxep.addActionListener(this::jbtsapxepActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfngaysin1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbanh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftoan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbtinhthanh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftinhthanhh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jrba01, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbtentruong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtftentruong, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jlbly, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfly, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                        .addComponent(jlbvan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfvan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtdocfile)
                                    .addComponent(jlbgt1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbnam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbnu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jbtthem)
                                        .addGap(56, 56, 56)
                                        .addComponent(jbtthukhoa)
                                        .addGap(50, 50, 50)
                                        .addComponent(jbtsapxep)))))
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbdo1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbma)
                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtinhthanh)
                    .addComponent(jtftinhthanhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrba01)
                    .addComponent(jrbdo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbhoten)
                    .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtentruong)
                    .addComponent(jtftentruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbly)
                    .addComponent(jtfly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbvan))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbngaysinh)
                    .addComponent(jtfngaysin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtoan)
                    .addComponent(jtftoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbgt1)
                    .addComponent(jlbanh)
                    .addComponent(jtfanh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbnam)
                    .addComponent(jrbnu))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtdocfile)
                    .addComponent(jbtthem)
                    .addComponent(jbtthukhoa)
                    .addComponent(jbtsapxep))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrba01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrba01ActionPerformed
   jlbly.setVisible(true);
   jtfly.setVisible(true);
   jlbvan.setVisible(false);
   jtfvan.setVisible(false);
    }//GEN-LAST:event_jrba01ActionPerformed

    private void jrbdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbdo1ActionPerformed
     jlbly.setVisible(false);
   jtfly.setVisible(false);
   jlbvan.setVisible(true);
   jtfvan.setVisible(true);
    }//GEN-LAST:event_jrbdo1ActionPerformed

    private void jbtdocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdocfileActionPerformed
      JFileChooser f = new JFileChooser();
      f.showOpenDialog(null);
      String tenfile = f.getSelectedFile().getPath();
      a.docfile(tenfile);
        Loodate(a.getA());
      
    }//GEN-LAST:event_jbtdocfileActionPerformed

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
    String ma = jtfma.getText();
    String ten = jtfhoten.getText();
    String ngays = jtfngaysin1.getText();
    String s[] = ngays.split("/");
    int ngay = Integer.parseInt(s[0].trim());
    int thang = Integer.parseInt(s[1].trim());
    int nam = Integer.parseInt(s[2].trim());
    NgaySinh n = new NgaySinh(ngay, thang, nam);
     boolean gt = jrbnam.isSelected();
    String tinh = jtftinhthanhh.getText();
    String truong = jtftentruong.getText();
    double toan = Double.parseDouble(jtftoan.getText());
     double anh = Double.parseDouble(jtfvan.getText());
     if(jrba01.isSelected()){
          double ly = Double.parseDouble(jtfly.getText());
          ITuyenSinh x = new A01(ma, ten, n,gt, tinh, truong, toan, anh, ly);
          a.them(x);
     } else if(jrbdo1.isSelected()){
          double van = Double.parseDouble(jtfvan.getText());
          ITuyenSinh x = new D01(ma, ten, n,gt, tinh, truong, toan, anh, van);
          a.them(x);
     }
    
    
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jbtthukhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthukhoaActionPerformed
       ArrayList<ITuyenSinh> x = new  ArrayList<>() ;
       x.add(a.thhuKhoa());
        Loodate(x);
        javax.swing.JOptionPane.showMessageDialog(this,"Danh Sach Thhu Khoa");
    }//GEN-LAST:event_jbtthukhoaActionPerformed

    private void jbtsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsapxepActionPerformed
       a.xapxep();
        Loodate(a.getA());
    }//GEN-LAST:event_jbtsapxepActionPerformed
  public void Loodate(ArrayList<ITuyenSinh> x){
      while(dtm.getRowCount()>0){
          dtm.removeRow(0);
      }
      for(ITuyenSinh ts:x){
          TuyenSinh y = (TuyenSinh) ts;
          if(y instanceof A01){
              dtm.addRow(new Object[]{y.getMa(),y.getHoTen(),y.getNgaySinh(),(y.isGt()?"nam":"nu"),y.getTinhThanh(),y.getTenTruong(),
                    y.getToan(),y.getAnh(),((A01) y).getLy(),""});
          } else  if(y instanceof D01){
              dtm.addRow(new Object[]{y.getMa(),y.getHoTen(),y.getNgaySinh(),(y.isGt()?"nam":"nu"),y.getTinhThanh(),y.getTenTruong(),
                    y.getToan(),y.getAnh(),"",((D01) y).getVan()});
          }
          
      }
      
  }
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtdocfile;
    private javax.swing.JButton jbtsapxep;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbtthukhoa;
    private javax.swing.JLabel jlbanh;
    private javax.swing.JLabel jlbgt1;
    private javax.swing.JLabel jlbhoten;
    private javax.swing.JLabel jlbly;
    private javax.swing.JLabel jlbma;
    private javax.swing.JLabel jlbngaysinh;
    private javax.swing.JLabel jlbtentruong;
    private javax.swing.JLabel jlbtinhthanh;
    private javax.swing.JLabel jlbtoan;
    private javax.swing.JLabel jlbvan;
    private javax.swing.JRadioButton jrba01;
    private javax.swing.JRadioButton jrbdo1;
    private javax.swing.JRadioButton jrbnam;
    private javax.swing.JRadioButton jrbnu;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfanh1;
    private javax.swing.JTextField jtfhoten;
    private javax.swing.JTextField jtfly;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfngaysin1;
    private javax.swing.JTextField jtftentruong;
    private javax.swing.JTextField jtftinhthanhh;
    private javax.swing.JTextField jtftoan;
    private javax.swing.JTextField jtfvan;
    // End of variables declaration//GEN-END:variables
}
