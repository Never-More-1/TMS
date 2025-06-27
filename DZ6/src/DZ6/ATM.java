package DZ6;

public class ATM {
    int moneyCount20;
    int moneyCount50;
    int moneyCount100;

    ATM(int moneyCount20, int moneyCount50, int moneyCount100) {
        this.moneyCount20 = moneyCount20;
        this.moneyCount50 = moneyCount50;
        this.moneyCount100 = moneyCount100;
    }

    void addMoney(int add20, int add50, int add100) {
        moneyCount20 += add20;
        moneyCount50 += add50;
        moneyCount100 += add100;
    }

    Boolean withdrawCash(int cash) {
        int subCash = cash;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        for (int i = moneyCount100; i > 0; i--) {
            if (cash - 100 < 0) {
                break;
            }
            cash -= 100;
            count100++;
        }
        for (int i = moneyCount50; i > 0; i--) {
            if (cash - 50 < 0) {
                break;
            }
            cash -= 50;
            count50++;
        }
        for (int i = moneyCount20; i > 0; i--) {
            if (cash - 20 < 0) {
                break;
            }
            cash -= 20;
            count20++;
        }

        if (count100 * 100 + count50 * 50 + count20 * 20 == subCash) {
            System.out.println("Операция прошла успешно!");
            System.out.println("======================================");
            System.out.println("100: " + count100);
            System.out.println("50: " + count50);
            System.out.println("20: " + count20);
            System.out.println("======================================");
            return true;
        } else {
            System.out.println("Операция неудалась! В банкомате недостаточно средств!");
            return false;
        }
    }
}
