package WordCountApplication;

/**
 *
 * @author NM Jakaria
 */
public class WordCountApplication extends javax.swing.JFrame {

    /**
     * Creates new form WordCountApplication
     */
    public WordCountApplication() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        jbtnCount = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextResult = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Count Application with Java");
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(960, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Word Count Application");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 730, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 60));

        jText.setColumns(20);
        jText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jText.setRows(5);
        jScrollPane1.setViewportView(jText);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 880, 260));

        jbtnCount.setBackground(new java.awt.Color(0, 153, 0));
        jbtnCount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnCount.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCount.setText("Count");
        jbtnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCountActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 130, 40));

        jbtnClear.setBackground(new java.awt.Color(204, 0, 51));
        jbtnClear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(255, 255, 255));
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 130, 40));

        jbtnExit.setBackground(new java.awt.Color(255, 0, 0));
        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 130, 40));

        jScrollPane2.setBorder(null);
        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jTextResult.setBackground(new java.awt.Color(0, 51, 51));
        jTextResult.setColumns(20);
        jTextResult.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextResult.setForeground(new java.awt.Color(255, 255, 255));
        jTextResult.setRows(3);
        jTextResult.setTabSize(5);
        jTextResult.setBorder(null);
        jTextResult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextResult);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 790, 90));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Designed By Naimullah Md Jakaria and Mohammad Faisal");
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 540, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 960, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 620));

        setSize(new java.awt.Dimension(990, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCountActionPerformed
        String str = jText.getText();
        String str1[] = str.split("\\s");
        int l = str.length();
        int len = str1.length;
        jTextResult.setText("Total Words:\t\t"+len+"\n\nTotal Letters:\t\t"+l);
    }//GEN-LAST:event_jbtnCountActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jText.setText("");
        jTextResult.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(WordCountApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordCountApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordCountApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordCountApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordCountApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jText;
    private javax.swing.JTextArea jTextResult;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCount;
    private javax.swing.JButton jbtnExit;
    // End of variables declaration//GEN-END:variables
}
