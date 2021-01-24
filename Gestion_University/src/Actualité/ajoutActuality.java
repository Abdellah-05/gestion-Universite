/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualité;

import Main.JDBC;
import static Main.JDBC.rs;
import static Main.JDBC.stmt;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author AbdoU
 */
public class ajoutActuality extends javax.swing.JFrame {

    /**
     * Creates new form ajoutActuality
     */
    public ajoutActuality() {
        initComponents();
        setSize( 800, 500 );
        setLocation(545, 260);
        this.setDefaultCloseOperation(2);
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
        titreActuA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        heurDActuA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        imgActuA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dateFActuA = new com.toedter.calendar.JDateChooser();
        dateDActuA = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        descreptionActuA = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Actualité");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(titreActuA);
        titreActuA.setBounds(330, 60, 360, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Titre d'actualité      :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 60, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Date début              :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 100, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Date fin                   :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 140, 180, 30);
        getContentPane().add(heurDActuA);
        heurDActuA.setBounds(330, 180, 360, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 102));
        jLabel8.setText("Heur début              :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 180, 180, 30);
        getContentPane().add(lien);
        lien.setBounds(330, 220, 360, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Descreption             :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 300, 180, 30);
        getContentPane().add(imgActuA);
        imgActuA.setBounds(330, 260, 360, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 102));
        jLabel10.setText("Nome d'image        :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 260, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 102));
        jLabel11.setText("Lien d'actualité       :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 220, 180, 30);

        jButton2.setBackground(new java.awt.Color(189, 255, 207));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 410, 110, 40);

        dateFActuA.setDateFormatString("dd-MMM-yyyy");
        getContentPane().add(dateFActuA);
        dateFActuA.setBounds(330, 140, 360, 30);

        dateDActuA.setDateFormatString("dd-MMM-yyyy");
        getContentPane().add(dateDActuA);
        dateDActuA.setBounds(330, 100, 360, 30);

        descreptionActuA.setColumns(20);
        descreptionActuA.setLineWrap(true);
        descreptionActuA.setRows(5);
        jScrollPane1.setViewportView(descreptionActuA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 300, 360, 100);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(660, 410, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ajouter noveau Actualité");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 0, 380, 40);

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/actu.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String titre = titreActuA.getText();
        String dateDebut = ((JTextField)dateDActuA.getDateEditor().getUiComponent()).getText();
        String dateFin = ((JTextField)dateFActuA.getDateEditor().getUiComponent()).getText();
        String heurDebut = heurDActuA.getText();
        String Link = lien.getText();
        String imgActuality = imgActuA.getText()+".png";
        String descreptionActuality = descreptionActuA.getText();
        int id = 1;
        JDBC bd = new JDBC();
        bd.connection();

        try {
            String q = "select * from actuality";
            rs = stmt.executeQuery(q);
            while(rs.next()){
                id = rs.getRow()+1;
            }

            if(titre.length() != 0 && dateDebut.length() != 0 && dateFin.length() != 0 && heurDebut.length() != 0
                && Link.length() != 0 && descreptionActuality.length() != 0 && imgActuality.length() != 0){
                String query = "INSERT INTO actuality VALUES ("+id+", '"+titre+"', "
                + "'"+dateDebut+"', '"+dateFin+"', '"+heurDebut+"', '"+descreptionActuality+"', '"+Link+"', "
                + "'"+imgActuality+"')";
                stmt.executeUpdate(query);
                JOptionPane dialogue = new JOptionPane("Bien enregistré", JOptionPane.INFORMATION_MESSAGE);
                JDialog boîte = dialogue.createDialog("Message");
                boîte.setVisible(true);
                titreActuA.setText("");
                heurDActuA.setText("");
                lien.setText("");
                imgActuA.setText("");
                descreptionActuA.setText("");
            }

        } catch (SQLException e) {
            System.out.println("erreur"+e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int response= JOptionPane.showConfirmDialog(null, "Do you really want to Quit?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response== JOptionPane.NO_OPTION) {
            new ajoutActuality().setVisible(false);
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
            java.util.logging.Logger.getLogger(ajoutActuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajoutActuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajoutActuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajoutActuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajoutActuality().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateDActuA;
    private com.toedter.calendar.JDateChooser dateFActuA;
    private javax.swing.JTextArea descreptionActuA;
    private javax.swing.JTextField heurDActuA;
    private javax.swing.JTextField imgActuA;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lien;
    private javax.swing.JTextField titreActuA;
    // End of variables declaration//GEN-END:variables
}
