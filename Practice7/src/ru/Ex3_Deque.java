package ru;

import java.util.*;

public class Ex3_Deque {

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


        Deque<Integer> fplayer = conv(f);
        Deque<Integer> splayer = conv(s);


        play(fplayer, splayer);

    }

    public static void play(Deque<Integer> fplayer, Deque<Integer> splayer) {
        int part = 0;
        while (!fplayer.isEmpty() && !splayer.isEmpty() && part < 107) {
            int cardFirst = fplayer.remove();
            int cardSecond = splayer.remove();

            if (cardFirst == 0 && cardSecond == 9) {
                fplayer.add(cardFirst);
                fplayer.add(cardSecond);
            } else if (cardFirst == 9 && cardSecond == 0) {
                splayer.add(cardFirst);
                splayer.add(cardSecond);
            } else if (cardFirst > cardSecond) {
                fplayer.add(cardFirst);
                fplayer.add(cardSecond);
            } else {
                splayer.add(cardFirst);
                splayer.add(cardSecond);
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

    public static Deque<Integer> conv(String[] pull) {
        Deque<Integer> p = new LinkedList();
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
