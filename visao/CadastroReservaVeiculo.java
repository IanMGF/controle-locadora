/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

import logic.*;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author nat_p
 */
public class CadastroReservaVeiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroNovoVeiculo
     */
    public CadastroReservaVeiculo() {
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
        fecharJanela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextDataReitrada = new javax.swing.JFormattedTextField();
        TextDataDevolucao = new javax.swing.JFormattedTextField();
        grupoVeiculosDisponiveis = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        CadastrarReservaVeiculo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        fecharJanela.setText("Fechar");
        fecharJanela.addActionListener(this::fecharJanelaActionPerformed);

        jLabel1.setText("Data de retirada:");

        jLabel2.setText("Data de devolução:");

        TextDataReitrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        TextDataReitrada.setText("<DD/MM/AAAA>");
        TextDataReitrada.setToolTipText("<DD/MM/AAAA>");
        TextDataReitrada.addActionListener(this::TextDataReitradaActionPerformed);

        TextDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        TextDataDevolucao.setText("<DD/MM/AAAA>");
        TextDataDevolucao.setToolTipText("<DD/MM/AAAA>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecharJanela, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(437, 437, 437))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextDataReitrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(grupoVeiculosDisponiveis))
                        .addContainerGap())
                    ))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecharJanela)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextDataReitrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grupoVeiculosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        CadastrarReservaVeiculo.setText("Próximo ->");
        CadastrarReservaVeiculo.addActionListener(this::CadastrarReservaVeiculoActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastrarReservaVeiculo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastrarReservaVeiculo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharJanelaActionPerformed(java.awt.event.ActionEvent ignoredEvt) {//GEN-FIRST:event_fecharJanelaActionPerformed
        dispose();
        //fecha o formulário
    }//GEN-LAST:event_fecharJanelaActionPerformed

    private void CadastrarReservaVeiculoActionPerformed(java.awt.event.ActionEvent ignoredEvt) {//GEN-FIRST:event_CadastrarReservaVeiculoActionPerformed
        String dataDevStr = TextDataDevolucao.getText();
        String dataRetStr = TextDataReitrada.getText();

        Date dataRetirada;
        Date dataDevolucao;

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            dataRetirada = df.parse(dataRetStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro: Formato inválido para data de retirada"
            );
            return;
        }

        try {
            dataDevolucao = df.parse(dataDevStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro: Formato inválido para data de devolução"
            );
            return;
        }

        List<IVeiculo> disponiveis = ReservaUseCases.encontrarVeiculosPorPeriodo(dataRetirada, dataDevolucao);

        StringBuilder veiculosStr = new StringBuilder();

        Set<String> gruposSet = disponiveis.stream()
                                        .map(IVeiculo::getGrupo)
                                        .collect(Collectors.toSet());

        if(gruposSet.size() == 0){
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum veículo está disponível no período",
                    "Nenhum Veículo encontrado",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        int grupoEscolhidoIndex = JOptionPane.showOptionDialog(
                null,
                "Selecione um dos grupos disponíveis",
                "Selecione um grupo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                gruposSet.toArray(),
                null
        );

        String grupoEscolhido = gruposSet.toArray(String[]::new)[grupoEscolhidoIndex];

        veiculosStr.append("Veículos disponíveis no período: \n");
        disponiveis.stream()
                .filter(v -> v.getGrupo().equals(grupoEscolhido))
                .forEach(
                v -> veiculosStr.append(v.getMarca())
                        .append(" - ").append(v.getModelo())
                        .append(" - ").append(v.getCor())
                        .append(" - ").append(v.getAno())
                        .append(" - ").append(v.getPlaca())
                        .append(" - ").append(v.getGrupo())
                        .append("\n")
        );
        veiculosStr.append("\nInforme a placa do veículo escolhido");

        String placaEscolhida;
        IVeiculo veiculo = null;

        while(veiculo == null) {
            placaEscolhida = JOptionPane.showInputDialog(
                    veiculosStr.toString()
            );
            veiculo = Frota.getVeiculoByPlaca(placaEscolhida);
        }

        String cpf = JOptionPane.showInputDialog("Informe o CPF do cliente");
        if(ClientUseCases.encontrarPorCPF(cpf) == null){
            // CPF Não encontrado.
            JOptionPane.showMessageDialog(
                    null,
                    "CPF não encontrado. Redirecionando para cadastro de cliente",
                    "CPF não encontrado",
                    JOptionPane.ERROR_MESSAGE
            );

            // fecha a janela
            dispose();

            CadastroNovoCliente telaCadastronovocliente = new CadastroNovoCliente();
            FuncionarioJFrame.jDesktopPane1.add( telaCadastronovocliente );
            telaCadastronovocliente.setVisible(true);
            return;
        }

        int limpezaExtOpt = JOptionPane.showConfirmDialog(
                null,
                "Gostaria de incluir limpeza externa?",
                "Limpeza externa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        int limpezaIntOpt = JOptionPane.showConfirmDialog(
                null,
                "Gostaria de incluir limpeza interna?",
                "Limpeza interna",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        int seguroOpt = JOptionPane.showConfirmDialog(
                null,
                "Gostaria de incluir seguro? (Obrigatório para clientes entre 18 e 21 anos)",
                "Seguro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        boolean limpezaInt = limpezaIntOpt == JOptionPane.YES_OPTION;
        boolean limpezaExt = limpezaExtOpt == JOptionPane.YES_OPTION;
        boolean seguro = seguroOpt == JOptionPane.YES_OPTION;

        IReserva res = ReservaUseCases.reservarVeiculo(
                dataRetirada,
                dataDevolucao,
                veiculo,
                cpf,
                limpezaInt,
                limpezaExt,
                seguro
        );

        JOptionPane.showMessageDialog(
                null,
                "Reserva concluída:\n" +
                "Código: " + res.getCodigo() +
                "Data retirada: " + res.getDataRetirada() +
                "Data Devolução " + res.getDataDevolucao() +
                "Placa: " + res.getVeiculo().getPlaca(),
                "Reserva concluída",
                JOptionPane.INFORMATION_MESSAGE
        );

    }//GEN-LAST:event_CadastrarReservaVeiculoActionPerformed

    private void TextDataReitradaActionPerformed(java.awt.event.ActionEvent ignoredEvt) {//GEN-FIRST:event_TextDataReitradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDataReitradaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarReservaVeiculo;
    private javax.swing.JFormattedTextField TextDataDevolucao;
    private javax.swing.JFormattedTextField TextDataReitrada;
    private javax.swing.JButton fecharJanela;
    private javax.swing.JScrollPane grupoVeiculosDisponiveis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
