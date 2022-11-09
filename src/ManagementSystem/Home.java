
package ManagementSystem;

public class Home extends javax.swing.JFrame {

    //Create new form Home
    public Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Student = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        BGImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(720, 560));
        setMinimumSize(new java.awt.Dimension(720, 560));
        setPreferredSize(new java.awt.Dimension(720, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-schoolboy-at-a-desk-30.png"))); // NOI18N
        Student.setText("Student");
        Student.setMaximumSize(new java.awt.Dimension(130, 40));
        Student.setMinimumSize(new java.awt.Dimension(130, 40));
        Student.setPreferredSize(new java.awt.Dimension(130, 40));
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        getContentPane().add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, -1, -1));

        Admin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-admin-settings-male-30.png"))); // NOI18N
        Admin.setText("Admin");
        Admin.setMaximumSize(new java.awt.Dimension(130, 40));
        Admin.setMinimumSize(new java.awt.Dimension(130, 40));
        Admin.setPreferredSize(new java.awt.Dimension(130, 40));
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 380, -1, -1));

        BGImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic1resize.jpg"))); // NOI18N
        BGImage.setText("jLabel1");
        BGImage.setMaximumSize(new java.awt.Dimension(760, 560));
        BGImage.setMinimumSize(new java.awt.Dimension(760, 560));
        BGImage.setPreferredSize(new java.awt.Dimension(760, 560));
        getContentPane().add(BGImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        
        // Create and display the StudentHomePage form.
        setVisible(false);
        StudentHomePage frame = new StudentHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_StudentActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        
        // Create and display the AdminHomePage form.
        setVisible(false);
        AdminHomePage frame = new AdminHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AdminActionPerformed
  
    public static void main(String args[]) {
        
        // Create and display the Home form.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home frame = new Home();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JLabel BGImage;
    private javax.swing.JButton Student;
    // End of variables declaration//GEN-END:variables
}
