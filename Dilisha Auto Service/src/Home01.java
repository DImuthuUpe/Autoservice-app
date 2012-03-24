

import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.*;
import newpackage.DB;
import newpackage.Handle;


/**
 *
 * @author  Hansa
 */
public class Home01 extends javax.swing.JFrame {
    
    /** Creates new form Home01 */
    
    Date d;
    SimpleDateFormat sd1;
    SimpleDateFormat sd2;
    SimpleDateFormat sd3;
    SimpleDateFormat sd4;
    SimpleDateFormat sd5;
    SimpleDateFormat sd6;
    SimpleDateFormat sd7;
    SimpleDateFormat sd8;
    String title = "Dilisha Auto Service - System                         ";
    int x = 0;
    int l = title.length();
    public Home01() {
        initComponents();
         setSize(1010,661);
         setLocationRelativeTo(null);
         sd1=new SimpleDateFormat("hh");
         sd2=new SimpleDateFormat(" a");
         sd3=new SimpleDateFormat("dd");
         sd4=new SimpleDateFormat("MMMM yyyy");
         sd5=new SimpleDateFormat("yyyy MMMM dd");
         sd6=new SimpleDateFormat("hh:mm:ss a");
         sd7=new SimpleDateFormat("EEEE");
         sd8=new SimpleDateFormat("mm:ss");
         Timer t=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                String sss = "                                                                                                          Dilisha Auto Service - Meetiyagoda                                                                                                         " ;
                d =new Date();
                jLabel4.setText(sd1.format(d));
                jLabel5.setText(sd2.format(d));
                jLabel7.setText(sd3.format(d));
                jLabel8.setText(sd4.format(d));
                jLabel9.setText(sd7.format(d));
                jLabel15.setText(sd8.format(d));
                jProgressBar2.setStringPainted(true);
                jProgressBar2.setString(sd5.format(d) + sss+ ""+sd6.format(d));
            }
        
        });
        t.start();
        
        t = new Timer(50, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setTitle(title.substring(0, x + 1));
                x++;
                if (x == l) {
                    x = 0;
                }

            }
        });
        t.start();
        
        reginfo();
        
    }
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbcheckstock = new javax.swing.JButton();
        jbfreeservice = new javax.swing.JButton();
        jbsearchvehicles = new javax.swing.JButton();
        jbserventdetails = new javax.swing.JButton();
        jbacounts = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmhelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiabtus = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dilisha Auto Service - System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(1010, 630));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbcheckstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkstock.png"))); // NOI18N
        jbcheckstock.setText("   Stock");
        jbcheckstock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbcheckstock.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbcheckstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcheckstockActionPerformed(evt);
            }
        });
        getContentPane().add(jbcheckstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 60));

        jbfreeservice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free.png"))); // NOI18N
        jbfreeservice.setText("   Services");
        jbfreeservice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbfreeservice.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbfreeservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfreeserviceActionPerformed(evt);
            }
        });
        getContentPane().add(jbfreeservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 60));

        jbsearchvehicles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicle.png"))); // NOI18N
        jbsearchvehicles.setText("   Search Vehicle");
        jbsearchvehicles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbsearchvehicles.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbsearchvehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsearchvehiclesActionPerformed(evt);
            }
        });
        getContentPane().add(jbsearchvehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 60));

        jbserventdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serventdetails.png"))); // NOI18N
        jbserventdetails.setText("Employee Details");
        jbserventdetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbserventdetails.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbserventdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbserventdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(jbserventdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 60));

        jbacounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ateendance.png"))); // NOI18N
        jbacounts.setText("   Attendance");
        jbacounts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbacounts.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbacounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbacountsActionPerformed(evt);
            }
        });
        getContentPane().add(jbacounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Monsieur_Security_v2_2.png"))); // NOI18N
        jButton1.setText("  Add Customer");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, 60));

        jButton2.setFont(new java.awt.Font("Arial", 1, 24));
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/docked-loading.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 130, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 440));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 440));

        jProgressBar2.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBar2.setIndeterminate(true);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1010, 30));

        jLabel14.setText("Hours");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 130, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Minutes");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 60, -1));

        jLabel15.setFont(new java.awt.Font("Digital", 0, 64));
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("88:88");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 160, 60));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Seconds");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 60, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 80));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 120, 80));

        jLabel4.setFont(new java.awt.Font("Digital", 1, 120));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("88");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 160, 80));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 130, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20));
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 60, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar_single_orange.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 150, 170));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 2, true), "Product Registered To :-"));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mr.");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel10.setText("Hansa Madusanka Amarasekara.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setText("0712004212");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setText("0915050586");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel13.setText("0712413767");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 640, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservice.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aqua apple.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, -1, 740));

        jMenu1.setText("File");

        jmiexit.setText("Exit");
        jmiexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiexitActionPerformed(evt);
            }
        });
        jMenu1.add(jmiexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setText("Theme");

        jMenuItem2.setText("Theme1");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Theme2");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Theme3");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Theme4");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jmhelp.setText("Help");

        jMenuItem1.setText("Registration Info");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmhelp.add(jMenuItem1);

        jmiabtus.setText("About Us");
        jmiabtus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiabtusActionPerformed(evt);
            }
        });
        jmhelp.add(jmiabtus);

        jMenuBar1.add(jmhelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsearchvehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsearchvehiclesActionPerformed
        SV01 sv01;
        sv01 = new SV01();
        sv01.setVisible(true);
        
}//GEN-LAST:event_jbsearchvehiclesActionPerformed

    private void jbserventdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbserventdetailsActionPerformed
        SD01 sd01;
        sd01 = new SD01();
        sd01.setVisible(true);
        
}//GEN-LAST:event_jbserventdetailsActionPerformed

    private void jbfreeserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfreeserviceActionPerformed
        Service ser = new Service();
        ser.setVisible(true);
    }//GEN-LAST:event_jbfreeserviceActionPerformed

    private void jbacountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbacountsActionPerformed
        F2 f2 =new F2();
        f2.setVisible(true);
    }//GEN-LAST:event_jbacountsActionPerformed

    private void jbcheckstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcheckstockActionPerformed
       CheckStock02 checkstore;
       checkstore = new CheckStock02();
       checkstore.setVisible(true);
    }//GEN-LAST:event_jbcheckstockActionPerformed

    private void jmiabtusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiabtusActionPerformed
       AboutUs aboutus;
       aboutus = new AboutUs();
       aboutus.setVisible(true);
    }//GEN-LAST:event_jmiabtusActionPerformed

    private void jmiexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiexitActionPerformed
       int y = JOptionPane.showConfirmDialog(this, "Are you sure want to exit ?", "Exit ?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
       if(y==0){
            System.exit(0);
       }
       
    }//GEN-LAST:event_jmiexitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            customer cust = new customer();
            cust.setVisible(true);//GEN-LAST:event_jButton1ActionPerformed
} catch (ClassNotFoundException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
             reginfo info = new reginfo(this);
             info.setVisible(true);
            }//GEN-LAST:event_jMenuItem1ActionPerformed

            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
            }//GEN-LAST:event_jButton2ActionPerformed

            private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());//GEN-LAST:event_jMenuItem2ActionPerformed
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        setVisible(true);
            }

            private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
  try {
            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        setVisible(true);                // TODO add your handling code here:
            }//GEN-LAST:event_jMenuItem3ActionPerformed

            private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
  try {
            UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        setVisible(true);                // TODO add your handling code here:
            }//GEN-LAST:event_jMenuItem4ActionPerformed

            private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
  try {
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        setVisible(true);                // TODO add your handling code here:
            }//GEN-LAST:event_jMenuItem5ActionPerformed
      /*/                                          
    
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
                } catch (ParseException ex) {
                    Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
                } 
                new Home01().setVisible(true);
                
            }   
        });
    }
    
    
    public void reginfo(){
        try {
            ResultSet rst = Handle.getData(DB.connect(), "select * from reginfo");
            Connection con = DB.connect();
            while (rst.next()) {
                jLabel3.setText(rst.getString(1));
                jLabel10.setText(rst.getString(2));
                jLabel11.setText(rst.getString(3));
                jLabel12.setText(rst.getString(4));
                jLabel13.setText(rst.getString(5));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbacounts;
    private javax.swing.JButton jbcheckstock;
    private javax.swing.JButton jbfreeservice;
    private javax.swing.JButton jbsearchvehicles;
    private javax.swing.JButton jbserventdetails;
    private javax.swing.JMenu jmhelp;
    private javax.swing.JMenuItem jmiabtus;
    private javax.swing.JMenuItem jmiexit;
    // End of variables declaration//GEN-END:variables
    
}