public class Main {
    public static void main(String[] args) {
        int amount = 1100;
        int check = 100;
        int bonus = 0;


        if (amount > 1000) {
            bonus = amount / 100;
        }

        int balans = amount + bonus + check;

        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговый счёт: " + balans);
    }
}