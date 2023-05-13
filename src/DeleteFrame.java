
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.Statement;






public class DeleteFrame extends javax.swing.JFrame {
    
    String url = "jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String username = "root";
    String password = "190219";
    

private void RechercheD() {
    // Replace these parameters with your own database connection details
//    String url = "jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL";
//    String username = "root";
//    String password = "190219";
String Mle = mleRecherche.getText();
//    // Get the id to search for from the text field
//    String Mle = mleRecherche.getText();

    try (Connection conn = DriverManager.getConnection(url, username, password)) {
        // Create a statement and execute a SELECT query to retrieve the data for the specified id
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM informations WHERE Mle = " + Mle);

        // If the id was found, retrieve the data from the ResultSet and display it in the text fields
        if (rs.next()) {
            NomFieldRecher.setText(rs.getString("Nom"));
            prenomFieldRecher.setText(rs.getString("Prenom"));
            soldeFieldRecher.setText(rs.getString("Solde"));
            mdpFieldRecher.setText(rs.getString("Mdp"));
        } else {
            // If the id was not found, display an error message
            JOptionPane.showMessageDialog(null, "No data found for Mle: " + Mle, "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        // If there was an error connecting to the database, display an error message
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

}



     private void DeleteEleve() {
                
    
String Mle = mleRecherche.getText();
    
                try (Connection conn = DriverManager.getConnection(url, username, password)) {
                    // Create a statement and execute a DELETE query to delete the data for the specified id
                    Statement stmt = conn.createStatement();
                    int rowsDeleted = stmt.executeUpdate("DELETE FROM informations WHERE Mle = " + Mle);

                    if (rowsDeleted > 0) {
                        // If the delete was successful, display a confirmation message
                        JOptionPane.showMessageDialog(null, "Data deleted for Mle: " + Mle, "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // If no rows were deleted, display an error message
                        JOptionPane.showMessageDialog(null, "No data found for Mle: " + Mle, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    // If there was an error connecting to the database, display an error message
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        
private void updateSolde() {
    
    String Mle = mleRecherche.getText();
    
    try (Connection conn = DriverManager.getConnection(url, username, password)) {
        
        double soldeToAdd;
        soldeToAdd = Double.parseDouble(soldeAddField.getText());
        // Create a statement and execute an UPDATE query to add the new solde value to the existing value in the "solde" column
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("UPDATE informations  WHERE Mle = ? SET solde = solde + " + soldeToAdd );
    } catch (SQLException e) {
        // If there was an error connecting to the database or executing the query, display an error message
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


   
    public DeleteFrame() {
        initComponents();
        
        setSize(770, 522);
        setLocation(200,100);
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listeDashboard = new javax.swing.JToggleButton();
        supprimerDashboard = new javax.swing.JToggleButton();
        soldeDashboard = new javax.swing.JToggleButton();
        ajouterDashboard = new javax.swing.JToggleButton();
        recherchePanel = new javax.swing.JPanel();
        rechercheLabel = new javax.swing.JLabel();
        mleRecherche = new javax.swing.JTextField();
        trouver = new javax.swing.JButton();
        NomFieldRecher = new javax.swing.JTextField();
        prenomFieldRecher = new javax.swing.JTextField();
        soldeFieldRecher = new javax.swing.JTextField();
        mdpFieldRecher = new javax.swing.JTextField();
        informationsPanel = new javax.swing.JPanel();
        prenomLabelRecher = new javax.swing.JLabel();
        soldeLabelRecher = new javax.swing.JLabel();
        nomLabelRecher = new javax.swing.JLabel();
        mdpLabelRecher = new javax.swing.JLabel();
        suppbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        soldeAddField = new javax.swing.JTextField();
        ajouterSoldbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resum5 réservations");
        getContentPane().setLayout(null);

        listeDashboard.setBackground(new java.awt.Color(153, 153, 255));
        listeDashboard.setText("Liste");
        listeDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeDashboardActionPerformed(evt);
            }
        });
        getContentPane().add(listeDashboard);
        listeDashboard.setBounds(10, 260, 150, 50);

        supprimerDashboard.setBackground(new java.awt.Color(153, 153, 255));
        supprimerDashboard.setText("Supprimer");
        supprimerDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerDashboardActionPerformed(evt);
            }
        });
        getContentPane().add(supprimerDashboard);
        supprimerDashboard.setBounds(10, 320, 150, 50);

        soldeDashboard.setBackground(new java.awt.Color(153, 153, 255));
        soldeDashboard.setText("Modifier solde");
        soldeDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldeDashboardActionPerformed(evt);
            }
        });
        getContentPane().add(soldeDashboard);
        soldeDashboard.setBounds(10, 380, 150, 50);

        ajouterDashboard.setBackground(new java.awt.Color(153, 153, 255));
        ajouterDashboard.setText("Ajouter eleve");
        ajouterDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterDashboardActionPerformed(evt);
            }
        });
        getContentPane().add(ajouterDashboard);
        ajouterDashboard.setBounds(10, 200, 150, 50);

        recherchePanel.setBackground(new java.awt.Color(204, 204, 255));
        recherchePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recherchePanel.setLayout(null);

        rechercheLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rechercheLabel.setText("Matricule de l'élève recheché :");
        recherchePanel.add(rechercheLabel);
        rechercheLabel.setBounds(10, 30, 230, 30);

        mleRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mleRechercheActionPerformed(evt);
            }
        });
        recherchePanel.add(mleRecherche);
        mleRecherche.setBounds(240, 30, 160, 22);

        trouver.setBackground(new java.awt.Color(153, 153, 255));
        trouver.setText("Trouver");
        trouver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trouverActionPerformed(evt);
            }
        });
        recherchePanel.add(trouver);
        trouver.setBounds(420, 30, 72, 23);

        getContentPane().add(recherchePanel);
        recherchePanel.setBounds(160, 50, 530, 100);

        NomFieldRecher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomFieldRecherActionPerformed(evt);
            }
        });
        getContentPane().add(NomFieldRecher);
        NomFieldRecher.setBounds(390, 220, 160, 22);
        getContentPane().add(prenomFieldRecher);
        prenomFieldRecher.setBounds(390, 260, 160, 22);
        getContentPane().add(soldeFieldRecher);
        soldeFieldRecher.setBounds(390, 300, 160, 22);
        getContentPane().add(mdpFieldRecher);
        mdpFieldRecher.setBounds(390, 340, 160, 22);

        informationsPanel.setBackground(new java.awt.Color(204, 204, 255));
        informationsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informationsPanel.setLayout(null);

        prenomLabelRecher.setText("Prenom");
        informationsPanel.add(prenomLabelRecher);
        prenomLabelRecher.setBounds(40, 70, 80, 16);

        soldeLabelRecher.setText("Solde");
        informationsPanel.add(soldeLabelRecher);
        soldeLabelRecher.setBounds(40, 110, 50, 16);

        nomLabelRecher.setText("Nom");
        informationsPanel.add(nomLabelRecher);
        nomLabelRecher.setBounds(40, 30, 70, 30);

        mdpLabelRecher.setText("Mot de passe");
        informationsPanel.add(mdpLabelRecher);
        mdpLabelRecher.setBounds(30, 140, 100, 16);

        getContentPane().add(informationsPanel);
        informationsPanel.setBounds(180, 200, 420, 230);

        suppbtn.setBackground(new java.awt.Color(153, 153, 255));
        suppbtn.setText("supprimer");
        suppbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppbtnActionPerformed(evt);
            }
        });
        getContentPane().add(suppbtn);
        suppbtn.setBounds(610, 250, 120, 23);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Retour au menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 440, 120, 23);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ajouterSoldbtn.setBackground(new java.awt.Color(153, 153, 255));
        ajouterSoldbtn.setText("ajouter sld");
        ajouterSoldbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterSoldbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soldeAddField)
                    .addComponent(ajouterSoldbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(soldeAddField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajouterSoldbtn)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(620, 300, 120, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/functionsAdmin1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 751, 472);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterDashboardActionPerformed
        // TODO add your handling code here:
        ajouterFrame f1 = new ajouterFrame();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ajouterDashboardActionPerformed

    private void mleRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mleRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mleRechercheActionPerformed

    private void trouverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trouverActionPerformed
        RechercheD()  ;      
    }//GEN-LAST:event_trouverActionPerformed

    private void NomFieldRecherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomFieldRecherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomFieldRecherActionPerformed

    private void suppbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppbtnActionPerformed
        DeleteEleve()        ;
    }//GEN-LAST:event_suppbtnActionPerformed

    private void listeDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeDashboardActionPerformed
        // TODO add your handling code here:
        liste f2 = new liste();
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeDashboardActionPerformed

    private void supprimerDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerDashboardActionPerformed
        // TODO add your handling code here:
        DeleteFrame f3 = new DeleteFrame();
        f3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_supprimerDashboardActionPerformed

    private void soldeDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldeDashboardActionPerformed
        // TODO add your handling code here:
        DeleteFrame f4 = new DeleteFrame();
        f4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_soldeDashboardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        espaceAdmin f5 = new espaceAdmin();
        f5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ajouterSoldbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterSoldbtnActionPerformed
        updateSolde();
    }//GEN-LAST:event_ajouterSoldbtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomFieldRecher;
    private javax.swing.JToggleButton ajouterDashboard;
    private javax.swing.JButton ajouterSoldbtn;
    private javax.swing.JPanel informationsPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton listeDashboard;
    private javax.swing.JTextField mdpFieldRecher;
    private javax.swing.JLabel mdpLabelRecher;
    private javax.swing.JTextField mleRecherche;
    private javax.swing.JLabel nomLabelRecher;
    private javax.swing.JTextField prenomFieldRecher;
    private javax.swing.JLabel prenomLabelRecher;
    private javax.swing.JLabel rechercheLabel;
    private javax.swing.JPanel recherchePanel;
    private javax.swing.JTextField soldeAddField;
    private javax.swing.JToggleButton soldeDashboard;
    private javax.swing.JTextField soldeFieldRecher;
    private javax.swing.JLabel soldeLabelRecher;
    private javax.swing.JButton suppbtn;
    private javax.swing.JToggleButton supprimerDashboard;
    private javax.swing.JButton trouver;
    // End of variables declaration//GEN-END:variables
}
