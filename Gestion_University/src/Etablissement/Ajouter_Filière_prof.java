/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etablissement;

import Main.JDBC;
import static Main.JDBC.conn;
import static Main.JDBC.rs;
import static Main.JDBC.stmt;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walid
 */
public class Ajouter_Filière_prof extends javax.swing.JFrame {
    public static int ideta;
    /**
     * Creates new form Ajouter_Filière_prof
     */
    public Ajouter_Filière_prof() {
        initComponents();
        setSize(800,500);
        setLocation(545, 260);
        this.setDefaultCloseOperation(2);
        try{
            JDBC DB = new JDBC();
            DB.connection();
            String sq = "SELECT ABRE_ESTA,NOM_ESTA FROM establishment";
            rs = stmt.executeQuery(sq);

            while(rs.next()){
                String abre = rs.getString("ABRE_ESTA");
                String nom = rs.getString("NOM_ESTA");
                
                String tabData[] = {abre, nom};
                DefaultTableModel tabModel = (DefaultTableModel)tableeta.getModel();
                tabModel.addRow(tabData);
            
            }
            stmt.close();
            rs.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("erreur "+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        abr = new javax.swing.JTextField();
        nom_ff = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nom_prof = new javax.swing.JTextField();
        prenom_prof = new javax.swing.JTextField();
        email_prof = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableeta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ecrireeta = new javax.swing.JTextField();
        ecrireeta1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("EMAIL_PROF : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 350, 120, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("NOM_FILIERE : ");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 30));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 160, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 102));
        jLabel10.setText("Ajouter Professeur à l'établissement : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 220, 270, 30);

        abr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrActionPerformed(evt);
            }
        });
        getContentPane().add(abr);
        abr.setBounds(440, 120, 170, 30);
        getContentPane().add(nom_ff);
        nom_ff.setBounds(440, 160, 170, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 102));
        jLabel13.setText("Ajouter Filière à l'établissement : ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(340, 80, 240, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 102));
        jLabel14.setText("ABRE_FILIERE : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(340, 120, 120, 30);

        jLabel15.setForeground(new java.awt.Color(255, 255, 102));
        jLabel15.setText("NOM_PROF : ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(340, 270, 120, 30);

        jLabel16.setForeground(new java.awt.Color(255, 255, 102));
        jLabel16.setText("PRENOM_PROF : ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(340, 310, 120, 30);
        getContentPane().add(nom_prof);
        nom_prof.setBounds(440, 270, 170, 30);
        getContentPane().add(prenom_prof);
        prenom_prof.setBounds(440, 310, 170, 30);
        getContentPane().add(email_prof);
        email_prof.setBounds(440, 350, 170, 30);

        jButton1.setBackground(new java.awt.Color(189, 255, 207));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Ajouter professeur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 290, 160, 50);

        jButton2.setBackground(new java.awt.Color(189, 255, 207));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Ajouter la filière");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 130, 160, 50);

        tableeta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Abréviation", "Nom Etablissement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableetaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableeta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 310, 350);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter Filière et Professeur");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 0, 420, 40);

        ecrireeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ecrireeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecrireetaActionPerformed(evt);
            }
        });
        getContentPane().add(ecrireeta);
        ecrireeta.setBounds(580, 80, 150, 30);

        ecrireeta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ecrireeta1);
        ecrireeta1.setBounds(600, 220, 150, 30);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(670, 410, 110, 40);

        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/background.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrActionPerformed

    private void tableetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableetaMouseClicked
        ideta = tableeta.getSelectedRow();
        ideta=ideta+1;
        int r=tableeta.getSelectedRow();
        ecrireeta.setText(tableeta.getValueAt(r,0).toString());
        ecrireeta1.setText(tableeta.getValueAt(r,0).toString());
    }//GEN-LAST:event_tableetaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String abree=abr.getText();
        String nomm=nom_ff.getText();
        JDBC db=new JDBC();
        db.connection();
        int idf=-156666;
        try {
            String qq="SELECT * FROM filiere";
            rs=stmt.executeQuery(qq);
            while(rs.next()){
                idf=rs.getRow()+1; 
            }
                       
            if(abree.length()!=0 && nomm.length()!=0 ){
                String q="INSERT INTO filiere VALUES ("+idf+","+ideta+",'"+abree+"','"+nomm+"')";
                stmt.executeUpdate(q);
                JOptionPane dialogue = new JOptionPane("La filière est bien enregistré", JOptionPane.INFORMATION_MESSAGE);
                JDialog boîte = dialogue.createDialog("Message");
                boîte.setVisible(true);
                abr.setText("");
                nom_ff.setText("");
            }
            
                rs.close();
                stmt.close();
                conn.close();
            }
            catch (SQLException ex) {
                System.out.println("erreur"+ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ecrireetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecrireetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecrireetaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String n=nom_prof.getText();
        String p=prenom_prof.getText();
        String e=email_prof.getText();

        JDBC db=new JDBC();
        db.connection();
        int idp=-156666;
        try {
            String qq="SELECT * FROM professeur";
            rs=stmt.executeQuery(qq);
            while(rs.next()){
                idp=rs.getRow()+1; 
            }
                       
            if(n.length()!=0 && p.length()!=0 && e.length()!=0 ){
                String q="INSERT INTO professeur VALUES ("+idp+","+ideta+",'"+n+"','"+p+"','"+e+"')";
                stmt.executeUpdate(q);
                JOptionPane dialogue = new JOptionPane("Le Professeur est bien enregistré", JOptionPane.INFORMATION_MESSAGE);
                JDialog boîte = dialogue.createDialog("Message");
                boîte.setVisible(true);
                nom_prof.setText("");
                prenom_prof.setText("");
                email_prof.setText("");
                }
            
                rs.close();
                stmt.close();
                conn.close();
            }
            catch (SQLException ex) {
                System.out.println("erreur"+ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int response= JOptionPane.showConfirmDialog(null, "Do you really want to Quit?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response== JOptionPane.NO_OPTION) {
            new Ajouter_Filière_prof().setVisible(false);
        } else if (response== JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Filière_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Filière_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Filière_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Filière_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajouter_Filière_prof().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abr;
    private javax.swing.JTextField ecrireeta;
    private javax.swing.JTextField ecrireeta1;
    private javax.swing.JTextField email_prof;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom_ff;
    private javax.swing.JTextField nom_prof;
    private javax.swing.JTextField prenom_prof;
    private javax.swing.JTable tableeta;
    // End of variables declaration//GEN-END:variables
}
