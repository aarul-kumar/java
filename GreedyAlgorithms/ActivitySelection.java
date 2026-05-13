package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void activitySelection(int start[], int end[]) {
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                ans.add(activities[i][0]);
                maxAct++;
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Total activities = " + maxAct);
        System.out.print("Activites selected: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 8 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        activitySelection(start, end);
    }
}
