package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1009 {
    public static Scanner sc = new Scanner(System.in);
    public static String name;
    public static double salary, sales;

    public static void main(String[] args) throws IOException {
        read();
        show();
    }

    public static void read() {
        name = sc.nextLine();
        salary = sc.nextDouble();
        sales = sc.nextDouble();
    }

    public static void show() {
        System.out.printf("TOTAL = R$ %.2f%n", salary + (sales * 0.15));
    }
}