package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jogo.JogoDeHanoi;

public class TelaPrincipal extends javax.swing.JFrame {

    private final JogoDeHanoi jogoDeHanoi;

    private final ImageIcon icon1;
    private final ImageIcon icon2;
    private final ImageIcon icon3;
    private final ImageIcon icon4;

    private int origem = 0;
    private int destino = 0;

    public TelaPrincipal() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);

        jogoDeHanoi = new JogoDeHanoi(4);

        icon1 = new ImageIcon("src\\barras\\barra1.png");
        icon2 = new ImageIcon("src\\barras\\barra2.png");
        icon3 = new ImageIcon("src\\barras\\barra3.png");
        icon4 = new ImageIcon("src\\barras\\barra4.png");

        this.inicialBarra1.setIcon(icon4);
        this.inicialBarra2.setIcon(icon3);
        this.inicialBarra3.setIcon(icon2);
        this.inicialBarra4.setIcon(icon1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnInserirTorreInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInserirAuxiliarUm = new javax.swing.JButton();
        btnInserirAuxiliarDois = new javax.swing.JButton();
        inicialBarra4 = new javax.swing.JLabel();
        inicialBarra1 = new javax.swing.JLabel();
        inicialBarra2 = new javax.swing.JLabel();
        inicialBarra3 = new javax.swing.JLabel();
        UmBarra4 = new javax.swing.JLabel();
        UmBarra1 = new javax.swing.JLabel();
        UmBarra2 = new javax.swing.JLabel();
        UmBarra3 = new javax.swing.JLabel();
        DoisBarra4 = new javax.swing.JLabel();
        DoisBarra2 = new javax.swing.JLabel();
        DoisBarra3 = new javax.swing.JLabel();
        DoisBarra1 = new javax.swing.JLabel();
        btnSelecionarOrigemInicial = new javax.swing.JButton();
        btnSelecionarOrigemUm = new javax.swing.JButton();
        btnSelecionarOrigemDois = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtJogadas = new javax.swing.JLabel();
        txtErro = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo De Hanoi");
        setResizable(false);

        btnInserirTorreInicial.setBackground(new java.awt.Color(255, 255, 102));
        btnInserirTorreInicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInserirTorreInicial.setText("Inserir");
        btnInserirTorreInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirTorreInicialActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        jLabel1.setText("Torre Auxiliar Um");

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        jLabel2.setText("Torre Inicial");

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 0, 18)); // NOI18N
        jLabel3.setText("Torre Auxiliar Dois");

        btnInserirAuxiliarUm.setBackground(new java.awt.Color(255, 255, 102));
        btnInserirAuxiliarUm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInserirAuxiliarUm.setText("Inserir");
        btnInserirAuxiliarUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirAuxiliarUmActionPerformed(evt);
            }
        });

        btnInserirAuxiliarDois.setBackground(new java.awt.Color(255, 255, 102));
        btnInserirAuxiliarDois.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInserirAuxiliarDois.setText("Inserir");
        btnInserirAuxiliarDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirAuxiliarDoisActionPerformed(evt);
            }
        });

        btnSelecionarOrigemInicial.setBackground(new java.awt.Color(255, 255, 102));
        btnSelecionarOrigemInicial.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSelecionarOrigemInicial.setText("Selecionar");
        btnSelecionarOrigemInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarOrigemInicialActionPerformed(evt);
            }
        });

        btnSelecionarOrigemUm.setBackground(new java.awt.Color(255, 255, 102));
        btnSelecionarOrigemUm.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSelecionarOrigemUm.setText("Selecionar");
        btnSelecionarOrigemUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarOrigemUmActionPerformed(evt);
            }
        });

        btnSelecionarOrigemDois.setBackground(new java.awt.Color(255, 255, 102));
        btnSelecionarOrigemDois.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSelecionarOrigemDois.setText("Selecionar");
        btnSelecionarOrigemDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarOrigemDoisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setText("Número de Jogadas: ");

        txtJogadas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtJogadas.setText("0");

        txtErro.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtErro.setForeground(new java.awt.Color(204, 0, 0));
        txtErro.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inicialBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicialBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicialBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicialBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UmBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UmBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UmBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UmBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoisBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoisBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoisBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoisBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelecionarOrigemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(btnSelecionarOrigemUm, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserirTorreInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(btnInserirAuxiliarUm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserirAuxiliarDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarOrigemDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJogadas)
                .addGap(119, 119, 119)
                .addComponent(txtErro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJogadas)
                    .addComponent(txtErro))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inicialBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inicialBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inicialBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(inicialBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DoisBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(DoisBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DoisBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(DoisBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UmBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UmBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(UmBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UmBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirTorreInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserirAuxiliarUm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserirAuxiliarDois, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarOrigemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarOrigemUm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarOrigemDois, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void moverBarra(int origem, int destino) throws Exception {
        this.colocarIconeNoDestino(destino, this.obterIcone(origem));
        this.zerarLocalizadores();
    }

    private void colocarIconeNoDestino(int numeroDaPilha, Icon icone) {
        switch (numeroDaPilha) {
            case 1: {
                if (this.inicialBarra1.getIcon() == null) {
                    this.inicialBarra1.setIcon(icone);
                } else if (this.inicialBarra2.getIcon() == null) {
                    this.inicialBarra2.setIcon(icone);
                } else if (this.inicialBarra3.getIcon() == null) {
                    this.inicialBarra3.setIcon(icone);
                } else {
                    this.inicialBarra4.setIcon(icone);
                }
                break;
            }
            case 2: {
                if (this.UmBarra1.getIcon() == null) {
                    this.UmBarra1.setIcon(icone);
                } else if (this.UmBarra2.getIcon() == null) {
                    this.UmBarra2.setIcon(icone);
                } else if (this.UmBarra3.getIcon() == null) {
                    this.UmBarra3.setIcon(icone);
                } else {
                    this.UmBarra4.setIcon(icone);
                }
                break;
            }

            case 3: {
                if (this.DoisBarra1.getIcon() == null) {
                    this.DoisBarra1.setIcon(icone);
                } else if (this.DoisBarra2.getIcon() == null) {
                    this.DoisBarra2.setIcon(icone);
                } else if (this.DoisBarra3.getIcon() == null) {
                    this.DoisBarra3.setIcon(icone);
                } else {
                    this.DoisBarra4.setIcon(icone);
                }
                break;
            }
        }
    }

    private Icon obterIcone(int numeroDaPilha) {

        Icon retorno;

        switch (numeroDaPilha) {
            case 1: {
                if (this.inicialBarra4.getIcon() != null) {
                    retorno = this.inicialBarra4.getIcon();
                    this.inicialBarra4.setIcon(null);
                    return retorno;
                }
                if (this.inicialBarra3.getIcon() != null) {
                    retorno = this.inicialBarra3.getIcon();
                    this.inicialBarra3.setIcon(null);
                    return retorno;
                }
                if (this.inicialBarra2.getIcon() != null) {
                    retorno = this.inicialBarra2.getIcon();
                    this.inicialBarra2.setIcon(null);
                    return retorno;
                }
                if (this.inicialBarra1.getIcon() != null) {
                    retorno = this.inicialBarra1.getIcon();
                    this.inicialBarra1.setIcon(null);
                    return retorno;
                }
                break;
            }
            case 2: {
                if (this.UmBarra4.getIcon() != null) {
                    retorno = this.UmBarra4.getIcon();
                    this.UmBarra4.setIcon(null);
                    return retorno;
                }
                if (this.UmBarra3.getIcon() != null) {
                    retorno = this.UmBarra3.getIcon();
                    this.UmBarra3.setIcon(null);
                    return retorno;
                }
                if (this.UmBarra2.getIcon() != null) {
                    retorno = this.UmBarra2.getIcon();
                    this.UmBarra2.setIcon(null);
                    return retorno;
                }
                if (this.UmBarra1.getIcon() != null) {
                    retorno = this.UmBarra1.getIcon();
                    this.UmBarra1.setIcon(null);
                    return retorno;
                }
                break;
            }
            case 3: {
                if (this.DoisBarra4.getIcon() != null) {
                    retorno = this.DoisBarra4.getIcon();
                    this.DoisBarra4.setIcon(null);
                    return retorno;
                }
                if (this.DoisBarra3.getIcon() != null) {
                    retorno = this.DoisBarra3.getIcon();
                    this.DoisBarra3.setIcon(null);
                    return retorno;
                }
                if (this.DoisBarra2.getIcon() != null) {
                    retorno = this.DoisBarra2.getIcon();
                    this.DoisBarra2.setIcon(null);
                    return retorno;
                }
                if (this.DoisBarra1.getIcon() != null) {
                    retorno = this.DoisBarra1.getIcon();
                    this.DoisBarra1.setIcon(null);
                    return retorno;
                }
                break;
            }
        }
        return null;
    }

    private void zerarLocalizadores() {
        origem = 0;
        destino = 0;
    }

    //BTN TORRE ORIGEM
    private void btnInserirTorreInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirTorreInicialActionPerformed

      /*  if (origem == 0) {
            origem = 1;
        } else {
            destino = 1;
        }*/
      destino  = 1;

            try {
               if( jogoDeHanoi.fazerJogada(origem, destino)){
                this.moverBarra(origem, destino);
                    txtErro.setText("");
                    txtJogadas.setText(""+jogoDeHanoi.getNumeroJogadas());
            }else{
                   txtErro.setText("Você não pode fazer isso.");
               }
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        

        

    }//GEN-LAST:event_btnInserirTorreInicialActionPerformed
    //BTN TORRE UM
    private void btnInserirAuxiliarUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirAuxiliarUmActionPerformed
  /*       if (origem == 0) {
            origem = 2;
        } else {
            destino = 2;
        }
*/
  destino  = 2;
            try {
               if( jogoDeHanoi.fazerJogada(origem, destino)){
                this.moverBarra(origem, destino);
                 txtErro.setText("");
                 txtJogadas.setText(""+jogoDeHanoi.getNumeroJogadas());
            }else{
                   txtErro.setText("Você não pode fazer isso.");
               }
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        


    }//GEN-LAST:event_btnInserirAuxiliarUmActionPerformed
    //BTN TORRE DOIS
    private void btnInserirAuxiliarDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirAuxiliarDoisActionPerformed

    /*    if (origem == 0) {
            origem = 3;
        } else {
            destino = 3;
        }
*/
    destino = 3;
            try {
               if( jogoDeHanoi.fazerJogada(origem, destino)){
                this.moverBarra(origem, destino);
                 txtErro.setText("");
                 txtJogadas.setText(""+jogoDeHanoi.getNumeroJogadas());
            }else{
                   txtErro.setText("Você não pode fazer isso.");
               }
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_btnInserirAuxiliarDoisActionPerformed
//BOTOES SELECIONAR
    
    private void btnSelecionarOrigemInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarOrigemInicialActionPerformed
        if(jogoDeHanoi.getOrigem(1).isEmpty()){
            JOptionPane.showMessageDialog(null, "Essa torre está vazia!");
        }else{
        origem = 1;
        }
    }//GEN-LAST:event_btnSelecionarOrigemInicialActionPerformed

    private void btnSelecionarOrigemUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarOrigemUmActionPerformed
        if(jogoDeHanoi.getOrigem(2).isEmpty()){
            JOptionPane.showMessageDialog(null, "Essa torre está vazia!");
        }else{
        origem =2;
        }
    }//GEN-LAST:event_btnSelecionarOrigemUmActionPerformed

    private void btnSelecionarOrigemDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarOrigemDoisActionPerformed
        if(jogoDeHanoi.getOrigem(3).isEmpty()){
            JOptionPane.showMessageDialog(null, "Essa torre está vazia!");
        }else{
        origem = 3;
        }
    }//GEN-LAST:event_btnSelecionarOrigemDoisActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(TelaPrincipal.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoisBarra1;
    private javax.swing.JLabel DoisBarra2;
    private javax.swing.JLabel DoisBarra3;
    private javax.swing.JLabel DoisBarra4;
    private javax.swing.JLabel UmBarra1;
    private javax.swing.JLabel UmBarra2;
    private javax.swing.JLabel UmBarra3;
    private javax.swing.JLabel UmBarra4;
    private javax.swing.JButton btnInserirAuxiliarDois;
    private javax.swing.JButton btnInserirAuxiliarUm;
    private javax.swing.JButton btnInserirTorreInicial;
    private javax.swing.JButton btnSelecionarOrigemDois;
    private javax.swing.JButton btnSelecionarOrigemInicial;
    private javax.swing.JButton btnSelecionarOrigemUm;
    private javax.swing.JLabel inicialBarra1;
    private javax.swing.JLabel inicialBarra2;
    private javax.swing.JLabel inicialBarra3;
    private javax.swing.JLabel inicialBarra4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtErro;
    private javax.swing.JLabel txtJogadas;
    // End of variables declaration//GEN-END:variables
}
