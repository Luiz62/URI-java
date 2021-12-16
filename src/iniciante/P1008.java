package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1008 {
    public static Scanner sc = new Scanner(System.in);
    public static int number;
    public static double salary;

    public static void main(String[] args) throws IOException {
        readEmployee();
        show();
    }

    public static void readEmployee() {
        number = sc.nextInt();
        salary = sc.nextInt();
        salary *= sc.nextDouble();
    }

    public static void show() {
        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }

}