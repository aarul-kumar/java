package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0; i<=arr.length-2; i++) {
            int minPos = i;
            for(int j=i+1; j<=arr.length-1; j++) {
                if(arr[minPos]>arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
