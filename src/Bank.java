public class Bank {
    private int cash;

    public Bank(int initialCash) {
        this.cash = Math.max(initialCash, 0);
    }

    // Retorna o saldo atual
    public int getCash() {
        return cash;
    }

    // Realiza um depósito
    public void deposit(int value) {
        if (value > 0) {
            cash += value;
        }
    }

    // Tenta sacar uma quantia. Retorna true se o saque foi realizado com sucesso,
    // ou false se o saldo for insuficiente (o saldo nunca ficará negativo).
    public boolean saque(int value) {
        if (value > 0 && value <= cash) {
            cash -= value;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Saldo: " + cash + " moedas";
    }
}
