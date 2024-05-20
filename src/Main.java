public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        System.out.println("Task 2");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        System.out.println("Task 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        System.out.println("Task 4");

        for (int i = 10; i >= - 10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        System.out.println("Task 5");

        for (int year = 1904; year <=2096; year++){
            if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0){
                System.out.println(year + " год является високосным");
            }
        }
        System.out.println("----------------------------");

        System.out.println("Task 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        System.out.println("Task 7");

        for (int i = 1; i <= 512; i<<=1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        System.out.println("Task 8");

        int totalMoney = 0;
        int oneMonthMoney = 29000;
        for (int month = 1; month <=12 ; month++) {
            totalMoney = totalMoney + oneMonthMoney;
            System.out.println("Месяц " + month + ", сумма накоплений " + totalMoney + " рублей");
        }
        System.out.println("----------------------------");

        System.out.println("Task 9");
        float depositIsBank = 0f;
        float percentBank = 0.12f;
        for (int month = 1; month <=12 ; month++) {
            depositIsBank = depositIsBank + (depositIsBank * percentBank) + (float)oneMonthMoney;
            System.out.println("Месяц " + month + ", сумма накоплений " + depositIsBank + " рублей");
        }
        System.out.println("----------------------------");

        System.out.println("Task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}