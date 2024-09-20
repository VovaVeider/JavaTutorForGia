package org.vladimir.java.learn.gia.lessons.lesson1;

// Основной класс программы
public class LangDemo {

    // Главный метод программы, с него начинается выполнение
    public static void main(String[] args) {

        // 1. Переменные и типы данных
        // Примитивные типы данных: int (целое число), double (число с плавающей точкой),
        // char (символ), boolean (логический тип)

        int number = 10; // Переменная типа int
        double price = 9.99; // Переменная типа double
        char grade = 'A'; // Переменная типа char
        boolean isJavaFun = true; // Переменная типа boolean

        // Вывод на экран значений переменных
        System.out.println("Целое число: " + number);
        System.out.println("Число с плавающей точкой: " + price);
        System.out.println("Символ: " + grade);
        System.out.println("Логический тип: " + isJavaFun);

        // 2. Операторы
        // Арифметические операторы: +, -, *, /, %
        int sum = number + 5; // сложение
        int difference = number - 3; // вычитание
        int product = number * 2; // умножение
        double quotient = number / 3.0; // деление
        int remainder = number % 3; // остаток от деления

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток: " + remainder);

        // 3. Условные операторы: if, else if, else
        if (number > 5) {
            System.out.println("Число больше 5");
        } else if (number == 5) {
            System.out.println("Число равно 5");
        } else {
            System.out.println("Число меньше 5");
        }

        // 4. Циклы: for, while
        // Цикл for (выполняется определенное количество раз)
        System.out.println("Цикл for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Итерация: " + i);
        }

        // Цикл while (выполняется, пока условие истинно)
        System.out.println("Цикл while:");
        int i = 0;
        while (i < 5) {
            System.out.println("Итерация: " + i);
            i++; // Инкремент переменной
        }

        // 5. Массивы
        // Массив — это коллекция элементов одного типа
        int[] numbers = {1, 2, 3, 4, 5}; // Объявление и инициализация массива
        System.out.println("Массив чисел:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 6. Методы (функции)
        // Вызов метода и передача аргумента
        System.out.println("Факториал 5: " + factorial(5));

        // 7. Работа с классами и объектами
        // Создание объекта класса Person и вызов его методов
        Person person = new Person("Иван", 30);
        person.greet();
    }

    // Метод для вычисления факториала числа
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Факториал 0 равен 1
        }
        return n * factorial(n - 1); // Рекурсивный вызов метода
    }
}

// Дополнительный класс для демонстрации работы с объектами
class Person {
    // Поля класса (переменные)
    String name;
    int age;

    // Конструктор класса, инициализирующий поля
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для вывода приветствия
    public void greet() {
        System.out.println("Привет! Меня зовут " + name + ", мне " + age + " лет.");
    }
}
