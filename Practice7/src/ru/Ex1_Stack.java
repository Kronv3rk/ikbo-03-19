package ru;

import java.util.*;

public class Ex1_Stack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] f = null, s = null;
        boolean check = true;

        while(check) {
            System.out.println("5 карт игрока 1:");
            f = scanner.nextLine().split(" ");
            System.out.println("5 карт игрока 2:");
            s = scanner.nextLine().split(" ");
            check = !corr(f,s,10);
        }


        Stack<Integer> fplayer = conv(f);
        Stack<Integer> splayer = conv(s);


        play(fplayer, splayer);

    }

    public static void play(Stack<Integer> fplayer, Stack<Integer> splayer) {
        int part = 0;
        while (!fplayer.isEmpty() && !splayer.isEmpty() && part < 107) {
            int fcard = fplayer.pop();
            int scard = splayer.pop();

            if (fcard == 0 && scard == 9) {
                fplayer.add(0, fcard);
                fplayer.add(0, scard);
            } else if (fcard == 9 && scard == 0) {
                splayer.add(0, fcard);
                splayer.add(0, scard);
            } else if (fcard > scard) {
                fplayer.add(0, fcard);
                fplayer.add(0, scard);
            } else {
                splayer.add(0, fcard);
                splayer.add(0, scard);
            }
            part++;
        }

        if (part == 107) {
            System.out.println("draw");
        } else if (!splayer.isEmpty()) {
            System.out.println("Второй " + part);
        } else {
            System.out.println("Первый " + part);
        }
    }

    public static Stack<Integer> conv(String[] pull) {
        Stack<Integer> p = new Stack<>();
        for (String s : pull) {
            p.add(Integer.parseInt(s));
        }
        return p;
    }

    public static boolean corr(String[] fst, String[] scd, int n) {
        String[] check = new String[n];
        System.arraycopy(fst, 0, check, 0, n/2);
        System.arraycopy(scd, 0, check, n/2, n/2);
        Arrays.sort(check);
        for (int i = 0; i < n; i++) {
            if (i != Integer.parseInt(check[i])) {
                System.out.println("Повторный ввод");
                return false;
            }
        }
        return true;
    }
}
