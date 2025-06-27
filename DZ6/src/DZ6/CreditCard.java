package DZ6;

import java.util.Scanner;

public class CreditCard {
    double money;
    int bankAccount;

    CreditCard(int bankAccount, double money) {
        this.bankAccount = bankAccount;
        this.money = money;
    }

    void depositMoney(double addMoney) {
        System.out.println("Вы положили " + addMoney + " на карту");
        money += addMoney;
        System.out.print("Баланс: ");
        System.out.printf("%.2f", money);
        System.out.println();
    }

    void withdrawMoney(double subMoney) {
        if (subMoney < money) {
            System.out.println("Вы сняли " + subMoney + " с карты");
            money -= subMoney;
            System.out.print("Баланс: ");
            System.out.printf("%.2f", money);
            System.out.println();
        } else {
            System.out.println("Ошибка, на карте не хватеат средств!");
        }
    }

    void status() {
        System.out.println("======================================");
        System.out.println("Номер счета: " + bankAccount);
        System.out.print("Сумма на счету: ");
        System.out.printf("%.2f",  money);
        System.out.println();
        System.out.println("======================================");
    }
}

