package Mirea.lab1;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = scanner.nextInt(); /* Функция сканирует введённое число и записывает в переменную size*/
        if(size > 10 || size <= 0){
            System.out.print("Я отказываюсь считать такой массив");
            return;
        }

        int[] array = new int[size];
        /* Задаём массив размером с size*/

        System.out.print("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0){
                System.out.print("Отрицательные числа мне не нравятся");
                return;
            }
        }

        int sum = 0;
        for (int i = 0;i < size;i++){
            sum += array[i];
        }
        double mid = (double) sum / size;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + mid);
    }
}
