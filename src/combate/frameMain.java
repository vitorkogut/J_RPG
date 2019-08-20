/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import static combate.main.Jogador;
import static combate.main.Textos;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class frameMain extends javax.swing.JFrame implements ActionListener{
    
   int parteAtual = 0; // SERVE PARA SABER QUE PARTE ESTÁ DA AVENTURA E PARA DETERMINAR A PROXIMA
   int controlCombate = 0; // VARIAVEL DE CONTROLE
   private int preco = 50; // PREÇO DA MALHORIA DE EQUIPAMENTO
   
   
   private ImageIcon imagem;

   
    public frameMain() {
        initComponents(); 
        Timer timer = new Timer(50 , this);
        timer.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        frameUpgrade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        barraXp = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        quantXp = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barraVida = new javax.swing.JProgressBar();
        quantVida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelTexto = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        botãoProximo = new javax.swing.JButton();
        op1 = new javax.swing.JButton();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        classe = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        invJogador = new javax.swing.JButton();
        alertaInv = new javax.swing.JLabel();
        alertaUp = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameUpgrade.setText("UPGRADES");
        frameUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameUpgradeActionPerformed(evt);
            }
        });

        jLabel2.setText("VIDA");

        barraXp.setForeground(new java.awt.Color(0, 0, 102));

        jLabel3.setText("XP");

        quantXp.setText("0/100");

        lvl.setText("0");

        jLabel4.setText("Lvl :");

        barraVida.setForeground(new java.awt.Color(255, 0, 0));

        quantVida.setText("0/50");

        painelTexto.setEditable(false);
        painelTexto.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(painelTexto);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botãoProximo.setText("PRÓXIMO");
        botãoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoProximoActionPerformed(evt);
            }
        });

        op1.setText("OPÇÃO 1");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setText("OPÇÃO 2");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setText("OPÇÃO 3");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        classe.setText("Classe: ");

        gold.setText("Gold:");

        invJogador.setText("INVENTÁRIO");
        invJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invJogadorActionPerformed(evt);
            }
        });

        alertaInv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alertaInv.setForeground(new java.awt.Color(0, 0, 153));
        alertaInv.setText("!!!");

        alertaUp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alertaUp.setForeground(new java.awt.Color(0, 0, 153));
        alertaUp.setText("!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(op2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(botãoProximo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(op3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(op1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(98, 98, 98)
                        .addComponent(quantVida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(quantXp))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(lvl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(gold))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(classe))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(barraXp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertaUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frameUpgrade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alertaInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invJogador)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(lvl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(gold))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(classe))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(op3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(op1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(op2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantVida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(quantXp))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(barraXp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(botãoProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invJogador)
                            .addComponent(alertaInv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frameUpgrade)
                            .addComponent(alertaUp))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barraXp.getAccessibleContext().setAccessibleParent(barraXp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        if(parteAtual == 2){
            Jogador.setClasse(3);
            Jogador.setDestreza(5);
            Jogador.setXp(100);
            parteAtual = 5;
        }
        if(parteAtual == 8){
            parteAtual = 9;
        }

        if(parteAtual == 10){
            parteAtual = 11;
        }

        if(parteAtual == 12){
            parteAtual = 13;
        }

        if(parteAtual == 15){
            parteAtual = 16;// 16 eh um combate
        }

        if(parteAtual == 19){
            parteAtual = 25;
        }

        if(parteAtual == 22){
            parteAtual = 23;
        }

        if(parteAtual == 27){
            parteAtual = 28;
        }
    }//GEN-LAST:event_op3ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        if(parteAtual == 2){
            Jogador.setClasse(2);
            Jogador.setInteligencia(5);
            Jogador.setXp(100);
            parteAtual = 4;
        }
        if(parteAtual == 8){
            parteAtual = 9;
        }

        if(parteAtual == 10){
            parteAtual = 11;
        }

        if(parteAtual == 12){
            parteAtual = 13;
        }

        if(parteAtual == 15){
            parteAtual = 16;// 16 eh um combate
        }

        if(parteAtual == 19){
            parteAtual = 25;
        }

        if(parteAtual == 22){
            parteAtual = 23;
        }

        if(parteAtual == 27){
            parteAtual = 28;
        }
    }//GEN-LAST:event_op2ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed

        if(parteAtual == 2){
            Jogador.setClasse(1);
            Jogador.setForca(5);
            Jogador.setXp(100);
            parteAtual = 3;
        }

        if(parteAtual == 8){
            parteAtual = 9;
        }

        if(parteAtual == 10){
            parteAtual = 11;
        }

        if(parteAtual == 12){
            parteAtual = 13;
        }

        if(parteAtual == 15){
            Jogador.setGold(Jogador.getGold() - 10);
            parteAtual = 16;// 16 eh um combate
        }

        if(parteAtual == 19){
            parteAtual = 20;
        }

        if(parteAtual == 22){
            parteAtual = 23;
        }

        if(parteAtual == 27){
            parteAtual = 28;
        }

    }//GEN-LAST:event_op1ActionPerformed

    private void botãoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoProximoActionPerformed

        switch(parteAtual){
            case 3: case 4: case 5:
            parteAtual = 6;
            break;

            case 24: case 29:
            parteAtual = 30;
            break;
            
            case 16:
            if(controlCombate == 0){
                Combate combate = new Combate();
                combate.setVisible(true);
                controlCombate = 1;
                break;
            } else if(controlCombate == 1) {
                break;
            } else {    
                parteAtual++;
                break;
            }
            default:
            parteAtual = parteAtual + 1;
            break;
        }
    }//GEN-LAST:event_botãoProximoActionPerformed

    private void frameUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameUpgradeActionPerformed

        frameUP Upgrade = new frameUP();
        Upgrade.setLocationRelativeTo(null);
        Upgrade.setVisible(true);
        Upgrade.setPtsUP(Jogador.pontosUP);
        Upgrade.UpdateDados();
    }//GEN-LAST:event_frameUpgradeActionPerformed

    private void invJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invJogadorActionPerformed
        frameInventário inventário = new frameInventário();
        inventário.setVisible(true);
    }//GEN-LAST:event_invJogadorActionPerformed
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        painelTexto.setText(Textos.getTxt(parteAtual));
        barraXp.setValue(Jogador.getXp());
        barraVida.setValue(Jogador.getVida() * 2);
        quantXp.setText(Integer.toString(Jogador.getXp()) + "/100");
        quantVida.setText(Integer.toString(Jogador.getVida()) + "/" + Jogador.getMaxVida());
        lvl.setText(Integer.toString(Jogador.getLvl()));
        gold.setText("Gold: "+ Jogador.getGold());
        
        if(Jogador.getPontosUP() > 0){
            alertaUp.setText("!!!");
        } else {
            alertaUp.setText("");
        }
                
        if(Jogador.getGold() >= getPreco()){
            alertaInv.setText("!!!");
        } else {
            alertaInv.setText("");
        }
        
        if(Jogador.getClasse() == 1){
            classe.setText("Classe: Guerreiro");
        }
        else if(Jogador.getClasse() == 2){
            classe.setText("Classe: Mago");       
        }
        else if(Jogador.getClasse() == 3){
            classe.setText("Classe: Arqueiro");   
        }
        
        if(Jogador.getXp() >= 100){
            Jogador.setLvl(Jogador.getLvl() + 1);
            Jogador.setPontosUP(Jogador.getPontosUP() + 1);
            Jogador.setXp(Jogador.getXp() - 100);
        }
        
        //AKI OS BOTÕES SOMEM E APARECEM DEPENDENDO DA FASE
        if(parteAtual == 2 || parteAtual == 8 || parteAtual == 10 || parteAtual == 12 || parteAtual == 15 || parteAtual == 19 || parteAtual == 22 || parteAtual == 27){
            botãoProximo.setVisible(false);
            op1.setVisible(true);
            op2.setVisible(true);
            op3.setVisible(true);
        } else {
            botãoProximo.setVisible(true);
            op1.setVisible(false);
            op2.setVisible(false);
            op3.setVisible(false);
        }
        
        if(parteAtual %2 == 0){
            imagem = new ImageIcon(getClass().getResource("Images\\teste1.jpg"));
            jLabel5.setIcon(imagem);
        }else{
            imagem = new ImageIcon(getClass().getResource("Images\\teste2.jpg"));
            jLabel5.setIcon(imagem);
        }
        repaint();
    }
    
    
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertaInv;
    private javax.swing.JLabel alertaUp;
    private javax.swing.JProgressBar barraVida;
    private javax.swing.JProgressBar barraXp;
    private javax.swing.JButton botãoProximo;
    private javax.swing.JLabel classe;
    private javax.swing.JButton frameUpgrade;
    private javax.swing.JLabel gold;
    private javax.swing.JButton invJogador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lvl;
    private javax.swing.JButton op1;
    private javax.swing.JButton op2;
    private javax.swing.JButton op3;
    private javax.swing.JTextPane painelTexto;
    private javax.swing.JLabel quantVida;
    private javax.swing.JLabel quantXp;
    // End of variables declaration//GEN-END:variables


    public void setControlCombate(int controlCombate) {
        this.controlCombate = controlCombate;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}

