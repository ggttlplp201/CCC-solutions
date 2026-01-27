package ccc;

import java.util.*;

public class CCC07J4 {
    static void main() {

        Scanner input = new Scanner(System.in);
        String a = input.nextLine().replaceAll(" ", "");
        String b = input.nextLine().replaceAll(" ", "");
        HashMap<Character, Integer> A = new HashMap<>();
        HashMap<Character, Integer> B = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (!A.containsKey(a.charAt(i))) {
                A.put(a.charAt(i), 1);
            } else {
                A.put(a.charAt(i), A.get(a.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (!B.containsKey(b.charAt(i))) {
                B.put(b.charAt(i), 1);
            } else {
                B.put(b.charAt(i), B.get(b.charAt(i)) + 1);
            }
        }
        if (A.equals(B)) {
            System.out.println("Is an anagram.");
        } else {
            System.out.println("Is not an anagram.");
        }
//        int[] nums = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = nums.length - 1; j >= 0; j--) {
//                if (nums[i] == nums[j]) {
//                    i++;
//                    count++;
//                }
//            }
//        }
//        System.out.println(count / 2);
//        Scanner input = new Scanner(System.in);
//        String a = input.nextLine();
//        String b = input.nextLine();
//        char[] a1 = getAnagram(a);
//        char[] b1 = getAnagram(b);
//        if (Arrays.equals(a1, b1)) {
//            System.out.println("Is an anagram.");
//        } else {
//            System.out.println("Is not an anagram.");
//        }
//    }
//
//    private static char[] getAnagram(String a) {
//        a = a.replace(" ", "");
//        char[] a1 = a.toCharArray();
//        Arrays.sort(a1);
//        return a1;
    }
}
