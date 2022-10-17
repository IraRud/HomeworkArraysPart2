package skypro.java.course1.hw_1;

public class Task_1234 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        /* Задание 1
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц. Нужно написать программу, которая решит
        эту задачу, и вывести в консоль результат в формате: «Сумма трат за месяц составила … рублей».*/
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {   // 1-ый способ через foreach
            sum += element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", sum);
        sum = 0;
        for (int i = 0; i < arr.length; i++) {  //2-ой способ через for
            sum += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", sum);

        /* Задание 2
        Следующая задача — найти минимальную и максимальную трату за день. Нужно написать программу, которая решит эту
        задачу, и вывести в консоль результат в формате: «Минимальная сумма трат за день составила … рублей.
        Максимальная сумма трат за день составила … рублей».*/
        int max = arr[0];   // присвоим минимальное значение 1 эл-ту массива
        int min = arr[0];   // присвоим макисмальное значение 1 эл-ту массива
        for (int element :
                arr) {
            if (element < min) {
                min = element;  // если элемент массива меньше ранее найденного минимума, то он становится им
            }
            if (element > max) {
                max = element;  // если элемент массива больше ранее найденного максимума, то он становится им
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день " +
                "составила %d рублей.\n", min, max);

        /* Задание 3
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней. Нужно написать
        программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на
        количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        Важно помнить: подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).*/
        double arithmeticMean = (double) sum / arr.length;  // sum - сумма найденная ранее, arr.length - возвращает количество элементов
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", arithmeticMean);

        /* Задание 4
        Отойдем от подсчетов.В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали
        отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ». Данные с
        именами сотрудников хранятся в виде массива символов (char[]). Напишите код, который в случае такого бага будет
        выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву
        циклом и распечатать его элементы в правильном порядке.*/
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print("Массив с ошибками: ");
        for (char element : reverseFullName    // вывод старого массива
        ) {
            System.out.print(element);
        }
        System.out.println();
        char keeping;
        for (int i = 0; i < reverseFullName.length / 2; i++) {      // замена элементов массива
            keeping = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = keeping;
        }
        System.out.print("Массив без ошибок: ");
        for (char element : reverseFullName    // вывод исправленного массива
        ) {
            System.out.print(element);
        }


    }
}
