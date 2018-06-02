/**
 * EsPReSSO - Extension for Processing and Recognition of Single Sign-On Protocols.
 * Copyright (C) 2015 Tim Guenther and Christian Mainka
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package de.rub.nds.burp.espresso.intruder;

import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 * @author Nurullah Erinola
 */
public class InputJFrame extends javax.swing.JFrame {

    private boolean pressed = false;
    
    public InputJFrame() {
        initComponents();
        initJRadioButtons();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        protocolButtonGroup = new javax.swing.ButtonGroup();
        okjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        httpjRadioButton = new javax.swing.JRadioButton();
        httpsjRadioButton = new javax.swing.JRadioButton();
        ftpjRadioButton = new javax.swing.JRadioButton();
        smpjRadioButton = new javax.swing.JRadioButton();
        listenerjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        okjButton.setText("Ok");
        okjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Attack Listener:");

        jLabel2.setText("Protocoll:");

        protocolButtonGroup.add(httpjRadioButton);
        httpjRadioButton.setSelected(true);
        httpjRadioButton.setText("http");
        httpjRadioButton.setToolTipText("");

        protocolButtonGroup.add(httpsjRadioButton);
        httpsjRadioButton.setText("https");

        protocolButtonGroup.add(ftpjRadioButton);
        ftpjRadioButton.setText("ftp");

        protocolButtonGroup.add(smpjRadioButton);
        smpjRadioButton.setText("smp");

        listenerjTextField.setText("attackListener.org");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(listenerjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(httpsjRadioButton)
                            .addComponent(httpjRadioButton)
                            .addComponent(ftpjRadioButton)
                            .addComponent(smpjRadioButton)))
                    .addComponent(okjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listenerjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(httpjRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(httpsjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftpjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smpjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okjButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initJRadioButtons() {
        httpjRadioButton.setActionCommand("http://");
        httpsjRadioButton.setActionCommand("https://");
        ftpjRadioButton.setActionCommand("ftp://");
        smpjRadioButton.setActionCommand("smp://");
    }
    
    public String getListener() {
        return listenerjTextField.getText();
    }
    
    public String getProtocol() {
        return protocolButtonGroup.getSelection().getActionCommand();
    }
    
    public boolean getPressed() {
        return pressed;
    }
        
    private void okjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okjButtonActionPerformed
        setVisible(false);
        pressed = true;
    }//GEN-LAST:event_okjButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ftpjRadioButton;
    private javax.swing.JRadioButton httpjRadioButton;
    private javax.swing.JRadioButton httpsjRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField listenerjTextField;
    private javax.swing.JButton okjButton;
    private javax.swing.ButtonGroup protocolButtonGroup;
    private javax.swing.JRadioButton smpjRadioButton;
    // End of variables declaration//GEN-END:variables
}
