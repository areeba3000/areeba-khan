/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author hp
 */
public class NewApplet extends java.applet.Applet {

    /**
     * Initializes the applet NewApplet
     */
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        a = new java.awt.TextField();
        b = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button5 = new java.awt.Button();
        c = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        button6 = new java.awt.Button();
        button4 = new java.awt.Button();

        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("CALCULATOR");
        add(label1);
        label1.setBounds(120, 20, 180, 30);
        add(a);
        a.setBounds(180, 70, 170, 20);
        add(b);
        b.setBounds(180, 120, 170, 20);

        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("+");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(20, 180, 40, 30);

        button2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button2.setLabel("-");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(70, 180, 40, 30);

        button3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button3.setLabel("*");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(120, 180, 40, 30);

        button5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button5.setLabel("clear");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        add(button5);
        button5.setBounds(220, 180, 60, 30);

        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        add(c);
        c.setBounds(140, 240, 210, 30);

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("ENTER NUMBER 1:");
        add(label2);
        label2.setBounds(60, 70, 106, 20);

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("ENTER NUMBER 2:");
        add(label3);
        label3.setBounds(60, 120, 106, 20);

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("RESULT:");
        add(label4);
        label4.setBounds(50, 250, 60, 20);

        button6.setLabel("/");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        add(button6);
        button6.setBounds(170, 180, 40, 30);

        button4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button4.setLabel("exit");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4);
        button4.setBounds(300, 180, 37, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
      
    }//GEN-LAST:event_cActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
         int num1=Integer.parseInt(a.getText());
        int num2=Integer.parseInt(b.getText());
         int num3=num1+num2;
         c.setText(""+num3);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       int num1=Integer.parseInt(a.getText());
        int num2=Integer.parseInt(b.getText());
         int num3=num1-num2;
         c.setText(""+num3);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
    int num1=Integer.parseInt(a.getText());
        int num2=Integer.parseInt(b.getText());
         int num3=num1*num2;
         c.setText(""+num3);
    }//GEN-LAST:event_button3ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
   a.setText("");
   b.setText("");
   c.setText("");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
     int num1=Integer.parseInt(a.getText());
        int num2=Integer.parseInt(b.getText());
         int num3=num1/num2;
         c.setText(""+num3);
    }//GEN-LAST:event_button6ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
   System.exit(0);
    }//GEN-LAST:event_button4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField a;
    private java.awt.TextField b;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.TextField c;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
