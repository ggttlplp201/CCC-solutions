package ccc;

import java.util.*;

public class CCC09S4 {

    static void main() {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = in.nextInt();
        List<List<City>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < t; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int cost = in.nextInt();
            graph.get(x).add(new City(y, cost));
            graph.get(y).add(new City(x, cost));
        }

        int k = in.nextInt();
        int[] pencilCosts = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int z = in.nextInt();
            int Pz = in.nextInt();
            if (pencilCosts[z] == 0 || Pz < pencilCosts[z]) {
                pencilCosts[z] = Pz;
            }
        }

        int d = in.nextInt();
        int result = dijkstra(graph, pencilCosts, d, n);
        System.out.println(result);
    }

    static int dijkstra(List<List<City>> graph, int[] pencilCosts, int destination, int N) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[destination] = 0;
        PriorityQueue<City> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.cost));
        pq.offer(new City(destination, 0));
        while (!pq.isEmpty()) {
            City curr = pq.poll();
            for (City neighbor : graph.get(curr.id)) {
                int newDist = dist[curr.id] + neighbor.cost;
                if (newDist < dist[neighbor.id]) {
                    dist[neighbor.id] = newDist;
                    pq.offer(new City(neighbor.id, newDist));
                }
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            if (pencilCosts[i] > 0 && dist[i] != Integer.MAX_VALUE) {
                minCost = Math.min(minCost, dist[i] + pencilCosts[i]);
            }
        }

        return minCost;
    }

    static class City {
        int id;
        int cost;

        public City(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }
}

