package Arrays2D;

public class SearchInSortedMatrix {
    public static void search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row<=matrix.length-1 && col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("("+row+","+col+")");
                return;
            }
            if(matrix[row][col] > key) {
                col--;
            } else if(matrix[row][col] < key){
                row++;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;
        search(matrix, key);
    }
}
