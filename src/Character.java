import java.util.Random;

public class Character {
    // Variáveis
    private final String name;
    private final String specie;
    private final ElementType type;
    private final int maxEnergy;
    private final int maxHappiness = 100;
    private final int maxHunger = 100;
    private final Bank bank;
    private final Random random = new Random();
    private int sickCounter;
    private int healthCounter;
    private int timeRestingCounter;

    private boolean resting;
    private boolean sick;
    private boolean hurt;
    private boolean playing;
    private boolean isDead;

    private int health;
    private int age;
    private float energy;
    private double happiness;
    private int hunger;

    private Thread brainThread;


    // Construtor
    public Character(String name) {
        this.name = name;
        this.playing = false;
        this.resting = false;
        this.age = 0;
        this.sick = false;
        this.hurt = false;
        this.happiness = 50;
        this.hunger = 0;
        this.bank = new Bank(100);
        this.health = 3;
        ElementType[] types = ElementType.values();
        this.type = types[random.nextInt(types.length)];
        this.specie = this.type.getSpecieName();
        this.maxEnergy = this.type.getDefaultMaxEnergy();
        this.energy = this.maxEnergy;
        startBrain();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type.toString();
    }

    public String getEspecie() {
        return specie;
    }

    public int getAge() {
        return age;
    }

    public boolean isSick() {
        return sick;
    }

    public boolean isHurt() {
        return hurt;
    }

    public int getHappiness() {
        return (int) happiness;
    }

    public int getHunger() {return hunger; }

    public int getMaxHappiness() {
        return maxHappiness;
    }

    public int getMaxHunger() { return  maxHunger; };

