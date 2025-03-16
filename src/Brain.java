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
                // Verifica se passou 60 segundos (1 dia)
                if (Duration.between(ultimoTimePass, agora).getSeconds() >= 10) {
                    executarDia();
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

    private void executarDia() {
        boneco.timePass();
        if (boneco.isSick()) {
            boneco.setHealth(Math.max(boneco.getHealth() - 1, 0));
            if (boneco.getHealth() == 0) {
                parar();
                System.out.println("Boneco morreu!");
            }
        }
    }

    public void parar() {
        executando = false;
    }
}