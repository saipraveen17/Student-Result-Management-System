
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class StudentHomePage extends javax.swing.JFrame {

    // Creates new form StudentHomePage
    public StudentHomePage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RollNo = new javax.swing.JLabel();
        RollNo1 = new javax.swing.JLabel();
        rollNoField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollNo.setBackground(new java.awt.Color(255, 255, 255));
        RollNo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        RollNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RollNo.setText("Student Result Page");
        RollNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        RollNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RollNo.setMaximumSize(new java.awt.Dimension(125, 35));
        RollNo.setMinimumSize(new java.awt.Dimension(125, 35));
        RollNo.setOpaque(true);
        RollNo.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        RollNo1.setBackground(new java.awt.Color(255, 204, 204));
        RollNo1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        RollNo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RollNo1.setText("Roll Number");
        RollNo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        RollNo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RollNo1.setMaximumSize(new java.awt.Dimension(125, 35));
        RollNo1.setMinimumSize(new java.awt.Dimension(125, 35));
        RollNo1.setOpaque(true);
        RollNo1.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(RollNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, -1, -1));

        rollNoField.setMaximumSize(new java.awt.Dimension(75, 25));
        rollNoField.setMinimumSize(new java.awt.Dimension(75, 25));
        rollNoField.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 230, -1, -1));

        search.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); // NOI18N
        search.setText("Search");
        search.setPreferredSize(new java.awt.Dimension(125, 35));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-36.png"))); // NOI18N
        close.setText("Exit");
        close.setPreferredSize(new java.awt.Dimension(125, 35));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2resize.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(720, 560));
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        // Search for the entered rollNo in the database, then redirects to student result page.
        String rollNo = rollNoField.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from result where rollNo="+rollNo+"");
            if(!rs.first()) {
                JOptionPane.showMessageDialog(null, "Entered rollNo doesn't exist");
            }
            else {
                setVisible(false);
                StudentResult frame = new StudentResult(rollNo);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
        // Close the form and returns back to HomePage.
        setVisible(false);
        Home frame = new Home();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_closeActionPerformed

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown

    }//GEN-LAST:event_jLabel1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RollNo;
    private javax.swing.JLabel RollNo1;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
