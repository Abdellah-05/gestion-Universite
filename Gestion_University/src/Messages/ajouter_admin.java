/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messages;

import Main.JDBC;
import static Main.JDBC.conn;
import static Main.JDBC.rs;
import static Main.JDBC.stmt;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author walid
 */
public class ajouter_admin extends javax.swing.JFrame {

    /**
     * Creates new form ajouter_admin
     */
    public ajouter_admin() {
        initComponents();
        setLocation(614, 250);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tnom_admin = new javax.swing.JTextField();
        tprenom_admin = new javax.swing.JTextField();
        tlogin_admin = new javax.swing.JTextField();
        tpassword_admin = new javax.swing.JTextField();
        temail_admin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AJOUTER ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 240, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("NOM_ADMIN               :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 180, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("PRENOM_ADMIN        :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("LOGIN_ADMIN            :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("PASSWORD_ADMIN    :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 180, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("EMAIL_ADMIN            :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 180, 30));
        getContentPane().add(tnom_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 360, 30));

        tprenom_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprenom_adminActionPerformed(evt);
            }
        });
        getContentPane().add(tprenom_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 360, 30));
        getContentPane().add(tlogin_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 360, 30));
        getContentPane().add(tpassword_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 360, 30));

        temail_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temail_adminActionPerformed(evt);
            }
        });
        getContentPane().add(temail_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 360, 30));

        jButton1.setBackground(new java.awt.Color(189, 255, 207));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 160, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 110, 40));

        bk.setForeground(new java.awt.Color(0, 102, 102));
        bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/admin.png"))); // NOI18N
        getContentPane().add(bk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tprenom_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprenom_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprenom_adminActionPerformed

    private void temail_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temail_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temail_adminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom_admin=tnom_admin.getText().toUpperCase();
        String prenom_admin=tprenom_admin.getText();
        String login_admin=tlogin_admin.getText();
        String password_admin=tpassword_admin.getText();
        String email_admin=temail_admin.getText();
        int id = -10000;
        
        JDBC db=new JDBC();
        db.connection();
        
        try{
            String query="select * from administrateur ";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                id=rs.getRow()+1;
            }
            if(nom_admin.length()!=0 && prenom_admin.length()!=0 && login_admin.length()!=0 && password_admin.length()!=0 && email_admin.length()!=0){
                String q="INSERT INTO administrateur VALUES ("+id+",'"+nom_admin+"',initcap('"+prenom_admin+"'),'"+login_admin+"','"+password_admin+"','"+email_admin+"')";
                stmt.executeUpdate(q);
                JOptionPane dialogue = new JOptionPane("Bien enregistré", JOptionPane.INFORMATION_MESSAGE);
                JDialog boîte = dialogue.createDialog("Message");
                boîte.setVisible(true);
                tnom_admin.setText("");
                tprenom_admin.setText("");
                tlogin_admin.setText("");
                temail_admin.setText("");
                tpassword_admin.setText("");
            }
        }catch(Exception exp){
            System.out.println("ErreurT"+exp);
        }
        finally{
            try{
                rs.close();
                stmt.close();
                conn.close();
            }
            catch(Exception e){
                System.out.println("Erreur"+e);
            }
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int response= JOptionPane.showConfirmDialog(null, "Do you really want to Quit?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response== JOptionPane.NO_OPTION) {
            new ajouter_admin().setVisible(false);
        } else if (response== JOptionPane.YES_OPTION) {
            this.setVisible(false);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ajouter_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouter_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouter_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouter_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouter_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField temail_admin;
    private javax.swing.JTextField tlogin_admin;
    private javax.swing.JTextField tnom_admin;
    private javax.swing.JTextField tpassword_admin;
    private javax.swing.JTextField tprenom_admin;
    // End of variables declaration//GEN-END:variables
}