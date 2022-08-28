import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1() {
        int i = 0;
        while (i < 10) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (; i <= 10 && i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static void Task2() {
        int firstFriDay = 5;

        for (int currenFriDay = firstFriDay; currenFriDay <= 31; currenFriDay += 7) {
            System.out.println("Сегодня пятница, " + currenFriDay + " -е число. Необходимо подготовить отчет.");

        }

    }

    public static void Task3() {
        int currenYear = LocalDate.now().getYear();
        int start = currenYear - 200;
        int end = currenYear + 100;
        for (int year = start; year <= end; year++) {
            if(year % 79 == 0){
                System.out.println(year);
            }
        }


//        for (int comet = 0; 2122 >= comet;) {
//            comet = comet + 79;
//
//            if (1822 <= comet && comet <= 2122) {
//                System.out.println(comet);
//
//            }if (1822 > comet || comet > 2122){
//                System.out.print("");
//            }
//        }
//        получает тот же результат в 3 задании остальные дополнительных будут позже
    }


}