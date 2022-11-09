
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class StudentResult extends javax.swing.JFrame {

    // Creates new form StudentResult
    public StudentResult() {
        initComponents();
    }
    public StudentResult(String rollNo) {
        initComponents();
        rollNoField.setText(rollNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rollNo = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        fatherName = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        rollNoField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        fatherField = new javax.swing.JTextField();
        courseField = new javax.swing.JTextField();
        branchField = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        verdictField = new javax.swing.JTextField();
        Physics = new javax.swing.JLabel();
        Maths = new javax.swing.JLabel();
        Electrical = new javax.swing.JLabel();
        English = new javax.swing.JLabel();
        Economics = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Verdict = new javax.swing.JLabel();
        physicsField = new javax.swing.JTextField();
        mathsField = new javax.swing.JTextField();
        electricalField = new javax.swing.JTextField();
        englishField = new javax.swing.JTextField();
        economicsField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TotalMarks = new javax.swing.JLabel();
        PassingMarks = new javax.swing.JLabel();
        MarksObtained = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2resize.png"))); // NOI18N
        jLabel11.setText("jLabel1");
        jLabel11.setPreferredSize(new java.awt.Dimension(720, 560));
        jLabel11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel11ComponentShown(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(255, 204, 204));
        name.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Name");
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        name.setMaximumSize(new java.awt.Dimension(125, 35));
        name.setMinimumSize(new java.awt.Dimension(125, 35));
        name.setOpaque(true);
        name.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        rollNo.setBackground(new java.awt.Color(255, 204, 204));
        rollNo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rollNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rollNo.setText("Roll No.");
        rollNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        rollNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rollNo.setMaximumSize(new java.awt.Dimension(125, 35));
        rollNo.setMinimumSize(new java.awt.Dimension(125, 35));
        rollNo.setOpaque(true);
        rollNo.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(rollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 30, -1, -1));

        gender.setBackground(new java.awt.Color(255, 204, 204));
        gender.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gender.setText("Gender");
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gender.setMaximumSize(new java.awt.Dimension(125, 35));
        gender.setMinimumSize(new java.awt.Dimension(125, 35));
        gender.setOpaque(true);
        gender.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));

        fatherName.setBackground(new java.awt.Color(255, 204, 204));
        fatherName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        fatherName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fatherName.setText("Father's Name");
        fatherName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        fatherName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fatherName.setMaximumSize(new java.awt.Dimension(125, 35));
        fatherName.setMinimumSize(new java.awt.Dimension(125, 35));
        fatherName.setOpaque(true);
        fatherName.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 85, -1, -1));

        course.setBackground(new java.awt.Color(255, 204, 204));
        course.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        course.setText("Course");
        course.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        course.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        course.setMaximumSize(new java.awt.Dimension(125, 35));
        course.setMinimumSize(new java.awt.Dimension(125, 35));
        course.setOpaque(true);
        course.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        branch.setBackground(new java.awt.Color(255, 204, 204));
        branch.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        branch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branch.setText("Branch");
        branch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        branch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        branch.setMaximumSize(new java.awt.Dimension(125, 35));
        branch.setMinimumSize(new java.awt.Dimension(125, 35));
        branch.setOpaque(true);
        branch.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 140, -1, -1));

        nameField.setMaximumSize(new java.awt.Dimension(225, 25));
        nameField.setMinimumSize(new java.awt.Dimension(225, 25));
        nameField.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 32, -1, -1));

        rollNoField.setMaximumSize(new java.awt.Dimension(225, 25));
        rollNoField.setMinimumSize(new java.awt.Dimension(225, 25));
        rollNoField.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 32, -1, -1));

        genderField.setMaximumSize(new java.awt.Dimension(225, 25));
        genderField.setMinimumSize(new java.awt.Dimension(225, 25));
        genderField.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 87, -1, -1));

        fatherField.setMaximumSize(new java.awt.Dimension(225, 25));
        fatherField.setMinimumSize(new java.awt.Dimension(225, 25));
        fatherField.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(fatherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 87, -1, -1));

        courseField.setMaximumSize(new java.awt.Dimension(225, 25));
        courseField.setMinimumSize(new java.awt.Dimension(225, 25));
        courseField.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(courseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 142, -1, -1));

        branchField.setMaximumSize(new java.awt.Dimension(225, 25));
        branchField.setMinimumSize(new java.awt.Dimension(225, 25));
        branchField.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(branchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 142, -1, -1));

        totalField.setMaximumSize(new java.awt.Dimension(225, 25));
        totalField.setMinimumSize(new java.awt.Dimension(225, 25));
        totalField.setPreferredSize(new java.awt.Dimension(110, 25));
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 502, -1, -1));

        verdictField.setMaximumSize(new java.awt.Dimension(225, 25));
        verdictField.setMinimumSize(new java.awt.Dimension(225, 25));
        verdictField.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(verdictField, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 502, -1, -1));

        Physics.setBackground(new java.awt.Color(255, 204, 204));
        Physics.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Physics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Physics.setText("Physics");
        Physics.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Physics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Physics.setMaximumSize(new java.awt.Dimension(125, 35));
        Physics.setMinimumSize(new java.awt.Dimension(125, 35));
        Physics.setOpaque(true);
        Physics.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(Physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 245, -1, -1));

        Maths.setBackground(new java.awt.Color(255, 204, 204));
        Maths.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Maths.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maths.setText("Mathematics-1");
        Maths.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Maths.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Maths.setMaximumSize(new java.awt.Dimension(125, 35));
        Maths.setMinimumSize(new java.awt.Dimension(125, 35));
        Maths.setOpaque(true);
        Maths.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(Maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        Electrical.setBackground(new java.awt.Color(255, 204, 204));
        Electrical.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Electrical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Electrical.setText("Electrical");
        Electrical.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Electrical.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Electrical.setMaximumSize(new java.awt.Dimension(125, 35));
        Electrical.setMinimumSize(new java.awt.Dimension(125, 35));
        Electrical.setOpaque(true);
        Electrical.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 345, -1, -1));

        English.setBackground(new java.awt.Color(255, 204, 204));
        English.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        English.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        English.setText("English");
        English.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        English.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        English.setMaximumSize(new java.awt.Dimension(125, 35));
        English.setMinimumSize(new java.awt.Dimension(125, 35));
        English.setOpaque(true);
        English.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(English, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 395, -1, -1));

        Economics.setBackground(new java.awt.Color(255, 204, 204));
        Economics.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Economics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Economics.setText("Economics");
        Economics.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Economics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Economics.setMaximumSize(new java.awt.Dimension(125, 35));
        Economics.setMinimumSize(new java.awt.Dimension(125, 35));
        Economics.setOpaque(true);
        Economics.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(Economics, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 445, -1, -1));

        Total.setBackground(new java.awt.Color(255, 204, 204));
        Total.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total.setText("Total");
        Total.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Total.setMaximumSize(new java.awt.Dimension(125, 35));
        Total.setMinimumSize(new java.awt.Dimension(125, 35));
        Total.setOpaque(true);
        Total.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        Verdict.setBackground(new java.awt.Color(255, 204, 204));
        Verdict.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Verdict.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verdict.setText("Verdict");
        Verdict.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Verdict.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Verdict.setMaximumSize(new java.awt.Dimension(125, 35));
        Verdict.setMinimumSize(new java.awt.Dimension(125, 35));
        Verdict.setOpaque(true);
        Verdict.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(Verdict, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        physicsField.setMaximumSize(new java.awt.Dimension(75, 25));
        physicsField.setMinimumSize(new java.awt.Dimension(75, 25));
        physicsField.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(physicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 247, -1, -1));

        mathsField.setMaximumSize(new java.awt.Dimension(75, 25));
        mathsField.setMinimumSize(new java.awt.Dimension(75, 25));
        mathsField.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 297, -1, -1));

        electricalField.setMaximumSize(new java.awt.Dimension(75, 25));
        electricalField.setMinimumSize(new java.awt.Dimension(75, 25));
        electricalField.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(electricalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 347, -1, -1));

        englishField.setMaximumSize(new java.awt.Dimension(75, 25));
        englishField.setMinimumSize(new java.awt.Dimension(75, 25));
        englishField.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(englishField, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 397, -1, -1));

        economicsField.setMaximumSize(new java.awt.Dimension(75, 25));
        economicsField.setMinimumSize(new java.awt.Dimension(75, 25));
        economicsField.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(economicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 447, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("35");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 247, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("100");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 297, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("35");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 297, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("100");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 347, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("35");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 347, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("100");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 397, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("35");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 397, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("100");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 447, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("35");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 447, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("100");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 247, -1, -1));

        TotalMarks.setBackground(new java.awt.Color(255, 255, 255));
        TotalMarks.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        TotalMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalMarks.setText("Total Marks");
        TotalMarks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        TotalMarks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TotalMarks.setMaximumSize(new java.awt.Dimension(125, 35));
        TotalMarks.setMinimumSize(new java.awt.Dimension(125, 35));
        TotalMarks.setOpaque(true);
        TotalMarks.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(TotalMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 195, -1, -1));

        PassingMarks.setBackground(new java.awt.Color(255, 255, 255));
        PassingMarks.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        PassingMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassingMarks.setText("Passing Marks");
        PassingMarks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        PassingMarks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PassingMarks.setMaximumSize(new java.awt.Dimension(125, 35));
        PassingMarks.setMinimumSize(new java.awt.Dimension(125, 35));
        PassingMarks.setOpaque(true);
        PassingMarks.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(PassingMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 195, -1, -1));

        MarksObtained.setBackground(new java.awt.Color(255, 255, 255));
        MarksObtained.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        MarksObtained.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarksObtained.setText("Marks Obtained");
        MarksObtained.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        MarksObtained.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MarksObtained.setMaximumSize(new java.awt.Dimension(125, 35));
        MarksObtained.setMinimumSize(new java.awt.Dimension(125, 35));
        MarksObtained.setOpaque(true);
        MarksObtained.setPreferredSize(new java.awt.Dimension(115, 30));
        getContentPane().add(MarksObtained, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 195, -1, -1));

        LogOut.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Icons_ResultManagement\\icons8-logout-40.png")); // NOI18N
        LogOut.setMaximumSize(new java.awt.Dimension(200, 50));
        LogOut.setMinimumSize(new java.awt.Dimension(200, 50));
        LogOut.setPreferredSize(new java.awt.Dimension(60, 50));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/schoolPic2resize.png"))); // NOI18N
        jLabel12.setText("jLabel1");
        jLabel12.setPreferredSize(new java.awt.Dimension(720, 560));
        jLabel12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel12ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        
        // LogOut from the student page and returns back to StudentHomePage.
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
            StudentHomePage frame = new StudentHomePage();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void jLabel11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel11ComponentShown

    }//GEN-LAST:event_jLabel11ComponentShown

    private void jLabel12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel12ComponentShown

    }//GEN-LAST:event_jLabel12ComponentShown

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed

    }//GEN-LAST:event_totalFieldActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        // Auto Populates all the details and results of the student on the screen.
        String rollNo = rollNoField.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered rollNo doesn't exist");
            }
            else{
                nameField.setText(rs.getString(1));
                genderField.setText(rs.getString(3));
                fatherField.setText(rs.getString(4));
                courseField.setText(rs.getString(5));
                branchField.setText(rs.getString(6));
                
                physicsField.setText(rs.getString(8));
                mathsField.setText(rs.getString(9));
                electricalField.setText(rs.getString(10));
                englishField.setText(rs.getString(11));
                economicsField.setText(rs.getString(12));
                totalField.setText(rs.getString(13));
                
                nameField.setEditable(false);
                genderField.setEditable(false);
                fatherField.setEditable(false);
                courseField.setEditable(false);
                branchField.setEditable(false);
                
                physicsField.setEditable(false);
                mathsField.setEditable(false);
                electricalField.setEditable(false);
                englishField.setEditable(false);
                economicsField.setEditable(false);
                totalField.setEditable(false);
                
                int m1 = Integer.parseInt(rs.getString(8));
                int m2 = Integer.parseInt(rs.getString(9));
                int m3 = Integer.parseInt(rs.getString(10));
                int m4 = Integer.parseInt(rs.getString(11));
                int m5 = Integer.parseInt(rs.getString(12));
                
                if(m1<35 || m2<35 || m3<35 || m4<35 || m5<35){
                    verdictField.setText("Fail");
                }
                else{
                    verdictField.setText("Pass");
                }
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Economics;
    private javax.swing.JLabel Electrical;
    private javax.swing.JLabel English;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel MarksObtained;
    private javax.swing.JLabel Maths;
    private javax.swing.JLabel PassingMarks;
    private javax.swing.JLabel Physics;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalMarks;
    private javax.swing.JLabel Verdict;
    private javax.swing.JLabel branch;
    private javax.swing.JTextField branchField;
    private javax.swing.JLabel course;
    private javax.swing.JTextField courseField;
    private javax.swing.JTextField economicsField;
    private javax.swing.JTextField electricalField;
    private javax.swing.JTextField englishField;
    private javax.swing.JTextField fatherField;
    private javax.swing.JLabel fatherName;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mathsField;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField physicsField;
    private javax.swing.JLabel rollNo;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JTextField totalField;
    private javax.swing.JTextField verdictField;
    // End of variables declaration//GEN-END:variables
}
