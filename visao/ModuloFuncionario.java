/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import javax.swing.JFrame;

/**
 *
 * @author nat_p
 */
public class ModuloFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioJFrame
     */
    public ModuloFuncionario() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        CadastrarNovoCliente = new javax.swing.JMenu();
        CadastrarReservaVeiculo = new javax.swing.JMenu();
        CancelarReservaVeiculo = new javax.swing.JMenu();
        CancelarPorNComparecimento = new javax.swing.JMenuItem();
        RetirarVeiculo = new javax.swing.JMenu();
        DevolverVeiculoLocado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Funcionario");
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 991, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CadastrarNovoCliente.setLabel("Cadastrar novo cliente");
        CadastrarNovoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarNovoClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(CadastrarNovoCliente);

        CadastrarReservaVeiculo.setText("Cadastrar reserva de veículo");
        CadastrarReservaVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarReservaVeiculoMouseClicked(evt);
            }
        });
        jMenuBar1.add(CadastrarReservaVeiculo);

        CancelarReservaVeiculo.setText("Cancelar reserva de veículo");
        CancelarReservaVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarReservaVeiculoMouseClicked(evt);
            }
        });

        CancelarPorNComparecimento.setText("Por não comparecimento");
        CancelarPorNComparecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarPorNComparecimentoActionPerformed(evt);
            }
        });
        CancelarReservaVeiculo.add(CancelarPorNComparecimento);

        jMenuBar1.add(CancelarReservaVeiculo);

        RetirarVeiculo.setText("Retirar veículo");
        RetirarVeiculo.setToolTipText("");
        RetirarVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetirarVeiculoMouseClicked(evt);
            }
        });
        jMenuBar1.add(RetirarVeiculo);

        DevolverVeiculoLocado.setText("Devolver veículo locado");
        DevolverVeiculoLocado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevolverVeiculoLocadoMouseClicked(evt);
            }
        });
        jMenuBar1.add(DevolverVeiculoLocado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarNovoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarNovoClienteMouseClicked
        CadastroNovoCliente telaCadastronovocliente = new CadastroNovoCliente();
        jDesktopPane1.add(telaCadastronovocliente);
        telaCadastronovocliente.setVisible(true);
        
        
    }//GEN-LAST:event_CadastrarNovoClienteMouseClicked

    private void CadastrarReservaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarReservaVeiculoMouseClicked
        CadastroReservaVeiculo telaCadastroReservaVeiculo = new CadastroReservaVeiculo();
        jDesktopPane1.add(telaCadastroReservaVeiculo);
        telaCadastroReservaVeiculo.setVisible(true);
    }//GEN-LAST:event_CadastrarReservaVeiculoMouseClicked

    private void CancelarPorNComparecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarPorNComparecimentoActionPerformed
        
        CancelarReservaNComparecimento telaCancelarReservaNComparecimento = new CancelarReservaNComparecimento();
        jDesktopPane1.add(telaCancelarReservaNComparecimento);
        telaCancelarReservaNComparecimento.setVisible(true);
    }//GEN-LAST:event_CancelarPorNComparecimentoActionPerformed

    private void CancelarReservaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarReservaVeiculoMouseClicked
        CancelarReservaVeiculo telaCancelarReservaVeiculo = new CancelarReservaVeiculo();
        jDesktopPane1.add(telaCancelarReservaVeiculo);
        telaCancelarReservaVeiculo.setVisible(true);
    }//GEN-LAST:event_CancelarReservaVeiculoMouseClicked

    private void RetirarVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetirarVeiculoMouseClicked
        RetirarVeiculo telaRetirarVeiculo = new RetirarVeiculo();
        jDesktopPane1.add(telaRetirarVeiculo);
        telaRetirarVeiculo.setVisible(true);
    }//GEN-LAST:event_RetirarVeiculoMouseClicked

    private void DevolverVeiculoLocadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevolverVeiculoLocadoMouseClicked
       DevolverVeiculoLocado telaDevolverVeiculo = new DevolverVeiculoLocado();
        jDesktopPane1.add(telaDevolverVeiculo);
        telaDevolverVeiculo.setVisible(true);
    }//GEN-LAST:event_DevolverVeiculoLocadoMouseClicked

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
            java.util.logging.Logger.getLogger(ModuloFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CadastrarNovoCliente;
    private javax.swing.JMenu CadastrarReservaVeiculo;
    private javax.swing.JMenuItem CancelarPorNComparecimento;
    private javax.swing.JMenu CancelarReservaVeiculo;
    private javax.swing.JMenu DevolverVeiculoLocado;
    private javax.swing.JMenu RetirarVeiculo;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
