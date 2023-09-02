public class Main {
    public static void main(String[] args) {
        System.out.println("Variables Part Two!");


        System.out.println("Task 1 - переменные разных типов");

        int a = 1000500; // variables type int
        byte b = 50; // variables type byte
        short c = -15440; // variables type short
        long d = 324458544774444554L; // variables type long
        float e = (float)44554.87; // variables type float
        float f = 447558.907f; // variables type float
        double g = 345.987; // variables type double

        System.out.println("Значение переменной а с типом int = "+ a);
        System.out.println("Значение переменной b c типом byte = "+ b);
        System.out.println("Значение переменной c с типом short = "+ c);
        System.out.println("Значение переменной d с типом long = "+ d);
        System.out.println("Значение переменной e с типом float = "+ e);
        System.out.println("Значение переменной f с типом float = "+ f);
        System.out.println("Значение переменной g с типом double = "+ g);


        System.out.println("Task 2 - объявление переменной с нужным типом");

        float h = (float)27.12; // type float
        long i = 987678965549L; // type long
        float j = 2.786f; // type float
        short k = 569; // type short
        short l = -159; // type short
        short m = 27897; // type short
        byte n = 67; // type byte


        System.out.println("Task 3 - бумага для учеников");

        short teacherLP = 23; // Ученики Людмилы Павловны
        short teacherAS = 27; // Ученики Анны Сергеевны
        short teacherEA = 30; // Ученики Екатерины Андреевны
        double allStudents = teacherLP + teacherAS + teacherEA; // Всего учеников в трех классах
        short allSheetsOfPaper = 480; // Общее количество бумаги на всех
        double sheetsPerStudent = allSheetsOfPaper / allStudents; // Вычисляем, сколько бумаги на каждого
        double sheetsPerLP = sheetsPerStudent * teacherLP; // Бумаги на класс Людмилы Павловны
        double sheetsPerAS = sheetsPerStudent * teacherAS; // Бумаги на класс Анны Сергеевны
        double sheetsPerEA = sheetsPerStudent * teacherEA; // Бумаги на класс Екатерины Андреевны

        System.out.println("Учеников в классе Людмилы Павловны " + teacherLP);
        System.out.println("Учеников в классе Анны Сергеевны " + teacherAS);
        System.out.println("Учеников в классе Екатерины Андреевны " + teacherEA);
        System.out.println("Всего учеников в трех классах " + allStudents);
        System.out.println("Общее количество бумаги на три класса " + allSheetsOfPaper);
        System.out.println("Количество бумаги на одного ученика " + sheetsPerStudent);
        System.out.println("Количество бумаги на класс Людмилы Павловны " + sheetsPerLP);
        System.out.println("Количество бумаги на класс Анны Сергеевны " + sheetsPerAS);
        System.out.println("Количество будмаги на класс Екатерины Андреевны " + sheetsPerEA);


        System.out.println("Task 4 - делаем бутылки");

        double perfomanceInTwoMinutes = 16; // Производительность 16 бут на 2 мин
        double perfomanceBase = perfomanceInTwoMinutes / 2; // Производительность за 1 минуту
        double perfomanceInTwentyMinutes = perfomanceBase * 20; // Производительность за 20 минут
        double perfomanceInDay = perfomanceBase * 60 * 24; // Произоводительность за сутки
        double perfomanceInThreeDay = perfomanceInDay * 3; // Производительность за 3 дня
        double perfomanceInMonth = perfomanceInDay * 30; // Производительность за месяц, учитываем, что в месяце 30 дней

        System.out.println("Производительность машины за 2 минуты " + perfomanceInTwoMinutes + " бутылок");
        System.out.println("Производительность машины за 1 минуту " + perfomanceBase+ " бутылок");

        System.out.println("За 20 минут машина произвела " + perfomanceInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки " + perfomanceInDay + " штук бутылок");
        System.out.println("За 3 дня " + perfomanceInThreeDay + " штук бутылок");
        System.out.println("За месяц " + perfomanceInMonth + " штук бутылок. (Учитываем, что в месяце 30 дней");


        System.out.println("Task 5 - красим школу");

        int allBanks = 120; // Всего на школу 120 банок краски
        int whiteForClass = 2; // На один класс 2 банки белой краски
        int brownForClass = 4; // На один класс 4 банки коричневой краски
        double paintForClass = whiteForClass + brownForClass; // Всего банок краски на один класс
        double allClases = allBanks / paintForClass; // Всего классов в школе
        double allWhitePaint = allClases * whiteForClass; // Всего закуплено белой краски
        double allBrownPaint = allClases * brownForClass; // Всего закуплено коричневой краски

        System.out.println("Всего на всю школу закуплено " + allBanks + " банок краски.");
        System.out.println("Белой краски на один класс " + whiteForClass + " банки.");
        System.out.println("Коричневой краски на один класс " + brownForClass + " банки.");
        System.out.println("Белой и коричневой краски на один класс " + paintForClass + " банок.");
        System.out.println("Всего классов в школе " + allClases);
        System.out.println("Закуплено белой краски " + allWhitePaint + "банок");
        System.out.println("Закуплено коричневой краски " + allBrownPaint + "банок");
        System.out.println("В школе, где " + allClases + " классов, нужно " + allWhitePaint + " белой краски и " + allBrownPaint + " коричневой краски"  );


        System.out.println("Task 6 - завтрак спортсмена");

        double bananasGram = 5 * 80; // Бананы в грамммах
        double milkGram = 200 / 100 * 105; // Молоко в граммах
        double iceCreamGram = 2 * 100; // Мороженое в граммах
        double eggsGram = 4 * 70; // Яйца в граммах
        double allBreakfastGram = bananasGram + iceCreamGram + milkGram  + eggsGram; // Весь завтрак в граммах
        double allBreakfastKilo = allBreakfastGram / 1000; // Весь завтрак в килограммах
        /**
         * Тут можно было бы заморочиться и расписать сколько в граммах каждого продукта
         * съедает на завтрак спортсмен, но и так много текста)))
         */
        System.out.println("На завтрак спортсмен съедает " + allBreakfastGram + " грамм еды.");
        System.out.println("На завтрак спортсмен съедает " + allBreakfastKilo + " килограмм еды.");


        System.out.println("Task 7 - спортсмен худеет");

        double targetWeightLossKilo = 7; //  Цель похудения в кг
        double targetWeightLoss = 7 * 1000; // Цель похудения в граммах
        double minWeightLoss = 250; // Минимальная потеря в весе в день
        double maxWeightLoss = 500; // Максимальная потеря в весе в день
        double minTargetWeightLoss = targetWeightLoss / minWeightLoss; // Дней для похудения, теряя по 250 грамм
        double maxTargetWeightLoss = targetWeightLoss / maxWeightLoss; // Дней для похудения, теряя по 500 грамм
        double middleWeightLoss = (minTargetWeightLoss + maxTargetWeightLoss) / 2; // Среднее количество дней для похудения
        /**
         * Тут тоже можно заморочиться и писать выводить в консоль результаты каждого действия, но нах...
         */
        System.out.println("Если спортсмен будет сбрасывать по 250 грамм в день, то он достигнет цели похудения на 7 кг через "  + minTargetWeightLoss + " дней." );
        System.out.println("Если спортсмен будет сбрасывать по 500 грамм в день, то он достигнет цели похудения на 7 кг через "  + maxTargetWeightLoss + " дней." );
        System.out.println("Среднее количество дней для похудения на 7 кг "  + middleWeightLoss + " день." );

        System.out.println("Task 8 - заплаты сотрудников");
        int salaryMasha = 67760; // Текущая зарплата Маши
        int salaryDenis = 83690; // Текущая зарплата Дениса
        int salaryKristina = 76230; // Текущая зарплата Кристины

        double salaryIncreaseMasha = salaryMasha * 1.1; // Зарплата Маши после повышения на 10 %
        double salaryIncreaseDenis = salaryDenis * 1.1; // Зарплата Дениса после повышения на 10 %
        double salaryIncreaseKristina = salaryKristina * 1.1; // Зарплата Кристины после повышения на 10 %

        double salaryMashaYear = salaryMasha * 12; // Зарплата Маши за год, без повышения
        int salaryDenisYear = salaryDenis * 12; // Зарплата Дениса за год, без повышения
        double salaryKristinaYear = salaryKristina * 12; // Зарплата Критины за год, без повышения

        double salaryIncreaseMashaYear = salaryIncreaseMasha * 12; // Зарплата Маши за год, после повышения
        double salaryIncreaseDenisYear = salaryIncreaseDenis * 12; // Зарплата Дениса за год после повышения
        double salaryIncreaseKristinaYear = salaryIncreaseKristina * 12; // Зарплата Кристины за год после повышения

        double differenceSalaryMasha = salaryIncreaseMashaYear - salaryMashaYear; // На столько в год Маша стала больше зарабатывать
        double differenceSalaryDenis = salaryIncreaseDenisYear - salaryDenisYear; // На столько в год Денис стал больше зарабатывать
        double differenceSalaryKristina = salaryIncreaseKristinaYear - salaryKristinaYear; // На стоько в год Кристина стала больше зарабатывать

        System.out.println("Маша теперь получает " + Math.ceil(salaryIncreaseMasha) +  " рублей. Годовой доход вырос на " + Math.ceil(differenceSalaryMasha) + " рублей.");
        System.out.println("Денис теперь получает " + Math.ceil(salaryIncreaseDenis) +  " рублей. Годовой доход вырос на " + Math.ceil(differenceSalaryDenis) + " рублей.");
        System.out.println("Кристина теперь получает " + Math.ceil(salaryIncreaseKristina) +  " рублей. Годовой доход вырос на " + Math.ceil(differenceSalaryKristina) + " рублей.");



    }



}