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

    }
}
