/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication10;

import java.awt.Color;

/**
 *
 * @author hp
 */
public class NewApplet extends java.applet.Applet {

    /** Initializes the applet NewApplet */
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

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        a = new java.awt.Button();
        b = new java.awt.Button();

        button2.setLabel("button2");

        setLayout(null);

        a.setForeground(new java.awt.Color(0, 0, 1));
        a.setLabel("ok");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        add(a);
        a.setBounds(150, 130, 60, 30);

        b.setLabel("color");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        add(b);
        b.setBounds(150, 180, 70, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
b.setBackground(a.getForeground());

    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
 this.setBackground(Color.yellow);
    }//GEN-LAST:event_bActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button a;
    private java.awt.Button b;
    private java.awt.Button button2;
    // End of variables declaration//GEN-END:variables

}
