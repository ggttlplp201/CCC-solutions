package ccc;

import java.util.*;

public class CCC00S2 {
    static void main() {
        //Scored 12/15
        Scanner in = new Scanner(System.in);
        int streams = in.nextInt();
        ArrayList<Integer> map = new ArrayList<>();
        for (int i = 0; i < streams; i++) {
            map.add(in.nextInt());
        }
        int command = 0;
        while (command != 77) {
            command = in.nextInt();
            if (command == 99) {
                int index = in.nextInt() - 1;
                int left = in.nextInt(); //50
                int right = 100 - left; //50
                int valLeft = map.get(index);
                valLeft *= (double) left / 100;
                int valRight = map.get(index);
                valRight *= (double) right / 100;
                map.set(index, valLeft);
                map.add(index, valRight);
            } else if (command == 88) {
                int index = in.nextInt() - 1;
                int val = map.get(index);
                val += map.get(index + 1);
                map.set(index, val);
                map.remove(index + 1);
            }
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }
}
