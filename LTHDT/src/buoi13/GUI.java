/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buoi13;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    DefaultTableModel dmt;
    QuanLySinhVien a;
    
    public GUI() {
        initComponents();
        this.setTitle("Quản Lý Sinh Viên");
        dmt = new DefaultTableModel();
        a = new QuanLySinhVien();
        dmt.setColumnIdentifiers(new Object[]{"Mã SV","Họ Tên","Ngay Sinh","Nganh","Điểm TB","Điẻm RL","Trương TN","Quốc Gia","Điểm Ielst"});
        jtbhienthi.setModel(dmt);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbhienthi = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        llbmasv = new javax.swing.JLabel();
        jtften = new javax.swing.JTextField();
        jlbngaysinh = new javax.swing.JLabel();
        jlbten = new javax.swing.JLabel();
        jtfmasv1 = new javax.swing.JTextField();
        jtfnganh = new javax.swing.JTextField();
        jlbnganh = new javax.swing.JLabel();
        jlbdiemtb = new javax.swing.JLabel();
        jtfngaysinh2 = new javax.swing.JTextField();
        jtfdiemtb = new javax.swing.JTextField();
        jrbsvcq = new javax.swing.JRadioButton();
        jrbsvvt = new javax.swing.JRadioButton();
        jrbsvqt = new javax.swing.JRadioButton();
        jlbdiemrl = new javax.swing.JLabel();
        jtftruong = new javax.swing.JTextField();
        jlbtruong = new javax.swing.JLabel();
        jtfdiemrl = new javax.swing.JTextField();
        jlbquocgia = new javax.swing.JLabel();
        jlbdiemielst = new javax.swing.JLabel();
        jtfdiemielst = new javax.swing.JTextField();
        jtfquocgia = new javax.swing.JTextField();
        jbtthem = new javax.swing.JButton();
        jbtcapnhat = new javax.swing.JButton();
        jbtxoa = new javax.swing.JButton();
        jbttimkiem = new javax.swing.JButton();
        jbthocbong = new javax.swing.JButton();
        jbtsvtbmax = new javax.swing.JButton();
        jbttungnganh = new javax.swing.JButton();
        jbtthongke = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmidocfile = new javax.swing.JMenuItem();
        jmnighifile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh Sách Sinh Viên");

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

        jLabel2.setText("Tông Tin Thí Sinh");

        llbmasv.setText("Mã SV");

        jlbngaysinh.setText("Ngày Sinh");

        jlbten.setText("Họ Tên");

        jlbnganh.setText("ngành");

        jlbdiemtb.setText("Điểm TB");

        jrbsvcq.setText("SVCQ");
        jrbsvcq.addActionListener(this::jrbsvcqActionPerformed);

        jrbsvvt.setText("SVLT");
        jrbsvvt.addActionListener(this::jrbsvvtActionPerformed);

        jrbsvqt.setText("SVQT");
        jrbsvqt.addActionListener(this::jrbsvqtActionPerformed);

        jlbdiemrl.setText("Điểm RL");

        jlbtruong.setText("Trường");

        jlbquocgia.setText("quốc Gia");

        jlbdiemielst.setText("Điểm Ielst");

        jbtthem.setText("Thêm");
        jbtthem.addActionListener(this::jbtthemActionPerformed);

        jbtcapnhat.setText("Cập Nhật");
        jbtcapnhat.addActionListener(this::jbtcapnhatActionPerformed);

        jbtxoa.setText("xoa");
        jbtxoa.addActionListener(this::jbtxoaActionPerformed);

        jbttimkiem.setText("Tìm Kiếm");
        jbttimkiem.addActionListener(this::jbttimkiemActionPerformed);

        jbthocbong.setText("Hoc Bổng");
        jbthocbong.addActionListener(this::jbthocbongActionPerformed);

        jbtsvtbmax.setText("Tìm Sv TB Max");
        jbtsvtbmax.addActionListener(this::jbtsvtbmaxActionPerformed);

        jbttungnganh.setText("Từng Ngành");
        jbttungnganh.addActionListener(this::jbttungnganhActionPerformed);

        jbtthongke.setText("Tống Kê");
        jbtthongke.addActionListener(this::jbtthongkeActionPerformed);

        jMenu2.setText("Edit");

        jmidocfile.setText("Đọc File");
        jmidocfile.addActionListener(this::jmidocfileActionPerformed);
        jMenu2.add(jmidocfile);

        jmnighifile.setText("Ghi File");
        jmnighifile.addActionListener(this::jmnighifileActionPerformed);
        jMenu2.add(jmnighifile);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfngaysinh2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(llbmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfmasv1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbten, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtften, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtxoa)
                        .addGap(18, 18, 18)
                        .addComponent(jbttimkiem)
                        .addGap(31, 31, 31)
                        .addComponent(jbthocbong)
                        .addGap(39, 39, 39)
                        .addComponent(jbtsvtbmax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbttungnganh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(460, 460, 460))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfnganh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbsvcq, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbdiemrl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfdiemrl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbsvvt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtthongke)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlbtruong, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtftruong, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbsvqt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbdiemielst, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfdiemielst, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbtthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtcapnhat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(llbmasv)
                            .addComponent(jtfmasv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbnganh)
                            .addComponent(jtfnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbten)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtften, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbdiemtb)
                                .addComponent(jtfdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbsvcq)
                            .addComponent(jrbsvvt)
                            .addComponent(jrbsvqt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbdiemrl)
                            .addComponent(jtftruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbtruong)
                            .addComponent(jtfdiemrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbquocgia)
                            .addComponent(jtfquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbdiemielst)
                            .addComponent(jtfdiemielst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbngaysinh)
                    .addComponent(jtfngaysinh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtthem)
                    .addComponent(jbtcapnhat)
                    .addComponent(jbtxoa)
                    .addComponent(jbttimkiem)
                    .addComponent(jbthocbong)
                    .addComponent(jbtsvtbmax)
                    .addComponent(jbttungnganh)
                    .addComponent(jbtthongke))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmnighifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnighifileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmnighifileActionPerformed

    private void jmidocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmidocfileActionPerformed
       JFileChooser f = new JFileChooser();
       f.showOpenDialog(null);
       String tenfile = f.getSelectedFile().getPath();
       a.docfile(tenfile);
       LooDate(a.getA());
    }//GEN-LAST:event_jmidocfileActionPerformed

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
     String ma = jtfmasv1.getText().trim();
     String ten = jtften.getText().trim();
     String ngays = jtfngaysinh2.getText().trim();
     String s[] = ngays.split("/");
     int ngay = Integer.parseInt(s[0].trim());
     int thang = Integer.parseInt(s[1].trim());
     int nam = Integer.parseInt(s[2].trim());
     NgaySinh n = new NgaySinh(ngay,thang,nam);
     String nganh = jtfnganh.getText().trim();
     double diemTB = Double.parseDouble(jtfdiemtb.getText().trim());
     if(jrbsvcq.isSelected()){
          double diemRL = Double.parseDouble(jtfdiemrl.getText().trim());
          SVCQ x = new SVCQ(ma, ten, n, nganh, diemTB, diemRL);
          a.them(x);
     }
      if(jrbsvvt.isSelected()){
        String truong = jtftruong.getText().trim();
          SVLT x = new SVLT(ma, ten, n, nganh, diemTB, truong);
          a.them(x);
     }
        if(jrbsvqt.isSelected()){
        String quocgia  = jtfquocgia.getText().trim();
        double diemielst = Double.parseDouble(jtfdiemielst.getText().trim());
          SVQT x = new SVQT(ma, ten, n, nganh, diemTB, quocgia,diemielst);
          a.them(x);
     }
     
        LooDate(a.getA());
        
    }//GEN-LAST:event_jbtthemActionPerformed

    private void jrbsvcqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsvcqActionPerformed
   jlbdiemrl.setVisible(true);
   jtfdiemrl.setVisible(true);
   jlbtruong.setVisible(false);
   jtftruong.setVisible(false);
   jlbquocgia.setVisible(false);
    jtfquocgia.setVisible(false);
   jlbdiemielst.setVisible(false);
    jtfdiemielst.setVisible(false);
    }//GEN-LAST:event_jrbsvcqActionPerformed

    private void jrbsvvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsvvtActionPerformed
       jlbdiemrl.setVisible(false);
   jtfdiemrl.setVisible(false);
   jlbtruong.setVisible(true);
   jtftruong.setVisible(true);
   jlbquocgia.setVisible(false);
    jtfquocgia.setVisible(false);
   jlbdiemielst.setVisible(false);
    jtfdiemielst.setVisible(false);
    }//GEN-LAST:event_jrbsvvtActionPerformed

    private void jrbsvqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbsvqtActionPerformed
        jlbdiemrl.setVisible(false);
   jtfdiemrl.setVisible(false);
   jlbtruong.setVisible(false);
   jtftruong.setVisible(false);
   jlbquocgia.setVisible(true);
    jtfquocgia.setVisible(true);
   jlbdiemielst.setVisible(true);
    jtfdiemielst.setVisible(true);
    }//GEN-LAST:event_jrbsvqtActionPerformed

    private void jbtcapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcapnhatActionPerformed
      String ma = javax.swing.JOptionPane.showInputDialog(this,"Nhap ma can tim");
        
        try {
            
            String ten = jtften.getText();
            String ngays= jtfngaysinh2.getText();
            String s[] = ngays.split("/");
            int ngay = Integer.parseInt(s[0].trim());
            int thang = Integer.parseInt(s[1].trim());
            int nam = Integer.parseInt(s[2].trim());
            String nganhHoc = jtfnganh.getText();
            double diemtb = Double.parseDouble(jtfdiemtb.getText());;
              double diemRL = 0;
              String tenTruongTN = "";
               String quocGia = "";
                double diemIelst = 0;
                
               if(jrbsvcq.isSelected()){
                   diemRL=Double.parseDouble(jtfdiemrl.getText());
               }else if(jrbsvvt.isSelected()){
                   tenTruongTN = jtftruong.getText();
               }else if(jrbsvqt.isSelected()){
                   quocGia = jtfquocgia.getText();
                   diemIelst = Double.parseDouble(jtfdiemielst.getText());
               }
              
            if(a.capNhat(ma, ten, ngay, thang, nam, ngays, diemtb, diemRL, tenTruongTN, quocGia, diemIelst)){
                LooDate(a.getA());
                javax.swing.JOptionPane.showMessageDialog(this,"cap nhat thanh cong");
            }else{
                 javax.swing.JOptionPane.showMessageDialog(this,"cap nhat k thanh cong");
            }
            
            
            
            
            
        } catch (Exception e) {
        }
          
          
          
                  
      
      
    }//GEN-LAST:event_jbtcapnhatActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
     int row = jtbhienthi.getSelectedRow();
     
     String ma = jtbhienthi.getValueAt(row,0).toString();
        try {
            a.xoa(ma);
            LooDate(a.getA());
            javax.swing.JOptionPane.showMessageDialog(this,"xoa thanh cong ma :"+ma);
        } catch (Exception e) {
        }
     
     
    }//GEN-LAST:event_jbtxoaActionPerformed

    private void jbttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimkiemActionPerformed
   String timkiem = javax.swing.JOptionPane.showInputDialog(this,"Nhập Mã Số Cần Tim");
        try {
            ArrayList<DaiHocA> x = new ArrayList<>();
            
            x.add(a.tim(timkiem));
            LooDate(x);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbttimkiemActionPerformed

    private void jbthocbongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbthocbongActionPerformed
        ArrayList<DaiHocA> x = a.hocBong();
        LooDate(x);
        javax.swing.JOptionPane.showMessageDialog(this,"nhửng Sinh Viên Đạt Hoc Bổng");
       
        
    }//GEN-LAST:event_jbthocbongActionPerformed

    private void jbtsvtbmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsvtbmaxActionPerformed
       ArrayList<DaiHocA> x = new ArrayList<>();
       x.add(a.timDiemTBMax());
        LooDate(x);
        javax.swing.JOptionPane.showMessageDialog(this,"Sinh Viên Đạt TB cao");
    }//GEN-LAST:event_jbtsvtbmaxActionPerformed

    private void jbttungnganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttungnganhActionPerformed
      String nganh = javax.swing.JOptionPane.showInputDialog(this,"Nhập Nganh Can Liet Kê");
      ArrayList<DaiHocA> x = a.getByNganh(nganh);
        LooDate(x);
          javax.swing.JOptionPane.showMessageDialog(this,"Nganh "+nganh);
    }//GEN-LAST:event_jbttungnganhActionPerformed

    private void jbtthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthongkeActionPerformed
    javax.swing.JOptionPane.showMessageDialog(this,a.thongKeSoLuong());
    }//GEN-LAST:event_jbtthongkeActionPerformed

    public void LooDate(ArrayList<DaiHocA> a){
        while(dmt.getRowCount()>0){
            dmt.removeRow(0);
        }
        for(DaiHocA sv:a){
            if(sv instanceof SVCQ){
                dmt.addRow(new Object[]{sv.getMaSV(),sv.getTenSV(),sv.getNgaySinh(),sv.getNganhHoc(),sv.getDiemTB(),((SVCQ) sv).getDiemRL()});
            }else   if(sv instanceof SVLT){
                dmt.addRow(new Object[]{sv.getMaSV(),sv.getTenSV(),sv.getNgaySinh(),sv.getNganhHoc(),sv.getDiemTB(),"",((SVLT) sv).getTenTruongTN()});
            }else   if(sv instanceof SVQT){
                dmt.addRow(new Object[]{sv.getMaSV(),sv.getTenSV(),sv.getNgaySinh(),sv.getNganhHoc(),sv.getDiemTB(),"","",((SVQT) sv).getQuocGia(),((SVQT) sv).getDiemIelts()});
            }
        }
        
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtcapnhat;
    private javax.swing.JButton jbthocbong;
    private javax.swing.JButton jbtsvtbmax;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbtthongke;
    private javax.swing.JButton jbttimkiem;
    private javax.swing.JButton jbttungnganh;
    private javax.swing.JButton jbtxoa;
    private javax.swing.JLabel jlbdiemielst;
    private javax.swing.JLabel jlbdiemrl;
    private javax.swing.JLabel jlbdiemtb;
    private javax.swing.JLabel jlbnganh;
    private javax.swing.JLabel jlbngaysinh;
    private javax.swing.JLabel jlbquocgia;
    private javax.swing.JLabel jlbten;
    private javax.swing.JLabel jlbtruong;
    private javax.swing.JMenuItem jmidocfile;
    private javax.swing.JMenuItem jmnighifile;
    private javax.swing.JRadioButton jrbsvcq;
    private javax.swing.JRadioButton jrbsvqt;
    private javax.swing.JRadioButton jrbsvvt;
    private javax.swing.JTable jtbhienthi;
    private javax.swing.JTextField jtfdiemielst;
    private javax.swing.JTextField jtfdiemrl;
    private javax.swing.JTextField jtfdiemtb;
    private javax.swing.JTextField jtfmasv1;
    private javax.swing.JTextField jtfnganh;
    private javax.swing.JTextField jtfngaysinh2;
    private javax.swing.JTextField jtfquocgia;
    private javax.swing.JTextField jtften;
    private javax.swing.JTextField jtftruong;
    private javax.swing.JLabel llbmasv;
    // End of variables declaration//GEN-END:variables
}
