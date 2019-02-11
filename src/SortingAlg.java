/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int x = arr1.length;
        int y = arr2.length;
        int[] mergeArr = new int[x + y];
        for (int i = 0; i < x; i++) {
            mergeArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < x + y; i++) {
            mergeArr[i] = arr2[i - x];
        }

        for (int j = 0; j < mergeArr.length; j++) {
            for (int k = j + 1; k < mergeArr.length; k++)
            {
                if (mergeArr[j] < mergeArr[k])
                {
                    
                }
            }
        }
        return mergeArr;
    }
}
    /*public static void mergeSort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    /*public static void mergeSortHelper(int[] arr, int left, int right, int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++){
            arr[k] = temp[k];
        }
    }
}*/
