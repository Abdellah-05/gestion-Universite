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
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walid
 */
public class affiche_etablissement extends javax.swing.JFrame {

    /**
     * Creates new form affiche_etablissement
     */
    public affiche_etablissement() {
        initComponents();
        setLocation(545, 260);
        setSize(800,500);
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
                DefaultTableModel tabModel = (DefaultTableModel)table.getModel();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        localimage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenue dans l'espace des établissements");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 40);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(40);
            table.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 310, 350);

        localimage.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(localimage);
        localimage.setBounds(330, 70, 460, 110);

        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        textarea.setLineWrap(true);
        textarea.setRows(5);
        textarea.setWrapStyleWord(true);
        textarea.setPreferredSize(new java.awt.Dimension(460, 140));
        jScrollPane2.setViewportView(textarea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 190, 460, 230);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(700, 430, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ucaav1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 800, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int r = table.getSelectedRow();
        r=r+1;
        JDBC db=new JDBC();
        db.connection();
        String sql="SELECT * FROM establishment e, filiere f,professeur p WHERE e.ID_ESTA=p.ID_ESTA AND e.ID_ESTA=f.ID_ESTA AND e.ID_ESTA="+r;
        try {
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                String IMG = rs.getString("PHOTO_ESTA");
                localimage.setIcon(new ImageIcon("C:\\Users\\walid\\OneDrive\\Bureau\\EST\\S3\\Modélisation et POO JAVA\\G.University\\Projet\\Gestion_University\\src\\media\\"+IMG));
                textarea.setText(rs.getString("ABRE_ESTA")+"\n"+rs.getString("NOM_ESTA")+"\n\nADRESSE:   "+rs.getString("ADRESSE_ESTA")
                +"\nTELE:   "+rs.getString("TELE_ESTA")+"\nEMAIL:   "+rs.getString("EMAIL_ESTA")+"\n\nLINK:   "+rs.getString("LINK_ESTA")+"\n\nFilière : "+rs.getString("ABRE_FILIERE")+"("+rs.getString("NOM_FILIERE")+")"
                +"\nProfesseur : "+rs.getString("NOM_PROF")+" "+rs.getString("PRENOM_PROF"));
                
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException ex) {
            System.out.println("erreur"+ex);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int response= JOptionPane.showConfirmDialog(null, "Do you really want to Quit?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response== JOptionPane.NO_OPTION) {
            new affiche_etablissement().setVisible(false);
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
            java.util.logging.Logger.getLogger(affiche_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(affiche_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(affiche_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(affiche_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new affiche_etablissement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel localimage;
    private javax.swing.JTable table;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
