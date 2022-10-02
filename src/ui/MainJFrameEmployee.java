/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author darshit
 */
public class MainJFrameEmployee extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameEmployee
     */
    String gender;
    String imgPath;
    DefaultTableModel model;
    
    public MainJFrameEmployee() {
        initComponents();
        model = (DefaultTableModel)tblempRecords.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnGender = new javax.swing.ButtonGroup();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        javax.swing.JLabel lblName = new javax.swing.JLabel();
        javax.swing.JLabel lblEmpId = new javax.swing.JLabel();
        javax.swing.JLabel lblGender = new javax.swing.JLabel();
        javax.swing.JLabel lblAge = new javax.swing.JLabel();
        javax.swing.JLabel lblStartDate = new javax.swing.JLabel();
        javax.swing.JLabel lblLevel = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        javax.swing.JLabel lblTeamInfo = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        txtContact = new javax.swing.JTextField();
        rbtnOther = new javax.swing.JRadioButton();
        javax.swing.JButton btnCreate = new javax.swing.JButton();
        txtEmailId = new javax.swing.JTextField();
        btnImage = new javax.swing.JButton();
        starrtDate = new com.toedter.calendar.JDateChooser();
        javax.swing.JLabel lblContactNum = new javax.swing.JLabel();
        javax.swing.JLabel lblPosTitle = new javax.swing.JLabel();
        javax.swing.JLabel lblEmailId = new javax.swing.JLabel();
        javax.swing.JLabel lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        javax.swing.JLabel lblTitle = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tblempRecords = new javax.swing.JTable();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        javax.swing.JButton btnUpdate = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblName.setForeground(new java.awt.Color(0, 0, 204));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblEmpId.setForeground(new java.awt.Color(0, 0, 204));
        lblEmpId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpId.setText("Employee ID:");

        lblGender.setForeground(new java.awt.Color(0, 0, 204));
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblAge.setForeground(new java.awt.Color(0, 0, 204));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblStartDate.setForeground(new java.awt.Color(0, 0, 204));
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate.setText("Start Date:");

        lblLevel.setForeground(new java.awt.Color(0, 0, 204));
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level:");

        rbtnGender.add(rbtnMale);
        rbtnMale.setForeground(new java.awt.Color(0, 51, 204));
        rbtnMale.setText("Male");

        lblTeamInfo.setForeground(new java.awt.Color(0, 0, 204));
        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo.setText("Team Info:");

        rbtnGender.add(rbtnFemale);
        rbtnFemale.setForeground(new java.awt.Color(0, 51, 204));
        rbtnFemale.setText("Female");

        rbtnGender.add(rbtnOther);
        rbtnOther.setForeground(new java.awt.Color(0, 51, 204));
        rbtnOther.setText("Other");

        btnCreate.setForeground(new java.awt.Color(0, 51, 204));
        btnCreate.setText("Create Record");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnImage.setForeground(new java.awt.Color(0, 0, 204));
        btnImage.setText("Upload Image");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        lblContactNum.setForeground(new java.awt.Color(0, 0, 204));
        lblContactNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNum.setText("Phone:");

        lblPosTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblPosTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosTitle.setText("PositionTitle:");

        lblEmailId.setForeground(new java.awt.Color(0, 0, 204));
        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailId.setText("Email ID:");

        lblPhoto.setForeground(new java.awt.Color(0, 0, 204));
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoto.setText("Photo:");

        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTitle.setBackground(new java.awt.Color(102, 153, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 0, 204));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("EMPLOYEE DATABASE");
        lblTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        tblempRecords.setAutoCreateRowSorter(true);
        tblempRecords.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        tblempRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Emp ID", "Age", "Gender", "StartDate", "Level", "TeamInfo", "Position Title", "Phone", "Email ID", "Photo"
            }
        ));
        tblempRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblempRecordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblempRecords);

        btnDelete.setForeground(new java.awt.Color(0, 0, 204));
        btnDelete.setText("Delete Employee Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setForeground(new java.awt.Color(0, 0, 204));
        btnUpdate.setText("Update Employee Record");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblSearch.setText("Search Employee Record:");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmailId)
                                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmailId)
                                    .addComponent(txtContact)
                                    .addComponent(txtPositionTitle)
                                    .addComponent(txtTeamInfo)
                                    .addComponent(txtLevel)
                                    .addComponent(starrtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAge)
                                    .addComponent(txtEmpID)
                                    .addComponent(txtName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnOther))
                                    .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSearch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete))
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblContactNum, lblEmailId, lblEmpId, lblGender, lblLevel, lblName, lblPhoto, lblPosTitle, lblStartDate, lblTeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpId)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbtnMale)
                                .addComponent(rbtnFemale)
                                .addComponent(rbtnOther))
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartDate)
                            .addComponent(starrtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContactNum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTeamInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPosTitle)
                                        .addGap(34, 34, 34)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmailId))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUpdate)
                                    .addComponent(lblSearch)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoto)
                            .addComponent(btnImage)))
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreate, btnImage, lblAge, lblContactNum, lblEmailId, lblEmpId, lblGender, lblLevel, lblName, lblPhoto, lblPosTitle, lblStartDate, lblTeamInfo, rbtnFemale, rbtnMale, rbtnOther, starrtDate, txtAge, txtContact, txtEmailId, txtEmpID, txtLevel, txtName, txtPositionTitle, txtTeamInfo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        if(rbtnMale.isSelected()==true)
        {
            gender = "Male";
        }
        if(rbtnFemale.isSelected()==true)
        {
            gender = "Female";
        }
        if(rbtnOther.isSelected()==true)
        {
            gender = "Others";
        }
        
        JLabel imgg = new JLabel();
        ImageIcon icon = new ImageIcon(imgPath);
        imgg.setIcon(icon);
        
        String name= txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        int empId = Integer.parseInt(txtEmpID.getText());
        String emailId = txtEmailId.getText();
        String level= txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String position = txtPositionTitle.getText();
        long phone = Long.parseLong(txtContact.getText());
        SimpleDateFormat sDate = new SimpleDateFormat("YYYY-MM-dd");
        String startDate = String.valueOf(sDate.format(starrtDate.getDate()));
        
        if(!(emailId.contains("@"))||!((emailId.endsWith(".com")) ||(emailId.endsWith(".edu")))||name.isBlank()||level.isBlank()||teamInfo.isBlank()||position.isBlank()||startDate.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Please enter all fields");
        }
        else
        {
        
            model = (DefaultTableModel) tblempRecords.getModel();
            model.addRow(new Object[]{name, empId, age, gender, startDate, level, teamInfo,position, phone, emailId,icon});

            JOptionPane.showMessageDialog(this, "Employee Record Saved..!!");

            txtName.setText("");
            txtAge.setText("");
            txtEmailId.setText("");
            txtEmpID.setText("");
            txtLevel.setText("");
            txtContact.setText("");
            txtTeamInfo.setText("");
            txtPositionTitle.setText("");
            lblImage.setIcon(null);
            rbtnGender.clearSelection();
        } 
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImgFile = new JFileChooser();
         
        int showOpenDialog = browseImgFile.showOpenDialog(null);
        if (showOpenDialog == JFileChooser.APPROVE_OPTION)
        {
            File selectFileImg = browseImgFile.getSelectedFile();
            imgPath = selectFileImg.getAbsolutePath();
            JOptionPane.showMessageDialog(null, imgPath);
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectRow = tblempRecords.getSelectedRow();
        if (selectRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a Row to delete record");
        }
        model = (DefaultTableModel) tblempRecords.getModel();
        model.removeRow(tblempRecords.getSelectedRow());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tblempRecords.getModel();
        if( tblempRecords.getSelectedRowCount() == 1)
        {
            String name= txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            int empId = Integer.parseInt(txtEmpID.getText());
            if(rbtnMale.isSelected()==true)
            {
                gender = "Male";
            }
            if(rbtnFemale.isSelected()==true)
            {
                gender = "Female";
            }
            if(rbtnOther.isSelected()==true)
            {
                gender = "Others";
            }
            String emailId = txtEmailId.getText();
            String level= txtLevel.getText();
            String teamInfo = txtTeamInfo.getText();
            String position = txtPositionTitle.getText();
            long phone = Long.parseLong(txtContact.getText());
            SimpleDateFormat sDate = new SimpleDateFormat("YYYY-MM-dd");
            String startDate = String.valueOf(sDate.format(starrtDate.getDate()));
       
            model.setValueAt (name, tblempRecords.getSelectedRow(), 0);
            model.setValueAt (empId, tblempRecords.getSelectedRow(), 1);
            model.setValueAt (age, tblempRecords.getSelectedRow(), 2);
            model.setValueAt (gender, tblempRecords.getSelectedRow(), 3);
            model.setValueAt (startDate, tblempRecords.getSelectedRow(), 4);
            model.setValueAt (level, tblempRecords.getSelectedRow(), 5);
            model.setValueAt (teamInfo, tblempRecords.getSelectedRow(), 6);
            model.setValueAt (position, tblempRecords.getSelectedRow(), 7);
            model.setValueAt (phone, tblempRecords.getSelectedRow(), 8);
            model.setValueAt (emailId, tblempRecords.getSelectedRow(), 9);
        
            JFileChooser browseImgFile = new JFileChooser();
            FileNameExtensionFilter filename = new FileNameExtensionFilter("IMAGES", "png","jpeg","jpg");
            browseImgFile.addChoosableFileFilter(filename);

            JLabel imgg = new JLabel();
            ImageIcon icon = new ImageIcon(imgPath);
            imgg.setIcon(icon);
            
            model.setValueAt(icon, tblempRecords.getSelectedRow(), 10);
            
            JOptionPane.showMessageDialog(this, "Employee Record Updated..!!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblempRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblempRecordsMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tblempRecords.getModel();
        int i = tblempRecords.getSelectedRow();
        txtName.setText(model.getValueAt(i, 0).toString());
        txtEmpID.setText(model.getValueAt(i, 1).toString());
        txtAge.setText(model.getValueAt(i, 2).toString());

        if("Male".equals(model.getValueAt(i, 3)))
            {
                    rbtnMale.setSelected(true);
            }
        else if("Female".equals(model.getValueAt(i, 3)))
            {
                rbtnFemale.setSelected(true);
            }
        else
            {
                rbtnOther.setSelected(true);
            }
        
        txtLevel.setText(model.getValueAt(i, 5).toString());
        txtTeamInfo.setText(model.getValueAt(i, 6).toString());
        txtPositionTitle.setText(model.getValueAt(i, 7).toString());
        txtContact.setText(model.getValueAt(i, 8).toString());
        txtEmailId.setText(model.getValueAt(i, 9).toString());
        
        imgPath = model.getValueAt(i, 10).toString();
        ImageIcon icon = new ImageIcon(imgPath);
       
        Image img = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),Image.SCALE_SMOOTH);
        lblImage.setIcon(new ImageIcon(img));
        
    }//GEN-LAST:event_tblempRecordsMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblempRecords.getModel();
        Vector<Vector> empdata = model.getDataVector();
        
        try
        {
            FileOutputStream empfile = new FileOutputStream("empfile.bin");
            ObjectOutputStream output = new ObjectOutputStream(empfile);
            
            output.writeObject(empdata);
            
            output.close();
            empfile.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try
        {
            FileInputStream empfile = new FileInputStream("empfile.bin");
            ObjectInputStream input = new ObjectInputStream(empfile);
            
            Vector<Vector> empdata = (Vector<Vector>)input.readObject();
            
            input.close();
            empfile.close();
            
            DefaultTableModel model = (DefaultTableModel) tblempRecords.getModel();
            for(int i=0; i<empdata.size();i++)
            {
                Vector row = empdata.get(i);
                model.addRow(new Object[]{row.get(0),row.get(1),row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8),row.get(9),row.get(10)});
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tblempRecords.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(model);
        tblempRecords.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.ButtonGroup rbtnGender;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnOther;
    private com.toedter.calendar.JDateChooser starrtDate;
    private javax.swing.JTable tblempRecords;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
