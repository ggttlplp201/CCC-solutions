package ccc;

import java.util.*;

public class CCC05J3 {
    static void main() {
        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String directions = in.next();
            if (directions.equals("SCHOOL")) {
                break;
            } else {
                arr.add(directions);
            }
        }
        Collections.reverse(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).equals("R")) {
                System.out.println("Turn LEFT onto " + arr.get(i + 1) + " street.");
            }
            if (arr.get(i).equals("L")) {
                System.out.println("Turn RIGHT onto " + arr.get(i + 1) + " street.");
            }
        }
        if (arr.get(arr.size() - 1).equals("R")) {
            System.out.println("Turn LEFT into your HOME.");
        } else if (arr.get(arr.size() - 1).equals("L")) {
            System.out.println("Turn RIGHT into your HOME.");
        }
    }
}
