public class Main {
    public static void main(String[] args) {
        // Домашняя работа, №5. Циклы. Абламский Д.А.
        //task1.1
        System.out.println("Задание 1.2\n");
        int i =  1;
        while (i<=10){
            System.out.print( i++ + " ");
        }
        //task1.2
        //System.out.println("\nЗадание 1.2");
        System.out.print("\n");
        for (int i1 = 10; 0 <i1 && i1<=10; i1 = i1-1)
        {System.out.print(i1+ " ");};

        //task 2
        System.out.println("\n\nЗадание 2\n");

        int firstFriday = 3;
        int daysOfMonth = 31;
        int periodForOurMonth = daysOfMonth -firstFriday;

        for (int dayNumber = 0; dayNumber <= periodForOurMonth; dayNumber++) {
            // Каждый день проверяем, является ли он пятницей принадлежащей периоду просмотра
            if (dayNumber % 7 == 0) {
                // Выводим сообщение
                System.out.println("Сегодня отчётный день, пятница " + (dayNumber + firstFriday) + "-е число");
                continue;
            };
        }
        //task 3
        System.out.println("\n\nЗадание 3\n");

        int periodFlight =79;
        int yearsOnPeriodView = 2102;
        int periodView = yearsOnPeriodView -periodFlight;
        for (int yearFlight = 0; periodFlight < periodView; yearFlight++) {
            // Каждый год проверяем, является ли он лётным и принадлежащим периоду просмотра
            if (yearFlight % 79 == 0 ) {
                if ( (yearFlight + periodFlight) < 2102 && 1822 < (yearFlight + periodFlight) ){
                // Выводим сообщение
                System.out.println("лётный год " + (yearFlight + periodFlight));
               } continue;
            }

        }

    }
}