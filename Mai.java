
package start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static start.ShowLogsTable.buildTableModel;


public class Mai extends javax.swing.JFrame {

    
    public Mai() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logbtn = new javax.swing.JLabel();
        usrbtn = new javax.swing.JLabel();
        Aboutbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logbtnMouseReleased(evt);
            }
        });
        getContentPane().add(logbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 150, 170));

        usrbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrbtnMouseReleased(evt);
            }
        });
        getContentPane().add(usrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 140, 150));

        Aboutbtn.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Aboutbtn.setForeground(new java.awt.Color(0, 0, 255));
        Aboutbtn.setText("About Us:");
        Aboutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aboutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AboutbtnMouseReleased(evt);
            }
        });
        getContentPane().add(Aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 160, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        jLabel1.setToolTipText("SIGN UP HERE");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 200, 30));

        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reg.jpg"))); // NOI18N
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RegisterMouseReleased(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 80, 120));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Log out");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 120, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sniffer out.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 760));

        setSize(new java.awt.Dimension(899, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usrbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrbtnMouseReleased
       frm_updatePassword cp = new frm_updatePassword();
            this.setVisible(false);
            cp.setVisible(true);
    }//GEN-LAST:event_usrbtnMouseReleased

    private void logbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbtnMouseReleased
        try {
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/camcapturedb","root","");
        PreparedStatement pre1 = con1.prepareStatement("select * from tbl_logs");
        ResultSet rs1;
        rs1 = pre1.executeQuery();
        JTable table = new JTable(buildTableModel(rs1));
       // Closes the Connection

    JOptionPane.showMessageDialog(null, new JScrollPane(table));
         } catch (SQLException ex) {
            Logger.getLogger(ShowLogsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logbtnMouseReleased

    private void AboutbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutbtnMouseReleased
       AboutPage ab = new AboutPage();
        
        ab.setVisible(true);
    }//GEN-LAST:event_AboutbtnMouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
         
    }//GEN-LAST:event_jLabel1MouseReleased

    private void RegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseReleased
               frm_registration cp = new frm_registration();
               this.setVisible(false);
               cp.setVisible(true);     
    }//GEN-LAST:event_RegisterMouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        start st = new start();
        this.setVisible(false);
        st.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseReleased
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aboutbtn;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logbtn;
    private javax.swing.JLabel usrbtn;
    // End of variables declaration//GEN-END:variables
}
