package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1007 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Integer> list = readValues();
        show(list);
    }

    public static List<Integer> readValues() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }

    public static void show(List<Integer> list) {
        int diferenca = list.get(0) * list.get(1) - list.get(2) * list.get(3);
        System.out.printf("DIFERENCA = %d%n", diferenca);
    }
}