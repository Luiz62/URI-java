package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1002 {
    public static double PI = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        System.out.printf("A=%5.4f\n", PI*(raio*raio));
        sc.close();

    }

}