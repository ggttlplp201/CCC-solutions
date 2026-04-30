package ccc.senior;

import java.util.*;

public class CCC14S2 {
    static void main() {
        //Scored 350/500
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> Line1 = new ArrayList<>();
        ArrayList<String> Line2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Line1.add(in.next());
        }
        for (int i = 0; i < N; i++) {
            Line2.add(in.next());
        }
        if (checkTrue(N, Line1, Line2)) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }

    private static boolean checkTrue(int N, ArrayList<String> Line1, ArrayList<String> Line2) {
        boolean flag = true;
        String temp = null;
        String temp2 = null;
        int j = N - 1;
        for (int i = 0; i < N; i++) {
            temp = Line1.get(i) + Line2.get(i);
            temp2 = Line2.get(j) + Line1.get(j);
            j--;
            if (!(temp.equals(temp2))) {
                flag = false;
            }
        }
        return flag;
    }
}
