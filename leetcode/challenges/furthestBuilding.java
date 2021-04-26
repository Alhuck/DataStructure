package leetcode.challenges;

import java.util.PriorityQueue;

public class furthestBuilding {

    public static int furthestBuildingM(int[] heights, int bricks, int ladders) {
        int maxIndex = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a)) ;
        for (int i = 0; i < heights.length; i++) {
            maxIndex = i;
            if ((i + 1) < heights.length) {
                if (heights[i] >= heights[i + 1]) {
                    continue;
                } else {
                    int diff = (heights[i + 1] - heights[i]);
                    if (ladders <= 0 && (bricks <= 0 || (diff) > bricks)) {
                        break;
                    }
                    if ((diff) <= bricks) {
                        bricks = bricks - (diff);
                        pq.offer(diff);
                    } else {
                        if (!pq.isEmpty()) {
                            bricks = bricks + pq.poll();
                            if (bricks >= diff) {
                                bricks = bricks - diff;
                                pq.offer(diff);
                            }
                        }
                        ladders = ladders - 1;
                    }
                }
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1, 5, 1, 2, 3, 4, 10000 };
        int ladders = 1;
        int bricks = 4;

        System.out.println(furthestBuildingM(arr, bricks, ladders));
    }

}
