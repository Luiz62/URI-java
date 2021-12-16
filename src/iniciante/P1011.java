package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class P1011 {
    public static double PI = 3.14159;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double volume = 4.0/3.0 * PI * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }

}