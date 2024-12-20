/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author ADITYA
 */
public class inputbuku extends javax.swing.JFrame {

    /**
     * Creates new form inputbuku
     */
    public inputbuku(){
        initComponents();
        setkat();
    
        try {
           BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Input Data Buku");
    }
private void setkat(){
    cmbkat.addItem("Kategori");
    cmbkat.addItem("Biografi");
    cmbkat.addItem("Fantasi");
    cmbkat.addItem("Fiksi");
    cmbkat.addItem("Sejarah");
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtpengarang = new javax.swing.JTextField();
        txtpenerbit = new javax.swing.JTextField();
        txtjudul = new javax.swing.JTextField();
        cmbkat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtstok = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpengarang.setText("Pengarang");
        txtpengarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpengarangMouseClicked(evt);
            }
        });
        jPanel2.add(txtpengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 474, 46));

        txtpenerbit.setText("Penerbit");
        txtpenerbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpenerbitMouseClicked(evt);
            }
        });
        jPanel2.add(txtpenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 474, 46));

        txtjudul.setText("Judul");
        txtjudul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtjudulMouseClicked(evt);
            }
        });
        jPanel2.add(txtjudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 474, 46));

        jPanel2.add(cmbkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 95, -1));

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        txtdesc.setText("\n\n   Deskripsi");
        txtdesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdescMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtdesc);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 505, -1));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jButton3.setText("Cancel");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        txtstok.setText("Stok");
        txtstok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtstokMouseClicked(evt);
            }
        });
        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstokKeyTyped(evt);
            }
        });
        jPanel2.add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 65, 25));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 110, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setText("FORM INPUT BUKU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String kat = (String) cmbkat.getSelectedItem();
String jdl = (String) txtjudul.getText();
String penga = (String) txtpengarang.getText();
String pener = (String) txtpenerbit.getText();
String desc = (String) txtdesc.getText();
String stk = (String) txtstok.getText();


     if(kat.equals("Kategori")){
      JOptionPane.showMessageDialog(null, "Pilih Kategori!");
     }   
     else if(jdl.equals("")||penga.equals("")||pener.equals("")||desc.equals("")||stk.equals("")){
      JOptionPane.showMessageDialog(null, "Tidak Boleh Ada Yang Kosong!");     
     }
     else{
     try{
    String sql="select*from buku order by id_buku desc";
    java.sql.Connection conn=(Connection) koneksi.koneksi();
    java.sql.Statement stm = conn.createStatement();
    java.sql.ResultSet res = stm.executeQuery(sql);
     String aidi;
    if(res.next()){
       
        String no=res.getString("id_buku").substring(1);
      String id = ""+(Integer.parseInt(no)+1);
      String nol=null;
      if(id.length()==1){
          nol="000";
      } 
      else if(id.length()==2){
          nol="00";
      }
       else if(id.length()==3){
          nol="0";
      }
       else if(id.length()==4){
          nol="";
      }
      aidi = "B"+nol+id; 
    }
    else{
       aidi = "B0001"; 
    }
    try {
            String query = "INSERT INTO buku VALUES "
                    + "('" + aidi+"','"+txtjudul.getText() + "','" + txtpengarang.getText() 
                    + "','" + txtpenerbit.getText() + "','" + cmbkat.getSelectedItem()  
                    + "','" + txtdesc.getText()+ "','" + txtstok.getText() + "')";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement mts = kon.prepareStatement(query);
            mts.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
   }  
catch(Exception b){
    JOptionPane.showMessageDialog(null,b.getMessage());
}
     new databuku().setVisible(true);
dispose();
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtjudulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtjudulMouseClicked
txtjudul.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudulMouseClicked

    private void txtpengarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpengarangMouseClicked
      txtpengarang.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpengarangMouseClicked

    private void txtpenerbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpenerbitMouseClicked
txtpenerbit.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenerbitMouseClicked

    private void txtdescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescMouseClicked
txtdesc.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescMouseClicked

    private void txtstokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtstokMouseClicked
txtstok.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new databuku().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtstokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyTyped
char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokKeyTyped

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbkat;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtpenerbit;
    private javax.swing.JTextField txtpengarang;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
