import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
    // Далее пишем код для задачи

//    public static void main(String[] args) {
//         int[] rack = new int[4];
//         rack[0] = 12;
//         rack[1] = 9;
//         rack[2] = 11;
//         rack[3] = 10;
//         int[] rack2 = new int[4];
//         rack2[0] = 12;
//         rack2[1] = 9;
//        rack2[2] = 11;
//        rack2[3] = 10;
//        boolean rackAreEqual = true;
//        rackAreEqual = rack.length == rack2.length;
//        for (int i = 0; i < rack.length; i++) {
//            if (rack[i] != rack2[i]) {
//                rackAreEqual = false;
//            }
//            if (rackAreEqual) {
//                System.out.println("Стилажи одинаковые");
//            } else {
//                System.out.println("Стилажи разные");
//            }
//        }
//        int[] rack3 = {12, 9, 11, 10};
//        int sum = 0;
//        for (int index = 0; index < rack3.length; index++) {
//            sum = sum + rack3[index];
//        }
//
//
//        System.out.println(sum);
//        int[] rack4 = {12, 9, 11, 10};
//        int sum1 = 0;
//        for (int element : rack4) {
//            sum1 = sum1 + element;
//        }
//        System.out.println(sum1);
//
//        int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        int[] weightCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        boolean arraysAreEqual = true;
//        arraysAreEqual = weight.length == weightCopy.length;
//        if (arraysAreEqual) {
//            for (int i = 0; i < weight.length; i++) {
//                if (weight.length != weightCopy.length) {
//                    arraysAreEqual = false;
//                }
//            }
//        }
//        if (arraysAreEqual) {
//            System.out.println("Массивы равны");
//        } else {
//            System.out.println("Массивы разные");
//        }//Найдем максимум массива
//        int maxWeight = -1;
//        for (int i = 0; i < weight.length; i++) {
//            if (weight[i] > maxWeight) {
//                maxWeight = weight[i];
//            }
//        }//вариант есть еще такой
//        System.out.println(maxWeight);
//        for (final int current : weight){
//            if (current>maxWeight){
//                maxWeight=current;
//            }
//        }
//        System.out.println(maxWeight);
//           int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        for (int i = 0; i < weight.length-1 && weight[i + 1] !=0; i++){
//            System.out.println(weight[i +1] - weight[i]);
//        }
//        Задача №1
//        System.out.println("Задача №1");





    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Далее пишем код для задачи
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
            int[] arr = generateRandomArray();
            int minExpenses = arr[0];
            int maxExpenses = -1;
            for (int i = 0; i < arr.length; i++){
                if(arr[i]<minExpenses) {
                   minExpenses = arr[i];
                }
                if (arr[i]>maxExpenses) {
                    maxExpenses = arr[i];

                }
            }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
        }
    public static void task3 () {
        int[] arr = generateRandomArray();
        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Средняя сумма затрат за месяц составила " + sum / arr.length + " рублей.");
    }
    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}


