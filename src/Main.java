public class Main {
    public static void main(String [] args) {

        // 1. Напишите программу, чтобы проверить значения длины и ширины прямоугольника и определить,
        // является ли он квадратным или нет.

        int length = 5;
        int width = 5;

        if (length == width) {
            System.out.println("Прямоугольник является квадратным");
        } else {
            System.out.println("Прямоугольник не является квадратным");
        }

        // 2. Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
        // Если стоимость товара ниже 5000, то стоимость остается без изменений.
        // Вычислите и выведите итоговую стоимость покупки для пользователя.

        int cost = 5000;

        if (cost > 5000) {
            System.out.println("Магазин предоставит скидку в 10%");
        } else {
            System.out.println("Магазин не предоставит скидку в 10%");
        }

        // 3. В университете существуют следующие правила для системы оценок:
        //
        //Ниже 25 - F
        //От 25 до 45 - E
        //От 45 до 50 - D
        //От 50 до 60 - C
        //От 60 до 80 - B
        //Выше 80 - A
        //Создайте переменную grade и напечатайте в консоль соответствующую оценку в
        // зависимости от значения переменной.

        int grade = 51;
        if (grade >= 0 && grade < 25) {
            System.out.println("Оценка - F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("Оценка - E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Оценка - D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Оценка - C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Оценка - B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("Оценка - A");
        } else {
            System.out.println("Неверное число");
        }

        // 4. Дано целое положительное число. Напишите программу, которая выводит
        // это число в обратном порядке. Например, если дано число 12345,
        // то вывод будет следующим: 54321.


        int number = 12345;
        while (number <= 54321) {
            if (number < 54321) {
                number++;
                continue;
            }
            System.out.println(number);
            number++; // Я НЕ УВЕРЕН В ПРАВИЛЬНОСТИ ВЫПОЛНЕНИЯ ЭТОГО ЗАДАНИЯ
        }

        // 5. Дано целое положительное число.
        // Напишите программу, которая выводит сообщение о том, является ли это число простым.

        int positiveNumber = 11;
        int a = 1;
        int b = 11;

        int simpleNumber = positiveNumber / a;
        int simpleNumber2 = positiveNumber / b;

        if (simpleNumber == 11 && simpleNumber2 == 1) {
            System.out.println("Число является простым"); // Я НЕ УВЕРЕН В ПРАВИЛЬНОСТИ ВЫПОЛНЕНИЯ ЭТОГО ЗАДАНИЯ
        } else if (simpleNumber != 11 && simpleNumber2 != 1) {
            System.out.println("Число не является простым");

        }

        // 6. Напишите программу для печати следующего сообщения:
        //
        //i)
        //**********
        //**********
        //**********
        //**********

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ii)
        //*
        //**
        //***
        //****
        //*****

        for (int ii = 1; ii < 5; ii++) {
            for (int jj = 1; jj <= ii; jj++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // iii)
//        1
//        212
//        32123
//        4321234
//        543212345

        int rows = 5;

        for (int iii = 1; iii <= rows; iii++) {
            for (int jjj = 1; jjj <= rows - iii; jjj++) {
                System.out.print(" ");
            }
            for (int jjj = iii; jjj >= 1; jjj--) {
                System.out.print(jjj);
            }
            for (int jjj = 2; jjj <= iii; jjj++) {
                System.out.print(jjj);
            }

            System.out.println();
        }

        // 7. Даны два целых числа a и b. Напишите программу для вычисления суммы
        // натуральных чисел в диапазоне от a до b.


        // 8. В компании прошла аттестация по компетенциям и навыкам сотрудников. Даны зарплата и класс сотрудника. Напишите программу, чтобы определить сумму премии в зависимости от класса сотрудника. Необходимо создать переменную со значением зарплаты сотрудника, вывести в консоль результирующую зарплату с премией.
        //
        //Бонусы в зависимости от класса:
        //
        //Класс A: 50%
        //Класс B: 25%
        //Класс C: 0%

        double salary = 100000;
        char grade1 = 'A';

        switch (grade1) {
            case 'A' -> salary = salary *= 1.5;
            case 'B' -> salary = salary * 1.25;
        }
        System.out.println(salary);


        // 9. Дано целое положительное число n. Напишите программу для печати ряда Фибоначчи из n членов:
        //
        //0 1 1 2 3 5 8 13 21 .....

        int f = 1;
        while (f != 0) {
            f = f + f;

            System.out.println(f);
        }






    }
}

