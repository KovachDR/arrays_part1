import java.util.Arrays;

public class ArraysPartOne {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача №1 и №2");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i < numbers1.length; i++) {
            if (i == numbers1.length - 1) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.printf(numbers1[i] + ", ");
        }
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.printf(numbers2[i] + ", ");
        }
        int[] numbers3 = {5, 3, 54, 22, 64, 22, 5454, 442, 12, 156, 764};
        for (int i = 0; i < numbers3.length; i++) {
            if (i == numbers3.length - 1) {
                System.out.println(numbers3[i]);
                break;
            }
            System.out.printf(numbers3[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = numbers1.length - 1; i <= numbers1.length; i--) {
            if (i == 0) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.printf(numbers1[i] + ", ");
        }
        double [] numbers2 = {1.57, 7.654, 9.986};
        for (int i = numbers2.length - 1; i <= numbers2.length; i--) {
            if (i == 0) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.printf(numbers2[i] + ", ");
        }
        int [] numbers3 = {5,3,54,22,64,22,5454,442,12,156,764};
        for (int i = numbers3.length - 1; i <= numbers3.length; i--) {
            if (i == 0) {
                System.out.println(numbers3[i]);
                break;
            }
            System.out.printf(numbers3[i] + ", ");
        }
    }
    public static void task4() {
        System.out.println("Задача №4");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i < numbers1.length; i++){
            if (numbers1[i] % 2 != 0){
                numbers1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers1));
    }
}


