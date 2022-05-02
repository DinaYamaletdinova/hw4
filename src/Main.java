public class Main {
    public static void main(String[] args) {
            // Задание 1
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
            }
        System.out.println();
        int i = 10;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 2
        int friday = 5;
        for (; friday <= 31; friday = friday+7 ) {
            System.out.println("Сегодня " + friday + ", пятница. Необходимо подготовить отчёт.");
        }

        // Задание 3
        int zero = 0;
        int beforeYear = (2022 - 200); // 1822
        int futureYear = (2022 + 100); // 2122
        // System.out.println(beforeYear + " и " + futureYear + " крайние даты.");

        for (; zero <= futureYear; zero = zero + 79){
            if (zero >= beforeYear)

                System.out.println(zero);
        }

    }


}





