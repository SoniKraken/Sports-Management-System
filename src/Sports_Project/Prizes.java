/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports_Project;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Prizes extends javax.swing.JFrame {
        DefaultTableModel dtm5 = new DefaultTableModel();
    
    /**
     * Creates new form Prizes
     */
    public Prizes() {
        this.setResizable(false);
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=1003;
             int ysize=830;
             this.setSize(xsize,ysize);
        
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/my_connection?zeroDateTimeBehavior=convertToNull","root","");
            String query="select * from prizes";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            dtm5.addColumn("Date");
            dtm5.addColumn("Title");
            dtm5.addColumn("Player/Team_id");
            dtm5.addColumn("Player/Team_Name");
            dtm5.addColumn("Sports_Name");
            dtm5.addColumn("Position");
            while(rs.next()){
                Object[] u1={rs.getString("Date"),rs.getString("Title"),rs.getString("Player/Team_id"),rs.getString("Player/Team_Name"),rs.getString("Sports_Name"),rs.getInt("Position")};
                dtm5.addRow(u1);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error"+ex); 
        }
             
             
             
        /**     
        jTable1.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTable1.setGridColor(Color.gray);
        jTable1.setForeground(Color.red);
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
            jTable1.setOpaque(false);
            ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
            jScrollPane1.getViewport().setOpaque(false);
         */   
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("     ACADEMY PRIZES");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("       HYDRA SPORTS ACADEMY");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(5, 5, 960, 92);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("  Acadmy PRIZES :-");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(5, 104, 584, 78);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(601, 117, 114, 31);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(774, 117, 111, 31);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(dtm5);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(103, 230, 782, 448);

        jButton10.setBackground(new java.awt.Color(255, 255, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("ADD / REMOVE / UPDATE PRIZES");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(295, 691, 372, 63);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Project images\\113.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 950, 750);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 970, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sports_System SS=new Sports_System();
        SS.setVisible(true);
        SS.pack();
        SS.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
            int xsize=947;
            int ysize=698;
            SS.setSize(xsize,ysize);
        SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login_page lp=new Login_page();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize=910;
                int ysize=715;
                lp.setSize(xsize,ysize);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        add_prizes ap=new add_prizes();
        ap.setVisible(true);
        ap.pack();
        ap.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize=900;
                int ysize=720;
                ap.setSize(xsize,ysize);
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Prizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prizes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}