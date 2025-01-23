import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Задача 1: Статистика массива");
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Массив должен содержать хотя бы один элемент.");
        } else {
            int[] arr = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            for (int num : arr) {
                sum += num;
                if (num < smallest) smallest = num;
                if (num > largest) largest = num;
            }

            double average = (double) sum / arr.length;

            System.out.println("Статистика массива:");
            System.out.println("Сумма элементов: " + sum);
            System.out.println("Среднее значение: " + average);
            System.out.println("Наименьший элемент: " + smallest);
            System.out.println("Наибольший элемент: " + largest);
        }

        System.out.println();


        scanner.nextLine();
        System.out.println("Задача 2: Проверка на палиндром");
        System.out.println("Введите слово, число или предложение для проверки:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром.");
        }
    }


    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}



