/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evenement;

import Main.JDBC;
import static Main.JDBC.*;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbdoU
 */
public class modif_Evenement extends javax.swing.JFrame {

    /**
     * Creates new form modif_Evenement
     */
    public modif_Evenement() {
        initComponents();
        setSize( 800, 500 );
        setLocation(545, 260);
        this.setDefaultCloseOperation(2);
        
        try{
            
            JDBC DB = new JDBC();
            DB.connection();
            
            String sqlE ;
            sqlE = "select * from event";
            rs = stmt.executeQuery(sqlE);
            
           
            while(rs.next()){
                String TITRE_EVE = rs.getString("TITRE_EVE");
                      
                String tabDataEv[] = {TITRE_EVE};
                DefaultTableModel tabModelEv = (DefaultTableModel)tableEvM.getModel();
                tabModelEv.addRow(tabDataEv);
              
            }
            
            stmt.close();
            rs.close();
            conn.close();
        }catch(SQLException e){
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

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEvM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titreEvM = new javax.swing.JTextField();
        dateD = new javax.swing.JTextField();
        dateF = new javax.swing.JTextField();
        heurD = new javax.swing.JTextField();
        heurF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        descrEvM = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/event.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tableEvM.setForeground(new java.awt.Color(102, 0, 51));
        tableEvM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                           Titre d'événement"
            }
        ));
        tableEvM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEvMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEvM);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 380, 120);

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Date fin       :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 290, 110, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Date début  :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 250, 110, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Heur fin       :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 370, 110, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Heur début  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 330, 110, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Titre            :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 210, 100, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Descreption d'évenement :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 60, 200, 30);
        getContentPane().add(titreEvM);
        titreEvM.setBounds(510, 210, 250, 30);
        getContentPane().add(dateD);
        dateD.setBounds(510, 250, 250, 30);
        getContentPane().add(dateF);
        dateF.setBounds(510, 290, 250, 30);
        getContentPane().add(heurD);
        heurD.setBounds(510, 330, 250, 30);
        getContentPane().add(heurF);
        heurF.setBounds(510, 370, 250, 30);

        jButton2.setBackground(new java.awt.Color(189, 255, 207));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Valider");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 410, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modifier un evenement");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 0, 440, 40);

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

        descrEvM.setColumns(20);
        descrEvM.setLineWrap(true);
        descrEvM.setRows(5);
        jScrollPane3.setViewportView(descrEvM);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(400, 90, 360, 110);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/event.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void getFromTable(){
        int r = tableEvM.getSelectedRow();
        r=r+1;
        JDBC db=new JDBC();
        db.connection();
        String sqlEv="SELECT * FROM event WHERE ID_EVE="+r;
        try {
            
            rs=stmt.executeQuery(sqlEv);
            while(rs.next()){
                
                String TITRE_EVE = rs.getString("TITRE_EVE");
                String DATE_J_D_EVE = rs.getString("DATE_J_D_EVE");
                String DATE_J_F_EVE = rs.getString("DATE_J_F_EVE");
                String HEURE_D_EVE = rs.getString("HEURE_D_EVE");
                String HEURE_F_EVE = rs.getString("HEURE_F_EVE");
                String TEXT_EVE = rs.getString("TEXT_EVE");
                
                String[] arrOfStr1M = DATE_J_D_EVE.split(" ", 2);
                DATE_J_D_EVE = arrOfStr1M[0];
                String[] arrOfStr2M = DATE_J_F_EVE.split(" ", 2);
                DATE_J_F_EVE = arrOfStr2M[0];
                
                descrEvM.setText(TEXT_EVE);
                titreEvM.setText(TITRE_EVE);
                dateD.setText(DATE_J_D_EVE);
                dateF.setText(DATE_J_F_EVE);
                heurD.setText(HEURE_D_EVE);
                heurF.setText(HEURE_F_EVE);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException ex) {
            System.out.println("erreur"+ex);
        }
    }
    private void tableEvMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEvMMouseClicked
        // TODO add your handling code here:
        getFromTable();
    }//GEN-LAST:event_tableEvMMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int ID = tableEvM.getSelectedRow();
        ID=ID+1;
        
        String EvDescreption = descrEvM.getText();
        String EvTitre = titreEvM.getText();
        String EvDateDeb = dateD.getText();
        String EvDateFin= dateF.getText();
        String EvHeurDib = heurD.getText();
        String EvHeurFin = heurF.getText();
        
        System.out.println(EvDateDeb);
        System.out.println(EvDateFin);
        
        JDBC db=new JDBC();
        db.connection();
        try{
                      
            if(EvDescreption.length()!=0 && EvTitre.length()!=0 && EvDateDeb.length()!=0 && 
                    EvDateFin.length()!=0 && EvHeurDib.length()!=0 && EvHeurFin.length()!=0){
                
                String sq = "update event set TITRE_EVE = '"+EvTitre+"', "
                        + "DATE_J_D_EVE = TO_DATE('"+EvDateDeb+"', 'YYYY-MM-DD'), "
                                + "DATE_J_F_EVE = TO_DATE('"+EvDateFin+"', 'YYYY-MM-DD'),"
                                        + "HEURE_D_EVE = '"+EvHeurDib+"', HEURE_F_EVE = '"+EvHeurFin+"', "
                                                + "TEXT_EVE = '"+EvDescreption+"' WHERE ID_EVE = "+ID;
                
                stmt.executeUpdate(sq);
                JOptionPane dialogue = new JOptionPane("Bien enregistré", JOptionPane.INFORMATION_MESSAGE);
                JDialog boîte = dialogue.createDialog("Message");
                boîte.setVisible(true);
                titreEvM.setText("");heurD.setText("");heurF.setText("");dateD.setText("");dateF.setText("");
                this.setVisible(false);
                new modif_Evenement().setVisible(true);
                
            }
        }catch(SQLException exp){
            System.out.println("ErreurT"+exp);
        }
        finally{
            try{
                rs.close();
                stmt.close();
                conn.close();
            }
            catch(SQLException e){
                System.out.println("Erreur"+e);
            }
             
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int response= JOptionPane.showConfirmDialog(null, "Do you really want to Quit?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response== JOptionPane.NO_OPTION) {
            new modif_Evenement().setVisible(false);
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
            java.util.logging.Logger.getLogger(modif_Evenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modif_Evenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modif_Evenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modif_Evenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modif_Evenement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateD;
    private javax.swing.JTextField dateF;
    private javax.swing.JTextArea descrEvM;
    private javax.swing.JTextField heurD;
    private javax.swing.JTextField heurF;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableEvM;
    private javax.swing.JTextField titreEvM;
    // End of variables declaration//GEN-END:variables
}
