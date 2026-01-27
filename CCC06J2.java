package ccc;

import java.util.*;

public class CCC06J2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int dice = input.nextInt();
        int dice2 = input.nextInt();
        int count = 0;
        for (int i = 1; i <= dice; i++) {
            for (int x = 1; x <= dice2; x++) {
                if (i + x == 10)
                    count = count + 1;
            }
        }
        if (count == 1)
            System.out.println("There is " + count + " way to get the sum 10.");
        else
            System.out.println("There are " + count + " ways to get the sum 10.");
    }
}
