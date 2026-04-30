package ccc.senior;

import java.util.*;

public class CCC17S2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> all = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            all.add(in.nextInt());
        }
        Collections.sort(all);
        ArrayList<Integer> high = new ArrayList<>();
        ArrayList<Integer> low = new ArrayList<>();
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i < n / 2) {
                    low.add(all.get(i));
                } else {
                    high.add(all.get(i));
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i < n / 2 + 1) {
                    low.add(all.get(i));
                } else {
                    high.add(all.get(i));
                }
            }
        }
        low.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(low.get(i)).append(" ").append(high.get(i)).append(" ");
        }
        if (n % 2 != 0) {
            sb.append(low.get(low.size() - 1));
        }
        System.out.println(sb.toString());
    }
}


//        int second = in.nextInt();
//        for (int i = 0; i < n - 1; i++) {
//            all.add(in.nextInt());
//        }
//        ArrayList<Integer> high = new ArrayList<>();
//        ArrayList<Integer> low = new ArrayList<>();
//        low.add(first);
//        high.add(second);
//        for (int i = 0; i < all.size(); i++) {
//            if (all.get(i) < first) {
//                low.add(all.get(i));
//            } else {
//                high.add(all.get(i));
//            }
//        }
//        Collections.sort(high);
//        low.sort(Collections.reverseOrder());
//        while (i < low.size() || j < high.size()) {
//            if (i == low.size()) {
//                break;
//            } else if (j == high.size()) {
//                break;
//            }
//            System.out.print(low.get(i) + " ");
//            System.out.print(high.get(j) + " ");
//            i++;
//            j++;
//        }
//        if (j == high.size()) {
//            while (i < low.size()) {
//                System.out.print(low.get(i) + " ");
//                i++;
//            }
//        } else {
//            while (j < high.size()) {
//                System.out.print(high.get(j) + " ");
//                j++;
//            }
//        }

