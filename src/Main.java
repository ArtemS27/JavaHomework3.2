import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        int startAccountAmount = 100;
        int putAmount = 1100;
        int accountAmount;
        int bonus;
        if (putAmount >= 1000) {
            bonus = putAmount / 100;
            accountAmount = startAccountAmount + putAmount + bonus;
            System.out.println("Бонус = " + bonus);
            System.out.println("Баланс = " + accountAmount);
        } else {
            accountAmount = startAccountAmount + putAmount;
            System.out.println("Баланс = " + accountAmount);
        }
    }
}