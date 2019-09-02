package nestedInner.accountBank;

interface Card { }

public class AccountBank {
    private final String owner;
    private final String numberCard;
    private double amount;

    public AccountBank(String owner, String numberCard) {
        this.owner = owner;
        this.numberCard = numberCard;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public double getAmount() {
        return amount;
    }

    public synchronized double withdraw(final double amountWithDraw) {
        if(amountWithDraw > getAmount()) {
            final double amountReturn = getAmount();
            this.amount = 0;
            return amountReturn;
        }
        if(amountWithDraw < 0) return .0;
        this.amount = this.amount - amountWithDraw;
        return amountWithDraw;
    }

    public class CardGold implements Card {
        final String numberCard;

        public CardGold(String numberCard) {
            this.numberCard = numberCard;
        }

        public String getNumberCard() {
            return numberCard;
        }

        public double withdraw(final double amountWithDraw) {
            return AccountBank.this.withdraw(amountWithDraw);
        }
    }

    public class CardSilver implements Card {
        final String numberCard;

        public CardSilver(String numberCard) {
            this.numberCard = numberCard;
        }

        public String getNumberCard() {
            return numberCard;
        }

        public double withdraw(final double amountWithDraw) {
            return AccountBank.this.withdraw(amountWithDraw);
        }
    }

    public static void main(String[] args) {
        final AccountBank myAccount = new AccountBank("Andrey", "1111 2222 3333 4444");
        AccountBank.CardSilver myCard = myAccount.new CardSilver("1111 2222 3333 4444");

        myAccount.setAmount(3000);
        myCard.withdraw(100);

        System.out.println(myAccount.getAmount());
    }
}
