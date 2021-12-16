package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1003 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A, B, SOMA;
        A = sc.nextInt();
        B = sc.nextInt();
        SOMA = A + B;
        System.out.printf("SOMA = %d%n", SOMA);
    }

}