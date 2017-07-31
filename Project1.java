package project1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project1 extends javax.swing.JFrame {

    private static void setDefaultCloseOpeartion(int EXIT_ON_CLOSE) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Project1.setDefaultCloseOpeartion(JFrame.EXIT_ON_CLOSE);
    }

    public Project1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        tips = new javax.swing.JButton();
        about = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jlabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Calculation = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel1.setLayout(null);

        tips.setBackground(new java.awt.Color(255, 255, 255));
        tips.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tips.setText("Tips");
        tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsActionPerformed(evt);
            }
        });
        jpanel1.add(tips);
        tips.setBounds(590, 100, 90, 23);

        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jpanel1.add(about);
        about.setBounds(590, 130, 90, 23);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jpanel1.add(exit);
        exit.setBounds(590, 160, 90, 23);

        jlabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(0, 51, 153));
        jlabel2.setText("Scientific   Extended    Calculator");
        jpanel1.add(jlabel2);
        jlabel2.setBounds(120, 20, 400, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jpanel1.add(jLabel1);
        jLabel1.setBounds(400, 10, 110, 0);

        Calculation.setBackground(new java.awt.Color(255, 255, 255));
        Calculation.setText("Calculation");
        Calculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculationActionPerformed(evt);
            }
        });
        jpanel1.add(Calculation);
        Calculation.setBounds(590, 70, 90, 23);

        jlabel1.setBackground(new java.awt.Color(0, 0, 0));
        jlabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/pic.jpg"))); // NOI18N
        jlabel1.setText("jLabel2");
        jpanel1.add(jlabel1);
        jlabel1.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsActionPerformed
        
        this.setVisible(false);
        Project3 ob = new Project3();
        ob.setVisible(true);
    }//GEN-LAST:event_tipsActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        Project4 ob = new Project4();
        ob.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        System.exit(0);
        
    }//GEN-LAST:event_exitActionPerformed

    private void CalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculationActionPerformed
        
        this.setVisible(false);
        Project2 ob = new Project2();
        ob.setVisible(true);
    }//GEN-LAST:event_CalculationActionPerformed

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
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculation;
    private javax.swing.JButton about;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton tips;
    // End of variables declaration//GEN-END:variables
}




   /* 
    private void changeScreen(JFrame mainFrame, JPanel panel){
     mainFrame.getContentPane().removeAll();
     mainFrame.repaint();
     mainFrame.revalidate();
     System.out.println("Panel: " + panel);
     mainFrame.getContentPane().add(panel);
     mainFrame.repaint();
     mainFrame.revalidate();
        
    }
    private void changeScreen(JPanel container, JPanel inner){
     container.removeAll();
     container.repaint();
     container.revalidate();
     container.add(inner);
     container.repaint();
     container.revalidate();
        
    }
*/

// 5 * (6 + 2) - 12 / 4