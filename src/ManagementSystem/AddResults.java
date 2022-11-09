
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class AddResults extends javax.swing.JFrame {

    // Creates new form AddResults
    public AddResults() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Maths = new javax.swing.JLabel();
        Electrical = new javax.swing.JLabel();
        English = new javax.swing.JLabel();
        Economics = new javax.swing.JLabel();
        Physics = new javax.swing.JLabel();
        RollNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JButton();
        mathsField = new javax.swing.JTextField();
        electricalField = new javax.swing.JTextField();
        englishField = new javax.swing.JTextField();
        economicsField = new javax.swing.JTextField();
        rollNoField = new javax.swing.JTextField();
        physicsField = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 560));
        setMinimumSize(new java.awt.Dimension(720, 560));
        setPreferredSize(new java.awt.Dimension(735, 595));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Maths.setBackground(new java.awt.Color(255, 204, 204));
        Maths.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Maths.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maths.setText("Mathematics-1");
        Maths.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Maths.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Maths.setMaximumSize(new java.awt.Dimension(125, 35));
        Maths.setMinimumSize(new java.awt.Dimension(125, 35));
        Maths.setOpaque(true);
        Maths.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(Maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 275, -1, -1));

        Electrical.setBackground(new java.awt.Color(255, 204, 204));
        Electrical.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Electrical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Electrical.setText("Electrical");
        Electrical.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Electrical.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Electrical.setMaximumSize(new java.awt.Dimension(125, 35));
        Electrical.setMinimumSize(new java.awt.Dimension(125, 35));
        Electrical.setOpaque(true);
        Electrical.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 325, -1, -1));

        English.setBackground(new java.awt.Color(255, 204, 204));
        English.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        English.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        English.setText("English");
        English.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        English.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        English.setMaximumSize(new java.awt.Dimension(125, 35));
        English.setMinimumSize(new java.awt.Dimension(125, 35));
        English.setOpaque(true);
        English.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(English, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 375, -1, -1));

        Economics.setBackground(new java.awt.Color(255, 204, 204));
        Economics.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Economics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Economics.setText("Economics");
        Economics.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Economics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Economics.setMaximumSize(new java.awt.Dimension(125, 35));
        Economics.setMinimumSize(new java.awt.Dimension(125, 35));
        Economics.setOpaque(true);
        Economics.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(Economics, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 425, -1, -1));

        Physics.setBackground(new java.awt.Color(255, 204, 204));
        Physics.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Physics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Physics.setText("Physics");
        Physics.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Physics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Physics.setMaximumSize(new java.awt.Dimension(125, 35));
        Physics.setMinimumSize(new java.awt.Dimension(125, 35));
        Physics.setOpaque(true);
        Physics.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(Physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, -1, -1));

        RollNo.setBackground(new java.awt.Color(255, 204, 204));
        RollNo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        RollNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RollNo.setText("Roll No.");
        RollNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        RollNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RollNo.setMaximumSize(new java.awt.Dimension(125, 35));
        RollNo.setMinimumSize(new java.awt.Dimension(125, 35));
        RollNo.setOpaque(true);
        RollNo.setPreferredSize(new java.awt.Dimension(125, 35));
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Roll No.", "Gender", "Father's Name", "Course", "Branch"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setMaximumSize(new java.awt.Dimension(500, 20));
        table.setMinimumSize(new java.awt.Dimension(500, 20));
        table.setPreferredSize(new java.awt.Dimension(500, 20));
        table.setRequestFocusEnabled(false);
        table.setShowGrid(false);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 560, 50));

        search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-20.png"))); // NOI18N
        search.setText("Search");
        search.setPreferredSize(new java.awt.Dimension(100, 25));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        mathsField.setMaximumSize(new java.awt.Dimension(75, 25));
        mathsField.setMinimumSize(new java.awt.Dimension(75, 25));
        mathsField.setPreferredSize(new java.awt.Dimension(125, 25));
        getContentPane().add(mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 280, -1, -1));

        electricalField.setMaximumSize(new java.awt.Dimension(75, 25));
        electricalField.setMinimumSize(new java.awt.Dimension(75, 25));
        electricalField.setPreferredSize(new java.awt.Dimension(125, 25));
        getContentPane().add(electricalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 330, -1, -1));

        englishField.setMaximumSize(new java.awt.Dimension(75, 25));
        englishField.setMinimumSize(new java.awt.Dimension(75, 25));
        englishField.setPreferredSize(new java.awt.Dimension(125, 25));
        getContentPane().add(englishField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 380, -1, -1));

        economicsField.setMaximumSize(new java.awt.Dimension(75, 25));
        economicsField.setMinimumSize(new java.awt.Dimension(75, 25));
        economicsField.setPreferredSize(new java.awt.Dimension(125, 25));
        getContentPane().add(economicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 430, -1, -1));

        rollNoField.setMaximumSize(new java.awt.Dimension(75, 25));
        rollNoField.setMinimumSize(new java.awt.Dimension(75, 25));
        rollNoField.setPreferredSize(new java.awt.Dimension(125, 25));
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        physicsField.setMaximumSize(new java.awt.Dimension(75, 25));
        physicsField.setMinimumSize(new java.awt.Dimension(75, 25));
        physicsField.setPreferredSize(new java.awt.Dimension(125, 25));
        getContentPane().add(physicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 230, -1, -1));

        submit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checkmark-36.png"))); // NOI18N
        submit.setText("Submit");
        submit.setPreferredSize(new java.awt.Dimension(125, 40));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-36.png"))); // NOI18N
        close.setText("Exit");
        close.setPreferredSize(new java.awt.Dimension(125, 40));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2resize.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(720, 560));
        jLabel1.setMinimumSize(new java.awt.Dimension(720, 560));
        jLabel1.setPreferredSize(new java.awt.Dimension(720, 560));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        // Serach action based on the rollNo entered.
        String rollNo = rollNoField.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student where rollNo='"+rollNo+"'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first()) {
                JOptionPane.showMessageDialog(null, "Entered rollNo is wrong");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        // Submitting the results of student after adding them.
        String rollNo = rollNoField.getText();
        int physicsMarks = Integer.parseInt(physicsField.getText());
        int mathematicsMarks = Integer.parseInt(mathsField.getText());
        int electricalMarks = Integer.parseInt(electricalField.getText());
        int englishMarks = Integer.parseInt(englishField.getText());
        int economicsMarks = Integer.parseInt(economicsField.getText());
        int result = 0;
        result = physicsMarks+mathematicsMarks+electricalMarks+englishMarks+economicsMarks;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into result values("+rollNo+","+physicsMarks+","+mathematicsMarks+","+electricalMarks+","+englishMarks+","+economicsMarks+","+result+")");
            JOptionPane.showMessageDialog(null, "Successfully added");
            setVisible(false);
            AddResults frame = new AddResults();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
        // Close the form and returns back to AdminHomePage.
        setVisible(false);
        AdminHomePage frame = new AdminHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Economics;
    private javax.swing.JLabel Electrical;
    private javax.swing.JLabel English;
    private javax.swing.JLabel Maths;
    private javax.swing.JLabel Physics;
    private javax.swing.JLabel RollNo;
    private javax.swing.JButton close;
    private javax.swing.JTextField economicsField;
    private javax.swing.JTextField electricalField;
    private javax.swing.JTextField englishField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mathsField;
    private javax.swing.JTextField physicsField;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JButton search;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
