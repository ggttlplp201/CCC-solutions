package ccc.junior;

import java.util.*;

public class CCC09J3 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(makeValidTime(n) + " in Ottawa");

        System.out.println(makeValidTime(n - 300) + " in Victoria");

        System.out.println(makeValidTime(n - 200) + " in Edmonton");

        System.out.println(makeValidTime(n - 100) + " in Winnipeg");


        System.out.println(makeValidTime(n) + " in Toronto");

        System.out.println(makeValidTime(n + 100) + " in Halifax");

        System.out.println(makeValidTime(n + 130) + " in St. John's");

    }

    private static int makeValidTime(int O) {
        while (O % 100 > 59) {
            O += 100;
            O -= 60;
        }
        while (O > 2359) {
            O -= 2400;
        }
        while (O < 0) {
            O += 2400;
        }
        return O;
    }
}
