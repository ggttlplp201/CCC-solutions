package ccc.senior;

import java.util.*;

public class CCC19S2 {
    static HashSet<Integer> primes = new HashSet<>();

    static void main() {

        Scanner in = new Scanner(System.in);
        primeNums();
        int T = in.nextInt();
        int B;
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            for (int A : primes) {
                B = N * 2 - A;
                if (primes.contains(B)) {
                    System.out.println(A + " " + B);
                    break;
                }
            }
        }

    }

    private static void primeNums() {
        boolean[] prime = new boolean[2000001];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= 2000000; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= 2000000; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i < 2000001; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }
    }
}

