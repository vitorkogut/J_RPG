package combate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import static combate.main.Jogador;
import static combate.main.MainFrame;
import java.util.Random;


public class Combate extends javax.swing.JFrame implements ActionListener {
    
    inimigo inimigo = new inimigo();
    Random dado = new Random();
    Timer timer = new Timer(50 , this);
    
    int turno = 0;

    public Combate() {
        initComponents();
        timer.start();
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

        pot.setText("POÇÃO");

        barraVida.setBackground(new java.awt.Color(255, 255, 255));
        barraVida.setForeground(new java.awt.Color(204, 0, 0));

        barraVidaInimigo.setForeground(new java.awt.Color(255, 0, 0));

        vidaInimigo.setText("VIDA INIMIGO :");

        vidaPersonagem.setText("VIDA :");

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atq)
                                .addGap(18, 18, 18)
                                .addComponent(def)
                                .addGap(18, 18, 18)
                                .addComponent(pot)
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vidaInimigo)
                                    .addComponent(barraVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(vidaPersonagem))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(vidaPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atqActionPerformed
        
        if(dado.nextInt(20) > 5){
            inimigo.setVida(inimigo.getVida() - 10); // AKI FAZ A LOGICA DE DAR DANO
            if(inimigo.getVida() <= 0){
                Jogador.setXp(Jogador.getXp() + 200);
                MainFrame.setControlCombate(2);
                timer.stop();
                dispose();
                
            }
        }        
        atqInimigo();          
    }//GEN-LAST:event_atqActionPerformed

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
        barraVidaInimigo.setValue(inimigo.getVida());
        vidaInimigo.setText("VIDA INIMIGO : " + inimigo.getVida());
        vidaPersonagem.setText("VIDA : " + Jogador.getVida());
        
    }
    
    public void atqInimigo(){
        if(dado.nextInt(20) > 15){
            Jogador.setVida(Jogador.getVida() - 1); // AKI FAZ A LOGICA DE TOMAR DANO E MORRER
            if(Jogador.getVida() <= 0){
                System.exit(0);
            }
        }
    }

}

