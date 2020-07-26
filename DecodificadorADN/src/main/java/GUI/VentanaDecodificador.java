/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ADN.ADN;
import DecodificadorADN.Decodificador;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author baquiax
 */
public class VentanaDecodificador extends javax.swing.JFrame {

    Decodificador decodificador;

    /**
     * Creates new form VentanaDecodificadir
     */
    public VentanaDecodificador() {
        initComponents();
        decodificador = new Decodificador();
        super.setLocationRelativeTo(null);
        super.setVisible(true);

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
        lblPrimerADN = new javax.swing.JLabel();
        lblSegundoADN = new javax.swing.JLabel();
        txtPrimerADN = new javax.swing.JTextField();
        txtSegundoADN = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblSecuencia = new javax.swing.JLabel();
        txtSecuenciaComun = new javax.swing.JTextField();
        btnComparar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Decodificador ADN");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPrimerADN.setText("Ingrese el primer ADN:");

        lblSegundoADN.setText("Ingrese el segundo ADN:");

        txtSegundoADN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoADNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSegundoADN)
                        .addGap(27, 27, 27)
                        .addComponent(txtSegundoADN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrimerADN)
                        .addGap(43, 43, 43)
                        .addComponent(txtPrimerADN)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerADN)
                    .addComponent(txtPrimerADN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoADN)
                    .addComponent(txtSegundoADN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblTitulo.setText("Decodificador ADN");

        lblSecuencia.setText("Secuencia en comun:");

        btnComparar.setText("Comparar ADN");
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblSecuencia)
                        .addGap(28, 28, 28)
                        .addComponent(txtSecuenciaComun)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnComparar)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnComparar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecuencia)
                    .addComponent(txtSecuenciaComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSegundoADNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoADNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoADNActionPerformed

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed
        if (!txtPrimerADN.getText().isEmpty() && !txtSegundoADN.getText().isEmpty()) {
            try {
                String comun = decodificador.decodificarADNComun(new ADN(txtPrimerADN.getText()), new ADN(txtSegundoADN.getText()));
                txtSecuenciaComun.setText(comun);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa ambos ADN's", "Error", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompararActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComparar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPrimerADN;
    private javax.swing.JLabel lblSecuencia;
    private javax.swing.JLabel lblSegundoADN;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtPrimerADN;
    private javax.swing.JTextField txtSecuenciaComun;
    private javax.swing.JTextField txtSegundoADN;
    // End of variables declaration//GEN-END:variables
}