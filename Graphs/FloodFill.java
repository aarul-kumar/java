package Graphs;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgCol = image[sr][sc];
        if (orgCol == color) {
            return image;
        }
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, orgCol);
        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        helper(image, sr, sc - 1, color, vis, orgCol);
        helper(image, sr, sc + 1, color, vis, orgCol);
        helper(image, sr - 1, sc, color, vis, orgCol);
        helper(image, sr + 1, sc, color, vis, orgCol);
    }
    public static void main(String[] args) {
        int image[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        image = floodFill(image, 1, 1, 2);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
