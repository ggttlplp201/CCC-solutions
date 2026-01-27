package ccc;

import java.util.*;

public class CCC00S1 {
    static void main() {
        //Scored 9/15
        Scanner in = new Scanner(System.in);

        int money = in.nextInt();

        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();

        int turn = 0;
        while (money != 0) {
            money--;
            if (turn % 3 == 0) {
                if (m1 == 35) {
                    money += 30;
                    m1 = 0;

                } else {

                    m1++;
                }
            } else if (turn % 3 == 1) {
                if (m2 == 100) {
                    money += 60;
                    m2 = 0;

                } else {

                    m2++;
                }
            } else if (turn % 3 == 2) {
                if (m3 == 10) {
                    money += 9;
                    m3 = 0;

                } else {

                    m3++;
                }
            }
            turn++;
        }
        System.out.println("Martha plays " + turn + " times before going broke.");
    }
}
