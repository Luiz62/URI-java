package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class P1013 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int Maior1 = (a + b + Math.abs(a - b)) /2;
        int Maior12 = (Maior1 + c + Math.abs(Maior1 - c)) /2;
        System.out.printf("%d eh o maior%n", Maior12);
    }

}