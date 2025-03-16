
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        setOptionVisible(false);
        setMenuVisible(false);
        startUIUpdateTimer();
        
    }
    Character boneco;
    private boolean localPlaying;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        criarBtn = new javax.swing.JButton();
        jogarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        descansarToggle = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        caixaNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        opcao1Btn = new javax.swing.JButton();
        opcao2Btn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        brincarBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 780));
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("Especie:");

        jLabel3.setText("Tipo:");

        criarBtn.setText("Criar um novo Tamagotchi");
        criarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarBtnActionPerformed(evt);
            }
        });

        jogarBtn.setText("Jogar");
        jogarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Idade:");

        descansarToggle.setText("Descansar");
        descansarToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descansarToggleActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        caixaNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caixaNome.setToolTipText("jh");

        opcao1Btn.setText("Opcao 1");
        opcao1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao1BtnActionPerformed(evt);
            }
        });

        opcao2Btn.setText("Opcao 2");
        opcao2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao2BtnActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(51, 0, 255));
        jProgressBar1.setValue(50);

        jLabel9.setText("Felicidade:");

        jProgressBar2.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar2.setForeground(new java.awt.Color(204, 204, 0));
        jProgressBar2.setValue(50);

        jLabel10.setText("Energia:");

        jLabel11.setText("Estado:");

        jLabel13.setText("Vida:");

        jLabel14.setText("Vida");

        brincarBtn.setText("Brincar");
        brincarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brincarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                        .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(criarBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(32, 32, 32)
                                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jogarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brincarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descansarToggle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcao1Btn)
                                .addGap(55, 55, 55)
                                .addComponent(opcao2Btn)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(criarBtn)
                        .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addComponent(jLabel14))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12))
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcao1Btn)
                    .addComponent(opcao2Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogarBtn)
                    .addComponent(descansarToggle)
                    .addComponent(brincarBtn))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(616, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarBtnActionPerformed
        String value = caixaNome.getText();
        if(!Objects.equals(value, "")){
                        Thread brain = new Thread(new Brain(boneco = new Character(value)));
                        brain.start();
        }else{
            return;
        }
        SwingUtilities.invokeLater(() -> {
                setMenuVisible(true);
                appendTextSystem(boneco.isAlive());
                criarBtn.setVisible(false);
                caixaNome.setVisible(false);
                jLabel5.setText(boneco.getName());
                jLabel6.setText(boneco.getEspecie());
                jLabel7.setText(boneco.getType());
                jLabel8.setText((String.valueOf(boneco.getAge())));
                jLabel12.setText((boneco.isSick() ? "Doente" : "Saudável"));
                jProgressBar1.setMaximum(boneco.getMaxHappiness());
                jProgressBar1.setValue(boneco.getHappiness());
                jProgressBar2.setMaximum(boneco.getMaxEnergy());
                jProgressBar2.setValue(boneco.getEnergy());
                jLabel14.setText(boneco.getHealth() == 3 ? "❤️❤️❤️" :
                   boneco.getHealth() == 2 ? "❤️❤️" :
                   boneco.getHealth() == 1 ? "❤️" : "💀💀💀");
            });
        
    }//GEN-LAST:event_criarBtnActionPerformed
    boolean jogando = false;
    private void jogarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarBtnActionPerformed
        switchMenuOption(true);
        jogando = true;
        appendTextSystem("""
                         
                         
                         ============|       MENU JOGOS           |============
                              | Selecione uma op\u00e7\u00e3o:            |
                              | 1 - Jogo 1 - custo 5    |
                              | 2 - Jogo 2 - custo 10  |
                         ======================================================
                            Escolha o n\u00famero da op\u00e7\u00e3o desejada: 
                         """);
        
    }//GEN-LAST:event_jogarBtnActionPerformed

    private void opcao1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao1BtnActionPerformed
        switchMenuOption(false);
        if(jogando){
            processarEscolhaJogo(1,5);
            jogando = false;
        }
    }//GEN-LAST:event_opcao1BtnActionPerformed

    private void opcao2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao2BtnActionPerformed
        switchMenuOption(false);
        if(jogando){
            processarEscolhaJogo(2,10);
            jogando = false;
        }
    }//GEN-LAST:event_opcao2BtnActionPerformed

    private void descansarToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descansarToggleActionPerformed
        if(descansarToggle.isSelected()){
            jogarBtn.setVisible(false);
            brincarBtn.setVisible(false);
            boneco.setResting(true);
            appendTextSystem("\n\n💤 " + boneco.getName() + " está roncando profundamente..." +
                    "\n(clique em acordar a qualquer momento para interromper o descanso)");
            descansarToggle.setText("Acordar");
        }
        else{
            jogarBtn.setVisible(true);
            brincarBtn.setVisible(true);
            boneco.setResting(false);
            appendTextSystem("\n⏳ Acordando... Lembre-se: "+
                    boneco.getName() + " precisa descansar regularmente");
            descansarToggle.setText("Descansar");
        }
    }//GEN-LAST:event_descansarToggleActionPerformed

    private void brincarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brincarBtnActionPerformed
        if(brincarBtn.isSelected()){
            if (boneco.isSick() || boneco.isHurt()) {
                String motivo = boneco.isSick() ? "doente" : "ferido";
                boneco.setPlaying(false);
                appendTextSystem(boneco.getName() + " está " + motivo + " e não pode brincar!");
                brincarBtn.setSelected(false);
                return;
            }
            boneco.setPlaying(true);
            if(boneco.isPlaying()){
                updateUIPlaying(true);
                localPlaying = true;
                appendTextSystem("\n\nVoce esta brincando com " + boneco.getName());
            }
            else {
                updateUIPlaying(false);
            }

        }else{
           localPlaying = false;
           updateUIPlaying(false);
           appendTextSystem("\n\n🛑 " + boneco.getName() + " parou de brincar");
        }
    }
    private void updateUIPlaying(boolean isPlaying) {
        SwingUtilities.invokeLater(() -> {
            brincarBtn.setText(isPlaying ? "Parar" : "Brincar");
            jogarBtn.setVisible(!isPlaying);
            descansarToggle.setVisible(!isPlaying);
            brincarBtn.setSelected(isPlaying);
        });
    }

    public void appendTextSystem(String text) {
        try {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String timestamp = now.format(formatter);
            String header = String.format("\n=== SISTEMA [%s] ===\n", timestamp);
            String footer = "────────────────────────────────────────────\n";
            String finalText = header + text + "\n" + footer;
            Document doc = jTextPane1.getDocument();
            doc.insertString(doc.getLength(), finalText, null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
    private void processarEscolhaJogo(int jogo, int custo) {
        
        appendTextSystem("\nJogo " + jogo + " selecionado! Custo: " + custo + " energias.\n" + boneco.play(custo));
        
    }
    
    public void switchMenuOption(boolean bool){
        setMenuVisible(!bool);
        setOptionVisible(bool);
    }
    
    public final void setOptionVisible(boolean bool){
        opcao1Btn.setVisible(bool);
        opcao2Btn.setVisible(bool);
    }
    public final void setMenuVisible(boolean bool){
        jogarBtn.setVisible(bool);
        brincarBtn.setVisible(bool);
        descansarToggle.setVisible(bool);
    }
    
    //inicia o timer de update da ui
    private void startUIUpdateTimer() {
        Timer timer = new Timer(1, e -> updateUI());
        timer.start();
    }
    // atualiza as informacoes na ui
    public void updateUI(){
        if(boneco != null){
            try{
                SwingUtilities.invokeLater(() -> {
                    jLabel8.setText((String.valueOf(boneco.getAge())));
                    jLabel12.setText((boneco.isSick() ? "Doente" : "Saudável"));
                    jProgressBar1.setValue(boneco.getHappiness());
                    jProgressBar2.setValue(boneco.getEnergy());
                    jLabel14.setText(boneco.getHealth() == 3 ? "❤️❤️❤️" :
                            boneco.getHealth() == 2 ? "❤️❤️" :
                                    boneco.getHealth() == 1 ? "❤️" : "💀💀💀");
                    if(localPlaying && !boneco.isPlaying()){
                        updateUIPlaying(false);
                        appendTextSystem("\n\n🛑 " + boneco.getName() + " parou de brincar");
                        localPlaying = false;
                    }
                });
            }catch(Exception e){
                System.out.println("erro: " + e);
            }
        }
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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton brincarBtn;
    private javax.swing.JTextField caixaNome;
    private javax.swing.JButton criarBtn;
    private javax.swing.JToggleButton descansarToggle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jogarBtn;
    private javax.swing.JButton opcao1Btn;
    private javax.swing.JButton opcao2Btn;
    // End of variables declaration//GEN-END:variables
}
