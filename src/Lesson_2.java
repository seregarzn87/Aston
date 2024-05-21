import java.util.Arrays;
import java.util.Random;

public class Lesson_2 {

    /*
    1. Создайте метод printThreeWords(), который при вызове
    должен отпечатать в столбец три слова: Orange, Banana,
    Apple.*/

    public static void printThreeWords() {
        System.out.println("Orange,");
        System.out.println("Banana,");
        System.out.println("Apple.");
    }
    /*
    2. Создайте метод checkSumSign(), в теле которого объявите
    две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Далее метод должен
    просуммировать эти переменные, и если их сумма больше
    или равна 0, то вывести в консоль сообщение “Сумма положительная”,
     в противном случае - “Сумма отрицательная”;*/

    public static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(-100, 100);
        int b = random.nextInt(-100, 100);
        int sum = a + b;
        if (sum >= 0)
            System.out.println(sum + " - Сумма положительная");
        else
            System.out.println(sum + " - Сумма отрицательная");
    }

    /*
     * 3. Создайте метод printColor() в теле
     * которого задайте int переменную value и
     * инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль
     * метод должен вывести сообщение “Красный”, если лежит
     * в пределах от 0 (0 исключительно) до 100 (100 включительно),
     * то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/

    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt(-100, 100);
        if (value <= 0)
            System.out.println(value + " - Красный");
        else if (value > 0 && value <= 100) {
            System.out.println(value + " - Желтый");
        } else
            System.out.println(value + " - Зеленый");
    }

    /*
     * 4. Создайте метод compareNumbers(), в теле
     * которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми
     * захотите. Если a больше или равно b, то необходимо
     * вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(-100, 100);
        int b = random.nextInt(-100, 100);
        if (a >= b)
            System.out.println("a >= b");
        else {
            System.out.println("a < b");
        }
    }
    /*
     * 5. Напишите метод, принимающий на вход два целых числа и проверяющий,
     *  что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.*/

    public static void numberSum() {
        Random random = new Random();
        int a = random.nextInt(-20, 20);
        int b = random.nextInt(-20, 20);
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            System.out.println("true");
        else
            System.out.println("false");
    }
    /*6. Напишите метод, которому в качестве параметра
    передается целое число, метод должен напечатать
    в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/

    public static void checkNumber() {
        Random random = new Random();
        int a = random.nextInt(-100, 100);
        if (a >= 0)
            System.out.println(a + " - положительное");
        else
            System.out.println(a + " - отрицательное");
    }
    /*7. Напишите метод, которому в качестве параметра
    передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.*/

    public static void check() {
        Random random = new Random();
        int a = random.nextInt(-100, 100);
        if (a >= 0)
            System.out.println("false");
        else
            System.out.println("true");
    }
    /*8. Напишите метод, которому в качестве аргументов
     передается строка и число, метод должен отпечатать
     в консоль указанную строку, указанное количество раз;*/

    public static void print() {
        String a = 2024 + " - год семьи";
        int numberOfTimes = 5;//количество раз
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(a);
        }
    }

    /*
     * 9. Напишите метод, который определяет, является
     * ли год високосным, и возвращает boolean (високосный - true,
     *  не високосный - false). Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    public static boolean leapYearCount(int year) {
        return ((year % 4 == 0 & year % 100 != 0) | (year % 400 == 0));
    }
    /*10. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void arrayReplacement() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    /*11. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/

    public static void arrayNumbers() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    //12
    public static void array() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //13
    public static void twoDimensionalArray() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                if (i == j)
                    array[i][j] = 1;
                else if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
        }
    }

    //14
    public static void oneMassiv(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Random random = new Random();
        printThreeWords();//1
        checkSumSign();//2
        printColor();//3
        compareNumbers();//4
        numberSum();//5
        checkNumber();//6
        check();//7
        print();//8
        System.out.println(leapYearCount(random.nextInt(0, 2024)));//9
        arrayReplacement();//10
        arrayNumbers();//11
        array();//12
        twoDimensionalArray();//13
        oneMassiv(random.nextInt(20), random.nextInt(1000));//14
    }
}
