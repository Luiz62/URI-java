package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1010 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Peca> list = read();
        show(list);
    }

    public static List<Peca> read() {
        List<Peca> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int codigo = sc.nextInt();
            int numero = sc.nextInt();
            double valor = sc.nextDouble();

            list.add(new Peca(codigo, numero, valor));
        }
        return list;
    }

    public static void show(List<Peca> list) {
        double total = 0.0;
        for (Peca peca: list) {
            total += peca.total();
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }

    public static class Peca {
        private int codigo;
        private int numero;
        private double valor;

        public Peca(int codigo, int numero, double valor) {
            this.codigo = codigo;
            this.numero = numero;
            this.valor = valor;
        }

        public double total() {
            return numero * valor;
        }

    }
}