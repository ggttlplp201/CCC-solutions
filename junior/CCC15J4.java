package ccc.junior;

import java.util.*;

public class CCC15J4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String cur;
        int friend;
        int time = 0;
        int[] receive = new int[101];
        int[] reply = new int[101];
        int[] wait = new int[101];

        for (int i = 0; i < num; i++) {
            cur = in.next();
            friend = in.nextInt();
            if (cur.equals("W")) {
                time = time + friend - 1;
            } else if (cur.equals("R")) {
                reply[friend] = -1;
                receive[friend] = time;
                time++;
            } else if (cur.equals("S")) {
                reply[friend] = 1;
                wait[friend] += time - receive[friend];
                time++;
            }
        }
        for (int j = 0; j < 101; j++) {
            if (reply[j] == -1) {
                System.out.println(j + " " + -1);
            } else if (reply[j] == 1) {
                System.out.println(j + " " + wait[j]);
            }
        }
    }
}
