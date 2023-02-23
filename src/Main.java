public class Main {
    public static void main(String[] args) {
        int openingBalance = 100;
        int income = 1100;
        int cost = 100;
        int bonus = 0;
        int currentBalance;

        if (income > 1000) {
            bonus = income / cost;
            currentBalance = openingBalance + income + bonus;
        } else {
            currentBalance = openingBalance + income;
        }

        System.out.println("Текущий баланс: " + currentBalance + " рублей");
        System.out.println("Начислено бонусов: " + bonus);
        
    }
}
