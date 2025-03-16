import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Character {
    // Variáveis
    private final String name;
    private final String specie;
    private final ElementType type;
    private final int maxEnergy;
    private final int maxHappiness;
    private final Bank bank;
    private final Random random = new Random();
    
    private boolean resting;
    private boolean sick;
    private boolean hurt;
    private boolean hasDebt;
    private boolean playing;
    
    private int health;
    private int age;
    private float energy;
    private double happiness;
    private int debt;

    // Construtor
    public Character(String name) {
        this.name = name;
        this.playing = false;
        this.resting = false;
        this.age = 0;
        this.sick = false;
        this.hurt = false;
        this.happiness = 50;
        this.maxHappiness = 100;
        this.bank = new Bank(100);
        this.health = 3;

        ElementType[] types = ElementType.values();
        this.type = types[random.nextInt(types.length)];
        this.specie = this.type.getSpecieName();
        this.maxEnergy = this.type.getDefaultMaxEnergy();
        this.energy = this.maxEnergy;
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type.toString(); }
    public String getEspecie() { return specie; }
    public int getAge() { return age; }
    public int getDebt() { return debt; }
    public boolean HasDebt() { return hasDebt; }
    public boolean isSick() { return sick; }
    public boolean isHurt() { return hurt; }
    public int getHappiness() { return (int) happiness; }
    public int getMaxHappiness() { return maxHappiness; }
    public int getEnergy() { return (int) this.energy; }
    public int getMaxEnergy() { return maxEnergy; }
    public boolean isPlaying() { return playing; }
    public int getBank() { return bank.getCash(); }
    public int getHealth() { return health; }
    public boolean isResting() { return resting; }

    // Setters e modificadores
    public void setResting(boolean resting) { this.resting = resting; }
    public void setHealth(int health) { this.health = health; }
    public void setPlaying(boolean playing) { this.playing = playing; }
    
    public int setHappiness() {
        int randomAmount = random.nextInt(5, 10);
        this.happiness = Math.min(this.happiness + randomAmount, this.maxHappiness);
        return randomAmount;
    }

    // Ações
    public void feed(String type, boolean rare) {
        if (Objects.equals(type, this.type.toString())) {
            energy = rare ? Math.min(energy + 50, maxEnergy) : Math.min(energy + 30, maxEnergy);
        } else {
            energy = Math.min(energy + 10, maxEnergy);
        }
    }

    public String play(int cost) {
        if(this.sick || this.happiness == 0){
            String param = this.sick ? this.name + " está doente, não pode jogar!" : this.name + " está triste, não pode jogar!";
            return param;
        }
        if(energy > cost) {
            int happinessBonus = (int) this.happiness / 4;
            int energyBonus = (int) this.energy / 4;
            int money = energyBonus + happinessBonus + cost + (this.age / 2);

            this.energy = Math.max(this.energy - (cost + (this.age / 5)), 0);
            int halfcost = cost / 2;
            int dynamicReduction = (int) (this.maxHappiness * 0.1);
            this.happiness = Math.max(this.happiness - (halfcost + dynamicReduction), 0);
            bank.setCash(bank.getCash() + money);
            
            return "\n\nDinheiro recebido com jogo: " + money + "\nTotal no banco: " + getBank();
        } else {
            return "Energia insuficiente (" + energy + "). Alimente o(a) " + this.name + "!";
        }
    }

    public void brincar() {
        if(!playing){return;}
        if(happiness >= maxHappiness){
            playing = false;
            return;
        }
        float customEnergize = 0.2f;
        if (this.energy >= customEnergize) {
            double ganhoFelicidade = (maxHappiness * 0.02);
            this.energy -= customEnergize;
            this.happiness = Math.min(this.happiness + ganhoFelicidade, this.maxHappiness);
            playing = true;
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
        if(!resting){return;}
        float increment = this.maxEnergy * 0.005f; // 0.05% da maxEnergy
        this.energy = Math.min(this.energy + increment, this.maxEnergy);
    }

    public boolean buy(int value) {
        if (bank.getCash() >= value) {
            bank.setCash(bank.getCash() - value);
            return true;
        }
        return false;
    }

    // Métodos de controle do estado
    public void timePass() {
        this.age += 1;
        if (age >= 10) {
            randomSick();
        }
    }
    // 10% de chance de ficar doente
    private void randomSick() {
        if (random.nextInt(10) == 2) {
            this.sick = true;
        }
    }

    // Status do personagem
    public String isAlive() {
        return """
               ====================================
               | """ + this.name + " vive agora! |\n" +
               "| [" + this.specie + " do tipo " + this.type + "] |\n" +
               "====================================\n" +
               "| Idade: " + this.age + " dias\n" +
               "| Felicidade: " + this.happiness + "/" + this.maxHappiness + "\n" +
               "| Energia: " + this.energy + "/" + this.maxEnergy + "\n" +
               "| Estado: " + (this.sick ? "Doente" : "Saudável") + (this.hurt ? " | Ferido" : "") + "\n" +
               (this.health == 3 ? "| Saúde: ❤️❤️❤️ \n" :
                this.health == 2 ? "| Saúde: ❤️❤️ \n" :
                this.health == 1 ? "| Saúde: ❤️ \n" : "| Saúde: 💀💀💀 \n") +
               "| Banco: " + this.bank.getCash() + " moedas\n" +
               "====================================";
    }
}