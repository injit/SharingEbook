package ebooksharing1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author indrajit
 */
public class tabpannedAH extends javax.swing.JFrame {

    /**
     * Creates new form tabpannedAH
     */
    public tabpannedAH() {
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

        UserTypeRadioButton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VisitorButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UserNameTextField1 = new javax.swing.JTextField();
        SignInButton = new javax.swing.JButton();
        UserPassTextField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        UserNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to EBook Sharing Application");

        VisitorButton.setText("Continue as Visitor");
        VisitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitorButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/indrajit/Desktop/SharingEbook/banner3.jpg")); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));
        jPanel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(963, 920));

        UserNameLabel.setText("UserName");

        PasswordLabel.setText("PassWord");

        SignInButton.setText("Sign In");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel10.setText("Please Enter Your credentials ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserNameLabel)
                    .addComponent(PasswordLabel))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(SignInButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addGap(36, 36, 36)
                .addComponent(SignInButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel3);

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(970, 920));

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        RegisterButton.setText("Register me");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("First Name");

        jLabel6.setText("Last Name");

        jLabel7.setText("Email Address");

        jLabel9.setText("Select User Category");

        UserTypeRadioButton.add(jRadioButton3);
        jRadioButton3.setText("Super User");

        UserTypeRadioButton.add(jRadioButton4);
        jRadioButton4.setText("User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(146, 146, 146))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(RegisterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registration", jPanel2);

