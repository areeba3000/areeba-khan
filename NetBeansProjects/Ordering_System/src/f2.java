/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class f2 extends javax.swing.JFrame {

    /**
     * Creates new form f2
     */
    public f2() {
        initComponents();
         this.setLocationRelativeTo(null);
        add.setEnabled(false);
        remove.setEnabled(false);
        loadrecord(JTable2);
        loadrecord1(JTable3);
        pay.setEnabled(false);
      
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        JTable3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        pay = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        qnty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        JTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTable3);
        if (JTable3.getColumnModel().getColumnCount() > 0) {
            JTable3.getColumnModel().getColumn(0).setResizable(false);
            JTable3.getColumnModel().getColumn(1).setResizable(false);
            JTable3.getColumnModel().getColumn(2).setResizable(false);
            JTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(310, 70, 300, 200);

        JTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTable2);
        if (JTable2.getColumnModel().getColumnCount() > 0) {
            JTable2.getColumnModel().getColumn(0).setResizable(false);
            JTable2.getColumnModel().getColumn(1).setResizable(false);
            JTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 290, 220);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("CART");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 30, 80, 30);

        add.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        add.setText("Add To Cart");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(220, 300, 120, 80);

        pay.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        getContentPane().add(pay);
        pay.setBounds(500, 390, 90, 40);

        remove.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove);
        remove.setBounds(360, 390, 90, 40);

        jButton1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 90, 30);

        b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(b);
        b.setBounds(70, 371, 90, 20);

        a.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(a);
        a.setBounds(117, 333, 99, 31);

        qnty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qnty.setText("1");
        getContentPane().add(qnty);
        qnty.setBounds(80, 401, 80, 50);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ID :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 303, 23, 23);

        id1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        id1.setForeground(new java.awt.Color(240, 240, 240));
        id1.setText("0");
        getContentPane().add(id1);
        id1.setBounds(50, 303, 60, 23);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Quantity :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 411, 100, 27);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Price :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 371, 67, 27);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Product Name :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 333, 100, 27);
        getContentPane().add(id);
        id.setBounds(100, 303, 0, 0);

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("TOTAL :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 320, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 320, 89, 30);

        exit.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(550, 10, 65, 27);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\6666.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 620, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void loadrecord(JTable table)
    {
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://Localhost:3306/orderingsystem","root","");
            String sql= "select * from tbl2";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel();
           model.setRowCount(0);
           Object[] row;
           while (rs.next())
           {
           row= new Object[3];
           row[0]=rs.getInt(1);
            row[1]=rs.getString(2);
             row[2]=rs.getInt(3);
             model.addRow(row);
           }
           con.close();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
public void loadrecord1(JTable table)
    {
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://Localhost:3306/orderingsystem","root","");
            String sql= "select * from tbl3";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel();
           model.setRowCount(0);
           Object[] row;
         int total = 0;  
           while (rs.next())
           {
           row= new Object[4];
           row[0]=rs.getInt(1);
            row[1]=rs.getString(2);
              row[2]=rs.getString(3);
             row[3]=rs.getInt(4);
             total += rs.getInt(4);  
             model.addRow(row);
           }
           con.close();
             id.setText("0");
            a.setText("");
            b.setText("");
            String tot =String.valueOf(total);
           jLabel1.setText(tot); 
           
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    private void JTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable2MouseClicked
        add.setEnabled(true);
         int rowIndex= JTable2.getSelectedRow();
        id.setText(JTable2.getValueAt(rowIndex,0).toString());
        a.setText(JTable2.getValueAt(rowIndex,1).toString());
        b.setText(JTable2.getValueAt(rowIndex,2).toString());
        
    }//GEN-LAST:event_JTable2MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
         String ID = id.getText();
         String product = a.getText();
        String price = b.getText();
        int prices =Integer.parseInt(price);
        int qty =Integer.parseInt(qnty.getText());
        int total= prices * qty;
        String tot =String.valueOf(total);
         String Quantity =String.valueOf(qty);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://Localhost:3306/orderingsystem","root","");
            String sql= "insert into tbl3 (id , products , Quantity, price) values (?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ID);
            pst.setString(2,product);
            pst.setString(3,Quantity);
            pst.setString(4,tot);
            pst.execute();
            loadrecord(JTable2);
            con.close();
          

            id.setText("0");
            a.setText("");
            b.setText("");
            loadrecord1(JTable3);
          
      
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
           pay.setEnabled(true);
        
    }//GEN-LAST:event_addActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        String data=jLabel1.getText();
        f5 p=new f5(data);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        int i =Integer.parseInt(jLabel1.getText());
        int ii=Integer.parseInt(b.getText());
        int t = i-ii;
        String f=String.valueOf(t);
        jLabel1.setText(f);
                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://Localhost:3306/orderingsystem","root","");
            String ID = id.getText();
            if(ID.equals("0"))
            {
                JOptionPane.showMessageDialog(null,"NO DATA SELECTED!");
            }
            else
            {
                String sql= "delete from tbl3 where id like '"+ID+"'";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.execute();
                con.close();
              
                loadrecord1(JTable3);
                id.setText("0");
                a.setText("");
                b.setText("");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
                      
    }//GEN-LAST:event_removeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new f4().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable3MouseClicked
        remove.setEnabled(true);
          int rowIndex= JTable3.getSelectedRow();
        id.setText(JTable3.getValueAt(rowIndex,0).toString());
        a.setText(JTable3.getValueAt(rowIndex,1).toString());
        b.setText(JTable3.getValueAt(rowIndex,3).toString());
        
    }//GEN-LAST:event_JTable3MouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable2;
    private javax.swing.JTable JTable3;
    private javax.swing.JLabel a;
    private javax.swing.JButton add;
    private javax.swing.JLabel b;
    private javax.swing.JButton exit;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton pay;
    private javax.swing.JTextField qnty;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}
