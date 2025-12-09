package Arrays2D;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int n = matrix.length;
        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;

        while(startRow<=endRow && startCol<=endCol) {
            //topRow
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //rightColumn
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottomRow
            if(startRow < endRow) {
                for(int j=endCol-1; j>=startCol; j--) {
                    System.out.print(matrix[endRow][j]+" ");
                }
            }
            //leftColumn
            if(startCol < endCol) {
                for(int i=endRow-1; i>=startRow+1; i--) {
                    System.out.print(matrix[i][startCol]+" ");
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }
}
