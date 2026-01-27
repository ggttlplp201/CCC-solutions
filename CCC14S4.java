package ccc;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class CCC14S4 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        List<Glass> glasses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int tintLevel = Integer.parseInt(st.nextToken());
            glasses.add(new Glass(x1, y1, x2, y2, tintLevel));
        }

        List<Event> events = new ArrayList<>();
        for (Glass glass : glasses) {
            events.add(new Event(glass.x1, glass.y1, glass.y2, glass.tintLevel));
            events.add(new Event(glass.x2, glass.y1, glass.y2, -glass.tintLevel));
        }

        Collections.sort(events);

        TreeSet<Integer> yIntervals = new TreeSet<>();
        for (Glass glass : glasses) { //unique Ys
            yIntervals.add(glass.y1);
            yIntervals.add(glass.y2);
        }

        Integer[] yValues = yIntervals.toArray(new Integer[0]);
        HashMap<Integer, Integer> yIndexMap = new HashMap<>(yValues.length);
        for (int i = 0; i < yValues.length; i++) {
            yIndexMap.put(yValues[i], i);
        }
        long[] tintFactors = new long[yValues.length];

        long totalArea = 0;

        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            long xDiff = 0;
            if (i > 0) {
                xDiff = event.x - events.get(i - 1).x;
            }
            for (int yIndex = 0; yIndex < tintFactors.length - 1; yIndex++) {
                if (tintFactors[yIndex] >= t) {
                    long yDiff = yValues[yIndex + 1] - yValues[yIndex];
                    long area = xDiff * yDiff;
                    totalArea += area;
                }
            }
            int y1 = event.y1;
            int y2 = event.y2;
            int y1Index = yIndexMap.get(y1);
            int y2Index = yIndexMap.get(y2);
            for (int yIndex = y1Index; yIndex < y2Index; yIndex++) {
                tintFactors[yIndex] += event.value;
            }
        }
//        for (Event event : events) {
//            int x = event.x;
//            int y1 = event.y1;
//            int y2 = event.y2;
//            int value = event.value;
//            int currentTint = 0;
//            for (int i = 1; i < yValues.length; i++) {
//                if (currentTint >= t) {
//                    totalArea += (long) (x - prevX) * (yValues[i] - yValues[i - 1]);
//                }
//                if (y1 <= yValues[i - 1] && y2 >= yValues[i]) {
//                    currentTint += value;
//                }
//            }
//            prevX = x;
//        }

        pw.println(totalArea);
        br.close();
        pw.close();
    }

    static class Glass {
        int x1, y1, x2, y2, tintLevel;

        public Glass(int x1, int y1, int x2, int y2, int tintLevel) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.tintLevel = tintLevel;
        }
    }

    static class Event implements Comparable<Event> {
        int x, y1, y2, value;

        public Event(int x, int y1, int y2, int value) {
            this.x = x;
            this.y1 = y1;
            this.y2 = y2;
            this.value = value;
        }

        @Override
        public int compareTo(Event other) {
            return Integer.compare(this.x, other.x);
        }
    }

}

