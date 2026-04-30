package ccc.junior;

import java.util.*;

public class CCC09J2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int trout = input.nextInt();
        int pike = input.nextInt();
        int pickerel = input.nextInt();
        int total = input.nextInt();
        int counter = 0;
        for (int i = 0; i <= total; i++) {
            for (int j = 0; j <= total; j++) {
                for (int k = 0; k <= total; k++) {
                    int fishtotal = trout * i + pike * j + pickerel * k;
                    if (fishtotal <= total && fishtotal > 0) {
                        counter++;
                        System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " Yellow Pickerel");
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: " + counter);
    }
}
