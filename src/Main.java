public class Main {
    public static void main(String[] args) {
        int amount = 1100;
        int check = 100;
        int bonus = 0;


        if (amount > 1000) {
            bonus = amount / 100;
        }

        int finalBonus = bonus;
        int balans = amount + finalBonus + check; 

        // Вывод результата
        System.out.println("Количество бонусов: " + finalBonus);
        System.out.println("Итоговый счёт: " + balans);
    }
}