package ccc;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC15S3 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int G = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        int[] gates = new int[P + 1];
        for (int i = 1; i <= P; i++) {
            gates[i] = Integer.parseInt(br.readLine());
        }
        TreeSet<Integer> gatesRemaining = new TreeSet<>();
        for (int i = 0; i <= G; i++) {
            gatesRemaining.add(i);
        }
        int counter = 0;
        for (int i = 0; i <= P; i++) {
            int gate = gates[i];
            Integer gateJ = gatesRemaining.floor(gate);
            if (gateJ == null) {
                break;
            } else {
                gatesRemaining.remove(gateJ);
                counter++;
            }
        }
        System.out.println(counter - 1);
    }
}
