/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author soaka
 */
public class StartUI extends javax.swing.JFrame {

    /**
     * Creates new form FirstPageUI
     */
    public StartUI() {
        initComponents();
//        w.setIcon(new ImageIcon("src/utils/logo.png"));
//        jLabel1.setIcon(new ImageIcon("src/utils/administrative_tools_64px.png"));
//        jLabel3.setIcon(new ImageIcon("src/utils/next_100px.png"));
        StartManager sm=new StartManager();
        animate();
//        JLabel dailyQuote=new JLabel();
//        dailyQuote.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
//        dailyQuote.setVerticalTextPosition((int) CENTER_ALIGNMENT);
//        dailyQuote.setHorizontalAlignment((int) CENTER_ALIGNMENT);
//        dailyQuote.setVerticalAlignment((int) CENTER_ALIGNMENT);
//        dailyQuote.setBounds(0, 200,900 ,50);
//        dailyQuote.setFont(new Font("Leelawadi UI",0,20));
//        JTextArea ta=new JTextArea();
//        ta.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
//        ta.setVerticalTextPosition((int) CENTER_ALIGNMENT);
//        ta.setHorizontalAlignment((int) CENTER_ALIGNMENT);
//        ta.setVerticalAlignment((int) CENTER_ALIGNMENT);
//        ta.setBounds(0, 200,900 ,50);
//        ta.setFont(new Font("Leelawadi UI",0,20));
        
//        dailyQuote.setOpaque(true);
//        dailyQuote.setBackground(Color.red);
        jTextArea1.setText(sm.generateRandomString());
        jPanel2.add(jScrollPane1);
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel3);
//         SimpleAttributeSet attrs=new SimpleAttributeSet();
//            StyleConstants.setAlignment(attrs,StyleConstants.ALIGN_CENTER);
//            StyledDocument doc=(StyledDocument)jTextPane1.getDocument();
//            doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
//            jTextPane1.setBackground(new Color(176,221,194));
        jLabel1.setBounds(600, 300, 100, 100);
        jLabel3.setBounds(200, 300, 100, 100);
    }
    public void animate(){
        AnimationClass ac=new AnimationClass();
        ac.jLabelYUp(w.getY(),-1000, 15, 1, w);
        ac.jLabelYDown(d.getY(), 1000, 15, 1, d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        w = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(176, 221, 194));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 590));

        w.setBackground(new java.awt.Color(40, 153, 160));
        w.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        w.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/logo_full.png"))); // NOI18N
        w.setText("BeHappy");
        w.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        w.setOpaque(true);
        w.setPreferredSize(new java.awt.Dimension(200, 150));
        w.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        d.setBackground(new java.awt.Color(147, 205, 186));
        d.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText("WELCOME");
        d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(w, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 600);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/administrative_tools_64px.png"))); // NOI18N
        jLabel1.setToolTipText("continue to admin login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 64, 64);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/next_100px.png"))); // NOI18N
        jLabel3.setToolTipText("contniue to next screen");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 100, 100);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 33, 13);

        jScrollPane1.setBackground(new java.awt.Color(176, 221, 194));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(176, 221, 194));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 17, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daily Quote", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI", 0, 24), new java.awt.Color(0, 88, 81))); // NOI18N
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 100, 700, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        new login().setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
        new MainMenuUI().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(StartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables
}
