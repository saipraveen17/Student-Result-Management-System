
package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

    // Creates new form AddStudent
    public AddStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clear = new javax.swing.JButton();
        rollNoField = new javax.swing.JTextField();
        branchBox = new javax.swing.JComboBox<>();
        courseBox = new javax.swing.JComboBox<>();
        genderBox = new javax.swing.JComboBox<>();
        rollNo = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        fatherName = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        fatherField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 560));
        setMinimumSize(new java.awt.Dimension(720, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/refresh--v136.png"))); // NOI18N
        clear.setText("Clear");
        clear.setMaximumSize(new java.awt.Dimension(125, 40));
        clear.setMinimumSize(new java.awt.Dimension(125, 40));
        clear.setPreferredSize(new java.awt.Dimension(125, 40));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 475, -1, -1));

        rollNoField.setMaximumSize(new java.awt.Dimension(225, 25));
        rollNoField.setMinimumSize(new java.awt.Dimension(225, 25));
        rollNoField.setPreferredSize(new java.awt.Dimension(225, 25));
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        branchBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        branchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "Mechanical", "Civil", "Electrical", "Chemical", "Metallurgy" }));
        branchBox.setMaximumSize(new java.awt.Dimension(100, 25));
        branchBox.setMinimumSize(new java.awt.Dimension(100, 25));
        branchBox.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(branchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        courseBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "B.Com", "B.Sc" }));
        courseBox.setMaximumSize(new java.awt.Dimension(100, 25));
        courseBox.setMinimumSize(new java.awt.Dimension(100, 25));
        courseBox.setPreferredSize(new java.awt.Dimension(100, 25));
        courseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBoxActionPerformed(evt);
            }
        });
        getContentPane().add(courseBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        genderBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderBox.setMaximumSize(new java.awt.Dimension(225, 25));
        genderBox.setMinimumSize(new java.awt.Dimension(225, 25));
        genderBox.setPreferredSize(new java.awt.Dimension(100, 25));
        genderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        rollNo.setBackground(new java.awt.Color(255, 204, 204));
        rollNo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rollNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rollNo.setText("Roll No.");
        rollNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        rollNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rollNo.setMaximumSize(new java.awt.Dimension(125, 35));
        rollNo.setMinimumSize(new java.awt.Dimension(125, 35));
        rollNo.setOpaque(true);
        rollNo.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(rollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 105, -1, -1));

        gender.setBackground(new java.awt.Color(255, 204, 204));
        gender.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gender.setText("Gender");
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gender.setMaximumSize(new java.awt.Dimension(125, 35));
        gender.setMinimumSize(new java.awt.Dimension(125, 35));
        gender.setOpaque(true);
        gender.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 175, -1, -1));

        fatherName.setBackground(new java.awt.Color(255, 204, 204));
        fatherName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        fatherName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fatherName.setText("Father's Name");
        fatherName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        fatherName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fatherName.setMaximumSize(new java.awt.Dimension(125, 35));
        fatherName.setMinimumSize(new java.awt.Dimension(125, 35));
        fatherName.setOpaque(true);
        fatherName.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 245, -1, -1));

        course.setBackground(new java.awt.Color(255, 204, 204));
        course.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        course.setText("Course");
        course.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        course.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        course.setMaximumSize(new java.awt.Dimension(125, 35));
        course.setMinimumSize(new java.awt.Dimension(125, 35));
        course.setOpaque(true);
        course.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 315, -1, -1));

        branch.setBackground(new java.awt.Color(255, 204, 204));
        branch.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        branch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branch.setText("Branch");
        branch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        branch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        branch.setMaximumSize(new java.awt.Dimension(125, 35));
        branch.setMinimumSize(new java.awt.Dimension(125, 35));
        branch.setOpaque(true);
        branch.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 385, -1, -1));

        name.setBackground(new java.awt.Color(255, 204, 204));
        name.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name");
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        name.setMaximumSize(new java.awt.Dimension(125, 35));
        name.setMinimumSize(new java.awt.Dimension(125, 35));
        name.setOpaque(true);
        name.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 35, -1, -1));

        fatherField.setMaximumSize(new java.awt.Dimension(225, 25));
        fatherField.setMinimumSize(new java.awt.Dimension(225, 25));
        fatherField.setPreferredSize(new java.awt.Dimension(225, 25));
        getContentPane().add(fatherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        nameField.setMaximumSize(new java.awt.Dimension(225, 25));
        nameField.setMinimumSize(new java.awt.Dimension(225, 25));
        nameField.setPreferredSize(new java.awt.Dimension(225, 25));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-36.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setMaximumSize(new java.awt.Dimension(125, 40));
        cancel.setMinimumSize(new java.awt.Dimension(125, 40));
        cancel.setPreferredSize(new java.awt.Dimension(125, 40));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 475, -1, -1));

        submit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); // NOI18N
        submit.setText("Submit");
        submit.setMaximumSize(new java.awt.Dimension(125, 40));
        submit.setMinimumSize(new java.awt.Dimension(125, 40));
        submit.setPreferredSize(new java.awt.Dimension(125, 40));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 475, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2resize.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(720, 560));
        jLabel7.setMinimumSize(new java.awt.Dimension(720, 560));
        jLabel7.setPreferredSize(new java.awt.Dimension(720, 560));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed

    }//GEN-LAST:event_genderBoxActionPerformed

    private void courseBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBoxActionPerformed

    }//GEN-LAST:event_courseBoxActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        // Submitting the changes performed to database by inserting new student.
        String Name = nameField.getText();
        String rollNo = rollNoField.getText();
        String gender = (String)genderBox.getSelectedItem();
        String fatherName = fatherField.getText();
        String course = (String)courseBox.getSelectedItem();
        String branch = (String)branchBox.getSelectedItem();
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO student VALUES('"+Name+"','"+rollNo+"','"+gender+"','"+fatherName+"','"+course+"','"+branch+"')");
            JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e) {
            JOptionPane.showConfirmDialog(null, e.toString());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        // Close the form and returns back to AdminHomePage.
        int flag = JOptionPane.showConfirmDialog(null, "Do you want to Exit", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag==0) {
            setVisible(false);
            AdminHomePage frame = new AdminHomePage();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        // Clear the details displaying in the current form on screen.
        setVisible(false);
        AddStudent frame = new AddStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel branch;
    private javax.swing.JComboBox<String> branchBox;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel course;
    private javax.swing.JComboBox<String> courseBox;
    private javax.swing.JTextField fatherField;
    private javax.swing.JLabel fatherName;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel rollNo;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
