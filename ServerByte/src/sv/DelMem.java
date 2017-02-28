/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tien
 */
public class DelMem extends javax.swing.JFrame {

    /**
     * Creates new form DelMem
     */
    String nameTb;
Get get= new Get();
    public DelMem(String name_tb) {
        nameTb = name_tb;
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         String url = System.getProperty("user.dir", null);
            String urlIcon;
            urlIcon = url + "\\icon\\46.png";
            btDel.setIcon(new javax.swing.ImageIcon(urlIcon));
            btDel.setBackground(new Color(255, 204, 255));
            getContentPane().setBackground(new Color(153, 235, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên đăng nhập :");

        btDel.setText("Xóa");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btDel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btDel)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        del();
    }//GEN-LAST:event_btDelActionPerformed

    public void del() {
        if (tfName.getText().equals("") == false) {
            Server server = new Server();

            if (server.get.delUser(nameTb, tfName.getText()) != 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                tfName.setText("");
                tfName.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Không thành công!");
                tfName.setText("");
                tfName.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ!");
            tfName.setText("");
            tfName.requestFocus();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
