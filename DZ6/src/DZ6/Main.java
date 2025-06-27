package DZ6;

public class Main {
    public static void main(String[] args) {
        //Task 1----------------------------------------------------------------
//        CreditCard card1 = new CreditCard(827389126, 100.12);
//        CreditCard card2 = new CreditCard(784567389, 802.4);
//        CreditCard card3 = new CreditCard(547385645, 3500);
//        System.out.println(card1.money);
//        System.out.println(card1.bankAccount);
//        card1.depositMoney(314);
//        card2.depositMoney(454.50);
//        card3.withdrawMoney(35.21);
//        card1.status();
//        card2.status();
//        card3.status();
        //Task 2----------------------------------------------------------------
        ATM cashMachine = new ATM(10, 1, 1);
        cashMachine.addMoney(0, 9, 9);
        cashMachine.withdrawCash(520);
    }
}