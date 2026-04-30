package ccc.junior;

import java.util.*;

public class CCC10J4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        while (true) {
            int nums = in.nextInt();
            if (nums == 0) {
                break;
            }
            System.out.println(getCycleLength(nums, in));
        }
    }

    static int getCycleLength(int nums, Scanner in) {
        int[] arr;
        arr = new int[nums];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] diff = new int[nums - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }
        for (int n = 1; n <= diff.length; n++) {
            if (isCycle(diff, n)) {
                return n;
            }
        }
        return diff.length;
    }

    static boolean isCycle(int[] diff, int n) {
        int k = 0;
        for (int j = 0; j < diff.length; j++) {
            if (diff[j] != diff[k]) {
                return false;
            }
            k++;
            if (k == n) {
                k = 0;
            }
        }
        return true;
    }
}





    /*Scanner input = new Scanner(System.in);
    int h = input.nextInt();
    int m = input.nextInt();
    int t = 1;
    int A = -6*t*t*t*t + h*t*t*t + 2*t*t + t;
        while (t < m && A > 0) {
        t = t + 1;
        A = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t;
        }
        if (A>0)
        System.out.println("The balloon does not touch ground in the given time.");

        else if (A <= 0)
        System.out.println("The balloon first touches ground at hour:\n"  + t);



    /*Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = x;
        while (z<y) {
                System.out.println("All positions change in year " +z);
                z += 60;


     */
        /*for (int x = 0; x < 100; x += 3) {
            System.out.println(x);
        }

        //int x = 0;
        //while (x++ < 10) {
            //System.out.print(x);
            //if (x == 7)
                //break;
        //}
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter a number");
        //int x = input.nextInt();
        //if (x > 0) {
            //System.out.println("positive");
        //} else if(x == 0) {
            //System.out.println("zero");
        //} else {
            //System.out.println("negative");
        //}
    }*/
