/**
 *
 * @author Rodrigo
 */
public class Bank {
    private int cash;
    private int debt;
    private int portion;
    public Bank(int cash){
        this.debt = 0;
        this.portion = 0;
        this.cash = cash;
    }
    public int getDebtPortion() {
        return debt / portion;
    }
    public int getDebt() {
        return debt;
    }

    public int getCash() {
        return cash;
    }

    public int getPortion() {
        return portion;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }
    public void setPortion(int portion) {
        this.portion = portion;
    }
}
