import java.util.*;

public class JavaBasics {
    public static void hello() {
        System.out.println("Hello world.");
    }

    public static int calculateSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static int factorial(int a) {
        int temp = 1;
        for (int i = 1; i <= a; i++) {
            temp *= i;
        }
        return temp;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    public static void arrayUpdate(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public static int linearSearch(String array[], String checkNum) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkNum) {
                return i;
            }
        }
        return -1;
    }

    public static int checkLargestNum(int array[]) {
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (num <= array[i]) {
                num = array[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int myArr[] = { 10, 44, 3, 65, 100 };

        int num = checkLargestNum(myArr);
        System.out.println(num);

    }
}