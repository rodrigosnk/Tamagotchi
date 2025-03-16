import java.time.Duration;
import java.time.LocalDateTime;

public class Brain implements Runnable {
    private volatile boolean executando = true;
    private final Character boneco;
    private LocalDateTime ultimoTimePass;

    public Brain(Character boneco) {
        this.boneco = boneco;
        this.ultimoTimePass = LocalDateTime.now();
    }

    @Override
    public void run() {
        while (executando) {
            try {
                LocalDateTime agora = LocalDateTime.now();
                // Verifica se passou  (1 dia)
                if (Duration.between(ultimoTimePass, agora).getSeconds() >= 10) {
                    executeDia();
                    ultimoTimePass = agora;
                }
                boneco.rest();
                boneco.brincar();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Cérebro interrompido!");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Cérebro finalizado!");
    }

    private void executeDia() {
        boneco.timePass();
        if (boneco.isDead()) {
            parar();
        }
    }

    public void parar() {
        executando = false;
    }
}