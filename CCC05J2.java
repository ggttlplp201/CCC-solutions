package ccc;

import java.util.*;

public class CCC05J2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int initial = input.nextInt();
        int range = input.nextInt();
        int rsaCount = 0;
        for (int i = initial; i <= range; i++) {
            int count = countFactors(i);
            if (count == 4)
                rsaCount++;
        }


        System.out.println("The number of RSA numbers between " + initial + " and " + range + " is " + rsaCount);
    }

    private static int countFactors(int initial) {
        int count = 0;


        for (int i = 1; i <= initial; i++) {
            if (initial % i == 0)
                count = count + 1;
        }
        return count;
    }
}
