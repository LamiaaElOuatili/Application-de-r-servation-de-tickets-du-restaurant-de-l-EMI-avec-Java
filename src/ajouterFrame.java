
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class ajouterFrame extends javax.swing.JFrame {

    /**
     * Creates new form ajouter
     */
    public ajouterFrame() {
        initComponents();
        setSize(770, 522);
        setLocation(200,100);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomField = new javax.swing.JTextField();
        prenomField = new javax.swing.JTextField();
        prenomLabel = new javax.swing.JLabel();
        mleLabel = new javax.swing.JLabel();
        soldeField = new javax.swing.JTextField();
        mdpField = new javax.swing.JTextField();
        mleField = new javax.swing.JTextField();
        soldeLabel = new javax.swing.JLabel();
        mdpLabel = new javax.swing.JLabel();
        nomLabel = new javax.swing.JLabel();
        ajouter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        soldeDashboard = new javax.swing.JToggleButton();
        ajouterDashboard = new javax.swing.JToggleButton();
        supprimerDashboard = new javax.swing.JToggleButton();
        listeDashboard = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resum5 réservations");
        getContentPane().setLayout(null);

        nomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomField);
        nomField.setBounds(410, 130, 180, 30);
        getContentPane().add(prenomField);
        prenomField.setBounds(410, 170, 180, 30);

        prenomLabel.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        prenomLabel.setText(" PRENOM          :");
        getContentPane().add(prenomLabel);
        prenomLabel.setBounds(290, 180, 100, 15);

        mleLabel.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        mleLabel.setText("MATRICULE       :");
        getContentPane().add(mleLabel);
        mleLabel.setBounds(290, 100, 100, 15);

        soldeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(soldeField);
        soldeField.setBounds(410, 220, 180, 30);

        mdpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mdpField);
        mdpField.setBounds(410, 270, 180, 30);

        mleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mleFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mleField);
        mleField.setBounds(410, 90, 180, 30);

        soldeLabel.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        soldeLabel.setText("SOLDE               :");
        getContentPane().add(soldeLabel);
        soldeLabel.setBounds(290, 230, 100, 15);

        mdpLabel.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        mdpLabel.setText("MOT DE PASSE :");
        getContentPane().add(mdpLabel);
        mdpLabel.setBounds(290, 270, 100, 20);

        nomLabel.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        nomLabel.setText("NOM                  :");
        getContentPane().add(nomLabel);
        nomLabel.setBounds(290, 140, 100, 15);

        ajouter.setBackground(new java.awt.Color(102, 102, 255));
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(ajouter);
        ajouter.setBounds(620, 140, 90, 23);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, 110));

        soldeDashboard.setText("Modifier solde");
        soldeDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldeDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(soldeDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        ajouterDashboard.setText("Ajouter eleve");
        ajouterDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(ajouterDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        supprimerDashboard.setText("Supprimer");
        supprimerDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(supprimerDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        listeDashboard.setText("Liste");
        listeDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(listeDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Retour au menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 470);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Inserez les informations de l'eleve:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 40, 390, 29);

        exit.setBackground(new java.awt.Color(153, 153, 255));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(620, 180, 90, 23);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(620, 220, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/functionsAdmin1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 770, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomFieldActionPerformed

    private void soldeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soldeFieldActionPerformed

    private void mdpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpFieldActionPerformed

    private void mleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mleFieldActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL","root","190219");
            String sql =("insert into informations (Mle,Nom,Prenom,Solde,Mdp)value(?,?,?,?,?)");
            PreparedStatement pst =con.prepareStatement(sql);
            
            pst.setString(1,mleField.getText());
            pst.setString(2,nomField.getText());
            pst.setString(3,prenomField.getText());
            pst.setString(4,soldeField.getText());
            pst.setString(5,mdpField.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "étudiant ajouté !");
            upDateDB();
        } catch (SQLException ex) {
            Logger.getLogger(ajouterFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ajouterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ajouterActionPerformed

private JFrame frame;    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"vous voulez quitter?","MySQL connector",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
        
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        mleField.setText("");
        nomField.setText("");
        prenomField.setText("");
        soldeField.setText("");
        mdpField.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void ajouterDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterDashboardActionPerformed
        // TODO add your handling code here:
        ajouterFrame f4 = new ajouterFrame();
        f4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ajouterDashboardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        espaceAdmin f = new espaceAdmin();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void soldeDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldeDashboardActionPerformed
        // TODO add your handling code here:
        DeleteFrame f1 = new DeleteFrame();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_soldeDashboardActionPerformed

    private void supprimerDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerDashboardActionPerformed
        // TODO add your handling code here:
        DeleteFrame f2 = new DeleteFrame();
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_supprimerDashboardActionPerformed

    private void listeDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeDashboardActionPerformed
        // TODO add your handling code here:
        liste f3 = new liste();
        f3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeDashboardActionPerformed

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
            java.util.logging.Logger.getLogger(ajouterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JToggleButton ajouterDashboard;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton listeDashboard;
    private javax.swing.JTextField mdpField;
    private javax.swing.JLabel mdpLabel;
    private javax.swing.JTextField mleField;
    private javax.swing.JLabel mleLabel;
    private javax.swing.JTextField nomField;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JTextField prenomField;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JButton reset;
    private javax.swing.JToggleButton soldeDashboard;
    private javax.swing.JTextField soldeField;
    private javax.swing.JLabel soldeLabel;
    private javax.swing.JToggleButton supprimerDashboard;
    // End of variables declaration//GEN-END:variables

    
    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    
        public void upDateDB() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "190219");
        String sql = "select * from informations";
        PreparedStatement pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int n = rsmd.getColumnCount();
        DefaultTableModel dtm = tableInfo.getModel();
        dtm.setRowCount(0);
        while (rs.next()) {
        Vector columnData = new Vector();
        columnData.add(rs.getString("Mle"));
        columnData.add(rs.getString("Nom"));
        columnData.add(rs.getString("Prenom"));
        columnData.add(rs.getString("Solde"));
        columnData.add(rs.getString("Mdp"));
        dtm.addRow(columnData);
        }
        pst.close();
        con.close();
        rs.close();
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
        }
        }}
        





