
package buoi5;

import buoi4.CNTT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
  DefaultTableModel dtm;
  mangsinhvien a;
  
   
    public GUI() {
        initComponents();
        a = new mangsinhvien();
        dtm = new DefaultTableModel();
       dtm.setColumnIdentifiers(new Object[]{"Mã SV","Họ Tên","Giới Tinh","Nganh","Mon1","Mon2","HHtml","Điểm TB","Loại"});
      tblHienThi.setModel(dtm);
      
    
               
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbrCNTT = new javax.swing.JRadioButton();
        rbrKhinhTe = new javax.swing.JRadioButton();
        lblMaSinhVien = new javax.swing.JLabel();
        txtMaSinhVien = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblGt = new javax.swing.JLabel();
        jbtNam = new javax.swing.JCheckBox();
        jbtNu = new javax.swing.JCheckBox();
        lblHtml = new javax.swing.JLabel();
        txtHtml = new javax.swing.JTextField();
        lblMon1 = new javax.swing.JLabel();
        txtMon1 = new javax.swing.JTextField();
        lblMon2 = new javax.swing.JLabel();
        txtMon2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();
        btnDocFile = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 800));

        rbrCNTT.setText("CNTT");
        rbrCNTT.addActionListener(this::rbrCNTTActionPerformed);

        rbrKhinhTe.setText("Kinh Tế");
        rbrKhinhTe.addActionListener(this::rbrKhinhTeActionPerformed);

        lblMaSinhVien.setText("Mã Sinh Viên");

        txtMaSinhVien.addActionListener(this::txtMaSinhVienActionPerformed);

        lblHoTen.setText("Họ Tên");

        lblGt.setText("Giới Tính");

        jbtNam.setText("Nam");
        jbtNam.addActionListener(this::jbtNamActionPerformed);

        jbtNu.setText("Nữ");

        lblHtml.setText("HTML");

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHienThi);

        btnDocFile.setText("Đọc File");
        btnDocFile.addActionListener(this::btnDocFileActionPerformed);

        btnThem.setText("Thêm");
        btnThem.addActionListener(this::btnThemActionPerformed);

        btnGhiFile.setText("Ghi File");
        btnGhiFile.addActionListener(this::btnGhiFileActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDocFile)
                .addGap(18, 18, 18)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnGhiFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMon1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblMon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblHtml, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHtml, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rbrCNTT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbrKhinhTe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtNu))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMon1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtMon2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbrCNTT)
                            .addComponent(rbrKhinhTe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtNam)
                            .addComponent(jbtNu))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMon1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lblMon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMon2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMon2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHtml, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHtml, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocFile)
                    .addComponent(btnThem)
                    .addComponent(btnGhiFile))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbrCNTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbrCNTTActionPerformed
     this.lblMon1.setText("Java");
     this.lblMon2.setText("Css");
     this.lblHtml.setVisible(true);
     this.txtHtml.setVisible(true);
             
    }//GEN-LAST:event_rbrCNTTActionPerformed

    private void rbrKhinhTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbrKhinhTeActionPerformed
       this.lblMon1.setText("NLKT");
     this.lblMon2.setText("Marketing");
     this.lblHtml.setVisible(false);
     this.txtHtml.setVisible(false);
    }//GEN-LAST:event_rbrKhinhTeActionPerformed

    private void txtMaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSinhVienActionPerformed

    private void jbtNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtNamActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
     String ma = txtMaSinhVien.getText();
     String ten = txtHoTen.getText();
     boolean gt = jbtNam.isSelected();
    double mon1 = Double.parseDouble(txtMon1.getText());
     double mon2 = Double.parseDouble(txtMon2.getText());

      if(rbrCNTT.isSelected()){
          double html = Double.parseDouble(txtHtml.getText());
          sinhvien sv = new cntt(ma,ten,gt,mon1,mon2,html);
          a.them(sv);
      }else{
          
          sinhvien sv = new kinhte(ma,ten,gt,mon1,mon2);
          a.them(sv);
      }
      LoodData(a.getA());
     
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
       JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        String tenfile = fc.getSelectedFile().getPath();
        a.docfile(tenfile);
        LoodData(a.getA());
    }//GEN-LAST:event_btnDocFileActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
       JFileChooser fc = new JFileChooser();
       fc.showSaveDialog(null);
       String tenfile = fc.getSelectedFile().getPath();
       a.ghifile(tenfile);
    }//GEN-LAST:event_btnGhiFileActionPerformed
 private void LoodData(ArrayList<sinhvien> a) {
     while(dtm.getRowCount()>0){
         dtm.removeRow(0);
     }
     
     for(sinhvien sv:a){
        if(sv instanceof cntt){
            dtm.addRow(new Object[]{sv.getmasv(),sv.gethoten(),(sv.isgt()?"Nam":"Nu"),"CNTT",((cntt)sv).getjava(),((cntt)sv).getcss(),((cntt)sv).gethtml(),
            sv.tinhDTB(),sv.xeploai()});
        }
        
          if(sv instanceof kinhte){
            dtm.addRow(new Object[]{sv.getmasv(),sv.gethoten(),(sv.isgt()?"Nam":"Nu"),"Kinh Tế",((kinhte)sv).getnlkt(),((kinhte)sv).getmakt(),
            "",sv.tinhDTB(),sv.xeploai()});
        }        
     }
     
     
        
    }
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jbtNam;
    private javax.swing.JCheckBox jbtNu;
    private javax.swing.JLabel lblGt;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblHtml;
    private javax.swing.JLabel lblMaSinhVien;
    private javax.swing.JLabel lblMon1;
    private javax.swing.JLabel lblMon2;
    private javax.swing.JRadioButton rbrCNTT;
    private javax.swing.JRadioButton rbrKhinhTe;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHtml;
    private javax.swing.JTextField txtMaSinhVien;
    private javax.swing.JTextField txtMon1;
    private javax.swing.JTextField txtMon2;
    // End of variables declaration//GEN-END:variables

   

   

       
}
