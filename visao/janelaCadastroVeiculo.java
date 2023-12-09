/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

/**
 *
 * @author nat_p
 */
public class janelaCadastroVeiculo extends javax.swing.JInternalFrame {
    //VeiculoUseCases veiculo = new VeiculoUseCases();
    
    /**
     * Creates new form janelaCadastroVeiculo
     */
    public janelaCadastroVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        labelPlaca = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelGrupo = new javax.swing.JLabel();
        fecharJanelaCV = new javax.swing.JButton();
        escrevaPlaca = new javax.swing.JTextField();
        escrevaMarca = new javax.swing.JTextField();
        escrevaModelo = new javax.swing.JTextField();
        escrevaCor = new javax.swing.JTextField();
        escrevaAno = new javax.swing.JTextField();
        escrevaGrupo = new javax.swing.JTextField();
        PainelCTA = new javax.swing.JPanel();
        AdicionarVeiculoCTA = new javax.swing.JButton();

        PainelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("Placa:");
        labelPlaca.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMarca.setText("Marca");

        labelModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModelo.setText("Modelo");

        labelCor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCor.setText("Cor");

        labelAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAno.setText("Ano");

        labelGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrupo.setText("Grupo");
        labelGrupo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        fecharJanelaCV.setText("Fechar");
        fecharJanelaCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharJanelaCVActionPerformed(evt);
            }
        });

        escrevaPlaca.setText("<LLLNLNN>");
        escrevaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escrevaPlacaActionPerformed(evt);
            }
        });
        escrevaPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                escrevaPlacaKeyTyped(evt);
            }
        });

        escrevaMarca.setText("<marca>");

        escrevaModelo.setText("<modelo>");
        escrevaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escrevaModeloActionPerformed(evt);
            }
        });

        escrevaCor.setText("<cor>");

        escrevaAno.setText("<ano>");
        escrevaAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escrevaAnoActionPerformed(evt);
            }
        });

        escrevaGrupo.setText("<grupo>");

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(labelMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escrevaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(labelGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escrevaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCor)
                                    .addComponent(labelAno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(escrevaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(escrevaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(labelModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escrevaModelo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(labelPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(escrevaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                        .addComponent(fecharJanelaCV)))
                .addContainerGap())
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlaca)
                            .addComponent(escrevaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fecharJanelaCV)))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(escrevaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(escrevaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor)
                    .addComponent(escrevaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno)
                    .addComponent(escrevaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGrupo)
                    .addComponent(escrevaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        PainelCTA.setBackground(new java.awt.Color(204, 204, 204));

        AdicionarVeiculoCTA.setLabel("Adicionar Veículo");
        AdicionarVeiculoCTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarVeiculoCTAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCTALayout = new javax.swing.GroupLayout(PainelCTA);
        PainelCTA.setLayout(PainelCTALayout);
        PainelCTALayout.setHorizontalGroup(
            PainelCTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCTALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdicionarVeiculoCTA)
                .addContainerGap())
        );
        PainelCTALayout.setVerticalGroup(
            PainelCTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCTALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdicionarVeiculoCTA)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelCTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelCTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarVeiculoCTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarVeiculoCTAActionPerformed
        // TODO add your handling code here:
            System.exit(0);

    }//GEN-LAST:event_AdicionarVeiculoCTAActionPerformed

    private void fecharJanelaCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharJanelaCVActionPerformed
        dispose();
        //fecha o formulário
    }//GEN-LAST:event_fecharJanelaCVActionPerformed

    private void escrevaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escrevaPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escrevaPlacaActionPerformed

    private void escrevaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escrevaModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escrevaModeloActionPerformed

    private void escrevaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escrevaAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escrevaAnoActionPerformed

    private void escrevaPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escrevaPlacaKeyTyped
        System.out.println("oi");
    }//GEN-LAST:event_escrevaPlacaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarVeiculoCTA;
    private javax.swing.JPanel PainelCTA;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JTextField escrevaAno;
    private javax.swing.JTextField escrevaCor;
    private javax.swing.JTextField escrevaGrupo;
    private javax.swing.JTextField escrevaMarca;
    private javax.swing.JTextField escrevaModelo;
    private javax.swing.JTextField escrevaPlaca;
    private javax.swing.JButton fecharJanelaCV;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelGrupo;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    // End of variables declaration//GEN-END:variables
}
