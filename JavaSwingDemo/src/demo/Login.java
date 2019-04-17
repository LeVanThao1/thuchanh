/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author BINHPA-PC
 */
public class Login extends JFrame{
    public Login(){
        initComponents();
    }

    private void initComponents() {
        pnl = new JPanel(new GridLayout(3, 2,10,10));
        lblUserName = new JLabel("UserName:",JLabel.CENTER);
        lblPassword = new JLabel("Password:",JLabel.CENTER);
        lblMessage = new JLabel();
        txtUserName = new JTextField();
        txtPassword = new JPasswordField();
        btnLogin = new JButton("Login");
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnLoginActionPerformed(e);
            }
        });
        
        pnl.add(lblUserName);
        pnl.add(txtUserName);
        pnl.add(lblPassword);
        pnl.add(txtPassword);
        pnl.add(lblMessage);
        pnl.add(btnLogin);
        
        add(pnl,BorderLayout.CENTER);
        setTitle("Login");
        setSize(400, 200);
    }
    
    private void btnLoginActionPerformed(ActionEvent e) {
        String userName = txtUserName.getText();
        String password = new String(txtPassword.getPassword());
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            lblMessage.setText(" Chào:  " + userName
                    + "");
        } else {
            lblMessage.setText(" Sai rồi.haha. ");
        }
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Khai báo các biến
    private JPanel pnl;
    private JLabel lblUserName,lblPassword,lblMessage;
    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JButton btnLogin;
}
