/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

/**
 *
 * @author nat_p
 */
public class janelaExclusaoVeiculo extends javax.swing.JInternalFrame {
    
    //VeiculoUseCases veiculoPraExcluir = new VeiculoUseCases();
    /**
     * Creates new form janelaExclusaoVeiculo
     */
    public janelaExclusaoVeiculo() {
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

        jPanel1 = new javax.swing.JPanel();
        labelPlaca = new javax.swing.JLabel();
        fecharJanelaCV = new javax.swing.JButton();
        escrevaPlaca = new javax.swing.JTextField();
        labelPlaca1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        motivoExclusao = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        excluirVeiculo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("Placa:");
        labelPlaca.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        fecharJanelaCV.setText("Fechar");
        fecharJanelaCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharJanelaCVActionPerformed(evt);
            }
        });

        escrevaPlaca.setText("<LLLNLNN>");
        escrevaPlaca.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                escrevaPlacaInputMethodTextChanged(evt);
            }
        });

        labelPlaca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca1.setText("Motivo para a exclusão do veículo: ");
        labelPlaca1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        motivoExclusao.setColumns(20);
        motivoExclusao.setForeground(new java.awt.Color(153, 153, 153));
        motivoExclusao.setRows(5);
        motivoExclusao.setText("venda, furto/roubo, acidente com perda total, ...");
        jScrollPane1.setViewportView(motivoExclusao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(escrevaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecharJanelaCV))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlaca1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlaca)
                            .addComponent(escrevaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fecharJanelaCV)))
                .addGap(18, 18, 18)
                .addComponent(labelPlaca1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        excluirVeiculo.setText("Excluir Veículo");
        excluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluirVeiculo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluirVeiculo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharJanelaCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharJanelaCVActionPerformed
        dispose();
        //fecha o formulário
    }//GEN-LAST:event_fecharJanelaCVActionPerformed

    private void excluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirVeiculoActionPerformed
        // depois considerar o caso de não existir a placa
        
        String placaEscrita = escrevaPlaca.getText();
        String motivoExclusaoV = motivoExclusao.getText();
        
        Exclusaopainel AlertaExclusao;
        AlertaExclusao = new Exclusaopainel();
        NewJFrame.add(AlertaExclusao);
        AlertaExclusao.setVisible(true);
        
        //VeiculoUseCases.deleteVeiculo(placaEscrita, motivoExclusaoV);
    }//GEN-LAST:event_excluirVeiculoActionPerformed

    private void escrevaPlacaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_escrevaPlacaInputMethodTextChanged
        
    }//GEN-LAST:event_escrevaPlacaInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField escrevaPlaca;
    private javax.swing.JButton excluirVeiculo;
    private javax.swing.JButton fecharJanelaCV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPlaca1;
    private javax.swing.JTextArea motivoExclusao;
    // End of variables declaration//GEN-END:variables
}
