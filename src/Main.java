public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        //С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей
        // и готовы откладывать по 15 тысяч рублей.
        double postponingEveryMonth = 15_000; // готов отложить по 15 тыс за каждый месяц
        double goalAccumulate = 0; // имеем 0 рублей
        int month = 0; // месяц
        while (goalAccumulate <= 2_459_000) { // цель накопить 2 459 000
            month++;
            goalAccumulate = (postponingEveryMonth + goalAccumulate) * 1.01; // сумма с учетом процентов по вкладу
            System.out.println("Месяц " + month + " сумма накоплений равна " + goalAccumulate + " рублей");
        }
        System.out.println("Задание 2");
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        // Не забудьте выполнить переход на новую строку между двумя циклами.
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);

        }
        System.out.println();

        System.out.println("Задание 3");
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
        int populationCountryY = 12_000_000; // население в стране
        int birthRatePerYear = 17; // За год рождаемость составляет 17 человек на 1000 человек
        int mortalityPerYear = 8; // За год смертность составляет 8 человек на 1000 человек
        int birthRateOneYear = populationCountryY * birthRatePerYear / 1000; // за один год родились
        int mortalityOneYear = populationCountryY * mortalityPerYear / 1000; // за один год умерло
        int totalIncreaseOneYear = birthRateOneYear - mortalityOneYear; // всего прибавятся людей за один год
        for (int year = 1; year <= 10; year++) {
            populationCountryY = populationCountryY + totalIncreaseOneYear;
            System.out.println("Год " + year + ", численность населения составляет " + populationCountryY + " человек");

        }
        System.out.println("4. Задание. Домашнее задание -2");
        //Условие
        //Напишите программу, которая выводит в консоль сумму накоплений.
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        //Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        System.out.println("Задание 1");
        // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей
        // при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        // Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        double initialDepositAmount = 15_000;
        int numberMonths = 0;
        double bankAccount = 0;
        double depositInterest = 7;
        int goal = 12_000_000;
        while (bankAccount <= 12_000_000) {
            initialDepositAmount = initialDepositAmount + initialDepositAmount / 100 * depositInterest;
            bankAccount = bankAccount + initialDepositAmount;
            numberMonths++;
            System.out.println("За " + numberMonths + " месяц сумма накоплений - " + Math.round(bankAccount) + " руб. ");
        }

        System.out.println(numberMonths + " месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей");


        System.out.println("Задание 2");
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        // Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
        double initialDepositAmount1 = 15_000;
        int numberMonths1 = 0;
        double bankAccount1 = 0;
        double depositInterest1 = 7;
        int goal1 = 12_000_000;
        while (bankAccount1 <= 12_000_000) {
            initialDepositAmount1 = initialDepositAmount1 + initialDepositAmount1 / 100 * depositInterest1;
            bankAccount1 = bankAccount1 + initialDepositAmount1;
            numberMonths1++;
            if (numberMonths1 % 6 == 0) {
                System.out.println("За " + numberMonths1 + " месяц сумма накоплений - " + Math.round(bankAccount1) + " руб. ");
            }
        }

        System.out.println(numberMonths1 + " месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей");

        System.out.println();
        System.out.println("Задание 3");
        //Василий решил, что год копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        // Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        // Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
        double initialDepositAmount2 = 15_000;
        int numberMonths2 = 0;
        double bankAccount2 = 0;
        double depositInterest2 = 7;
        int goal2 = 12_000_000;
        int depositTerm = 108; // срок депозита 9 лет(или 108 месяцев)
        while (numberMonths2 < 108) {
            initialDepositAmount2 = initialDepositAmount2 + initialDepositAmount2 / 100 * depositInterest2;
            bankAccount2 = bankAccount2 + initialDepositAmount2;
            numberMonths2++;
            if (numberMonths2 % 6 == 0) {
                System.out.println("За " + numberMonths2 + " месяц сумма накоплений - " + Math.round(bankAccount2) + " руб. ");
            }
        }
        System.out.println(numberMonths2 + " месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей");

        System.out.println();
        System.out.println("Задание 4");
        //В вашей компании пятница является днем отчетным.
        //Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием,
        // что нужно подготовить еженедельный отчет.
        //Условия задачи:
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        int firstFriday = 7;
        for (; firstFriday < 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + " -е число. Необходимо подготовить отчет.");
        }

        System.out.println();
        System.out.println("6. Задание. Домашнее задание -3");
        System.out.println("Задание 1");
        //Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        //Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        //Условия задачи:
        //в консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        //в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:     1896    1975     2054
        int startYear = 1817; // стартующий год
        int finalYear = 2054; // завершающий год
        while ( startYear < finalYear ) {
            startYear+=79;
            System.out.println("Появление кометы в " + startYear + " году.");

        }

        System.out.println("Задание 2");
            //Напишите программу, которая выводит в консоль таблицу умножения на 2: 2*1=2  //2*2=4  //2*3=6 //  2*4=8
            //2*5=10  //  2*6=12  //  2*7=14   //  2*8=16   //  2*9=18    // 2*10=20
            int number = 1;
            for (; number <= 10; number++) {
                System.out.println("2 * " + number + " = " + (number * 2));

            }


        }
    }





