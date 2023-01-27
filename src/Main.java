public class Main {
    public static void main(String[] args) {

        int balance = 120; // начальная сумма на счету
        int deposit = 1670; // сумма пополнения

        if (deposit > 1000) {
            balance = balance + deposit + deposit / 100;
            System.out.println("На счету " + balance + " рублей, " + "добавлено " + deposit / 100 + " бонусов.");
        } else {
            balance = balance + deposit;
            System.out.println("На счету " + balance + " рублей.");
        }
    }
}