        CancelButton.setText("Exit Application");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VisitorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VisitorButton)
                    .addComponent(CancelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitorButtonActionPerformed
        // TODO add your handling code here:
        VisitorPage Eav = new VisitorPage("Guest", "Visitor");
        Eav.setVisible(true);
        cancel();
    }//GEN-LAST:event_VisitorButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        //String file_name = "test.txt";
        String U_name = UserNameTextField.getText();
        String P_word = PasswordField1.getText();
        String F_name = FirstNameTextField.getText();
        String L_name = LastNameTextField.getText();
        String E_add = EmailTextField.getText();
        //String ID = IDTextField.getText();
        int points = 0;

        //////////
        //String result;
        boolean result = false;

        if (jRadioButton3.isSelected()) {
            //result = "Super User";
            result = true;
        } //else if (jRadioButton4.isSelected()) {
        //result = "User";
        //          result = false;
        //        }
        //        } else {
        //            result = "Unknown";
        //        }
        try {
            DbConnector dbc = new DbConnector();
            Connection conn = dbc.Connects();

            //            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/UsersRegistration", "java", "java");
            Statement stmt = conn.createStatement();
            Statement UserNameStmt = conn.createStatement();
            String UserN_query = "Select * from UserInfo";
            ResultSet UserN_result = UserNameStmt.executeQuery(UserN_query);
            boolean checkUserName = false;
            boolean checkemail = false;
            while (UserN_result.next()) {
                String UN = UserN_result.getString("UserName");
                String Uemail = UserN_result.getString("email");
                if (UN.equalsIgnoreCase(U_name)) {
                    checkUserName = true;
                }
                if (Uemail.equalsIgnoreCase(E_add)) {
                    checkemail = true;
                }

            }
            if (!checkUserName) {
                /*
                INSERT INTO userInfo (username,password,email,firstname,lastname,point_balance,is_SU) 
VALUES
 ('user1','sit','odio@lobortisauguescelerisque.com','Bo','Washington',26,True);
                */
                if (!checkemail) {
                    String query = "Insert Into UserInfo (username,password,email,firstname,lastname,point_balance,is_SU) Values ('" + U_name + "','" + P_word + "','" + E_add + "','" + F_name + "','" + L_name + "',"+ 0 + "," + result + ")";
                            //"//," + 0+")";//,'" +0+"')";

                    if (!U_name.isEmpty() && !P_word.isEmpty() && !F_name.isEmpty() && !L_name.isEmpty() && !E_add.isEmpty() && (jRadioButton3.isSelected() || jRadioButton4.isSelected())) {
                        if (jRadioButton3.isSelected())// && jRadioButton3.getText().equals("Super User"))
                        {
                            String input = JOptionPane.showInputDialog(null, "Enter Your Access code:", "Verification", JOptionPane.OK_OPTION);
                            if (input != null) {

                                if (input.equals("Access"))//This is a hard coded Access code for Super User registration
                                {
                                    JOptionPane.showMessageDialog(null, "Congratulations! Access granted, You have now Super User privilege.");
                                    stmt.executeUpdate(query);
                                    /*while(rs.next()){
                                     System.out.println("Un"+ rs.getString("UserName")+ "UP "+ rs.getString("UserPassword")+ "FN "+ rs.getString("FirstName")+ "LN "+ rs.getString("LastName")+"email "+rs.getString("Email")+"UID "+ rs.getBigDecimal("UserID")+ "UType "+ rs.getString("UserType"));
                                     }*/
                                    //System.out.println("Connected to db");
                                    conn.close();
                                    cancel();
                                    GreetingPage gp = new GreetingPage();
                                    gp.setVisible(true);
                                } else {
                                    final JPanel jp = new JPanel();
                                    JOptionPane.showMessageDialog(jp, "your access code is wrong !!!", "Warning", JOptionPane.WARNING_MESSAGE);
                                }

                            } else {
                                final JPanel jp = new JPanel();
                                JOptionPane.showMessageDialog(jp, "you clicked cancel !!! Try again", "Cancelled", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {

                            stmt.executeUpdate(query);
                            conn.close();
                            //JOptionPane.showMessageDialog(null, "Congratulations, You are now Registered User.");
                            GreetingPage gp = new GreetingPage();
                            gp.setVisible(true);
                            cancel();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "All field needs to be filled out.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "This email address is already used.");
                }
                //cancel();
            } else {
                JOptionPane.showMessageDialog(null, "UserName already taken.");
            }
            //conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Thank You for Using Ebook Application.");
        cancel();
        
        //tabpannedAH AH = new tabpannedAH();
        //AH.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // TODO add your handling code here:

        String UserNameText = "";
        //String delim = ",";
        String PassWordText = "";
        UserNameText = this.UserNameTextField1.getText();
        PassWordText = this.UserPassTextField.getText();

        try {
            DbConnector dbc = new DbConnector();

            Connection conn = dbc.Connects();
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //conn = DriverManager.getConnection("jdbc:derby://localhost:1527/UsersRegistration", "java", "java");
            Statement User_Stmt = conn.createStatement();
            String User_query = "Select * from UserInfo";
            ResultSet User_result = User_Stmt.executeQuery(User_query);
            boolean checkmatch = false;
            boolean SuperUserType = false;
            boolean UserType = false;

            String usernametogui = "";
            String firstNametogui = "";
            if (!UserNameText.isEmpty() && !PassWordText.isEmpty()) {
                while (User_result.next()) {
                    String UN = User_result.getString("userName");
                    String PW = User_result.getString("password");

                    if (UN.equalsIgnoreCase(UserNameText) && PW.equals(PassWordText)) {
                        checkmatch = true;
                        usernametogui = User_result.getString("userName");
                        
                        firstNametogui = User_result.getString("firstName");
                        SuperUserType = User_result.getBoolean("is_SU");
                    }

                }

                if (checkmatch) {
                    if (SuperUserType) {
                        //JOptionPane.showMessageDialog(null, "You are logged in as  Super user.");
                        cancel();
                        //RegUserPage rup = new RegUserPage("SuperUser", usernametogui);
                        tabpannedUserPage rup = new tabpannedUserPage("SuperUser", firstNametogui, usernametogui);
                        rup.setVisible(true);
                    } else if (!SuperUserType) {
                        //JOptionPane.showMessageDialog(null, "You are logged in as registered user.");
                        cancel();
                        //RegUserPage rup = new RegUserPage("Register User", usernametogui);
                        tabpannedUserPage rup = new tabpannedUserPage("User", firstNametogui, usernametogui);
                        rup.setVisible(true);
                    } else {
                        cancel();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid creditials, Try again.");
                    this.UserNameTextField.setText("");
                    this.UserPassTextField.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "All fields are required");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_SignInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(tabpannedAH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabpannedAH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabpannedAH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabpannedAH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabpannedAH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton SignInButton;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JTextField UserNameTextField1;
    private javax.swing.JPasswordField UserPassTextField;
    private javax.swing.ButtonGroup UserTypeRadioButton;
    private javax.swing.JButton VisitorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public void cancel() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

}
