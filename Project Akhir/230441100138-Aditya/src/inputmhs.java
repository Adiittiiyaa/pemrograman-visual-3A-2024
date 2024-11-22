/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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
public class inputmhs extends javax.swing.JFrame {

    /**
     * Creates new form inputmhs
     */
    public inputmhs(){
        initComponents();
        setcombo();
        
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("library.jpg"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Input Data Mahasiswa");
    }
private void setcombo(){
     cmbprodi.setEnabled(false);
    cmbfakultas.addItem("Teknik");
    cmbfakultas.addItem("FISIB");
    cmbfakultas.addItem("Ekonomi");
    cmbfakultas.addItem("Hukum");
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtnpm = new javax.swing.JTextField();
        cmbfakultas = new javax.swing.JComboBox<>();
        cmbprodi = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        lblid.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        txtnpm.setText("NPM");
        txtnpm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnpmMouseClicked(evt);
            }
        });
        txtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnpmActionPerformed(evt);
            }
        });
        txtnpm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnpmKeyReleased(evt);
            }
        });

        cmbfakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas" }));
        cmbfakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfakultasActionPerformed(evt);
            }
        });

        cmbprodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prodi" }));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        txtnama.setText("Nama");
        txtnama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnamaMouseClicked(evt);
            }
        });
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setText("FORM INPUT MAHASISWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbfakultas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbprodi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jButton3))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnpmActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpmActionPerformed

    private void txtnpmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnpmMouseClicked
txtnpm.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpmMouseClicked

    private void cmbfakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfakultasActionPerformed

     if(cmbfakultas.getSelectedItem().equals("Fakultas")){
        
         cmbprodi.setSelectedItem("Prodi");
    cmbprodi.setEnabled(false);
     }
        else if(cmbfakultas.getSelectedItem().equals("Teknik")){
        cmbprodi.setEnabled(true);
        cmbprodi.removeAllItems();
        cmbprodi.addItem("Sistem Informasi");
        cmbprodi.addItem("Informatika");
        cmbprodi.addItem("Industri");
        cmbprodi.addItem("Sipil");
    }
    else if(cmbfakultas.getSelectedItem().equals("FISIB")){
        cmbprodi.setEnabled(true);
        cmbprodi.removeAllItems();
        cmbprodi.addItem("Sastra Inggris");
        cmbprodi.addItem("Sastra Mesin");
    }
    else if(cmbfakultas.getSelectedItem().equals("Ekonomi")){
        cmbprodi.setEnabled(true);
        cmbprodi.removeAllItems();
        cmbprodi.addItem("Akutansi");
        cmbprodi.addItem("Management");
    }
    else if(cmbfakultas.getSelectedItem().equals("Hukum")){
        cmbprodi.setEnabled(true);
        cmbprodi.removeAllItems();
        cmbprodi.addItem("Ilmu Hukum");
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbfakultasActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String npm = txtnpm.getText();
    String nama = txtnama.getText();
    if(npm.equals("")||nama.equals("")){
            JOptionPane.showMessageDialog(null,"Isi Semua Form Yang Tersedia ");
        
    }
    else if(cmbfakultas.getSelectedItem().equals("Fakultas")||cmbprodi.getSelectedItem().equals("Prodi")){
            JOptionPane.showMessageDialog(null,"Pilih Fakultas atau prodi ");
        }
        else{
        try {
            String sql1 = "INSERT INTO mahasiswa"
                    + " VALUES ('"+txtnpm.getText()+"','" + txtnama.getText() + "','" + cmbfakultas.getSelectedItem()
                    + "','" + cmbprodi.getSelectedItem() + "')";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pdt = kon.prepareStatement(sql1);
            pdt.execute();
           JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        new datamahasiswa().setVisible(true);
        dispose();
        } catch (Exception b) {
            JOptionPane.showMessageDialog(this, b.getMessage());
        }   
  
    }
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnamaMouseClicked
txtnama.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaMouseClicked

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnpmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnpmKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpmKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new datamahasiswa().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbfakultas;
    private javax.swing.JComboBox<String> cmbprodi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnpm;
    // End of variables declaration//GEN-END:variables
}
