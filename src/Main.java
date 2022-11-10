public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int firstVariable = 1234567;
        byte secondVariable = 123;
        short thirdVariable = 1234;
        long forthVariable = 123456789L;
        float fifthVariable = 1.2f;
        double sixthVariable = 1.2345;
        System.out.println("Значение переменной firstVariable с типом int рано " + firstVariable);
        System.out.println("Значение переменной secondVariable с типом byte рано " + secondVariable);
        System.out.println("Значение переменной thirdVariable с типом short рано " + thirdVariable);
        System.out.println("Значение переменной forthVariable с типом long рано " + forthVariable);
        System.out.println("Значение переменной fifthVariable с типом float рано " + fifthVariable);
        System.out.println("Значение переменной sixthVariable с типом double рано " + sixthVariable);

        //Exercise 2
        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        float thirdNumber = 2.786f;
        boolean isFalse = false;
        short forthNumber = 569;
        short fifthNumber = -159;
        int sixthNumber = 27897;
        byte seventhNumber = 67;

        //Exercise 3
        int numberOfStudentsFirstClass = 23;
        int numberOfStudentsSecondClass = 27;
        int numberOfStudentsThirdClass = 30;
        int numberOfSheetsOfPaper = 480;
        int sumOfStudents = numberOfStudentsFirstClass + numberOfStudentsSecondClass + numberOfStudentsThirdClass;
        int numberOfPapersToEveryStudent = numberOfSheetsOfPaper / sumOfStudents;
        System.out.println("На каждого ученика расчитано " + numberOfPapersToEveryStudent + " листов бумаги");

        //Exercise 4
        int numberOfBottles = 16;
        int timeInMin = 2;
        int numberOfBottlesInOneMin = numberOfBottles / timeInMin;
        int bottlesIn20Min = numberOfBottlesInOneMin * 20;
        int bottlesPerDay = numberOfBottlesInOneMin * 60 * 24;
        int bottlesIn3Days = bottlesPerDay * 3;
        int bottlesInMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesIn20Min + " штук!");
        System.out.println("За день машина произвела бутылок " + bottlesPerDay + " штук!");
        System.out.println("За 3 дня машина произвела бутылок " + bottlesIn3Days + " штук!");
        System.out.println("За месяц машина произвела бутылок " + bottlesInMonth + " штук!");

        //Exercise 5
        int numberOfCans = 120;
        int numberOfCansWithWhitePaint = 2;
        int numberOfCansWithBrownPaint = 4;
        int numberOfClasses = numberOfCans / (numberOfCansWithWhitePaint + numberOfCansWithBrownPaint);
        int totalCansWithWhitePaint = numberOfCansWithWhitePaint * numberOfClasses;
        int totalCansWithBrownPaint = numberOfCansWithBrownPaint * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses +" классов, нужно " + totalCansWithWhitePaint + " банок белой краски и " + totalCansWithBrownPaint + " банок коричневой краски");

        //Exercise 6
        int numberOfBananas = 5;
        int weightOfOneBananaGram = 80;
        int milkMl = 200;
        int weightOfOneMlMilkGram = 105 / 100;
        int numberOfIceCream = 2;
        int weightOfIceCreamGram = 100;
        int numberOfEggs = 4;
        int weightOfOneEggGram = 70;
        int totalWeightGram = (numberOfBananas * weightOfOneBananaGram) + (weightOfOneMlMilkGram * milkMl) + (numberOfIceCream * weightOfIceCreamGram) + (numberOfEggs * weightOfOneEggGram);
        double totalWeightKg = totalWeightGram * 0.001;
        System.out.println("Общий вес завтрака равен " + totalWeightGram + " грамм,или " + totalWeightKg + " килограмм!");

        // Exercise 7
        int weightToBeLostKg = 7;
        int weightToBELostGram = weightToBeLostKg * 1000;
        int weightLostPerDayGramFirstScenario = 250;
        int weightLostParDayGramSecondScenario = 500;
        int daysFirstScenario = weightToBELostGram / weightLostPerDayGramFirstScenario;
        int daysSecondScenario = weightToBELostGram / weightLostParDayGramSecondScenario;
        int averageDays = (daysFirstScenario + daysSecondScenario) / 2;
        System.out.println("Колличество дней, которое уйдет у спортсмена, если худеть на 250 грамм в день равно " + daysFirstScenario);
        System.out.println("Колличество дней, которое уйдет у спортсмена, если худеть на 500 грамм в день равно " + daysSecondScenario);
        System.out.println("Среднее колличество дней которое буде необходимо спортсмену чтобы похудеть равно " + averageDays);

        //Exercise 8
        int salaryRubMaria = 67760;
        int yearSalaryMaria = salaryRubMaria * 12;
        int salaryRubDenis = 83690;
        int yearSalaryDenis = salaryRubDenis * 12;
        int salaryRubKristina = 76230;
        int yearSalaryKristina = salaryRubKristina * 12;
        int newSalaryMaria = salaryRubMaria + (salaryRubMaria * 10 / 100);
        int newSalaryDenis = salaryRubDenis + (salaryRubDenis * 10 / 100);
        int newSalaryKristina = salaryRubKristina + (salaryRubKristina * 10 / 100);
        int newYearSalaryMaria = newSalaryMaria * 12;
        int newYearSalaryDenis = newSalaryDenis *12;
        int newYearSalaryKristina = newSalaryKristina * 12;
        int differenceYearSalaryMaria = newYearSalaryMaria - yearSalaryMaria;
        int differenceYearSalaryDenis = newYearSalaryDenis - yearSalaryDenis;
        int differenceYearSalaryKristina = newYearSalaryKristina - yearSalaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + differenceYearSalaryMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceYearSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceYearSalaryKristina + " рублей");
    }

}