
import java.sql.Connection;

/*
 * All.java
 *
 * Created on February 12, 2010, 10:03 PM
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import newpackage.DB;
import newpackage.Handle;



/**
 *
 * @author  Menik
 */
public class SD01 extends javax.swing.JFrame {
    
    /** Creates new form All */
    public SD01() {
        initComponents();
        setSize(828, 375);
        setLocationRelativeTo(null);
        
        refresh1();
        jTable1.setSelectionMode(0);
        JOptionPane.showInputDialog(this,"ccc","cccslsl", JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Details");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Employee Date of Birth", "Employee NIC", "Employee First Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 260));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_user.png"))); // NOI18N
        jButton1.setText("  Create New Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 283, 200, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove_user.png"))); // NOI18N
        jButton3.setText("   Remove User");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 330));

        jLabel1.setText("Servent ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 366, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 366, -1));

        jLabel2.setText("Servent Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel3.setText("Date of Birth");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1970, 1970, 2010, 1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 37, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 40, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 366, -1));

        jLabel5.setText("First Day");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel4.setText("NIC Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_user.png"))); // NOI18N
        jButton2.setText("Add New Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 180, 50));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2015, 1));
        getContentPane().add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 37, -1));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 40, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 810, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 40, 20));

        jLabel7.setText("Year");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        jLabel8.setText("Month");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jLabel9.setText("Day");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jLabel10.setText("Year");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        jLabel11.setText("Month");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        jLabel12.setText("Day");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_cancel.png"))); // NOI18N
        jButton4.setText("  Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().equals("")){
            
            JOptionPane.showConfirmDialog(this,"Employee ID Cannot Be Empty", "Employee ID Required",JOptionPane.OK_OPTION,2);
        }else{
            addServent();
            setSize(828, 375);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            setLocationRelativeTo(null);
            jButton1.setEnabled(true);
        }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int y = JOptionPane.showConfirmDialog(this,"Are You Sure Want To Delete Selected Employee","Confirm to Delete",JOptionPane.YES_NO_OPTION);
        if(y==0){
            removeServent();
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setSize(834,580);
        jButton1.setEnabled(false);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            setSize(828, 375);
            setLocationRelativeTo(null);
            jButton1.setEnabled(true);      
    }//GEN-LAST:event_jButton4ActionPerformed
   
    void refresh1(){
        try {
            ResultSet rst=Handle.getData(DB.connect(), "select * from servent");
            Connection con=DB.connect();
            
            DefaultTableModel dt4 = (DefaultTableModel) jTable1.getModel();

            int rw = dt4.getRowCount();
            for (int i = 0; i < rw; i++) {
                dt4.removeRow(0);
            }

            while (rst.next()) {
                Object[] ob = {rst.getString(1),  rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)};
                dt4.addRow(ob);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SD01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SD01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void addServent(){
        try{

            
        String s[] ={jTextField1.getText(),jTextField2.getText(),jSpinner1.getValue()+"-"+jSpinner2.getValue()+"-"+jSpinner3.getValue(),jTextField4.getText(),jSpinner4.getValue()+"-"+jSpinner5.getValue()+"-"+jSpinner6.getValue()};    
        Handle.setData(DB.connect(), "insert into servent(serventid,serventname,serventdob,serventnic,serventfirstday) values('"+s[0]+"' , '"+s[1]+"' , '"+s[2]+"','"+s[3]+"' , '"+ s[4]+ " ')");
        Connection con=DB.connect();

        refresh1();
        }catch(Exception e){
           JOptionPane.showConfirmDialog(this,"Incorrect Data Input. Please Check Ur Entered Data Correction", "Error from Entered Data",JOptionPane.OK_OPTION,2);
        }
         
    }
    
    void removeServent(){
        try{ 
        
            String id = jTable1.getValueAt(jTable1.getSelectedRow(),0)+"";
            Handle.setData(DB.connect(),"delete from servent where serventid = '"+ id + "' " );
            Connection con=DB.connect();
            
            refresh1();
            }catch(Exception e){
                 JOptionPane.showConfirmDialog(this,"You Have Missed Something. Select a Row for Delete", "Error When Try To Remove",JOptionPane.OK_OPTION,2);
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SD01().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    
}
