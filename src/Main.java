//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int people = 7;
        System.out.println("Значение переменной people с типом int равно " + people);
        byte robot = 125;
        System.out.println("Значение переменной robot с типом byte равно " + robot);
        short finger = 28705;
        System.out.println("Значение переменной finger с типом short равно " + finger);
        long bear = 7954329;
        System.out.println("Значение переменной bear с типом long равно " + bear);
        float agg = 95f;
        System.out.println("Значение переменной agg с типом float равно " + agg);
        double lego = 192;
        System.out.println("Значение переменной lego с типом double равно " + lego);

        double seeds = 27.12;
        System.out.println(seeds);
        long stars = 987_678_965_549L;
        System.out.println(stars);
        double gram = 2.786;
        System.out.println(gram);
        short apple = 569;
        System.out.println(apple);
        short happy = -159;
        System.out.println(happy);
        short drop = 27897;
        System.out.println(drop);
        byte pokemon = 67;
        System.out.println(pokemon);

        byte lyudmilapavlovna = 23;
        System.out.println(lyudmilapavlovna);
        byte annasergeevna = 27;
        System.out.println(annasergeevna);
        byte ekaterinaandreevna = 30;
        System.out.println(ekaterinaandreevna);
        short totalsheets = 480;
        System.out.println(totalsheets);
        int teashers = lyudmilapavlovna + annasergeevna + ekaterinaandreevna;
        System.out.println(teashers);
        int perstudent = totalsheets / teashers;
        System.out.println("На каждого ученика рассчитано " + perstudent + " листов бумаги");

        int car20minutes = (20 / 2) * 16;
        System.out.println("За 20 минут машина произвела " + car20minutes + " штук бутылок");
        int car24hours = (24 * 60) / 2 * 16;
        System.out.println("За сутки машина произвела " + car24hours + " штук бутылок");
        int car3day = (3 * 24 * 60) / 2 * 16;
        System.out.println("За 3 дня машина произвела " + car3day + " штук бутылок");
        int car1month = (30 * 24 * 60) / 2 * 16;
        System.out.println("За месяц машина произвела " + car1month + " штук бутылок");

        int allclass = 120 / (2+4);
        System.out.println(allclass);
        int white = 2 * allclass;
        System.out.println(white);
        int brown = 4 * allclass;
        System.out.println("В школе, где " + allclass + " классов, нужно " + white + " белой краски и " + brown + " банок коричневой краски");

        int breakfast = (5 * 80) + (200 / 100) * 105 + (2 * 100) + (4 * 70);
        System.out.println("Общий вес завтрака в граммах равен " + breakfast + " грамм");
        double breakfastkg = breakfast / 1000.0;
        System.out.println("Общий вес завтрака в килограммах равен " + breakfastkg + " килограмм");

        int weight250Gr = (7 * 1000) / 250;
        System.out.println("Потребуется " + weight250Gr + " дней, если терять в день по 250 грамм");
        int weight500Gr = (7 * 1000) / 500;
        System.out.println("Потребуется " + weight500Gr + " дней, если терять в день по 500 грамм");
        int weightMidleday = (weight250Gr + weight500Gr) / 2;
        System.out.println("В среднем для похудения потребуется " + weightMidleday + " дней");

        double teacheronesalary = (67760 / 100.0) * 10 + 67760;
        System.out.println(teacheronesalary);
        double teacheoneryears = (teacheronesalary * 12) - (67760 * 12);
        System.out.println("Маша теперь получает " + teacheronesalary + " рублей. Годовой доход вырос на " + teacheoneryears + " рублей");
        double teachertwosalary = (83690 / 100.0) * 10 + 83690;
        System.out.println(teachertwosalary);
        double teachertwoyears = (teachertwosalary * 12) - (83690 * 12);
        System.out.println("Денис теперь получает " + teachertwosalary + " рублей. Годовой доход вырос на " + teachertwoyears + " рублей");
        double teacherthreesalary = (76230 / 100.0) * 10 + 76230;
        System.out.println(teacherthreesalary);
        double teacherthreeyears = (teacherthreesalary * 12) - (76230 * 12);
        System.out.println("Кристина теперь получает " + teacherthreesalary + " рублей. Годовой доход вырос на " + teacherthreeyears + " рублей");
    }
}