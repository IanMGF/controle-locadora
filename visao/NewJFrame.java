/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import javax.swing.JFrame;

public class NewJFrame extends javax.swing.JFrame {

    // Construtor 
    public NewJFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
    
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuGerente = new javax.swing.JMenuBar();
        cadastrarNovoVeiculo = new javax.swing.JMenu();
        excluirVeiculo = new javax.swing.JMenu();
        gerarRelatorio = new javax.swing.JMenu();
        alterarParametros = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Gerente");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 800));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5608, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65533, 65533)
        );

        menuGerente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menuGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cadastrarNovoVeiculo.setMnemonic('c');
        cadastrarNovoVeiculo.setText("Cadastrar novo veículo");
        cadastrarNovoVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarNovoVeiculoMouseClicked(evt);
            }
        });
        menuGerente.add(cadastrarNovoVeiculo);

        excluirVeiculo.setText("Excluir veículo");
        excluirVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirVeiculoMouseClicked(evt);
            }
        });
        menuGerente.add(excluirVeiculo);

        gerarRelatorio.setText("Gerar Relatórios Estatísticos");
        gerarRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerarRelatorioMouseClicked(evt);
            }
        });
        menuGerente.add(gerarRelatorio);

        alterarParametros.setText("Alterar parâmetros operacionais");
        menuGerente.add(alterarParametros);

        setJMenuBar(menuGerente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cadastrarNovoVeiculoMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        // com essas 3 linhas de código dá pra instanciar múltiplas janelas
        janelaCadastroVeiculo telaCadastroNV = new janelaCadastroVeiculo();
        jDesktopPane1.add(telaCadastroNV);
        telaCadastroNV.setVisible(true);
    }                                                 

    private void excluirVeiculoMouseClicked(java.awt.event.MouseEvent evt) {                                            
        janelaExclusaoVeiculo telaExclusaoV = new janelaExclusaoVeiculo();
        jDesktopPane1.add(telaExclusaoV);
        telaExclusaoV.setVisible(true);
    }                                           

    private void gerarRelatorioMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu alterarParametros;
    private javax.swing.JMenu cadastrarNovoVeiculo;
    private javax.swing.JMenu excluirVeiculo;
    private javax.swing.JMenu gerarRelatorio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar menuGerente;
    // End of variables declaration                   
}
