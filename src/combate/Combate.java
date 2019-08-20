package combate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import static combate.main.Jogador;
import static combate.main.MainFrame;
import static combate.main.TextosCombate;
import java.util.Random;

public class Combate extends javax.swing.JFrame implements ActionListener {

    inimigo inimigo = new inimigo();
    Random dado = new Random();
    Timer timer = new Timer(50, this);

    int perdaTurno = 0;
    int perdaTurnoInimigo = 0;
    int danoAtual = 0;

    public Combate() {
        initComponents();
        timer.start();
        fechar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoCombate = new javax.swing.JTextPane();
        atq = new javax.swing.JButton();
        def = new javax.swing.JButton();
        pot = new javax.swing.JButton();
        barraVida = new javax.swing.JProgressBar();
        barraVidaInimigo = new javax.swing.JProgressBar();
        vidaInimigo = new javax.swing.JLabel();
        vidaPersonagem = new javax.swing.JLabel();
        fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AKI ENTRA TELA COM O INIMIGO");

        textoCombate.setEditable(false);
        textoCombate.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(textoCombate);

        atq.setText("ATAQUE");
        atq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atqActionPerformed(evt);
            }
        });

        def.setText("DEFENDER");
        def.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defActionPerformed(evt);
            }
        });

        pot.setText("POÇÃO");
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });

        barraVida.setBackground(new java.awt.Color(255, 255, 255));
        barraVida.setForeground(new java.awt.Color(204, 0, 0));

        barraVidaInimigo.setForeground(new java.awt.Color(255, 0, 0));

        vidaInimigo.setText("VIDA INIMIGO :");

        vidaPersonagem.setText("VIDA :");

        fechar.setText("FECHAR");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(vidaPersonagem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(atq)
                                    .addGap(18, 18, 18)
                                    .addComponent(def)
                                    .addGap(18, 18, 18)
                                    .addComponent(pot)
                                    .addGap(141, 141, 141)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vidaInimigo)
                                        .addComponent(barraVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barraVidaInimigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(atq)
                        .addComponent(def)
                        .addComponent(pot)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vidaInimigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vidaPersonagem)
                    .addComponent(fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atqActionPerformed
        int d20 = dado.nextInt(20);
        danoAtual = d20;

        if (perdaTurno == 1 && perdaTurnoInimigo == 0) {
            atqInimigo();
            perdaTurno = 0;

        } else if (d20 > 5 && d20 < 18) {

            if (Jogador.getClasse() == 1) {
                inimigo.setVida((inimigo.getVida() - d20) - Jogador.getForca());
                danoAtual = danoAtual + Jogador.getForca();
            } else if (Jogador.getClasse() == 2) {
                inimigo.setVida((inimigo.getVida() - d20) - Jogador.getInteligencia());
                danoAtual = danoAtual + Jogador.getInteligencia();
            } else if (Jogador.getClasse() == 3) {
                inimigo.setVida((inimigo.getVida() - d20) - Jogador.getDestreza());
                danoAtual = danoAtual + Jogador.getDestreza();
            }

            if (inimigo.getVida() <= 0) {
                Jogador.setXp(Jogador.getXp() + 200);
                MainFrame.setControlCombate(2);
                timer.stop();
                fechar.setVisible(true);
                atq.setEnabled(false);
                def.setEnabled(false);
                pot.setEnabled(false);
                textoCombate.setText(TextosCombate.getTextoCombate(6));
                barraVidaInimigo.setValue(inimigo.getVida());
                vidaInimigo.setText("VIDA INIMIGO : 0");
            } else if (Jogador.getClasse() == 1) {
                textoCombate.setText(TextosCombate.getTextoCombate(0) + danoAtual + " de dano.");
            } else if (Jogador.getClasse() == 2) {
                textoCombate.setText(TextosCombate.getTextoCombate(1) + danoAtual + " de dano.");
            } else if (Jogador.getClasse() == 3) {
                textoCombate.setText(TextosCombate.getTextoCombate(2) + danoAtual + " de dano.");
            }
        } else if (d20 > 17) {
            if (Jogador.getClasse() == 1) {
                inimigo.setVida((inimigo.getVida() - d20) - Jogador.getForca() * 2);
                danoAtual = danoAtual + Jogador.getForca() * 2;
            } else if (Jogador.getClasse() == 2) {
                inimigo.setVida((inimigo.getVida() - d20) - Jogador.getInteligencia() * 2);
                danoAtual = danoAtual + Jogador.getInteligencia() * 2;
            } else if (Jogador.getClasse() == 3) {
                inimigo.setVida((inimigo.getVida() - d20) - Jogador.getDestreza() * 2);
                danoAtual = danoAtual + Jogador.getDestreza() * 2;
            }

            if (inimigo.getVida() <= 0) {
                Jogador.setXp(Jogador.getXp() + 200);
                MainFrame.setControlCombate(2);
                timer.stop();
                fechar.setVisible(true);
                atq.setEnabled(false);
                def.setEnabled(false);
                pot.setEnabled(false);
                textoCombate.setText(TextosCombate.getTextoCombate(6));
                barraVidaInimigo.setValue(inimigo.getVida());
                vidaInimigo.setText("VIDA INIMIGO : 0");
            } else {
                textoCombate.setText(TextosCombate.getTextoCombate(3) + danoAtual + " de dano.");
            }
        } else if (d20 <= 5 && d20 > 0) {
            textoCombate.setText(TextosCombate.getTextoCombate(4));
        } else if (d20 == 0) {
            textoCombate.setText(TextosCombate.getTextoCombate(5));
            perdaTurno = 1;
        }
        if(perdaTurnoInimigo > 0){
            perdaTurnoInimigo--;
        } else {
            atqInimigo();
        }
    }//GEN-LAST:event_atqActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void defActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defActionPerformed
        int d20 = dado.nextInt(20);
        int d20Inimigo = dado.nextInt(20);
        int d20Inimigo2 = dado.nextInt(20);
        
        if(d20 > d20Inimigo || d20 > d20Inimigo2){
            if(d20 > d20Inimigo && d20 > d20Inimigo2){
                inimigo.setVida(inimigo.getVida() - inimigo.getForça());
                perdaTurnoInimigo = 2;
                
                return;
            } else {
                return;
            }
        }
        if(perdaTurnoInimigo > 0){
            perdaTurnoInimigo--;
            System.out.println("DEU CERTO");
        } else { 
            atqInimigo();
        }
    }//GEN-LAST:event_defActionPerformed

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        if(Jogador.getPocao() > 0){
            Jogador.setVida(Jogador.getMaxVida());
            Jogador.setPocao(Jogador.getPocao() - 1);
        }
        atqInimigo();
    }//GEN-LAST:event_potActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atq;
    private javax.swing.JProgressBar barraVida;
    private javax.swing.JProgressBar barraVidaInimigo;
    private javax.swing.JButton def;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pot;
    private javax.swing.JTextPane textoCombate;
    private javax.swing.JLabel vidaInimigo;
    private javax.swing.JLabel vidaPersonagem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

        barraVida.setValue(Jogador.getVida() * 2);
        barraVidaInimigo.setValue(inimigo.getVida() / 3);
        vidaInimigo.setText("VIDA INIMIGO : " + inimigo.getVida());
        vidaPersonagem.setText("VIDA : " + Jogador.getVida());
        if(Jogador.getPocao() == 0){
            pot.setEnabled(false);
        }
        
        

    }

    public void atqInimigo() {
        int d20inimigo = dado.nextInt(20);
        float danoDefesa = 0;
        if (d20inimigo > 0) {
            if (Jogador.getDestreza() > 0 && Jogador.getDestreza() < 10 && d20inimigo < 6) {
                //TXT DE DESVIO
                return;
            } else if (Jogador.getDestreza() > 9 && Jogador.getDestreza() < 15 && d20inimigo < 11) {
                //TXT DE DESVIO
                return;
            } else if (Jogador.getDestreza() > 14 && Jogador.getDestreza() < 21 && d20inimigo < 15) {
                //TXT DE DESVIO
                return;
            } else {
                
                Jogador.setVida(Jogador.getVida() - inimigo.getForça());
                // AKI TEM Q FAZER A LOGICA DE DEFESA

                if (Jogador.getVida() <= 0) {
                    System.exit(0);
                }

            }
        }
    }

}