    public int getEnergy() {
        return (int) this.energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public boolean isPlaying() {
        return playing;
    }

    public int getBank() {
        return bank.getCash();
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return isDead;
    }

    // Setters e modificadores

    public void startResting() {
        this.resting = true;
    }
    public void stopResting() {
        this.resting = false;
    }

    private void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, 3)); // Saúde entre 0 e 3
        if (this.health == 0) {
            isDead = true;
        }
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    // Ações


    public String play(int cost) {
        if (this.sick || this.hurt || this.happiness == 0) {
            return this.sick ? this.name + " está doente, não pode jogar!" :
                    this.hurt ? this.name + " está machucado, não pode jogar!" :
                            this.name + " está triste, não pode jogar!";
        }
        if (energy > cost  && hunger < maxHunger) {
            int happinessBonus = (int) this.happiness / 4;
            int energyBonus = (int) this.energy / 4;
            int money = energyBonus + happinessBonus + cost + (this.age / 2);

            this.energy = Math.max(this.energy - (cost + ((float) this.age / 5)), 0);
            int halfcost = cost / 2;
            int dynamicReduction = (int) (this.maxHappiness * 0.1);
            this.happiness = Math.max(this.happiness - (halfcost + dynamicReduction), 0);
            bank.deposit(money);

            String machucado = "";
            if(random.nextInt(100) < 5 && age > 5) {
                this.hurt = true;
                machucado = "\n⚡ " + this.name + " se machucou durante o jogo!";
            }

            return "\n\nDinheiro recebido com jogo: " + money +
                    "\nTotal no banco: " + getBank() +
                    machucado;
        } else {
            return "Energia insuficiente (" + (int)energy + "). Alimente o(a) " + this.name + " e deixe o descansar!";
        }
    }

    public void brincar() {
        if (!playing) {
            return;
        }
        if (happiness >= maxHappiness) {
            playing = false;
            return;
        }
        float customEnergize = 0.2f;
        if (this.energy >= customEnergize) {
            double ganhoFelicidade = (maxHappiness * 0.02);
            this.energy -= customEnergize;
            this.happiness = Math.min(this.happiness + ganhoFelicidade, this.maxHappiness);
        } else {
            playing = false;
        }
    }

    public Object[] canPlay() {
        String motivo;
        if (sick || hurt) {
            motivo = sick ? "doente" : "ferido";
            playing = false;
            return new Object[]{false, motivo};
        }
        playing = true;
        motivo = "\n\nVoce esta brincando com " + name;
        return new Object[]{true, motivo};

    }

    public void rest() {
        if (!resting) {
            return;
        }
        float increment = this.maxEnergy * 0.005f; // 0.05% da maxEnergy
        this.energy = Math.min(this.energy + increment, this.maxEnergy);
    }

    // Metodo para medicar o personagem (custo: 150 moedas)
    public String medicate() {
        int custo = 150;
        if (bank.getCash() < custo) {
            return "Saldo insuficiente para medicar " + this.name + "! Voce precisa de 60 moedas";
        }
        if (this.sick || this.hurt) {
            if (bank.saque(custo)) {
                this.sick = false;
                this.hurt = false;
                this.sickCounter = 0;
                this.happiness = Math.min(this.happiness + 10, maxHappiness);
                return this.name + " foi medicado com sucesso! (-" + custo + " moedas)";
            }
        }
        return this.name + " não está doente!";
    }

    // Metodo para alimentar o personagem (custo: 20 moedas)
    public String feed() {
        if(hunger < 10){
            return name + " não está com fome!";
        }
        int custo = 100;
        if (bank.getCash() < custo) {
            return "Saldo insuficiente para alimentar " + this.name + "!";
        }
        if (bank.saque(custo)) {
            int fomeAntes = this.hunger;
            if (this.hunger > 0) {
                this.hunger = Math.max(this.hunger - 30, 0);
                this.energy = Math.min(this.energy + 5, this.maxEnergy);
                this.happiness = Math.min(this.happiness + 5, this.maxHappiness);
            }
            return this.name + " foi alimentado com sucesso! (Fome: " + fomeAntes + " -> " + this.hunger + " | -"+ custo +" moedas)";
        }
        return "Operação não realizada!";
    }




    // Métodos de controle do estado
    public void timePass() {
        if (isDead) {
            return;
        }
        // passa o tempo 10 vezes mais lento se esta descansando
        if(resting) {
            timeRestingCounter++;
            if (timeRestingCounter > 10) {
                this.age += 1;
                timeRestingCounter = 0;
            }
            return;
        }

        this.age += 1;
        this.hunger = Math.min(this.hunger + 10, maxHunger);

        if (age >= 10) {
            randomSick();
        }

        if (sick) {
            sickCounter++;
            if (sickCounter >= 2) {
                setHealth(health - 1);
                sickCounter = 0;
            }
        }else {
            healthCounter++;
            if (healthCounter >= 2) {
                setHealth(health + 1);
                healthCounter = 0;
            }
        }
    }

    // gera uma probabilade de ficar doente de acordo com felicidade e fome
    private void randomSick() {
        double hungerRatio = (double) hunger / maxHunger;
        double unhappinessRatio = 1.0 - (happiness / maxHappiness);
        double riskFactor = (hungerRatio + unhappinessRatio) / 2.0;
        int chance = (int) (riskFactor * 15.0);
        chance = Math.min(15, Math.max(0, chance));

        if (random.nextInt(100) < chance) {
            this.sick = true;
        }
    }

    public void startBrain() {
        if (brainThread == null) {
            brainThread = new Thread(new Brain(this));
            brainThread.start();
        }
    }

    // Status do personagem
    public String isAlive() {
        if (isDead) {
            return """
                    ====================================
                    » FIM DE JOGO -\s""" + this.name.toUpperCase() + " «\n" +
                    "====================================\n" +
                    "» Sobreviveu por: " + this.age + " dias\n" +
                    "» Espécie: " + this.specie + "\n" +
                    "» Elemento: " + this.type + "\n" +
                    "» Saúde final: " + "💀💀💀\n" +
                    "» Banco final: " + this.bank.getCash() + " moedas\n" +
                    "====================================\n" +
                    "|    O " + this.name + " descansou em paz...    |\n" +
                    "====================================";
        } else {
            return """
                    ====================================
                    |\s""" + this.name + " vive agora! |\n" +
                    "| [" + this.specie + " do tipo " + this.type + "] |\n" +
                    "====================================\n" +
                    "| Idade: " + this.age + " dias\n" +
                    "| Fome: " + this.hunger + "/" + this.maxHunger + "\n" +
                    "| Felicidade: " + (int) this.happiness + "/" + this.maxHappiness + "\n" +
                    "| Energia: " + (int) this.energy + "/" + this.maxEnergy + "\n" +
                    "| Estado: " + (this.sick ? "Doente" : "Saudável") + (this.hurt ? " | Ferido" : "") + "\n" +
                    (this.health == 3 ? "| Saúde: ❤️❤️❤️ \n" :
                            this.health == 2 ? "| Saúde: ❤️❤️ \n" :
                                    this.health == 1 ? "| Saúde: ❤️ \n" : "| Saúde: 💀💀💀 \n") +
                    "| Banco: " + this.bank.getCash() + " moedas\n" +
                    "====================================";
        }
    }

}