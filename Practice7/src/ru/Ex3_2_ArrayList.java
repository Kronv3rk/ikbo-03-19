package ru;


import java.util.*;

public class Ex3_2_ArrayList {


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

        ArrayList<Integer> fplayer = conv(f);
        ArrayList<Integer> splayer = conv(s);


        play(fplayer, splayer);

    }

    public static void play(ArrayList<Integer> fplayer, ArrayList<Integer> splayer) {
        int part = 0;
        while (!fplayer.isEmpty() && !splayer.isEmpty() && part < 107) {
            int fcard = fplayer.get(0);
            fplayer.remove(0);

            int scard = splayer.get(0);
            splayer.remove(0);

            if (fcard == 0 && scard == 9) {
                fplayer.add(fcard);
                fplayer.add(scard);
            } else if (fcard == 9 && scard == 0) {
                splayer.add(fcard);
                splayer.add(scard);
            } else if (fcard > scard) {
                fplayer.add(fcard);
                fplayer.add(scard);
            } else {
                splayer.add(fcard);
                splayer.add(scard);
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

    public static ArrayList<Integer> conv(String[] pull) {
        ArrayList<Integer> p = new ArrayList();
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
