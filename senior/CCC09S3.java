package ccc.senior;

import java.util.*;

public class CCC09S3 {
    static void main() {
        ArrayList<Integer>[] adj = new ArrayList[51];
        for (int i = 1; i < 51; i++) {
            adj[i] = new ArrayList<>();
        }
        addToArrayList(adj);
        Scanner in = new Scanner(System.in);
        graph(in, adj);
    }

    private static void graph(Scanner in, List<Integer>[] adj) {
        while (true) {
            String command = in.next();
            if (command.equals("q")) {
                return;
            } else {
                if (command.equals("i")) {
                    commandI(in, adj);
                }
                if (command.equals("d")) {
                    commandD(in, adj);
                }
                if (command.equals("n")) {
                    commandN(in, adj);
                }
                if (command.equals("f")) {
                    commandF(in, adj);
                } else if (command.equals("s")) {
                    commandS(in, adj);
                }
            }
        }
    }

    private static void commandS(Scanner in, List<Integer>[] adj) {
        int a = in.nextInt();
        int b = in.nextInt();
        int[] dis = new int[51];
        Queue<Integer> queue = new LinkedList<>();
        dis[a] = 0;
        boolean[] marked = new boolean[51];
        marked[a] = true;
        queue.add(a);
        while (queue.size() > 0) {
            int v = queue.remove();
            for (int w : adj[v]) {
                if (!marked[w]) {
                    dis[w] = dis[v] + 1;
                    marked[w] = true;
                    queue.add(w);
                }
            }
        }
        if (!marked[b]) {
            System.out.println("Not connected");
        } else {
            System.out.println(dis[b]);
        }
    }

    private static void commandF(Scanner in, List<Integer>[] adj) {
        int a = in.nextInt();
        ArrayList<Integer> friends = new ArrayList<>();
        ArrayList<Integer> friendsOfFriends = new ArrayList<>();
        for (int i = 0; i < adj[a].size(); i++) {
            friends.add(adj[a].get(i));
        }
        for (int j = 0; j < friends.size(); j++) {
            List<Integer> friendsJ = adj[friends.get(j)];
            for (int i = 0; i < friendsJ.size(); i++) {
                int friend = friendsJ.get(i);
                if (!friendsOfFriends.contains(friend) && friend != a && !friends.contains(friend)) {
                    friendsOfFriends.add(friend);
                }
            }
        }
        System.out.println(friendsOfFriends.size());
    }

    private static void commandN(Scanner in, List<Integer>[] adj) {
        int a = in.nextInt();
        System.out.println(adj[a].size());
    }

    private static void commandD(Scanner in, List<Integer>[] adj) {
        int a = in.nextInt();
        int b = in.nextInt();
        adj[a].remove((Integer) b);
        adj[b].remove((Integer) a);
    }

    private static void commandI(Scanner in, List<Integer>[] adj) {
        int a = in.nextInt();
        int b = in.nextInt();
        if (!(adj[a].contains(b))) {
            adj[a].add(b);
            adj[b].add(a);
        }
    }

    private static void addToArrayList(List<Integer>[] adj) {
        adj[1].add(6);
        adj[6].add(1);
        adj[2].add(6);
        adj[6].add(2);
        adj[3].add(6);
        adj[6].add(3);
        adj[7].add(6);
        adj[6].add(7);
        adj[4].add(6);
        adj[6].add(4);
        adj[5].add(6);
        adj[6].add(5);
        adj[4].add(3);
        adj[3].add(4);
        adj[5].add(4);
        adj[4].add(5);
        adj[5].add(3);
        adj[3].add(5);
        adj[3].add(15);
        adj[15].add(3);
        adj[7].add(8);
        adj[8].add(7);
        adj[8].add(9);
        adj[9].add(8);
        adj[10].add(9);
        adj[9].add(10);
        adj[10].add(11);
        adj[11].add(10);
        adj[11].add(12);
        adj[12].add(11);
        adj[13].add(12);
        adj[12].add(13);
        adj[13].add(15);
        adj[15].add(13);
        adj[13].add(14);
        adj[14].add(13);
        adj[16].add(17);
        adj[17].add(16);
        adj[17].add(18);
        adj[18].add(17);
        adj[16].add(18);
        adj[18].add(16);
        adj[12].add(9);
        adj[9].add(12);
    }
}