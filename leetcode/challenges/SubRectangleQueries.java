package diy.learnings.leetcode.challenges;

public class SubRectangleQueries {

    int[][] r;

    public SubRectangleQueries(int[][] rectangle) {
        this.r = rectangle;
    }

    public void updateQueries(int row1, int col1, int row2, int col2, int newValue) {

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                r[i][j] = newValue;
            }
        }
    }

    public int getValue(int row1, int col1) {
        return r[row1][col1];
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
