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


/**
 *
 * @author 6462340
 */
public class frameUP extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form frameUP
     */
    public frameUP() {
        initComponents();
        Timer timer = new Timer(200, this);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelPontosUP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frameForca = new javax.swing.JLabel();
        diminuiForca = new javax.swing.JButton();
        aumentaForca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        frameDefesa = new javax.swing.JLabel();
        diminuiDefesa = new javax.swing.JButton();
        aumentaDefesa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        frameVida = new javax.swing.JLabel();
        diminuiVida = new javax.swing.JButton();
        aumentaVida = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("PONTOS:");

        labelPontosUP.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("FORÇA: ");

        frameForca.setText("jLabel3");

        diminuiForca.setText("-");
        diminuiForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuiForcaActionPerformed(evt);
            }
        });

        aumentaForca.setText("+");
        aumentaForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaForcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("DEFESA:");

        frameDefesa.setText("jLabel3");

        diminuiDefesa.setText("-");
        diminuiDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuiDefesaActionPerformed(evt);
            }
        });

        aumentaDefesa.setText("+");
        aumentaDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaDefesaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("VIDA:");

        frameVida.setText("jLabel3");

        diminuiVida.setText("-");
        diminuiVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuiVidaActionPerformed(evt);
            }
        });

        aumentaVida.setText("+");
        aumentaVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaVidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPontosUP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(frameVida)
                                .addGap(18, 18, 18)
                                .addComponent(diminuiVida)
                                .addGap(4, 4, 4)
                                .addComponent(aumentaVida))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(frameDefesa)
                                    .addGap(18, 18, 18)
                                    .addComponent(diminuiDefesa)
                                    .addGap(4, 4, 4)
                                    .addComponent(aumentaDefesa))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(frameForca)
                                    .addGap(18, 18, 18)
                                    .addComponent(diminuiForca)
                                    .addGap(4, 4, 4)
                                    .addComponent(aumentaForca))))))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelPontosUP))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(frameForca)
                    .addComponent(diminuiForca)
                    .addComponent(aumentaForca))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(frameDefesa)
                    .addComponent(diminuiDefesa)
                    .addComponent(aumentaDefesa))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(frameVida)
                    .addComponent(diminuiVida)
                    .addComponent(aumentaVida))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void UpdateDados(){
        frameForca.setText(Integer.toString(Jogador.getForca()));
        frameVida.setText(Integer.toString(Jogador.getVida()));
        frameDefesa.setText( Integer.toString(Jogador.getDefesa()) );
        labelPontosUP.setText( Integer.toString(Jogador.getPontosUP()) );
    }
    
    private void aumentaForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaForcaActionPerformed
        
        if(Jogador.pontosUP > 0){
            Jogador.setForca( Jogador.getForca() + 1);
            Jogador.setPontosUP( Jogador.pontosUP - 1);
            UpdateDados();
        }
        
    }//GEN-LAST:event_aumentaForcaActionPerformed

    private void aumentaDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaDefesaActionPerformed
         if(Jogador.pontosUP > 0){
            Jogador.setDefesa( Jogador.getDefesa() + 1);
            Jogador.setPontosUP( Jogador.pontosUP - 1);
            UpdateDados();
        }
    }//GEN-LAST:event_aumentaDefesaActionPerformed

    private void aumentaVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaVidaActionPerformed
         if(Jogador.pontosUP > 0){
            Jogador.setVida( Jogador.getVida() + 1);
            Jogador.setPontosUP( Jogador.pontosUP - 1);
            UpdateDados();
        }
    }//GEN-LAST:event_aumentaVidaActionPerformed

    private void diminuiForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuiForcaActionPerformed
        if(Jogador.getForca() > 0){
            Jogador.setForca( Jogador.getForca() - 1);
            Jogador.setPontosUP( Jogador.pontosUP + 1);
            UpdateDados();
        }
    }//GEN-LAST:event_diminuiForcaActionPerformed

    private void diminuiVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuiVidaActionPerformed
        if(Jogador.getVida() > 1 ){
            Jogador.setVida( Jogador.getVida() - 1);
            Jogador.setPontosUP( Jogador.pontosUP + 1);
            UpdateDados();
        }       
    }//GEN-LAST:event_diminuiVidaActionPerformed

    private void diminuiDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuiDefesaActionPerformed
        if(Jogador.getDefesa() > 0){
            Jogador.setDefesa( Jogador.getDefesa() - 1);
            Jogador.setPontosUP( Jogador.pontosUP + 1);
            UpdateDados();
        }
    }//GEN-LAST:event_diminuiDefesaActionPerformed

public void setPtsUP(int pontos){
    labelPontosUP.setText( Integer.toString(pontos));
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aumentaDefesa;
    private javax.swing.JButton aumentaForca;
    private javax.swing.JButton aumentaVida;
    private javax.swing.JButton diminuiDefesa;
    private javax.swing.JButton diminuiForca;
    private javax.swing.JButton diminuiVida;
    private javax.swing.JLabel frameDefesa;
    private javax.swing.JLabel frameForca;
    private javax.swing.JLabel frameVida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelPontosUP;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        UpdateDados();
    }

}
