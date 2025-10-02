package pkgQuiz;
import javax.swing.JOptionPane;

public class frmQuestao2 extends javax.swing.JFrame {
    public frmQuestao2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpResposta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Onde fica o Nameless King?</html>");

        grpResposta.add(rbA);
        rbA.setSelected(true);
        rbA.setText("Pico dos Arquidragões");
        rbA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        grpResposta.add(rbB);
        rbB.setText("Anor Londo");
        rbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBActionPerformed(evt);
            }
        });

        grpResposta.add(rbC);
        rbC.setText("Santuário do Elo do Fogo");
        rbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnviar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbA)
                        .addComponent(rbB)
                        .addComponent(rbC)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbC)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBActionPerformed
    }//GEN-LAST:event_rbBActionPerformed

    private void rbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCActionPerformed
    }//GEN-LAST:event_rbCActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        Controle c = new Controle();
        if (rbA.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "Acertou!!!");
            c.setnAcertos(c.getnAcertos()+1);
        }

        frmQuestao3 tela3 = new frmQuestao3();
        tela3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuestao2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup grpResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbC;
    // End of variables declaration//GEN-END:variables
}
