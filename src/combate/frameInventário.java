package combate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import static combate.main.Jogador;
import static combate.main.MainFrame;


public class frameInventário extends javax.swing.JFrame implements ActionListener {

    public frameInventário() {
        initComponents();
        Timer timer = new Timer(50 , this);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        reforço = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        forcaJogador = new javax.swing.JLabel();
        intJogador = new javax.swing.JLabel();
        destrezaJogador = new javax.swing.JLabel();
        goldJogador = new javax.swing.JLabel();
        preçoReforço = new javax.swing.JLabel();
        defasaJogador = new javax.swing.JLabel();
        vidaJogador = new javax.swing.JLabel();
        qntPot = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jScrollPane1.setViewportView(jTextPane1);

        reforço.setText("Reforçar");
        reforço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reforçoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOTAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELMO");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ARMADURA");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ARMA 1");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ARMA 2");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);

        forcaJogador.setText("ATAQUE :");

        intJogador.setText("INTELIGÊNCIA :");

        destrezaJogador.setText("DESTREZA :");

        goldJogador.setText("Gold : ");

        preçoReforço.setText("Reforçar Equipamento : ");

        defasaJogador.setText("DEFESA :");

        vidaJogador.setText("VIDA :");

        qntPot.setText("POÇÃO :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reforço)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(preçoReforço)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destrezaJogador)
                            .addComponent(forcaJogador)
                            .addComponent(intJogador)
                            .addComponent(defasaJogador)
                            .addComponent(vidaJogador)
                            .addComponent(qntPot))))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(goldJogador)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(forcaJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(destrezaJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(defasaJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vidaJogador)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qntPot)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(preçoReforço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reforço)
                    .addComponent(goldJogador))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reforçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reforçoActionPerformed
        
        if(Jogador.getGold() >= MainFrame.getPreco()){
            Jogador.setGold(Jogador.getGold() - MainFrame.getPreco());
            if(Jogador.getClasse() == 1){
                Jogador.setForca(Jogador.getForca() + 5);
            } else if(Jogador.getClasse() == 2){
                Jogador.setInteligencia(Jogador.getInteligencia() + 5);
            } else if(Jogador.getClasse() == 3){
                Jogador.setDestreza(Jogador.getDestreza() + 5);
            } else {
                Jogador.setForca(Jogador.getForca() + 2);
                Jogador.setInteligencia(Jogador.getInteligencia() + 2);
                Jogador.setDestreza(Jogador.getDestreza() + 2);
            }
            Jogador.setDefesa(Jogador.getDefesa() + 25);
            if(Jogador.getMaxVida() + 25 < 51){
                Jogador.setMaxVida(Jogador.getMaxVida() + 25);
            } else {
                Jogador.setMaxVida(50);
            }
            MainFrame.setPreco(MainFrame.getPreco() + 25);          
        }
    }//GEN-LAST:event_reforçoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInventário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel defasaJogador;
    private javax.swing.JLabel destrezaJogador;
    private javax.swing.JLabel forcaJogador;
    private javax.swing.JLabel goldJogador;
    private javax.swing.JLabel intJogador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel preçoReforço;
    private javax.swing.JLabel qntPot;
    private javax.swing.JButton reforço;
    private javax.swing.JLabel vidaJogador;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        forcaJogador.setText("Força : " + Jogador.getForca());
        intJogador.setText("Inteligência : " + Jogador.getInteligencia());
        destrezaJogador.setText("Destreza : " + Jogador.getDestreza());
        defasaJogador.setText("Defesa : " + Jogador.getDefesa());
        vidaJogador.setText("Vida Maxima : " + Jogador.getMaxVida());
        goldJogador.setText("Gold : " + Jogador.getGold());
        qntPot.setText("Poção : " + Jogador.getPocao() + "/10");
        preçoReforço.setText("Reforçar equipamento : " + MainFrame.getPreco());
        
    }
}
