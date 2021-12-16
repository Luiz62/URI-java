package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class P1014 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaTotal = sc.nextInt();
        double totalCombustivel = sc.nextDouble();
        double consumoMedia = distanciaTotal / totalCombustivel;

        System.out.printf("%.3f km/l%n", consumoMedia);
    }

}