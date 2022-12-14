
package ManagementSystem;

import javax.swing.JOptionPane;

public class AdminHomePage extends javax.swing.JFrame {
    
    //Creates new form AdminHomePage
    public AdminHomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditStudentResults = new javax.swing.JButton();
        AddStudent = new javax.swing.JButton();
        InsertResults = new javax.swing.JButton();
        ListStudents = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        ListStudentResults = new javax.swing.JButton();
        BGImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 560));
        setMinimumSize(new java.awt.Dimension(720, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditStudentResults.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        EditStudentResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-edit student.png"))); // NOI18N
        EditStudentResults.setText("Update Student Results");
        EditStudentResults.setMaximumSize(new java.awt.Dimension(250, 60));
        EditStudentResults.setMinimumSize(new java.awt.Dimension(250, 60));
        EditStudentResults.setPreferredSize(new java.awt.Dimension(250, 60));
        EditStudentResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStudentResultsActionPerformed(evt);
            }
        });
        getContentPane().add(EditStudentResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        AddStudent.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-student.png"))); // NOI18N
        AddStudent.setText("Insert New Student");
        AddStudent.setMaximumSize(new java.awt.Dimension(250, 60));
        AddStudent.setMinimumSize(new java.awt.Dimension(250, 60));
        AddStudent.setPreferredSize(new java.awt.Dimension(250, 60));
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        InsertResults.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        InsertResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-grade-24re.png"))); // NOI18N
        InsertResults.setText("   Insert Results");
        InsertResults.setMaximumSize(new java.awt.Dimension(250, 60));
        InsertResults.setMinimumSize(new java.awt.Dimension(250, 60));
        InsertResults.setPreferredSize(new java.awt.Dimension(250, 60));
        InsertResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertResultsActionPerformed(evt);
            }
        });
        getContentPane().add(InsertResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        ListStudents.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ListStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudents.setText("  List of Students");
        ListStudents.setMaximumSize(new java.awt.Dimension(250, 60));
        ListStudents.setMinimumSize(new java.awt.Dimension(250, 60));
        ListStudents.setPreferredSize(new java.awt.Dimension(250, 60));
        ListStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        LogOut.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Icons_ResultManagement\\icons8-logout-40.png")); // NOI18N
        LogOut.setText("Log Out");
        LogOut.setMaximumSize(new java.awt.Dimension(200, 50));
        LogOut.setMinimumSize(new java.awt.Dimension(200, 50));
        LogOut.setPreferredSize(new java.awt.Dimension(200, 50));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 495, -1, -1));

        ListStudentResults.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ListStudentResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png"))); // NOI18N
        ListStudentResults.setText("View Student Results");
        ListStudentResults.setMaximumSize(new java.awt.Dimension(250, 60));
        ListStudentResults.setMinimumSize(new java.awt.Dimension(250, 60));
        ListStudentResults.setPreferredSize(new java.awt.Dimension(250, 60));
        ListStudentResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentResultsActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudentResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        BGImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2resize.png"))); // NOI18N
        BGImage.setText("jLabel1");
        BGImage.setMaximumSize(new java.awt.Dimension(720, 560));
        BGImage.setMinimumSize(new java.awt.Dimension(720, 560));
        BGImage.setPreferredSize(new java.awt.Dimension(720, 560));
        getContentPane().add(BGImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditStudentResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentResultsActionPerformed
        
        // Create and display the UpdateResults form.
        setVisible(false);
        UpdateResults frame = new UpdateResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_EditStudentResultsActionPerformed

    private void ListStudentResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentResultsActionPerformed
        
        // Create and display the ListResults form.
        setVisible(false);
        ListResults frame = new ListResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentResultsActionPerformed

    private void InsertResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertResultsActionPerformed
        
        // Create and display the AddResults form.
        setVisible(false);
        AddResults frame = new AddResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_InsertResultsActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        
        // Create and display the AddStudent form.
        setVisible(false);
        AddStudent frame = new AddStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }//GEN-LAST:event_AddStudentActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        
        // LogOut backc to the Home Page.
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }

    }//GEN-LAST:event_LogOutActionPerformed

    private void ListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentsActionPerformed
        
        // Create and display the ListStudents form.
        setVisible(false);
        ListStudents frame = new ListStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudent;
    private javax.swing.JLabel BGImage;
    private javax.swing.JButton EditStudentResults;
    private javax.swing.JButton InsertResults;
    private javax.swing.JButton ListStudentResults;
    private javax.swing.JButton ListStudents;
    private javax.swing.JButton LogOut;
    // End of variables declaration//GEN-END:variables
}
