package ccc.junior;

import java.util.*;
import java.io.*;

public class CCC07J5 {
    static int count = 0;

    static void main() throws IOException {
        //Scored 15/21
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> motels = new ArrayList<>();
        init(motels);
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                motels.add(Integer.parseInt(br.readLine()));
            }
        }
        Collections.sort(motels);
        int i = 0;
        backTrack(a, b, motels, i);
        System.out.println(count);
    }

    private static void backTrack(int a, int b, ArrayList<Integer> motels, int index) {
        if (index == motels.size() - 1) {
            count++;
            return;
        }
        for (int j = index + 1; j < motels.size(); j++) {
            if (motels.get(j) - motels.get(index) <= b && motels.get(j) - motels.get(index) >= a) {
                backTrack(a, b, motels, j);
            }
        }
    }

    private static void init(ArrayList<Integer> motels) {
        motels.add(0);
        motels.add(990);
        motels.add(1010);
        motels.add(1970);
        motels.add(2030);
        motels.add(2940);
        motels.add(3060);
        motels.add(3930);
        motels.add(4060);
        motels.add(4970);
        motels.add(5030);
        motels.add(5990);
        motels.add(6010);
        motels.add(7000);
    }
}
