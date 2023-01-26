public class Main {
    public static void main(String[] args) {

        int a = 118; // начальная сумма на счету
        int b = 1678; // сумма пополнения

        if (b > 1000) {
            a = a + b + b / 100;
            System.out.println("На счету " + a + " рублей, " + "добавлено " + b / 100 + " бонусов.");
        } else {
            a = a + b;
            System.out.println("На счету " + a + " рублей.");
        }
    }
}