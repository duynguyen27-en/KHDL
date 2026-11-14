
package Luyen2;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
QuanLyNhanVien a;
    DefaultTableModel dtm;
    public GUI() {
        initComponents();
        a = new QuanLyNhanVien();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Mã","Họ Tên","Ngày Sinh","Lương CB","Số Ngày Nghỉ","Doanh Số BH"});
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
        jtfluongcb = new javax.swing.JTextField();
        jlbngaysinh = new javax.swing.JLabel();
        jtfhoten = new javax.swing.JTextField();
        jlbluongcb = new javax.swing.JLabel();
        jtfngaysinh1 = new javax.swing.JTextField();
        jrbnvvp = new javax.swing.JRadioButton();
        jrbnvkd = new javax.swing.JRadioButton();
        jlbsongaynghi = new javax.swing.JLabel();
        jtfsongaynghhi = new javax.swing.JTextField();
        jlbdoanhsobh = new javax.swing.JLabel();
        jtfdoanhsobanhang = new javax.swing.JTextField();
        jbtdocfile = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jbttimfkiem = new javax.swing.JButton();
        jbtsapxep = new javax.swing.JButton();
        jbtthongke = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh Sách Nhân Viên");

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

        jlbma.setText("Mã");

        jlbhoten.setText("Họ Tên");

        jlbngaysinh.setText("Ngày Sinh");

        jlbluongcb.setText("Lương CB");

        jrbnvvp.setText("NVVP");
        jrbnvvp.addActionListener(this::jrbnvvpActionPerformed);

        jrbnvkd.setText("NVKD");
        jrbnvkd.addActionListener(this::jrbnvkdActionPerformed);

        jlbsongaynghi.setText("Số Ngày Nghỉ");

        jlbdoanhsobh.setText("Dong So BH");

        jbtdocfile.setText("Đọc File");
        jbtdocfile.addActionListener(this::jbtdocfileActionPerformed);

        jbtthem.setText("Thêm");
        jbtthem.addActionListener(this::jbtthemActionPerformed);

        jbttimfkiem.setText("Tìm Kiếm");
        jbttimfkiem.addActionListener(this::jbttimfkiemActionPerformed);

        jbtsapxep.setText("Sắp Xếp");
        jbtsapxep.addActionListener(this::jbtsapxepActionPerformed);

        jbtthongke.setText("Tống Kê");
        jbtthongke.addActionListener(this::jbtthongkeActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtdocfile)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtthem))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlbngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtfngaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlbma, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jrbnvvp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jbttimfkiem)
                                        .addGap(47, 47, 47)
                                        .addComponent(jbtsapxep)))
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtthongke)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(280, 280, 280)
                                        .addComponent(jlbsongaynghi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfsongaynghhi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbnvkd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbdoanhsobh, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfdoanhsobanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbma, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbnvvp)
                            .addComponent(jrbnvkd))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbdoanhsobh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbsongaynghi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfsongaynghhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfdoanhsobanhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfngaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtdocfile)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtthem)
                        .addComponent(jbttimfkiem)
                        .addComponent(jbtsapxep)
                        .addComponent(jbtthongke)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbnvvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbnvvpActionPerformed
   jlbsongaynghi.setVisible(true);
   jtfsongaynghhi.setVisible(true);
   jlbdoanhsobh.setVisible(false);
   jtfdoanhsobanhang.setVisible(false);
   
    }//GEN-LAST:event_jrbnvvpActionPerformed

    private void jrbnvkdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbnvkdActionPerformed
       jlbsongaynghi.setVisible(false);
   jtfsongaynghhi.setVisible(false);
   jlbdoanhsobh.setVisible(true);
   jtfdoanhsobanhang.setVisible(true);
   
    }//GEN-LAST:event_jrbnvkdActionPerformed

    private void jbtdocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtdocfileActionPerformed
     JFileChooser f = new JFileChooser();
     f.showOpenDialog(null);
     String tenfile = f.getSelectedFile().getPath();
     a.docfile(tenfile);
        LooDate(a.getA());
    }//GEN-LAST:event_jbtdocfileActionPerformed

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
      String ma = jtfma.getText();
      String ten = jtfhoten.getText();
      String ngays = jtfngaysinh1.getText();
      String s[] = ngays.split("/");
      int ngay = Integer.parseInt(s[0].trim());
      int thang = Integer.parseInt(s[1].trim());
      int nam = Integer.parseInt(s[2].trim());
      NgaySinh n = new NgaySinh(ngay, thang, nam);
      double luongCB = Double.parseDouble(jtfluongcb.getText());
      if(jrbnvvp.isSelected()){
          int soNgayNghi = Integer.parseInt(jtfsongaynghhi.getText());
          IThue x = new NhanVienVanPhong(ma, ten, n, luongCB, soNgayNghi);
          a.them(x);
      }else  if(jrbnvkd.isSelected()){
          double doanhSoBH = Double.parseDouble(jtfdoanhsobanhang.getText());
          IThue x = new NhanVienKinhDoanh(ma, ten, n, luongCB, doanhSoBH);
          a.them(x);
      }
      
        LooDate(a.getA());
      
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jbttimfkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimfkiemActionPerformed
       String row = javax.swing.JOptionPane.showInputDialog(this,"Nhập Mã Cần Tìm");
        try {
             ArrayList<IThue> x = new ArrayList<>();
       x.add(a.timKiem(row));
            LooDate(x);
             javax.swing.JOptionPane.showMessageDialog(this,"Tìm Kiếm Thành Công");
        } catch (Exception e) {
        }
       
               
    }//GEN-LAST:event_jbttimfkiemActionPerformed

    private void jbtsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsapxepActionPerformed
       a.xapxep();
        LooDate(a.getA());
         javax.swing.JOptionPane.showMessageDialog(this,"Sắp Xếp Thành Công");
    }//GEN-LAST:event_jbtsapxepActionPerformed

    private void jbtthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthongkeActionPerformed
       javax.swing.JOptionPane.showMessageDialog(this,a.thongKe());
    }//GEN-LAST:event_jbtthongkeActionPerformed
 public void LooDate(ArrayList<IThue> x){
     while(dtm.getRowCount()>0){
         dtm.removeRow(0);
     }
     for(IThue nv:x){
         NhanVien y = (NhanVien) nv;
         if(y instanceof NhanVienVanPhong){
             dtm.addRow(new Object[]{y.getMa(),y.getHoTen(),y.getNgaySinh(),y.getLuongCoBan(),
                                ((NhanVienVanPhong) y).getSoNgayNghi()});
         } else if(y instanceof NhanVienKinhDoanh){
             dtm.addRow(new Object[]{y.getMa(),y.getHoTen(),y.getNgaySinh(),y.getLuongCoBan(),"",
                                ((NhanVienKinhDoanh) y).getDoanhSoBH()});
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
    private javax.swing.JButton jbtthongke;
    private javax.swing.JButton jbttimfkiem;
    private javax.swing.JLabel jlbdoanhsobh;
    private javax.swing.JLabel jlbhoten;
    private javax.swing.JLabel jlbluongcb;
    private javax.swing.JLabel jlbma;
    private javax.swing.JLabel jlbngaysinh;
    private javax.swing.JLabel jlbsongaynghi;
    private javax.swing.JRadioButton jrbnvkd;
    private javax.swing.JRadioButton jrbnvvp;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfdoanhsobanhang;
    private javax.swing.JTextField jtfhoten;
    private javax.swing.JTextField jtfluongcb;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfngaysinh1;
    private javax.swing.JTextField jtfsongaynghhi;
    // End of variables declaration//GEN-END:variables
}
