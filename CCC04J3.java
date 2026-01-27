package ccc;

import java.util.*;

public class CCC04J3 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        ArrayList<String> adj = new ArrayList<String>();
        ArrayList<String> noun = new ArrayList<String>();
        for (int i = 0; i < x; i++) {
            adj.add(in.next());
        }
        for (int i = 0; i < y; i++) {
            noun.add(in.next());
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(adj.get(i) + " as " + noun.get(j));
            }
        }
    }
}

