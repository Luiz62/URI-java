package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class P1012 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String todosValores = sc.nextLine();
        List<Double> list = new ArrayList<>();

        for (String valor: todosValores.split(" ")) {
            list.add(Double.parseDouble(valor));
        }
        double triangulo = (list.get(0) * list.get(2))/2;
        double circulo = Math.pow(list.get(2), 2) * 3.14159;
        double trapezio = ((list.get(0) + list.get(1)) * list.get(2))/2;
        double quadrado = Math.pow(list.get(1), 2);
        double retangulo = list.get(0) * list.get(1);

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

    }

}