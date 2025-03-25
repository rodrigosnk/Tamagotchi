
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


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
        jLabel15 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        alimentar = new javax.swing.JButton();
        medicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tamagotchi ADS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 780));
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("Especie:");

        jLabel3.setText("Tipo:");

        criarBtn.setBackground(new java.awt.Color(51, 204, 0));
        criarBtn.setForeground(new java.awt.Color(255, 255, 255));
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
        jTextPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTextPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextPane1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextPane1);

        caixaNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caixaNome.setToolTipText("jh");

        jLabel5.setForeground(new java.awt.Color(0, 51, 255));

        jLabel6.setForeground(new java.awt.Color(0, 51, 255));

        jLabel7.setForeground(new java.awt.Color(0, 51, 255));

        jLabel8.setForeground(new java.awt.Color(0, 51, 255));

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

        jLabel12.setForeground(new java.awt.Color(0, 51, 255));

        jLabel13.setText("Vida:");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));

        brincarBtn.setText("Brincar");
        brincarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brincarBtnActionPerformed(evt);
            }
        });

        jLabel15.setText("Banco:");

        jProgressBar4.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar4.setForeground(new java.awt.Color(255, 153, 153));
        jProgressBar4.setValue(50);

        jLabel16.setText("Fome:");

        jLabel17.setForeground(new java.awt.Color(0, 51, 255));

        jLabel19.setText("Digite o nome aqui:");

        alimentar.setText("Alimentar");
        alimentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alimentarActionPerformed(evt);
            }
        });

        medicar.setText("Medicar");
        medicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(123, 123, 123))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(opcao1Btn)
                                        .addGap(55, 55, 55)
                                        .addComponent(opcao2Btn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jogarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(brincarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descansarToggle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alimentar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(medicar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(criarBtn)
                                .addGap(40, 40, 40))))))
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
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(criarBtn)
                            .addComponent(caixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcao1Btn)
                    .addComponent(opcao2Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogarBtn)
                    .addComponent(descansarToggle)
                    .addComponent(brincarBtn)
                    .addComponent(alimentar)
                    .addComponent(medicar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(616, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //cria o tamagotchi se o valor da caixa de texto nao for vazio
    private void criarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarBtnActionPerformed
        String value = caixaNome.getText();
        if(Objects.equals(value, "")) {
            return;
        }
        boneco = new Character(value);
        SwingUtilities.invokeLater(() -> {
                setMenuVisible(true);
                showTextSystem(boneco.isAlive());
                criarBtn.setVisible(false);
                caixaNome.setVisible(false);
                jLabel19.setVisible(false);
                jLabel5.setText(boneco.getName());
                jLabel6.setText(boneco.getEspecie());
                jLabel7.setText(boneco.getType());
                jLabel8.setText((String.valueOf(boneco.getAge())));
                jLabel12.setText((boneco.isSick() ? "Doente" : "Saudável" + (boneco.isHurt() ? " | Ferido" : "")));
                jProgressBar1.setMaximum(boneco.getMaxHappiness());
                jProgressBar1.setValue(boneco.getHappiness());
                jProgressBar2.setMaximum(boneco.getMaxEnergy());
                jProgressBar2.setValue(boneco.getEnergy());
                jProgressBar4.setMaximum(boneco.getMaxHunger());
                jProgressBar4.setValue(boneco.getHunger());
                jLabel17.setText(String.valueOf(boneco.getBank()));
                jLabel14.setText(boneco.getHealth() == 3 ? "❤️❤️❤️" :
                   boneco.getHealth() == 2 ? "❤️❤️" :
                   boneco.getHealth() == 1 ? "❤️" : "💀💀💀");
            });
        
    }//GEN-LAST:event_criarBtnActionPerformed
    
    
    boolean jogando = false;
    private void jogarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarBtnActionPerformed
        switchMenuOption(true);
        jogando = true;
        showTextSystem("""
                 
                 
                 =============|      MENU DE JOGOS       |=============
                 |                                               |
                 |   Bem-vindo(a) ao Menu de Jogos!              |
                 |   Opções disponíveis:                         |
                 |   1 - Jogo Clássico         - Energia: 5,00   |
                 |   2 - Jogo Premium          - Energia: 10,00  |
                 |                                               |
                 =================================================
                 Por favor, Selecione o número correspondente à opção desejada:
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
            medicar.setVisible(false);
            alimentar.setVisible(false);
            boneco.startResting();
            showTextSystem("\n\n💤 " + boneco.getName() + " está roncando profundamente..." +
                    "\n(clique em acordar a qualquer momento para interromper o descanso)");
            descansarToggle.setText("Acordar");
        }
        else{
            jogarBtn.setVisible(true);
            brincarBtn.setVisible(true);
            medicar.setVisible(true);
            alimentar.setVisible(true);
            boneco.stopResting();
            showTextSystem("\n⏳ Acordando... Lembre-se: "+
                    boneco.getName() + " precisa descansar regularmente");
            descansarToggle.setText("Descansar");
        }
    }//GEN-LAST:event_descansarToggleActionPerformed

    private void brincarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brincarBtnActionPerformed
        if(brincarBtn.isSelected()){
            Object[] response = boneco.canPlay();
            if((boolean)response[0] == false){
                showTextSystem((String) response[1]);
                brincarBtn.setSelected(false);
                return;
            }
            updateUIPlaying(true);
            localPlaying = true;
            showTextSystem((String) response[1]);
        }else{
            boneco.setPlaying(false);
           localPlaying = false;
           updateUIPlaying(false);
           showTextSystem("\n\n🛑 " + boneco.getName() + " parou de brincar");
        }
    }//GEN-LAST:event_brincarBtnActionPerformed

    private void medicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicarActionPerformed
        if (boneco.isSick() || boneco.isHurt()) {
            boneco.medicate();
            showTextSystem(boneco.getName() + " foi medicado e agora está saudável!");
        } else {
            showTextSystem(boneco.getName() + " não está doente!");
        }
    }//GEN-LAST:event_medicarActionPerformed

    private void alimentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alimentarActionPerformed
        if(boneco.getHunger() < 10){
             showTextSystem(boneco.getName() + " nao esta com fome!");
             return;
        }
        int fomeAntes = boneco.getHunger();
        boneco.feed();
        int fomeDepois = boneco.getHunger();
        showTextSystem(boneco.getName() + " foi alimentado. Fome: " + fomeAntes + " -> " + fomeDepois);
    }//GEN-LAST:event_alimentarActionPerformed

    private void updateUIPlaying(boolean isPlaying) {
        SwingUtilities.invokeLater(() -> {
            brincarBtn.setText(isPlaying ? "Parar" : "Brincar");
            jogarBtn.setVisible(!isPlaying);
            descansarToggle.setVisible(!isPlaying);
            brincarBtn.setSelected(isPlaying);
            medicar.setVisible(!isPlaying);
            alimentar.setVisible(!isPlaying);
        });
    }

    public void showTextSystem(String text) {
        try {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String timestamp = now.format(formatter);
            String header = String.format("\n=== SISTEMA [%s] ===\n", timestamp);
            String footer = "────────────────────────────────────────────\n";
            String finalText = header + text + "\n" + footer;
            jTextPane1.setText(finalText);
            //Document doc = jTextPane1.getDocument();
            //doc.insertString(doc.getLength(), finalText, null);
        } catch (Exception ex) {
        }
    }
    private void processarEscolhaJogo(int jogo, int custo) {
        
        showTextSystem("\nJogo " + jogo + " selecionado! Custo: " + custo + " energias.\n" + boneco.play(custo));
        
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
        medicar.setVisible(bool);
        alimentar.setVisible(bool);
    }
    
    //inicia o timer de update da ui
    Timer timer;
    private void startUIUpdateTimer() {
        timer = new Timer(1, e -> updateUI());
        timer.start();
    }
    // atualiza as informacoes na ui
    public void updateUI(){
        if(boneco != null){
            try{
                SwingUtilities.invokeLater(() -> {
                    jLabel8.setText((String.valueOf(boneco.getAge())));
                    jLabel12.setText((boneco.isSick() ? "Doente" : "Saudável" + (boneco.isHurt() ? " | Ferido" : "")));
                    if (boneco.isSick() || boneco.isHurt()) {
                        jLabel12.setForeground(Color.red);
                    } else {
                        jLabel12.setForeground(Color.decode("#0033FF"));
                    }
                    jProgressBar1.setValue(boneco.getHappiness());
                    jProgressBar2.setValue(boneco.getEnergy());
                    jProgressBar4.setValue(boneco.getHunger());
                    jLabel17.setText(String.valueOf(boneco.getBank()));
                    jLabel14.setText(boneco.getHealth() == 3 ? "❤️❤️❤️" :
                            boneco.getHealth() == 2 ? "❤️❤️" :
                                    boneco.getHealth() == 1 ? "❤️" : "💀💀💀");
                    if(localPlaying && !boneco.isPlaying()){
                        updateUIPlaying(false);
                        showTextSystem("\n\n🛑 " + boneco.getName() + " parou de brincar");
                        localPlaying = false;
                    }
                    if(boneco.isDead()){
                        showTextSystem(boneco.isAlive());
                        setMenuVisible(false);
                        setOptionVisible(false);
                        timer.stop();
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
    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alimentar;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jogarBtn;
    private javax.swing.JButton medicar;
    private javax.swing.JButton opcao1Btn;
    private javax.swing.JButton opcao2Btn;
    // End of variables declaration//GEN-END:variables
}
