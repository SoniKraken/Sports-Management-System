/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports_Project;

/**
 *
 * @author user
 */
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sports_System extends javax.swing.JFrame {

    /**
     * Creates new form Sports_System
     */
    public Sports_System() {
        this.setResizable(false);
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize=947;
                int ysize=707;
                this.setSize(xsize,ysize);
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("     HOME WINDOW");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(108, 122, 137));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("SPORTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(355, 177, 285, 73);

        jButton2.setBackground(new java.awt.Color(108, 122, 137));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("INFRASTRUCTURE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(17, 545, 311, 67);

        jButton3.setBackground(new java.awt.Color(108, 122, 137));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("STAFF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(668, 181, 245, 65);

        jButton4.setBackground(new java.awt.Color(108, 122, 137));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("PLAYERS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(668, 355, 245, 73);

        jButton5.setBackground(new java.awt.Color(108, 122, 137));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("SPONSORS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(355, 355, 285, 73);

        jButton6.setBackground(new java.awt.Color(108, 122, 137));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("PRIZES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(355, 542, 285, 73);

        jButton7.setBackground(new java.awt.Color(108, 122, 137));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("LOGOUT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(799, 105, 114, 31);

        jButton10.setBackground(new java.awt.Color(108, 122, 137));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("PLAYER REGISTRATION");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(17, 178, 311, 76);

        jButton11.setBackground(new java.awt.Color(108, 122, 137));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("REVIEW");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(668, 542, 245, 73);

        jButton12.setBackground(new java.awt.Color(108, 122, 137));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("TOURNAMENT REGISTRATION");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(20, 360, 307, 73);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("      HYDRA SPORTS ACADEMY");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(5, 5, 920, 92);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Project images\\93.jpeg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 910, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Infrastructure ifr=new Infrastructure();
    ifr.setVisible(true);
    ifr.pack();
    ifr.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=984;
             int ysize=943;
             ifr.setSize(xsize,ysize);
    ifr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Sports sp=new Sports();
    sp.setVisible(true);
    sp.pack();
    sp.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize=939;
                int ysize=816;
                sp.setSize(xsize,ysize);
    sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Staff sf=new Staff();
    sf.setVisible(true);
    sf.pack();
    sf.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=1076;
             int ysize=853;
             sf.setSize(xsize,ysize);
    sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Players py=new Players();
    py.setVisible(true);
    py.pack();
    py.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=1040;
             int ysize=776;
             py.setSize(xsize,ysize);
    py.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    Sponsors sp=new Sponsors();
    sp.setVisible(true);
    sp.pack();
    sp.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
              int xsize=1650;
             int ysize=956;
             sp.setSize(xsize,ysize);
    sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Prizes pr=new Prizes();
    pr.setVisible(true);
    pr.pack();
    pr.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=1003;
             int ysize=830;
             pr.setSize(xsize,ysize);
    pr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    Player_Registration nt=new Player_Registration();
    nt.setVisible(true);
    nt.pack();
    nt.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=1412;
             int ysize=940;
             nt.setSize(xsize,ysize);
    nt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    Competition_Registration AP=new Competition_Registration();
    AP.setVisible(true);
    AP.pack();
    AP.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=1247;
             int ysize=798;
             AP.setSize(xsize,ysize);
    AP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    Review rv=new Review();
    rv.setVisible(true);
    rv.pack();
    rv.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize=1130;
                int ysize=825;
                rv.setSize(xsize,ysize);
    rv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    Login_page rgf=new Login_page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=910;
        int ysize=715;
        rgf.setSize(xsize,ysize);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Sports_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sports_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sports_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sports_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sports_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
